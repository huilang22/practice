/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageImpliedDecimalCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateUsageImpliedDecimalCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateUsageImpliedDecimalCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateUsageImpliedDecimalObjectData noOpIn;

/**
 *
 * Constructor to create a   RateUsageImpliedDecimalCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateUsageImpliedDecimalCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageImpliedDecimalObjectData noOpInIn) {
    super(id, context, "RateUsageImpliedDecimalCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectHelper.toMap(noOpIn, new HashMap(), "RateUsageImpliedDecimal").get("RateUsageImpliedDecimal"));
    }
  }
/**
 *
 * Sets the  RateUsageImpliedDecimal
 * @param noOpInIn RateUsageImpliedDecimalObjectData to set
 *
 */
  public void setRateUsageImpliedDecimal(RateUsageImpliedDecimalObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateUsageImpliedDecimal passed into the constructor
 * @return Simulated response
 *
 */
  public RateUsageImpliedDecimalObjectData getRateUsageImpliedDecimal() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateUsageImpliedDecimalObjectHelper.fromMap(inputMap, "RateUsageImpliedDecimal");
  }
}
