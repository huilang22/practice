/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CtcRatingTypeDeleteNoOpRequest Udt Request/Response
 *
 */
public class CtcRatingTypeDeleteNoOpRequest extends CtcRatingTypeSubRequestParent {
/**
 *
 * Constructor to create a   CtcRatingTypeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcRatingTypeDeleteNoOpRequest(String id, CtcRatingTypeObjectData noOpIn) {
    super(id, "CtcRatingTypeDeleteNoOpRequest");
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
