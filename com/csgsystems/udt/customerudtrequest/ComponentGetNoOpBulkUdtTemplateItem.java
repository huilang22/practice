/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ComponentGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ComponentObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   ComponentGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseData noOpInIn) {
    super(id, context, "ComponentGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Component", ComponentObjectBaseHelper.toMap(noOpIn, new HashMap(), "Component").get("Component"));
    }
  }
/**
 *
 * Sets the  Component
 * @param noOpInIn ComponentObjectBaseData to set
 *
 */
  public void setComponent(ComponentObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Component passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentObjectBaseData getComponent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ComponentObjectBaseHelper.fromMap(inputMap, "Component");
  }
}
