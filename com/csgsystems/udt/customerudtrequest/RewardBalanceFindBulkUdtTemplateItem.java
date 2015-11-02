/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceFindBulkUdtTemplateItem.java
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
 * Class used to create a RewardBalanceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RewardBalanceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RewardBalanceObjectFilter RBIFindIn;
/**
 *
 * Constructor to create a  RewardBalanceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RewardBalanceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceObjectFilter RBIFindInIn) {
    super(id, context, "RewardBalanceFind");
    RBIFindIn = RBIFindInIn;
  }

  public void translateToMap() {
    if (RBIFindIn != null) {
      Integer index =  RBIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(RBIFindIn, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }


/**
 *
 * Sets the RewardBalance
 * @param RBIFindInIn Value of the RBIFindIn
 *
 */

  public void setRewardBalance(RewardBalanceObjectFilter RBIFindInIn) {
    RBIFindIn = RBIFindInIn;
  }

  public void translateFromMap() {
    RBIFindIn = RewardBalanceObjectHelper.fromMapFilter(inputMap, "RewardBalance");
  }

/**
 *
 * Gets the RewardBalance
 * @return Value of the RewardBalance
 *
 */

  public RewardBalanceObjectFilter getRewardBalance( ) {
    return RBIFindIn;
  }

}
