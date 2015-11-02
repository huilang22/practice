/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePostpaidProductChargeTotalNoOpRequest.java
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
 * NoOp class used to simulate a InvoicePostpaidProductChargeTotalNoOpRequest Udt Request/Response
 *
 */
public class InvoicePostpaidProductChargeTotalNoOpRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a   InvoicePostpaidProductChargeTotalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoicePostpaidProductChargeTotalNoOpRequest(String id, InvoicePostpaidProductChargeTotalOutputData noOpIn) {
    super(id, "InvoicePostpaidProductChargeTotalNoOpRequest");
    if (noOpIn != null) {
      addInput("InvoicePostpaidProductChargeTotalOutputData", InvoicePostpaidProductChargeTotalOutputHelper.toMap(noOpIn).get("InvoicePostpaidProductChargeTotalOutputData"));
    }
  }
/**
 *
 * Retrieves the InvoicePostpaidProductChargeTotalOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoicePostpaidProductChargeTotalOutputData getOutput() {
    return InvoicePostpaidProductChargeTotalOutputHelper.fromMap(outputMap);
  }
}
