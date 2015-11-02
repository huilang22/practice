/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailGetNoOpRequest.java
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
 * NoOp class used to simulate a InvoiceDetailGetNoOpRequest Udt Request/Response
 *
 */
public class InvoiceDetailGetNoOpRequest extends InvoiceDetailSubRequestParent {
/**
 *
 * Constructor to create a   InvoiceDetailGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoiceDetailGetNoOpRequest(String id, InvoiceDetailObjectData noOpIn) {
    super(id, "InvoiceDetailGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(noOpIn, new HashMap(), "InvoiceDetail").get("InvoiceDetail"));
    }
  }
/**
 *
 * Retrieves the InvoiceDetailObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvoiceDetailObjectData getOutput() {
    return InvoiceDetailObjectHelper.fromMap(outputMap, "InvoiceDetail");
  }
}
