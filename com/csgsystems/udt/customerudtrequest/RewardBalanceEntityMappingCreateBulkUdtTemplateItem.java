/*
 * Generated code DO NOT EDIT
 * Generated file: RewardBalanceEntityMappingCreateBulkUdtTemplateItem.java
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
 * Class used to create a RewardBalanceEntityMappingCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RewardBalanceEntityMappingCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RewardBalanceEntityMappingObjectData RBEMCreateIn;
/**
 *
 * Constructor to create a  RewardBalanceEntityMappingCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RewardBalanceEntityMappingCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceEntityMappingObjectData RBEMCreateInIn) {
    super(id, context, "RewardBalanceEntityMappingCreate");
    RBEMCreateIn = RBEMCreateInIn;
  }

  public void translateToMap() {
    if (RBEMCreateIn != null) {
      RBEMCreateIn.resetFlags(true, true);
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(RBEMCreateIn, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }


/**
 *
 * Sets the RewardBalanceEntityMapping
 * @param RBEMCreateInIn Value of the RBEMCreateIn
 *
 */

  public void setRewardBalanceEntityMapping(RewardBalanceEntityMappingObjectData RBEMCreateInIn) {
    RBEMCreateIn = RBEMCreateInIn;
  }

  public void translateFromMap() {
    RBEMCreateIn = RewardBalanceEntityMappingObjectHelper.fromMap(inputMap, "RewardBalanceEntityMapping");
  }

/**
 *
 * Gets the RewardBalanceEntityMapping
 * @return Value of the RewardBalanceEntityMapping
 *
 */

  public RewardBalanceEntityMappingObjectData getRewardBalanceEntityMapping( ) {
    return RBEMCreateIn;
  }

}
