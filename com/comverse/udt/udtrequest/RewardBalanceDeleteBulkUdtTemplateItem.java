/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RewardBalanceDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RewardBalanceDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RewardBalanceObjectKeyData RBIDeleteIn;
/**
 *
 * Constructor to create a  RewardBalanceDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RewardBalanceDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceObjectKeyData RBIDeleteInIn) {
    super(id, context, "RewardBalanceDelete");
    RBIDeleteIn = RBIDeleteInIn;
  }

  public void translateToMap() {
    if (RBIDeleteIn != null) {
      RBIDeleteIn.resetFlags(true, true);
      addInput("RewardBalance", RewardBalanceObjectKeyHelper.toMap(RBIDeleteIn, new HashMap(), "RewardBalanceObjectKeyData").get("RewardBalanceObjectKeyData"));
    }
  }


/**
 *
 * Sets the RewardBalance
 * @param RBIDeleteInIn Value of the RBIDeleteIn
 *
 */

  public void setRewardBalance(RewardBalanceObjectKeyData RBIDeleteInIn) {
    RBIDeleteIn = RBIDeleteInIn;
  }

  public void translateFromMap() {
    RBIDeleteIn = RewardBalanceObjectKeyHelper.fromMap(inputMap, "RewardBalance");
  }

/**
 *
 * Gets the RewardBalance
 * @return Value of the RewardBalance
 *
 */

  public RewardBalanceObjectKeyData getRewardBalance( ) {
    return RBIDeleteIn;
  }

}
