/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentActivateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ComponentActivateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentActivateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ComponentObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   ComponentActivateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentActivateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectBaseData noOpInIn) {
    super(id, context, "ComponentActivate");
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