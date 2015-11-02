/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureGetNoOpRequest.java
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
 * NoOp class used to simulate a RbrProcedureGetNoOpRequest Udt Request/Response
 *
 */
public class RbrProcedureGetNoOpRequest extends RbrProcedureSubRequestParent {
/**
 *
 * Constructor to create a   RbrProcedureGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrProcedureGetNoOpRequest(String id, RbrProcObjectData noOpIn) {
    super(id, "RbrProcedureGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(noOpIn, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }
/**
 *
 * Retrieves the RbrProcObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrProcObjectData getOutput() {
    return RbrProcObjectHelper.fromMap(outputMap, "RbrProcedure");
  }
}
