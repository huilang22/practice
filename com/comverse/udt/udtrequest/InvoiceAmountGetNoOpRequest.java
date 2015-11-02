/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceAmountGetNoOpRequest.java
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
 * NoOp class used to simulate a InvoiceAmountGetNoOpRequest Udt Request/Response
 *
 */
public class InvoiceAmountGetNoOpRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a   InvoiceAmountGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoiceAmountGetNoOpRequest(String id, InvoiceAmountObjectData noOpIn) {
    super(id, "InvoiceAmountGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvoiceAmount", InvoiceAmountObjectHelper.toMap(noOpIn, new HashMap(), "InvoiceAmount").get("InvoiceAmount"));
    }
  }
/**
 *
 * Retrieves the InvoiceAmountObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceAmountObjectData getOutput() {
    return InvoiceAmountObjectHelper.fromMap(outputMap, "InvoiceAmount");
  }
}
