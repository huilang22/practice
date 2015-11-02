/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceReissueGetNoOpRequest.java
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
 * NoOp class used to simulate a InvoiceReissueGetNoOpRequest Udt Request/Response
 *
 */
public class InvoiceReissueGetNoOpRequest extends InvoiceSubRequestParent {
/**
 *
 * Constructor to create a   InvoiceReissueGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoiceReissueGetNoOpRequest(String id, InvoiceObjectData noOpIn) {
    super(id, "InvoiceReissueGetNoOpRequest");
    if (noOpIn != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(noOpIn, new HashMap(), "Invoice").get("Invoice"));
    }
  }
/**
 *
 * Retrieves the InvoiceObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceObjectData getOutput() {
    return InvoiceObjectHelper.fromMap(outputMap, "Invoice");
  }
}
