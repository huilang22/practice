/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RewardBalanceGetBulkUdtTemplateItem.java
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
 * Class used to create a RewardBalanceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RewardBalanceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RewardBalanceObjectKeyData RBIGetIn;
/**
 *
 * Constructor to create a  RewardBalanceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RewardBalanceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RewardBalanceObjectKeyData RBIGetInIn) {
    super(id, context, "RewardBalanceGet");
    RBIGetIn = RBIGetInIn;
  }

  public void translateToMap() {
    if (RBIGetIn != null) {
      RBIGetIn.resetFlags(true, true);
      addInput("RewardBalance", RewardBalanceObjectKeyHelper.toMap(RBIGetIn, new HashMap(), "RewardBalanceObjectKeyData").get("RewardBalanceObjectKeyData"));
    }
  }


/**
 *
 * Sets the RewardBalance
 * @param RBIGetInIn Value of the RBIGetIn
 *
 */

  public void setRewardBalance(RewardBalanceObjectKeyData RBIGetInIn) {
    RBIGetIn = RBIGetInIn;
  }

  public void translateFromMap() {
    RBIGetIn = RewardBalanceObjectKeyHelper.fromMap(inputMap, "RewardBalance");
  }

/**
 *
 * Gets the RewardBalance
 * @return Value of the RewardBalance
 *
 */

  public RewardBalanceObjectKeyData getRewardBalance( ) {
    return RBIGetIn;
  }

}
