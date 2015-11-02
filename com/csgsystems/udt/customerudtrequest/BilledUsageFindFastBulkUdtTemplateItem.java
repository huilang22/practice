/*
 * Generated code DO NOT EDIT
 * Generated file: BilledUsageFindFastBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageFindFastBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageFindFastBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageObjectFilter BilledUsageffindIn;
/**
 *
 * Constructor to create a  BilledUsageFindFastBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageFindFastBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectFilter BilledUsageffindInIn) {
    super(id, context, "BilledUsageFindFast");
    BilledUsageffindIn = BilledUsageffindInIn;
  }

  public void translateToMap() {
    if (BilledUsageffindIn != null) {
      Integer index =  BilledUsageffindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsageffindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsageffindInIn Value of the BilledUsageffindIn
 *
 */

  public void setBilledUsage(BilledUsageObjectFilter BilledUsageffindInIn) {
    BilledUsageffindIn = BilledUsageffindInIn;
  }

  public void translateFromMap() {
    BilledUsageffindIn = BilledUsageObjectHelper.fromMapFilter(inputMap, "BilledUsage");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectFilter getBilledUsage( ) {
    return BilledUsageffindIn;
  }

}
