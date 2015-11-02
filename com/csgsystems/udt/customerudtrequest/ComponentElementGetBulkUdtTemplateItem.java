/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentElementGetBulkUdtTemplateItem.java
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
 * Class used to create a ComponentElementGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ComponentElementGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentElementObjectKeyData getIn;
/**
 *
 * Constructor to create a  ComponentElementGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ComponentElementGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentElementObjectKeyData getInIn) {
    super(id, context, "ComponentElementGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("ComponentElement", ComponentElementObjectKeyHelper.toMap(getIn, new HashMap(), "ComponentElementObjectKeyData").get("ComponentElementObjectKeyData"));
    }
  }


/**
 *
 * Sets the ComponentElement
 * @param getInIn Value of the getIn
 *
 */

  public void setComponentElement(ComponentElementObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = ComponentElementObjectKeyHelper.fromMap(inputMap, "ComponentElement");
  }

/**
 *
 * Gets the ComponentElement
 * @return Value of the ComponentElement
 *
 */

  public ComponentElementObjectKeyData getComponentElement( ) {
    return getIn;
  }

}
