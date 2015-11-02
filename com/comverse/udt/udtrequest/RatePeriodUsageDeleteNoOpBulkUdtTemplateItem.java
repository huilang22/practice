/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUsageDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RatePeriodUsageDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatePeriodUsageDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RatePeriodUsagesObjectData noOpIn;

/**
 *
 * Constructor to create a   RatePeriodUsageDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatePeriodUsageDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RatePeriodUsagesObjectData noOpInIn) {
    super(id, context, "RatePeriodUsageDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RatePeriodUsage", RatePeriodUsagesObjectHelper.toMap(noOpIn, new HashMap(), "RatePeriodUsage").get("RatePeriodUsage"));
    }
  }
/**
 *
 * Sets the  RatePeriodUsage
 * @param noOpInIn RatePeriodUsagesObjectData to set
 *
 */
  public void setRatePeriodUsage(RatePeriodUsagesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RatePeriodUsage passed into the constructor
 * @return Simulated response
 *
 */
  public RatePeriodUsagesObjectData getRatePeriodUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RatePeriodUsagesObjectHelper.fromMap(inputMap, "RatePeriodUsage");
  }
}
