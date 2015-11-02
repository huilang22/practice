/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceEntityMappingFindBulkUdtTemplateItem.java
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
 * Class used to create a RewardBalanceEntityMappingFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RewardBalanceEntityMappingFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RewardBalanceEntityMappingObjectFilter RBEMFindIn;
/**
 *
 * Constructor to create a  RewardBalanceEntityMappingFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RewardBalanceEntityMappingFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceEntityMappingObjectFilter RBEMFindInIn) {
    super(id, context, "RewardBalanceEntityMappingFind");
    RBEMFindIn = RBEMFindInIn;
  }

  public void translateToMap() {
    if (RBEMFindIn != null) {
      Integer index =  RBEMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(RBEMFindIn, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }


/**
 *
 * Sets the RewardBalanceEntityMapping
 * @param RBEMFindInIn Value of the RBEMFindIn
 *
 */

  public void setRewardBalanceEntityMapping(RewardBalanceEntityMappingObjectFilter RBEMFindInIn) {
    RBEMFindIn = RBEMFindInIn;
  }

  public void translateFromMap() {
    RBEMFindIn = RewardBalanceEntityMappingObjectHelper.fromMapFilter(inputMap, "RewardBalanceEntityMapping");
  }

/**
 *
 * Gets the RewardBalanceEntityMapping
 * @return Value of the RewardBalanceEntityMapping
 *
 */

  public RewardBalanceEntityMappingObjectFilter getRewardBalanceEntityMapping( ) {
    return RBEMFindIn;
  }

}
