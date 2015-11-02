/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrCreateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsHlrCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsHlrCreateNoOpRequest extends InvsHlrSubRequestParent {
/**
 *
 * Constructor to create a   InvsHlrCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsHlrCreateNoOpRequest(String id, InvsHlrObjectData noOpIn) {
    super(id, "InvsHlrCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(noOpIn, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }
/**
 *
 * Retrieves the InvsHlrObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsHlrObjectData getOutput() {
    return InvsHlrObjectHelper.fromMap(outputMap, "InvsHlr");
  }
}
