/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoicePrepaidProductChargeTotalNoOpRequest.java
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
 * NoOp class used to simulate a InvoicePrepaidProductChargeTotalNoOpRequest Udt Request/Response
 *
 */
public class InvoicePrepaidProductChargeTotalNoOpRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a   InvoicePrepaidProductChargeTotalNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoicePrepaidProductChargeTotalNoOpRequest(String id, InvoicePrepaidProductChargeTotalOutputData noOpIn) {
    super(id, "InvoicePrepaidProductChargeTotalNoOpRequest");
    if (noOpIn != null) {
      addInput("InvoicePrepaidProductChargeTotalOutputData", InvoicePrepaidProductChargeTotalOutputHelper.toMap(noOpIn).get("InvoicePrepaidProductChargeTotalOutputData"));
    }
  }
/**
 *
 * Retrieves the InvoicePrepaidProductChargeTotalOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoicePrepaidProductChargeTotalOutputData getOutput() {
    return InvoicePrepaidProductChargeTotalOutputHelper.fromMap(outputMap);
  }
}
