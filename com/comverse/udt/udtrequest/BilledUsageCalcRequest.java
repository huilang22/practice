/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageCalcRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BilledUsageCalcRequest Udt Request
 *
 */

public class BilledUsageCalcRequest extends BilledUsageSubRequestParent {
/**
 *
 * Constructor to create a  BilledUsageCalcRequest
 * @param id Unique request name
 * @param BilledUsageCalcIn BilledUsageObjectData for BilledUsageCalcRequest
 *
 */
@JsonCreator
  public BilledUsageCalcRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageObjectData BilledUsageCalcIn) {
    super(id, "BilledUsageCalc");
    if (BilledUsageCalcIn != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsageCalcIn, new HashMap(), "TaxAndDiscountSummary").get("TaxAndDiscountSummary"));
    }
  }

/**
 *
 * Retrieves the TaxAndDiscountAmountObjectData that results from the BilledUsageCalcRequest call
 * @return TaxAndDiscountAmountObjectData resulting from udt call
 *
 */

  public TaxAndDiscountAmountObjectData getOutput() {
    return TaxAndDiscountAmountObjectHelper.fromMap(outputMap, "TaxAndDiscountSummary");
  }
}
