/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingCreateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsSubjMatterRatingCreateRequest Udt Request
 *
 */

public class InvsSubjMatterRatingCreateRequest extends InvsSubjMatterRatingSubRequestParent {
/**
 *
 * Constructor to create a  InvsSubjMatterRatingCreateRequest
 * @param id Unique request name
 * @param InvsSubjMatterRatingCreateIn InvsSubjMatterRatingObjectData for InvsSubjMatterRatingCreateRequest
 *
 */
@JsonCreator
  public InvsSubjMatterRatingCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSubjMatterRating")InvsSubjMatterRatingObjectData InvsSubjMatterRatingCreateIn) {
    super(id, "InvsSubjMatterRatingCreate");
    if (InvsSubjMatterRatingCreateIn != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(InvsSubjMatterRatingCreateIn, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }

/**
 *
 * Retrieves the InvsSubjMatterRatingObjectData that results from the InvsSubjMatterRatingCreateRequest call
 * @return InvsSubjMatterRatingObjectData resulting from udt call
 *
 */

  public InvsSubjMatterRatingObjectData getOutput() {
    return InvsSubjMatterRatingObjectHelper.fromMap(outputMap, "InvsSubjMatterRating");
  }
}
