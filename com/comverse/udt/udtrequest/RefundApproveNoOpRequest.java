/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundApproveNoOpRequest.java
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
 * NoOp class used to simulate a RefundApproveNoOpRequest Udt Request/Response
 *
 */
public class RefundApproveNoOpRequest extends RefundSubRequestParent {
/**
 *
 * Constructor to create a   RefundApproveNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RefundApproveNoOpRequest(String id, RefundObjectData noOpIn) {
    super(id, "RefundApproveNoOpRequest");
    if (noOpIn != null) {
      addInput("Refund", RefundObjectHelper.toMap(noOpIn, new HashMap(), "Refund").get("Refund"));
    }
  }
/**
 *
 * Retrieves the RefundObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RefundObjectData getOutput() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
}
