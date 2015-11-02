/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingDeleteRequest.java
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
 * Class used to create a CtcRatingDeleteRequest Udt Request
 *
 */

public class CtcRatingDeleteRequest extends CtcRatingSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcRatingObjectKeyData for CtcRatingDeleteRequest
 *
 */
@JsonCreator
  public CtcRatingDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRating")CtcRatingObjectKeyData DeleteIn) {
    super(id, "CtcRatingDelete");
    if (DeleteIn != null) {
      addInput("CtcRating", CtcRatingObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcRatingObjectKeyData").get("CtcRatingObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcRatingObjectData that results from the CtcRatingDeleteRequest call
 * @return CtcRatingObjectData resulting from udt call
 *
 */

  public CtcRatingObjectData getOutput() {
    return CtcRatingObjectHelper.fromMap(outputMap, "CtcRating");
  }
}
