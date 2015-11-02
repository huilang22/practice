/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingGetRequest.java
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
 * Class used to create a InvsSubjMatterRatingGetRequest Udt Request
 *
 */

public class InvsSubjMatterRatingGetRequest extends InvsSubjMatterRatingSubRequestParent {
/**
 *
 * Constructor to create a  InvsSubjMatterRatingGetRequest
 * @param id Unique request name
 * @param InvsSubjMatterRatingGetIn InvsSubjMatterRatingObjectKeyData for InvsSubjMatterRatingGetRequest
 *
 */
@JsonCreator
  public InvsSubjMatterRatingGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSubjMatterRating")InvsSubjMatterRatingObjectKeyData InvsSubjMatterRatingGetIn) {
    super(id, "InvsSubjMatterRatingGet");
    if (InvsSubjMatterRatingGetIn != null) {
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectKeyHelper.toMap(InvsSubjMatterRatingGetIn, new HashMap(), "InvsSubjMatterRatingObjectKeyData").get("InvsSubjMatterRatingObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsSubjMatterRatingObjectData that results from the InvsSubjMatterRatingGetRequest call
 * @return InvsSubjMatterRatingObjectData resulting from udt call
 *
 */

  public InvsSubjMatterRatingObjectData getOutput() {
    return InvsSubjMatterRatingObjectHelper.fromMap(outputMap, "InvsSubjMatterRating");
  }
}
