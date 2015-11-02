/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageCalcBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageCalcBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageCalcBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageObjectData BilledUsageCalcIn;
/**
 *
 * Constructor to create a  BilledUsageCalcBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageCalcBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectData BilledUsageCalcInIn) {
    super(id, context, "BilledUsageCalc");
    BilledUsageCalcIn = BilledUsageCalcInIn;
  }

  public void translateToMap() {
    if (BilledUsageCalcIn != null) {
      BilledUsageCalcIn.resetFlags(true, true);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsageCalcIn, new HashMap(), "TaxAndDiscountSummary").get("TaxAndDiscountSummary"));
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsageCalcInIn Value of the BilledUsageCalcIn
 *
 */

  public void setBilledUsage(BilledUsageObjectData BilledUsageCalcInIn) {
    BilledUsageCalcIn = BilledUsageCalcInIn;
  }

  public void translateFromMap() {
    BilledUsageCalcIn = BilledUsageObjectHelper.fromMap(inputMap, "BilledUsage");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectData getBilledUsage( ) {
    return BilledUsageCalcIn;
  }

}
