/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceBalanceSummaryNoOpRequest.java
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
 * NoOp class used to simulate a InvoiceBalanceSummaryNoOpRequest Udt Request/Response
 *
 */
public class InvoiceBalanceSummaryNoOpRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a   InvoiceBalanceSummaryNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoiceBalanceSummaryNoOpRequest(String id, InvoiceBalanceSummaryOutputData noOpIn) {
    super(id, "InvoiceBalanceSummaryNoOpRequest");
    if (noOpIn != null) {
      addInput("InvoiceBalanceSummaryOutputData", InvoiceBalanceSummaryOutputHelper.toMap(noOpIn).get("InvoiceBalanceSummaryOutputData"));
    }
  }
/**
 *
 * Retrieves the InvoiceBalanceSummaryOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceBalanceSummaryOutputData getOutput() {
    return InvoiceBalanceSummaryOutputHelper.fromMap(outputMap);
  }
}
