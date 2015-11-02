/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceSummaryGetNoOpRequest.java
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
 * NoOp class used to simulate a InvoiceSummaryGetNoOpRequest Udt Request/Response
 *
 */
public class InvoiceSummaryGetNoOpRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a   InvoiceSummaryGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoiceSummaryGetNoOpRequest(String id, InvoiceSummaryObjectData noOpIn) {
    super(id, "InvoiceSummaryGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvoiceSummary", InvoiceSummaryObjectHelper.toMap(noOpIn, new HashMap(), "InvoiceSummary").get("InvoiceSummary"));
    }
  }
/**
 *
 * Retrieves the InvoiceSummaryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceSummaryObjectData getOutput() {
    return InvoiceSummaryObjectHelper.fromMap(outputMap, "InvoiceSummary");
  }
}
