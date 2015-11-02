/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableCreateNoOpRequest.java
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
 * NoOp class used to simulate a RbrVariableCreateNoOpRequest Udt Request/Response
 *
 */
public class RbrVariableCreateNoOpRequest extends RbrVariableSubRequestParent {
/**
 *
 * Constructor to create a   RbrVariableCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrVariableCreateNoOpRequest(String id, RbrVarObjectData noOpIn) {
    super(id, "RbrVariableCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrVariable", RbrVarObjectHelper.toMap(noOpIn, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }
/**
 *
 * Retrieves the RbrVarObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrVarObjectData getOutput() {
    return RbrVarObjectHelper.fromMap(outputMap, "RbrVariable");
  }
}
