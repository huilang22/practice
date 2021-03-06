/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvoiceDetailByAccountFindCountNoOpRequest.java
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
 * NoOp class used to simulate a InvoiceDetailByAccountFindCountNoOpRequest Udt Request/Response
 *
 */
public class InvoiceDetailByAccountFindCountNoOpRequest extends InvoiceDetailRequest {
/**
 *
 * Constructor to create a   InvoiceDetailByAccountFindCountNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvoiceDetailByAccountFindCountNoOpRequest(String id, Integer noOpIn) {
    super(id, "InvoiceDetailByAccountFindCountNoOpRequest");
    if (noOpIn != null) {
      addInput("TotalCount", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
