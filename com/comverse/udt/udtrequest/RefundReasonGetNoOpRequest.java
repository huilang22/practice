/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonGetNoOpRequest.java
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
 * NoOp class used to simulate a RefundReasonGetNoOpRequest Udt Request/Response
 *
 */
public class RefundReasonGetNoOpRequest extends RefundReasonSubRequestParent {
/**
 *
 * Constructor to create a   RefundReasonGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RefundReasonGetNoOpRequest(String id, RefundReasonObjectData noOpIn) {
    super(id, "RefundReasonGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RefundReason", RefundReasonObjectHelper.toMap(noOpIn, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }
/**
 *
 * Retrieves the RefundReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RefundReasonObjectData getOutput() {
    return RefundReasonObjectHelper.fromMap(outputMap, "RefundReason");
  }
}
