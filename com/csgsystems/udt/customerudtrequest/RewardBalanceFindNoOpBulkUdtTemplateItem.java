/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RewardBalanceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RewardBalanceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RewardBalanceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RewardBalanceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RewardBalanceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceObjectDataList noOpInIn) {
    super(id, context, "RewardBalanceFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = RewardBalanceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RewardBalance", noOpIn);
      }
      addInput("RewardBalance", mapList);
    }
  }
/**
 *
 * Sets the  RewardBalance
 * @param noOpInIn RewardBalanceObjectDataList to set
 *
 */
  public void setRewardBalance(RewardBalanceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RewardBalance passed into the constructor
 * @return Simulated response
 *
 */
  public RewardBalanceObjectDataList getRewardBalance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RewardBalanceObjectHelper.fromMapList(inputMap, "RewardBalanceList");
  }
}
