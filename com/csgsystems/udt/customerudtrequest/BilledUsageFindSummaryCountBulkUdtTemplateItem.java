/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageFindSummaryCountBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageFindSummaryCountBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageFindSummaryCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageObjectFilter BilledUsagescountIn;
/**
 *
 * Constructor to create a  BilledUsageFindSummaryCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageFindSummaryCountBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectFilter BilledUsagescountInIn) {
    super(id, context, "BilledUsageFindSummaryCount");
    BilledUsagescountIn = BilledUsagescountInIn;
  }

  public void translateToMap() {
    if (BilledUsagescountIn != null) {
      Integer index =  BilledUsagescountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsagescountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsagescountInIn Value of the BilledUsagescountIn
 *
 */

  public void setBilledUsage(BilledUsageObjectFilter BilledUsagescountInIn) {
    BilledUsagescountIn = BilledUsagescountInIn;
  }

  public void translateFromMap() {
    BilledUsagescountIn = BilledUsageObjectHelper.fromMapFilter(inputMap, "BilledUsage");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectFilter getBilledUsage( ) {
    return BilledUsagescountIn;
  }

}
