/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingGetNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemRatingGetNoOpRequest Udt Request/Response
 *
 */
public class CtcItemRatingGetNoOpRequest extends CtcItemRatingSubRequestParent {
/**
 *
 * Constructor to create a   CtcItemRatingGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemRatingGetNoOpRequest(String id, CtcItemRatingObjectData noOpIn) {
    super(id, "CtcItemRatingGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcItemRating", CtcItemRatingObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemRating").get("CtcItemRating"));
    }
  }
/**
 *
 * Retrieves the CtcItemRatingObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemRatingObjectData getOutput() {
    return CtcItemRatingObjectHelper.fromMap(outputMap, "CtcItemRating");
  }
}
