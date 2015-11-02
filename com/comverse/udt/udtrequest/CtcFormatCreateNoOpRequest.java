/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatCreateNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcFormatCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcFormatCreateNoOpRequest extends CtcFormatSubRequestParent {
/**
 *
 * Constructor to create a   CtcFormatCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcFormatCreateNoOpRequest(String id, CtcFormatObjectData noOpIn) {
    super(id, "CtcFormatCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcFormat", CtcFormatObjectHelper.toMap(noOpIn, new HashMap(), "CtcFormat").get("CtcFormat"));
    }
  }
/**
 *
 * Retrieves the CtcFormatObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFormatObjectData getOutput() {
    return CtcFormatObjectHelper.fromMap(outputMap, "CtcFormat");
  }
}
