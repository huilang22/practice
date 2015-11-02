/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonCreateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsReasonCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsReasonCreateNoOpRequest extends InvsReasonSubRequestParent {
/**
 *
 * Constructor to create a   InvsReasonCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsReasonCreateNoOpRequest(String id, InvsReasonObjectData noOpIn) {
    super(id, "InvsReasonCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsReason", InvsReasonObjectHelper.toMap(noOpIn, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }
/**
 *
 * Retrieves the InvsReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsReasonObjectData getOutput() {
    return InvsReasonObjectHelper.fromMap(outputMap, "InvsReason");
  }
}
