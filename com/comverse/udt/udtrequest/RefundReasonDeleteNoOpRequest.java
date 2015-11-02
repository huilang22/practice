/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonDeleteNoOpRequest.java
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
 * NoOp class used to simulate a RefundReasonDeleteNoOpRequest Udt Request/Response
 *
 */
public class RefundReasonDeleteNoOpRequest extends RefundReasonSubRequestParent {
/**
 *
 * Constructor to create a   RefundReasonDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RefundReasonDeleteNoOpRequest(String id, RefundReasonObjectData noOpIn) {
    super(id, "RefundReasonDeleteNoOpRequest");
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
