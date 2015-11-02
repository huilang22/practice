/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonUpdateNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a StatusReasonUpdateNoOpRequest Udt Request/Response
 *
 */
public class StatusReasonUpdateNoOpRequest extends StatusReasonSubRequestParent {
/**
 *
 * Constructor to create a   StatusReasonUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatusReasonUpdateNoOpRequest(String id, StatusReasonObjectData noOpIn) {
    super(id, "StatusReasonUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("StatusReason", StatusReasonObjectHelper.toMap(noOpIn, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }
/**
 *
 * Retrieves the StatusReasonObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public StatusReasonObjectData getOutput() {
    return StatusReasonObjectHelper.fromMap(outputMap, "StatusReason");
  }
}
