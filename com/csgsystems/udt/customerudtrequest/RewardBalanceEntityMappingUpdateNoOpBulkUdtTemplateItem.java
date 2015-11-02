/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceEntityMappingUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RewardBalanceEntityMappingUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RewardBalanceEntityMappingUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RewardBalanceEntityMappingObjectData noOpIn;

/**
 *
 * Constructor to create a   RewardBalanceEntityMappingUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RewardBalanceEntityMappingUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceEntityMappingObjectData noOpInIn) {
    super(id, context, "RewardBalanceEntityMappingUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(noOpIn, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }
/**
 *
 * Sets the  RewardBalanceEntityMapping
 * @param noOpInIn RewardBalanceEntityMappingObjectData to set
 *
 */
  public void setRewardBalanceEntityMapping(RewardBalanceEntityMappingObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RewardBalanceEntityMapping passed into the constructor
 * @return Simulated response
 *
 */
  public RewardBalanceEntityMappingObjectData getRewardBalanceEntityMapping() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RewardBalanceEntityMappingObjectHelper.fromMap(inputMap, "RewardBalanceEntityMapping");
  }
}
