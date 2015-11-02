/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamCreateNoOpRequest.java
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
 * NoOp class used to simulate a CtmParamCreateNoOpRequest Udt Request/Response
 *
 */
public class CtmParamCreateNoOpRequest extends CtmParamSubRequestParent {
/**
 *
 * Constructor to create a   CtmParamCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmParamCreateNoOpRequest(String id, CtmParamObjectData noOpIn) {
    super(id, "CtmParamCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtmParam", CtmParamObjectHelper.toMap(noOpIn, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }
/**
 *
 * Retrieves the CtmParamObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtmParamObjectData getOutput() {
    return CtmParamObjectHelper.fromMap(outputMap, "CtmParam");
  }
}
