/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RewardBalanceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RewardBalanceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RewardBalanceObjectData RBIUpdateIn;
/**
 *
 * Constructor to create a  RewardBalanceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RewardBalanceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceObjectData RBIUpdateInIn) {
    super(id, context, "RewardBalanceUpdate");
    RBIUpdateIn = RBIUpdateInIn;
  }

  public void translateToMap() {
    if (RBIUpdateIn != null) {
      RBIUpdateIn.resetFlags(true, true);
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(RBIUpdateIn, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }


/**
 *
 * Sets the RewardBalance
 * @param RBIUpdateInIn Value of the RBIUpdateIn
 *
 */

  public void setRewardBalance(RewardBalanceObjectData RBIUpdateInIn) {
    RBIUpdateIn = RBIUpdateInIn;
  }

  public void translateFromMap() {
    RBIUpdateIn = RewardBalanceObjectHelper.fromMap(inputMap, "RewardBalance");
  }

/**
 *
 * Gets the RewardBalance
 * @return Value of the RewardBalance
 *
 */

  public RewardBalanceObjectData getRewardBalance( ) {
    return RBIUpdateIn;
  }

}
