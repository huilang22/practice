/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyInstanceUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PolicyInstanceUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PolicyInstanceUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PolicyInstanceObjectData noOpIn;

/**
 *
 * Constructor to create a   PolicyInstanceUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PolicyInstanceUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyInstanceObjectData noOpInIn) {
    super(id, context, "PolicyInstanceUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PolicyInstance", PolicyInstanceObjectHelper.toMap(noOpIn, new HashMap(), "PolicyInstance").get("PolicyInstance"));
    }
  }
/**
 *
 * Sets the  PolicyInstance
 * @param noOpInIn PolicyInstanceObjectData to set
 *
 */
  public void setPolicyInstance(PolicyInstanceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PolicyInstance passed into the constructor
 * @return Simulated response
 *
 */
  public PolicyInstanceObjectData getPolicyInstance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PolicyInstanceObjectHelper.fromMap(inputMap, "PolicyInstance");
  }
}
