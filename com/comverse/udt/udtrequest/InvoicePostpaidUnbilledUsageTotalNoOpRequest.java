/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePostpaidUnbilledUsageTotalNoOpRequest.java
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
 * NoOp class used to simulate a InvoicePostpaidUnbilledUsageTotalNoOpRequest Udt Request/Response
 *
 */
public class InvoicePostpaidUnbilledUsageTotalNoOpRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a   InvoicePostpaidUnbilledUsageTotalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoicePostpaidUnbilledUsageTotalNoOpRequest(String id, InvoicePostpaidUnbilledUsageTotalOutputData noOpIn) {
    super(id, "InvoicePostpaidUnbilledUsageTotalNoOpRequest");
    if (noOpIn != null) {
      addInput("InvoicePostpaidUnbilledUsageTotalOutputData", InvoicePostpaidUnbilledUsageTotalOutputHelper.toMap(noOpIn).get("InvoicePostpaidUnbilledUsageTotalOutputData"));
    }
  }
/**
 *
 * Retrieves the InvoicePostpaidUnbilledUsageTotalOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoicePostpaidUnbilledUsageTotalOutputData getOutput() {
    return InvoicePostpaidUnbilledUsageTotalOutputHelper.fromMap(outputMap);
  }
}
