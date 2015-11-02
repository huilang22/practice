/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceBalanceSummaryRequest.java
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
 * Class used to create a InvoiceBalanceSummaryRequest Udt Request
 *
 */

public class InvoiceBalanceSummaryRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a  InvoiceBalanceSummaryRequest
 * @param id Unique request name
 * @param InvoiceBalSumIn InvoiceObjectData for InvoiceBalanceSummaryRequest
 *
 */
@JsonCreator
  public InvoiceBalanceSummaryRequest(@JsonProperty("RequestId") String id, @JsonProperty("Invoice")InvoiceObjectData InvoiceBalSumIn) {
    super(id, "InvoiceBalanceSummary");
    if (InvoiceBalSumIn != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(InvoiceBalSumIn, new HashMap(), "InvoiceBalanceSummaryOutputData").get("InvoiceBalanceSummaryOutputData"));
    }
  }

/**
 *
 * Retrieves the InvoiceBalanceSummaryOutputData that results from the InvoiceBalanceSummaryRequest call
 * @return InvoiceBalanceSummaryOutputData resulting from udt call
 *
 */

  public InvoiceBalanceSummaryOutputData getOutput() {
    return InvoiceBalanceSummaryOutputHelper.fromMap(outputMap);
  }
}
