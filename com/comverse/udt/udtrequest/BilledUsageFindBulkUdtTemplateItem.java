/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageFindBulkUdtTemplateItem.java
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
 * Class used to create a BilledUsageFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BilledUsageFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BilledUsageObjectFilter BilledUsagefindIn;
/**
 *
 * Constructor to create a  BilledUsageFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BilledUsageFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BilledUsageObjectFilter BilledUsagefindInIn) {
    super(id, context, "BilledUsageFind");
    BilledUsagefindIn = BilledUsagefindInIn;
  }

  public void translateToMap() {
    if (BilledUsagefindIn != null) {
      Integer index =  BilledUsagefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsagefindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }


/**
 *
 * Sets the BilledUsage
 * @param BilledUsagefindInIn Value of the BilledUsagefindIn
 *
 */

  public void setBilledUsage(BilledUsageObjectFilter BilledUsagefindInIn) {
    BilledUsagefindIn = BilledUsagefindInIn;
  }

  public void translateFromMap() {
    BilledUsagefindIn = BilledUsageObjectHelper.fromMapFilter(inputMap, "BilledUsage");
  }

/**
 *
 * Gets the BilledUsage
 * @return Value of the BilledUsage
 *
 */

  public BilledUsageObjectFilter getBilledUsage( ) {
    return BilledUsagefindIn;
  }

}
