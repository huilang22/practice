/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageFindCountBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageObjectFilter BilledUsagefindCountIn;
/**
 *
 * Constructor to create a  BilledUsageFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefindCountInIn) {
    super(id, context, "BilledUsageFindCount");
    BilledUsagefindCountIn = BilledUsagefindCountInIn;
  }

  public void translateToMap() {
    if (BilledUsagefindCountIn != null) {
      Integer index =  BilledUsagefindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsagefindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsagefindCountInIn Value of the BilledUsagefindCountIn
 *
 */

  public void setBilledUsage(BilledUsageObjectFilter BilledUsagefindCountInIn) {
    BilledUsagefindCountIn = BilledUsagefindCountInIn;
  }

  public void translateFromMap() {
    BilledUsagefindCountIn = BilledUsageObjectHelper.fromMapFilter(inputMap, "BilledUsage");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectFilter getBilledUsage( ) {
    return BilledUsagefindCountIn;
  }

}
