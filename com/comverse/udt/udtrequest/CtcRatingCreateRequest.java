/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingCreateRequest.java
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
 * Class used to create a CtcRatingCreateRequest Udt Request
 *
 */

public class CtcRatingCreateRequest extends CtcRatingSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcRatingObjectData for CtcRatingCreateRequest
 *
 */
@JsonCreator
  public CtcRatingCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRating")CtcRatingObjectData CreateIn) {
    super(id, "CtcRatingCreate");
    if (CreateIn != null) {
      addInput("CtcRating", CtcRatingObjectHelper.toMap(CreateIn, new HashMap(), "CtcRating").get("CtcRating"));
    }
  }

/**
 *
 * Retrieves the CtcRatingObjectData that results from the CtcRatingCreateRequest call
 * @return CtcRatingObjectData resulting from udt call
 *
 */

  public CtcRatingObjectData getOutput() {
    return CtcRatingObjectHelper.fromMap(outputMap, "CtcRating");
  }
}
