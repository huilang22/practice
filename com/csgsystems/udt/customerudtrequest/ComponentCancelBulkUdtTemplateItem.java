/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentCancelBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ComponentCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectBaseKeyData cancelIn;
  protected Date CCCeaseDate;
/**
 *
 * Constructor to create a  ComponentCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseKeyData cancelInIn, Date CCCeaseDateIn) {
    super(id, context, "ComponentCancel");
    cancelIn = cancelInIn;
    CCCeaseDate = CCCeaseDateIn;
  }

  public void translateToMap() {
    if (cancelIn != null) {
      cancelIn.resetFlags(true, true);
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(cancelIn, new HashMap(), "ComponentObjectBaseKeyData").get("ComponentObjectBaseKeyData"));
    }
    if (CCCeaseDate != null) {
      addInput("CancelDate", CCCeaseDate);
    }
  }


/**
 *
 * Sets the Component
 * @param cancelInIn Value of the cancelIn
 *
 */

  public void setComponent(ComponentObjectBaseKeyData cancelInIn) {
    cancelIn = cancelInIn;
  }

/**
 *
 * Sets the CancelDate
 * @param CCCeaseDateIn Value of the CCCeaseDate
 *
 */

  public void setCancelDate(Date CCCeaseDateIn) {
    CCCeaseDate = CCCeaseDateIn;
  }

  public void translateFromMap() {
    cancelIn = ComponentObjectBaseKeyHelper.fromMap(inputMap, "Component");
    CCCeaseDate = (Date)inputMap.get("CancelDate");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectBaseKeyData getComponent( ) {
    return cancelIn;
  }

/**
 *
 * Gets the CancelDate
 * @return Value of the CancelDate
 *
 */

  public Date getCancelDate( ) {
    return CCCeaseDate;
  }

}
