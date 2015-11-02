/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodDistinctFindBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a RatePeriodDistinctFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodDistinctFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RatePeriodDistinctObjectFilter rpFndIn;
/**
 *
 * Constructor to create a  RatePeriodDistinctFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodDistinctFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodDistinctObjectFilter rpFndInIn) {
    super(id, context, "RatePeriodDistinctFind");
    rpFndIn = rpFndInIn;
  }

  public void translateToMap() {
    if (rpFndIn != null) {
      Integer index =  rpFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RatePeriodDistinct", RatePeriodDistinctObjectHelper.toMap(rpFndIn, new HashMap(), "RatePeriodDistinct").get("RatePeriodDistinct"));
    }
  }


/**
 *
 * Sets the RatePeriodDistinct
 * @param rpFndInIn Value of the rpFndIn
 *
 */

  public void setRatePeriodDistinct(RatePeriodDistinctObjectFilter rpFndInIn) {
    rpFndIn = rpFndInIn;
  }

  public void translateFromMap() {
    rpFndIn = RatePeriodDistinctObjectHelper.fromMapFilter(inputMap, "RatePeriodDistinct");
  }

/**
 *
 * Gets the RatePeriodDistinct
 * @return Value of the RatePeriodDistinct
 *
 */

  public RatePeriodDistinctObjectFilter getRatePeriodDistinct( ) {
    return rpFndIn;
  }

}
