/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonMapGetNoOpRequest.java
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
 * NoOp class used to simulate a StatusReasonMapGetNoOpRequest Udt Request/Response
 *
 */
public class StatusReasonMapGetNoOpRequest extends StatusReasonMapSubRequestParent {
/**
 *
 * Constructor to create a   StatusReasonMapGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatusReasonMapGetNoOpRequest(String id, SRMObjectData noOpIn) {
    super(id, "StatusReasonMapGetNoOpRequest");
    if (noOpIn != null) {
      addInput("StatusReasonMap", SRMObjectHelper.toMap(noOpIn, new HashMap(), "StatusReasonMap").get("StatusReasonMap"));
    }
  }
/**
 *
 * Retrieves the SRMObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SRMObjectData getOutput() {
    return SRMObjectHelper.fromMap(outputMap, "StatusReasonMap");
  }
}
