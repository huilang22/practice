/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a CtmParamTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class CtmParamTypeCreateNoOpRequest extends CtmParamTypeSubRequestParent {
/**
 *
 * Constructor to create a   CtmParamTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmParamTypeCreateNoOpRequest(String id, CtmParamTypeObjectData noOpIn) {
    super(id, "CtmParamTypeCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtmParamType", CtmParamTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtmParamType").get("CtmParamType"));
    }
  }
/**
 *
 * Retrieves the CtmParamTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtmParamTypeObjectData getOutput() {
    return CtmParamTypeObjectHelper.fromMap(outputMap, "CtmParamType");
  }
}
