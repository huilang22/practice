/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsSubjMatterRatingGetNoOpRequest Udt Request/Response
 *
 */
public class InvsSubjMatterRatingGetNoOpRequest extends InvsSubjMatterRatingSubRequestParent {
/**
 *
 * Constructor to create a   InvsSubjMatterRatingGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsSubjMatterRatingGetNoOpRequest(String id, InvsSubjMatterRatingObjectData noOpIn) {
    super(id, "InvsSubjMatterRatingGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(noOpIn, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }
/**
 *
 * Retrieves the InvsSubjMatterRatingObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSubjMatterRatingObjectData getOutput() {
    return InvsSubjMatterRatingObjectHelper.fromMap(outputMap, "InvsSubjMatterRating");
  }
}
