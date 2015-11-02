/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcRatingGetRequest Udt Request
 *
 */

public class CtcRatingGetRequest extends CtcRatingSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingGetRequest
 * @param id Unique request name
 * @param GetIn CtcRatingObjectKeyData for CtcRatingGetRequest
 *
 */
@JsonCreator
  public CtcRatingGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRating")CtcRatingObjectKeyData GetIn) {
    super(id, "CtcRatingGet");
    if (GetIn != null) {
      addInput("CtcRating", CtcRatingObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcRatingObjectKeyData").get("CtcRatingObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcRatingObjectData that results from the CtcRatingGetRequest call
 * @return CtcRatingObjectData resulting from udt call
 *
 */

  public CtcRatingObjectData getOutput() {
    return CtcRatingObjectHelper.fromMap(outputMap, "CtcRating");
  }
}
