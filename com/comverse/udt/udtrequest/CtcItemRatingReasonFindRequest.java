/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonFindRequest.java
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
 * Class used to create a CtcItemRatingReasonFindRequest Udt Request
 *
 */

public class CtcItemRatingReasonFindRequest extends CtcItemRatingReasonRequest {
/**
 *
 * Constructor to create a  CtcItemRatingReasonFindRequest
 * @param id Unique request name
 * @param FindIn CtcItemRatingReasonObjectFilter for CtcItemRatingReasonFindRequest
 *
 */
@JsonCreator
  public CtcItemRatingReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemRatingReason")CtcItemRatingReasonObjectFilter FindIn) {
    super(id, "CtcItemRatingReasonFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(FindIn, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }

/**
 *
 * Retrieves the CtcItemRatingReasonObjectDataList that results from the CtcItemRatingReasonFindRequest call
 * @return CtcItemRatingReasonObjectDataList resulting from udt call
 *
 */

  public CtcItemRatingReasonObjectDataList getOutput() {
    return CtcItemRatingReasonObjectHelper.fromMapList(outputMap, "CtcItemRatingReasonList");
  }
}
