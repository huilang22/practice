/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CtcFormatTypeDeleteNoOpRequest Udt Request/Response
 *
 */
public class CtcFormatTypeDeleteNoOpRequest extends CtcFormatTypeSubRequestParent {
/**
 *
 * Constructor to create a   CtcFormatTypeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcFormatTypeDeleteNoOpRequest(String id, CtcFormatTypeObjectData noOpIn) {
    super(id, "CtcFormatTypeDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcFormatType", CtcFormatTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtcFormatType").get("CtcFormatType"));
    }
  }
/**
 *
 * Retrieves the CtcFormatTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFormatTypeObjectData getOutput() {
    return CtcFormatTypeObjectHelper.fromMap(outputMap, "CtcFormatType");
  }
}
