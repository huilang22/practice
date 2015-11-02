/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonFindRequest.java
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
 * Class used to create a CtcRatingReasonFindRequest Udt Request
 *
 */

public class CtcRatingReasonFindRequest extends CtcRatingReasonRequest {
/**
 *
 * Constructor to create a  CtcRatingReasonFindRequest
 * @param id Unique request name
 * @param FindIn CtcRatingReasonObjectFilter for CtcRatingReasonFindRequest
 *
 */
@JsonCreator
  public CtcRatingReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRatingReason")CtcRatingReasonObjectFilter FindIn) {
    super(id, "CtcRatingReasonFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(FindIn, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }

/**
 *
 * Retrieves the CtcRatingReasonObjectDataList that results from the CtcRatingReasonFindRequest call
 * @return CtcRatingReasonObjectDataList resulting from udt call
 *
 */

  public CtcRatingReasonObjectDataList getOutput() {
    return CtcRatingReasonObjectHelper.fromMapList(outputMap, "CtcRatingReasonList");
  }
}
