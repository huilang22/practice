/*
 * Generated code DO NOT EDIT
 * Generated file: PolicyInstanceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PolicyInstanceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PolicyInstanceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PolicyInstanceObjectData noOpIn;

/**
 *
 * Constructor to create a   PolicyInstanceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PolicyInstanceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PolicyInstanceObjectData noOpInIn) {
    super(id, context, "PolicyInstanceGet");
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
