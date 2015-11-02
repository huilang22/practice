/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingFindRequest.java
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
 * Class used to create a CtcRatingFindRequest Udt Request
 *
 */

public class CtcRatingFindRequest extends CtcRatingRequest {
/**
 *
 * Constructor to create a  CtcRatingFindRequest
 * @param id Unique request name
 * @param FindIn CtcRatingObjectFilter for CtcRatingFindRequest
 *
 */
@JsonCreator
  public CtcRatingFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRating")CtcRatingObjectFilter FindIn) {
    super(id, "CtcRatingFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcRating", CtcRatingObjectHelper.toMap(FindIn, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }

/**
 *
 * Retrieves the CtcRatingObjectDataList that results from the CtcRatingFindRequest call
 * @return CtcRatingObjectDataList resulting from udt call
 *
 */

  public CtcRatingObjectDataList getOutput() {
    return CtcRatingObjectHelper.fromMapList(outputMap, "CtcRatingList");
  }
}
