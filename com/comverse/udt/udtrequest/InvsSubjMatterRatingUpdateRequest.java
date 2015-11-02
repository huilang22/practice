/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingUpdateRequest.java
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
 * Class used to create a InvsSubjMatterRatingUpdateRequest Udt Request
 *
 */

public class InvsSubjMatterRatingUpdateRequest extends InvsSubjMatterRatingSubRequestParent {
/**
 *
 * Constructor to create a  InvsSubjMatterRatingUpdateRequest
 * @param id Unique request name
 * @param InvsSubjMatterRatingUpdateIn InvsSubjMatterRatingObjectData for InvsSubjMatterRatingUpdateRequest
 *
 */
@JsonCreator
  public InvsSubjMatterRatingUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSubjMatterRating")InvsSubjMatterRatingObjectData InvsSubjMatterRatingUpdateIn) {
    super(id, "InvsSubjMatterRatingUpdate");
    if (InvsSubjMatterRatingUpdateIn != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(InvsSubjMatterRatingUpdateIn, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }

/**
 *
 * Retrieves the InvsSubjMatterRatingObjectData that results from the InvsSubjMatterRatingUpdateRequest call
 * @return InvsSubjMatterRatingObjectData resulting from udt call
 *
 */

  public InvsSubjMatterRatingObjectData getOutput() {
    return InvsSubjMatterRatingObjectHelper.fromMap(outputMap, "InvsSubjMatterRating");
  }
}
