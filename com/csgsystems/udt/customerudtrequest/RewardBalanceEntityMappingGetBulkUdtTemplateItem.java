/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceEntityMappingGetBulkUdtTemplateItem.java
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
 * Class used to create a RewardBalanceEntityMappingGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RewardBalanceEntityMappingGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RewardBalanceEntityMappingObjectKeyData RBEMGetIn;
/**
 *
 * Constructor to create a  RewardBalanceEntityMappingGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RewardBalanceEntityMappingGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceEntityMappingObjectKeyData RBEMGetInIn) {
    super(id, context, "RewardBalanceEntityMappingGet");
    RBEMGetIn = RBEMGetInIn;
  }

  public void translateToMap() {
    if (RBEMGetIn != null) {
      RBEMGetIn.resetFlags(true, true);
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectKeyHelper.toMap(RBEMGetIn, new HashMap(), "RewardBalanceEntityMappingObjectKeyData").get("RewardBalanceEntityMappingObjectKeyData"));
    }
  }


/**
 *
 * Sets the RewardBalanceEntityMapping
 * @param RBEMGetInIn Value of the RBEMGetIn
 *
 */

  public void setRewardBalanceEntityMapping(RewardBalanceEntityMappingObjectKeyData RBEMGetInIn) {
    RBEMGetIn = RBEMGetInIn;
  }

  public void translateFromMap() {
    RBEMGetIn = RewardBalanceEntityMappingObjectKeyHelper.fromMap(inputMap, "RewardBalanceEntityMapping");
  }

/**
 *
 * Gets the RewardBalanceEntityMapping
 * @return Value of the RewardBalanceEntityMapping
 *
 */

  public RewardBalanceEntityMappingObjectKeyData getRewardBalanceEntityMapping( ) {
    return RBEMGetIn;
  }

}
