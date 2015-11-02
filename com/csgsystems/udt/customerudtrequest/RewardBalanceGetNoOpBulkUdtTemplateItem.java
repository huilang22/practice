/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a RewardBalanceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RewardBalanceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RewardBalanceObjectData noOpIn;

/**
 *
 * Constructor to create a   RewardBalanceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RewardBalanceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceObjectData noOpInIn) {
    super(id, context, "RewardBalanceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(noOpIn, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }
/**
 *
 * Sets the  RewardBalance
 * @param noOpInIn RewardBalanceObjectData to set
 *
 */
  public void setRewardBalance(RewardBalanceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RewardBalance passed into the constructor
 * @return Simulated response
 *
 */
  public RewardBalanceObjectData getRewardBalance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RewardBalanceObjectHelper.fromMap(inputMap, "RewardBalance");
  }
}
