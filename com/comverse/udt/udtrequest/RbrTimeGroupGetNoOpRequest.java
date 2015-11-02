/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupGetNoOpRequest.java
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
 * NoOp class used to simulate a RbrTimeGroupGetNoOpRequest Udt Request/Response
 *
 */
public class RbrTimeGroupGetNoOpRequest extends RbrTimeGroupSubRequestParent {
/**
 *
 * Constructor to create a   RbrTimeGroupGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrTimeGroupGetNoOpRequest(String id, RbrTmGrpObjectData noOpIn) {
    super(id, "RbrTimeGroupGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrTimeGroup", RbrTmGrpObjectHelper.toMap(noOpIn, new HashMap(), "RbrTimeGroup").get("RbrTimeGroup"));
    }
  }
/**
 *
 * Retrieves the RbrTmGrpObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrTmGrpObjectData getOutput() {
    return RbrTmGrpObjectHelper.fromMap(outputMap, "RbrTimeGroup");
  }
}
