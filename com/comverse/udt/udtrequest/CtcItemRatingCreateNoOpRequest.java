/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingCreateNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemRatingCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcItemRatingCreateNoOpRequest extends CtcItemRatingSubRequestParent {
/**
 *
 * Constructor to create a   CtcItemRatingCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemRatingCreateNoOpRequest(String id, CtcItemRatingObjectData noOpIn) {
    super(id, "CtcItemRatingCreateNoOpRequest");
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
