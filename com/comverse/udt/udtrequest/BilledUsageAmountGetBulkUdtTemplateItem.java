/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageAmountGetBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageObjectKeyData BilledUsageAmountIn;
/**
 *
 * Constructor to create a  BilledUsageAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectKeyData BilledUsageAmountInIn) {
    super(id, context, "BilledUsageAmountGet");
    BilledUsageAmountIn = BilledUsageAmountInIn;
  }

  public void translateToMap() {
    if (BilledUsageAmountIn != null) {
      BilledUsageAmountIn.resetFlags(true, true);
      addInput("BilledUsage", BilledUsageObjectKeyHelper.toMap(BilledUsageAmountIn, new HashMap(), "BilledUsageObjectKeyData").get("BilledUsageObjectKeyData"));
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsageAmountInIn Value of the BilledUsageAmountIn
 *
 */

  public void setBilledUsage(BilledUsageObjectKeyData BilledUsageAmountInIn) {
    BilledUsageAmountIn = BilledUsageAmountInIn;
  }

  public void translateFromMap() {
    BilledUsageAmountIn = BilledUsageObjectKeyHelper.fromMap(inputMap, "BilledUsage");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectKeyData getBilledUsage( ) {
    return BilledUsageAmountIn;
  }

}
