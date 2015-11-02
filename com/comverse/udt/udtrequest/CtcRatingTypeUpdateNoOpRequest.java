/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CtcRatingTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class CtcRatingTypeUpdateNoOpRequest extends CtcRatingTypeSubRequestParent {
/**
 *
 * Constructor to create a   CtcRatingTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcRatingTypeUpdateNoOpRequest(String id, CtcRatingTypeObjectData noOpIn) {
    super(id, "CtcRatingTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcRatingType", CtcRatingTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtcRatingType").get("CtcRatingType"));
    }
  }
/**
 *
 * Retrieves the CtcRatingTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingTypeObjectData getOutput() {
    return CtcRatingTypeObjectHelper.fromMap(outputMap, "CtcRatingType");
  }
}
