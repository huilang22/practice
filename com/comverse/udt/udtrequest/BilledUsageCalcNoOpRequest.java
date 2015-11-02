/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageCalcNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a BilledUsageCalcNoOpRequest Udt Request/Response
 *
 */
public class BilledUsageCalcNoOpRequest extends BilledUsageSubRequestParent {
/**
 *
 * Constructor to create a   BilledUsageCalcNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BilledUsageCalcNoOpRequest(String id, TaxAndDiscountAmountObjectData noOpIn) {
    super(id, "BilledUsageCalcNoOpRequest");
    if (noOpIn != null) {
      addInput("TaxAndDiscountSummary", TaxAndDiscountAmountObjectHelper.toMap(noOpIn, new HashMap(), "TaxAndDiscountSummary").get("TaxAndDiscountSummary"));
    }
  }
/**
 *
 * Retrieves the TaxAndDiscountAmountObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TaxAndDiscountAmountObjectData getOutput() {
    return TaxAndDiscountAmountObjectHelper.fromMap(outputMap, "TaxAndDiscountSummary");
  }
}
