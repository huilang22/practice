/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateTierCreateNoOpRequest.java
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
 * NoOp class used to simulate a RbrRateTierCreateNoOpRequest Udt Request/Response
 *
 */
public class RbrRateTierCreateNoOpRequest extends RbrRateTierSubRequestParent {
/**
 *
 * Constructor to create a   RbrRateTierCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrRateTierCreateNoOpRequest(String id, RbrRteTierObjectData noOpIn) {
    super(id, "RbrRateTierCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(noOpIn, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }
/**
 *
 * Retrieves the RbrRteTierObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRteTierObjectData getOutput() {
    return RbrRteTierObjectHelper.fromMap(outputMap, "RbrRateTier");
  }
}
