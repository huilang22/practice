/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceCreateBulkUdtTemplateItem.java
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
 * Class used to create a RewardBalanceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RewardBalanceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RewardBalanceObjectData RBICreateIn;
/**
 *
 * Constructor to create a  RewardBalanceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RewardBalanceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceObjectData RBICreateInIn) {
    super(id, context, "RewardBalanceCreate");
    RBICreateIn = RBICreateInIn;
  }

  public void translateToMap() {
    if (RBICreateIn != null) {
      RBICreateIn.resetFlags(true, true);
      addInput("RewardBalance", RewardBalanceObjectHelper.toMap(RBICreateIn, new HashMap(), "RewardBalance").get("RewardBalance"));
    }
  }


/**
 *
 * Sets the RewardBalance
 * @param RBICreateInIn Value of the RBICreateIn
 *
 */

  public void setRewardBalance(RewardBalanceObjectData RBICreateInIn) {
    RBICreateIn = RBICreateInIn;
  }

  public void translateFromMap() {
    RBICreateIn = RewardBalanceObjectHelper.fromMap(inputMap, "RewardBalance");
  }

/**
 *
 * Gets the RewardBalance
 * @return Value of the RewardBalance
 *
 */

  public RewardBalanceObjectData getRewardBalance( ) {
    return RBICreateIn;
  }

}
