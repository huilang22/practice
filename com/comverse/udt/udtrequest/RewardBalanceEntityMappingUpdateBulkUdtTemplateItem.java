/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceEntityMappingUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RewardBalanceEntityMappingUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RewardBalanceEntityMappingUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RewardBalanceEntityMappingObjectData RBEMUpdateIn;
/**
 *
 * Constructor to create a  RewardBalanceEntityMappingUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RewardBalanceEntityMappingUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceEntityMappingObjectData RBEMUpdateInIn) {
    super(id, context, "RewardBalanceEntityMappingUpdate");
    RBEMUpdateIn = RBEMUpdateInIn;
  }

  public void translateToMap() {
    if (RBEMUpdateIn != null) {
      RBEMUpdateIn.resetFlags(true, true);
      addInput("RewardBalanceEntityMapping", RewardBalanceEntityMappingObjectHelper.toMap(RBEMUpdateIn, new HashMap(), "RewardBalanceEntityMapping").get("RewardBalanceEntityMapping"));
    }
  }


/**
 *
 * Sets the RewardBalanceEntityMapping
 * @param RBEMUpdateInIn Value of the RBEMUpdateIn
 *
 */

  public void setRewardBalanceEntityMapping(RewardBalanceEntityMappingObjectData RBEMUpdateInIn) {
    RBEMUpdateIn = RBEMUpdateInIn;
  }

  public void translateFromMap() {
    RBEMUpdateIn = RewardBalanceEntityMappingObjectHelper.fromMap(inputMap, "RewardBalanceEntityMapping");
  }

/**
 *
 * Gets the RewardBalanceEntityMapping
 * @return Value of the RewardBalanceEntityMapping
 *
 */

  public RewardBalanceEntityMappingObjectData getRewardBalanceEntityMapping( ) {
    return RBEMUpdateIn;
  }

}
