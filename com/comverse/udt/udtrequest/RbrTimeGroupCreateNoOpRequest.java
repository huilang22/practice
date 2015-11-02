/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimeGroupCreateNoOpRequest.java
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
 * NoOp class used to simulate a RbrTimeGroupCreateNoOpRequest Udt Request/Response
 *
 */
public class RbrTimeGroupCreateNoOpRequest extends RbrTimeGroupSubRequestParent {
/**
 *
 * Constructor to create a   RbrTimeGroupCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrTimeGroupCreateNoOpRequest(String id, RbrTmGrpObjectData noOpIn) {
    super(id, "RbrTimeGroupCreateNoOpRequest");
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
