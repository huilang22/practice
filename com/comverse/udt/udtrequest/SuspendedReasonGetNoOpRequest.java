/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SuspendedReasonGetNoOpRequest.java
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

import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a SuspendedReasonGetNoOpRequest Udt Request/Response
 *
 */
public class SuspendedReasonGetNoOpRequest extends SuspendedReasonSubRequestParent {
/**
 *
 * Constructor to create a   SuspendedReasonGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SuspendedReasonGetNoOpRequest(String id, SuspendedReasonObjectData noOpIn) {
    super(id, "SuspendedReasonGetNoOpRequest");
    if (noOpIn != null) {
      addInput("SuspendedReason", SuspendedReasonObjectHelper.toMap(noOpIn, new HashMap(), "SuspendedReason").get("SuspendedReason"));
    }
  }
/**
 *
 * Retrieves the SuspendedReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SuspendedReasonObjectData getOutput() {
    return SuspendedReasonObjectHelper.fromMap(outputMap, "SuspendedReason");
  }
}
