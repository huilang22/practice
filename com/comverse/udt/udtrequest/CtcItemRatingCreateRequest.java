/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingCreateRequest.java
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
 * Class used to create a CtcItemRatingCreateRequest Udt Request
 *
 */

public class CtcItemRatingCreateRequest extends CtcItemRatingSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemRatingCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcItemRatingObjectData for CtcItemRatingCreateRequest
 *
 */
@JsonCreator
  public CtcItemRatingCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemRating")CtcItemRatingObjectData CreateIn) {
    super(id, "CtcItemRatingCreate");
    if (CreateIn != null) {
      addInput("CtcItemRating", CtcItemRatingObjectHelper.toMap(CreateIn, new HashMap(), "CtcItemRating").get("CtcItemRating"));
    }
  }

/**
 *
 * Retrieves the CtcItemRatingObjectData that results from the CtcItemRatingCreateRequest call
 * @return CtcItemRatingObjectData resulting from udt call
 *
 */

  public CtcItemRatingObjectData getOutput() {
    return CtcItemRatingObjectHelper.fromMap(outputMap, "CtcItemRating");
  }
}
