/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingFindRequest.java
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
 * Class used to create a CtcItemRatingFindRequest Udt Request
 *
 */

public class CtcItemRatingFindRequest extends CtcItemRatingRequest {
/**
 *
 * Constructor to create a  CtcItemRatingFindRequest
 * @param id Unique request name
 * @param FindIn CtcItemRatingObjectFilter for CtcItemRatingFindRequest
 *
 */
@JsonCreator
  public CtcItemRatingFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemRating")CtcItemRatingObjectFilter FindIn) {
    super(id, "CtcItemRatingFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItemRating", CtcItemRatingObjectHelper.toMap(FindIn, new HashMap(), "CtcItemRating").get("CtcItemRating"));
    }
  }

/**
 *
 * Retrieves the CtcItemRatingObjectDataList that results from the CtcItemRatingFindRequest call
 * @return CtcItemRatingObjectDataList resulting from udt call
 *
 */

  public CtcItemRatingObjectDataList getOutput() {
    return CtcItemRatingObjectHelper.fromMapList(outputMap, "CtcItemRatingList");
  }
}
