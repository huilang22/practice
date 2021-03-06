/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingGetNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a RewardBalanceEntityMappingGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RewardBalanceEntityMappingGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RewardBalanceEntityMappingObjectData noOpIn;

/**
 *
 * Constructor to create a   RewardBalanceEntityMappingGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RewardBalanceEntityMappingGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceEntityMappingObjectData noOpInIn) {
    super(id, context, "RewardBalanceEntityMappingGet");
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
