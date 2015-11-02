/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonGetRequest.java
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
 * Class used to create a CtcItemRatingReasonGetRequest Udt Request
 *
 */

public class CtcItemRatingReasonGetRequest extends CtcItemRatingReasonSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemRatingReasonGetRequest
 * @param id Unique request name
 * @param GetIn CtcItemRatingReasonObjectKeyData for CtcItemRatingReasonGetRequest
 *
 */
@JsonCreator
  public CtcItemRatingReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemRatingReason")CtcItemRatingReasonObjectKeyData GetIn) {
    super(id, "CtcItemRatingReasonGet");
    if (GetIn != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcItemRatingReasonObjectKeyData").get("CtcItemRatingReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemRatingReasonObjectData that results from the CtcItemRatingReasonGetRequest call
 * @return CtcItemRatingReasonObjectData resulting from udt call
 *
 */

  public CtcItemRatingReasonObjectData getOutput() {
    return CtcItemRatingReasonObjectHelper.fromMap(outputMap, "CtcItemRatingReason");
  }
}
