/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonUpdateNoOpRequest.java
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
 * NoOp class used to simulate a RefundReasonUpdateNoOpRequest Udt Request/Response
 *
 */
public class RefundReasonUpdateNoOpRequest extends RefundReasonSubRequestParent {
/**
 *
 * Constructor to create a   RefundReasonUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RefundReasonUpdateNoOpRequest(String id, RefundReasonObjectData noOpIn) {
    super(id, "RefundReasonUpdateNoOpRequest");
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
