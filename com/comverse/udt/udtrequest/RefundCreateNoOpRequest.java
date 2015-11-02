/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundCreateNoOpRequest.java
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
 * NoOp class used to simulate a RefundCreateNoOpRequest Udt Request/Response
 *
 */
public class RefundCreateNoOpRequest extends RefundSubRequestParent {
/**
 *
 * Constructor to create a   RefundCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RefundCreateNoOpRequest(String id, RefundObjectData noOpIn) {
    super(id, "RefundCreateNoOpRequest");
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
