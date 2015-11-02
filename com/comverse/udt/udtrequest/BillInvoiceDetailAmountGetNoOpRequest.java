/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillInvoiceDetailAmountGetNoOpRequest.java
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
 * NoOp class used to simulate a BillInvoiceDetailAmountGetNoOpRequest Udt Request/Response
 *
 */
public class BillInvoiceDetailAmountGetNoOpRequest extends InvoiceDetailSubRequestParent {
/**
 *
 * Constructor to create a   BillInvoiceDetailAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BillInvoiceDetailAmountGetNoOpRequest(String id, BillInvoiceDetailAmountObjectData noOpIn) {
    super(id, "BillInvoiceDetailAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BillInvoiceDetailAmount", BillInvoiceDetailAmountObjectHelper.toMap(noOpIn, new HashMap(), "BillInvoiceDetailAmount").get("BillInvoiceDetailAmount"));
    }
  }
/**
 *
 * Retrieves the BillInvoiceDetailAmountObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BillInvoiceDetailAmountObjectData getOutput() {
    return BillInvoiceDetailAmountObjectHelper.fromMap(outputMap, "BillInvoiceDetailAmount");
  }
}
