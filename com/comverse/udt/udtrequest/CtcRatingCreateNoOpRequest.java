/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingCreateNoOpRequest.java
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
 * NoOp class used to simulate a CtcRatingCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcRatingCreateNoOpRequest extends CtcRatingSubRequestParent {
/**
 *
 * Constructor to create a   CtcRatingCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcRatingCreateNoOpRequest(String id, CtcRatingObjectData noOpIn) {
    super(id, "CtcRatingCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcRating", CtcRatingObjectHelper.toMap(noOpIn, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }
/**
 *
 * Retrieves the CtcRatingObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingObjectData getOutput() {
    return CtcRatingObjectHelper.fromMap(outputMap, "CtcRating");
  }
}
