/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageFindCountBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnbilledUsageObjectFilter UnbilledUsagefindCountIn;
/**
 *
 * Constructor to create a  UnbilledUsageFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, UnbilledUsageObjectFilter UnbilledUsagefindCountInIn) {
    super(id, context, "UnbilledUsageFindCount");
    UnbilledUsagefindCountIn = UnbilledUsagefindCountInIn;
  }

  public void translateToMap() {
    if (UnbilledUsagefindCountIn != null) {
      Integer index =  UnbilledUsagefindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsagefindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the UnbilledUsage
 * @param UnbilledUsagefindCountInIn Value of the UnbilledUsagefindCountIn
 *
 */

  public void setUnbilledUsage(UnbilledUsageObjectFilter UnbilledUsagefindCountInIn) {
    UnbilledUsagefindCountIn = UnbilledUsagefindCountInIn;
  }

  public void translateFromMap() {
    UnbilledUsagefindCountIn = UnbilledUsageObjectHelper.fromMapFilter(inputMap, "UnbilledUsage");
  }

/**
 *
 * Gets the UnbilledUsage
 * @return Value of the UnbilledUsage
 *
 */

  public UnbilledUsageObjectFilter getUnbilledUsage( ) {
    return UnbilledUsagefindCountIn;
  }

}
