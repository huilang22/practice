/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageFindSummaryBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageFindSummaryBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageFindSummaryBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageObjectFilter UnbilledUsagesfindIn;
/**
 *
 * Constructor to create a  UnbilledUsageFindSummaryBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageFindSummaryBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagesfindInIn) {
    super(id, context, "UnbilledUsageFindSummary");
    UnbilledUsagesfindIn = UnbilledUsagesfindInIn;
  }

  public void translateToMap() {
    if (UnbilledUsagesfindIn != null) {
      Integer index =  UnbilledUsagesfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsagesfindIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsagesfindInIn Value of the UnbilledUsagesfindIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectFilter UnbilledUsagesfindInIn) {
    UnbilledUsagesfindIn = UnbilledUsagesfindInIn;
  }

  public void translateFromMap() {
    UnbilledUsagesfindIn = UnbilledUsageObjectHelper.fromMapFilter(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectFilter getUnbilledUsage( ) {
    return UnbilledUsagesfindIn;
  }

}
