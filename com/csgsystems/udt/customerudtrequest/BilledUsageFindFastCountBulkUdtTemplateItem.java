/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageFindFastCountBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageFindFastCountBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageFindFastCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageObjectFilter BilledUsagefcountIn;
/**
 *
 * Constructor to create a  BilledUsageFindFastCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageFindFastCountBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefcountInIn) {
    super(id, context, "BilledUsageFindFastCount");
    BilledUsagefcountIn = BilledUsagefcountInIn;
  }

  public void translateToMap() {
    if (BilledUsagefcountIn != null) {
      Integer index =  BilledUsagefcountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsagefcountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsagefcountInIn Value of the BilledUsagefcountIn
 *
 */

  public void setBilledUsage(BilledUsageObjectFilter BilledUsagefcountInIn) {
    BilledUsagefcountIn = BilledUsagefcountInIn;
  }

  public void translateFromMap() {
    BilledUsagefcountIn = BilledUsageObjectHelper.fromMapFilter(inputMap, "BilledUsage");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectFilter getBilledUsage( ) {
    return BilledUsagefcountIn;
  }

}
