/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceEntityMappingDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RewardBalanceEntityMappingDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RewardBalanceEntityMappingDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RewardBalanceEntityMappingObjectKeyData RBEMDeleteIn;
/**
 *
 * Constructor to create a  RewardBalanceEntityMappingDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RewardBalanceEntityMappingDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceEntityMappingObjectKeyData RBEMDeleteInIn) {
    super(id, context, "RewardBalanceEntityMappingDelete");
    RBEMDeleteIn = RBEMDeleteInIn;
  }

  public void translateToMap() {
    if (RBEMDeleteIn != null) {
      RBEMDeleteIn.resetFlags(true, true);
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectKeyHelper.toMap(RBEMDeleteIn, new HashMap(), "RewardBalanceEntityMappingObjectKeyData").get("RewardBalanceEntityMappingObjectKeyData"));
    }
  }


/**
 *
 * Sets the RewardBalanceEntityMapping
 * @param RBEMDeleteInIn Value of the RBEMDeleteIn
 *
 */

  public void setRewardBalanceEntityMapping(RewardBalanceEntityMappingObjectKeyData RBEMDeleteInIn) {
    RBEMDeleteIn = RBEMDeleteInIn;
  }

  public void translateFromMap() {
    RBEMDeleteIn = RewardBalanceEntityMappingObjectKeyHelper.fromMap(inputMap, "RewardBalanceEntityMapping");
  }

/**
 *
 * Gets the RewardBalanceEntityMapping
 * @return Value of the RewardBalanceEntityMapping
 *
 */

  public RewardBalanceEntityMappingObjectKeyData getRewardBalanceEntityMapping( ) {
    return RBEMDeleteIn;
  }

}
