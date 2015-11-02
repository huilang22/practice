/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePrepaidUnbilledUsageTotalNoOpRequest.java
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
 * NoOp class used to simulate a InvoicePrepaidUnbilledUsageTotalNoOpRequest Udt Request/Response
 *
 */
public class InvoicePrepaidUnbilledUsageTotalNoOpRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a   InvoicePrepaidUnbilledUsageTotalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoicePrepaidUnbilledUsageTotalNoOpRequest(String id, InvoicePrepaidUnbilledUsageTotalOutputData noOpIn) {
    super(id, "InvoicePrepaidUnbilledUsageTotalNoOpRequest");
    if (noOpIn != null) {
      addInput("InvoicePrepaidUnbilledUsageTotalOutputData", InvoicePrepaidUnbilledUsageTotalOutputHelper.toMap(noOpIn).get("InvoicePrepaidUnbilledUsageTotalOutputData"));
    }
  }
/**
 *
 * Retrieves the InvoicePrepaidUnbilledUsageTotalOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoicePrepaidUnbilledUsageTotalOutputData getOutput() {
    return InvoicePrepaidUnbilledUsageTotalOutputHelper.fromMap(outputMap);
  }
}
