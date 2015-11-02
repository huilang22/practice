/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateUsageCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateUsageCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateUsageObjectData noOpIn;

/**
 *
 * Constructor to create a   RateUsageCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateUsageCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageObjectData noOpInIn) {
    super(id, context, "RateUsageCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateUsage", RateUsageObjectHelper.toMap(noOpIn, new HashMap(), "RateUsage").get("RateUsage"));
    }
  }
/**
 *
 * Sets the  RateUsage
 * @param noOpInIn RateUsageObjectData to set
 *
 */
  public void setRateUsage(RateUsageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateUsage passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageObjectData getRateUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateUsageObjectHelper.fromMap(inputMap, "RateUsage");
  }
}
