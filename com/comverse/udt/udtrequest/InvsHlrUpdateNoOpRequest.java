/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsHlrUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsHlrUpdateNoOpRequest extends InvsHlrSubRequestParent {
/**
 *
 * Constructor to create a   InvsHlrUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsHlrUpdateNoOpRequest(String id, InvsHlrObjectData noOpIn) {
    super(id, "InvsHlrUpdateNoOpRequest");
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
