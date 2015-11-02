/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingDeleteRequest.java
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
 * Class used to create a CtcItemRatingDeleteRequest Udt Request
 *
 */

public class CtcItemRatingDeleteRequest extends CtcItemRatingSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemRatingDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcItemRatingObjectKeyData for CtcItemRatingDeleteRequest
 *
 */
@JsonCreator
  public CtcItemRatingDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemRating")CtcItemRatingObjectKeyData DeleteIn) {
    super(id, "CtcItemRatingDelete");
    if (DeleteIn != null) {
      addInput("CtcItemRating", CtcItemRatingObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemRatingObjectKeyData").get("CtcItemRatingObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemRatingObjectData that results from the CtcItemRatingDeleteRequest call
 * @return CtcItemRatingObjectData resulting from udt call
 *
 */

  public CtcItemRatingObjectData getOutput() {
    return CtcItemRatingObjectHelper.fromMap(outputMap, "CtcItemRating");
  }
}
