/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSubjMatterRatingFindRequest.java
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
 * Class used to create a InvsSubjMatterRatingFindRequest Udt Request
 *
 */

public class InvsSubjMatterRatingFindRequest extends InvsSubjMatterRatingRequest {
/**
 *
 * Constructor to create a  InvsSubjMatterRatingFindRequest
 * @param id Unique request name
 * @param InvsSubjMatterRatingFindIn InvsSubjMatterRatingObjectFilter for InvsSubjMatterRatingFindRequest
 *
 */
@JsonCreator
  public InvsSubjMatterRatingFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSubjMatterRating")InvsSubjMatterRatingObjectFilter InvsSubjMatterRatingFindIn) {
    super(id, "InvsSubjMatterRatingFind");
    if (InvsSubjMatterRatingFindIn != null) {
      Integer index =  InvsSubjMatterRatingFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSubjMatterRating", InvsSubjMatterRatingObjectHelper.toMap(InvsSubjMatterRatingFindIn, new HashMap(), "InvsSubjMatterRating").get("InvsSubjMatterRating"));
    }
  }

/**
 *
 * Retrieves the InvsSubjMatterRatingObjectDataList that results from the InvsSubjMatterRatingFindRequest call
 * @return InvsSubjMatterRatingObjectDataList resulting from udt call
 *
 */

  public InvsSubjMatterRatingObjectDataList getOutput() {
    return InvsSubjMatterRatingObjectHelper.fromMapList(outputMap, "InvsSubjMatterRatingList");
  }
}
