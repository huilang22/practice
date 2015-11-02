/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageFindSummaryCountBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageFindSummaryCountBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageFindSummaryCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageObjectFilter UnbilledUsagesfindCountIn;
/**
 *
 * Constructor to create a  UnbilledUsageFindSummaryCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageFindSummaryCountBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagesfindCountInIn) {
    super(id, context, "UnbilledUsageFindSummaryCount");
    UnbilledUsagesfindCountIn = UnbilledUsagesfindCountInIn;
  }

  public void translateToMap() {
    if (UnbilledUsagesfindCountIn != null) {
      Integer index =  UnbilledUsagesfindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsagesfindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsagesfindCountInIn Value of the UnbilledUsagesfindCountIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectFilter UnbilledUsagesfindCountInIn) {
    UnbilledUsagesfindCountIn = UnbilledUsagesfindCountInIn;
  }

  public void translateFromMap() {
    UnbilledUsagesfindCountIn = UnbilledUsageObjectHelper.fromMapFilter(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectFilter getUnbilledUsage( ) {
    return UnbilledUsagesfindCountIn;
  }

}
