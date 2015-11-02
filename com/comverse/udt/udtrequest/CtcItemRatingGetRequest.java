/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingGetRequest.java
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
 * Class used to create a CtcItemRatingGetRequest Udt Request
 *
 */

public class CtcItemRatingGetRequest extends CtcItemRatingSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemRatingGetRequest
 * @param id Unique request name
 * @param GetIn CtcItemRatingObjectKeyData for CtcItemRatingGetRequest
 *
 */
@JsonCreator
  public CtcItemRatingGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemRating")CtcItemRatingObjectKeyData GetIn) {
    super(id, "CtcItemRatingGet");
    if (GetIn != null) {
      addInput("CtcItemRating", CtcItemRatingObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemRatingObjectKeyData").get("CtcItemRatingObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemRatingObjectData that results from the CtcItemRatingGetRequest call
 * @return CtcItemRatingObjectData resulting from udt call
 *
 */

  public CtcItemRatingObjectData getOutput() {
    return CtcItemRatingObjectHelper.fromMap(outputMap, "CtcItemRating");
  }
}
