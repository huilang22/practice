/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentPolicyMapUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ComponentPolicyMapUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ComponentPolicyMapUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ComponentPolicyMapObjectData noOpIn;

/**
 *
 * Constructor to create a   ComponentPolicyMapUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ComponentPolicyMapUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentPolicyMapObjectData noOpInIn) {
    super(id, context, "ComponentPolicyMapUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ComponentPolicyMap", ComponentPolicyMapObjectHelper.toMap(noOpIn, new HashMap(), "ComponentPolicyMap").get("ComponentPolicyMap"));
    }
  }
/**
 *
 * Sets the  ComponentPolicyMap
 * @param noOpInIn ComponentPolicyMapObjectData to set
 *
 */
  public void setComponentPolicyMap(ComponentPolicyMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ComponentPolicyMap passed into the constructor
 * @return Simulated response
 *
 */
  public ComponentPolicyMapObjectData getComponentPolicyMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ComponentPolicyMapObjectHelper.fromMap(inputMap, "ComponentPolicyMap");
  }
}
