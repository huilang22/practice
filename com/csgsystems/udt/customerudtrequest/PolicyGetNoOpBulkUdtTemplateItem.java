/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PolicyGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PolicyGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PolicyObjectData noOpIn;

/**
 *
 * Constructor to create a   PolicyGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PolicyGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyObjectData noOpInIn) {
    super(id, context, "PolicyGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Policy", PolicyObjectHelper.toMap(noOpIn, new HashMap(), "Policy").get("Policy"));
    }
  }
/**
 *
 * Sets the  Policy
 * @param noOpInIn PolicyObjectData to set
 *
 */
  public void setPolicy(PolicyObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Policy passed into the constructor
 * @return Simulated response
 *
 */
  public PolicyObjectData getPolicy() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PolicyObjectHelper.fromMap(inputMap, "Policy");
  }
}
