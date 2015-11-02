/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageFindSummaryBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageFindSummaryBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageFindSummaryBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageObjectFilter BilledUsagesfindIn;
/**
 *
 * Constructor to create a  BilledUsageFindSummaryBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageFindSummaryBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectFilter BilledUsagesfindInIn) {
    super(id, context, "BilledUsageFindSummary");
    BilledUsagesfindIn = BilledUsagesfindInIn;
  }

  public void translateToMap() {
    if (BilledUsagesfindIn != null) {
      Integer index =  BilledUsagesfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsagesfindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsagesfindInIn Value of the BilledUsagesfindIn
 *
 */

  public void setBilledUsage(BilledUsageObjectFilter BilledUsagesfindInIn) {
    BilledUsagesfindIn = BilledUsagesfindInIn;
  }

  public void translateFromMap() {
    BilledUsagesfindIn = BilledUsageObjectHelper.fromMapFilter(inputMap, "BilledUsage");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectFilter getBilledUsage( ) {
    return BilledUsagesfindIn;
  }

}
