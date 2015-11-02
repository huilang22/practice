/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingUpdateRequest.java
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
 * Class used to create a CtcRatingUpdateRequest Udt Request
 *
 */

public class CtcRatingUpdateRequest extends CtcRatingSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcRatingObjectData for CtcRatingUpdateRequest
 *
 */
@JsonCreator
  public CtcRatingUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRating")CtcRatingObjectData UpdateIn) {
    super(id, "CtcRatingUpdate");
    if (UpdateIn != null) {
      addInput("CtcRating", CtcRatingObjectHelper.toMap(UpdateIn, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }

/**
 *
 * Retrieves the CtcRatingObjectData that results from the CtcRatingUpdateRequest call
 * @return CtcRatingObjectData resulting from udt call
 *
 */

  public CtcRatingObjectData getOutput() {
    return CtcRatingObjectHelper.fromMap(outputMap, "CtcRating");
  }
}
