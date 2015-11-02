/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a CtcFormatTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcFormatTypeCreateNoOpRequest extends CtcFormatTypeSubRequestParent {
/**
 *
 * Constructor to create a   CtcFormatTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcFormatTypeCreateNoOpRequest(String id, CtcFormatTypeObjectData noOpIn) {
    super(id, "CtcFormatTypeCreateNoOpRequest");
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
