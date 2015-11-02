/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonGetRequest.java
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
 * Class used to create a CtcRatingReasonGetRequest Udt Request
 *
 */

public class CtcRatingReasonGetRequest extends CtcRatingReasonSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingReasonGetRequest
 * @param id Unique request name
 * @param GetIn CtcRatingReasonObjectKeyData for CtcRatingReasonGetRequest
 *
 */
@JsonCreator
  public CtcRatingReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRatingReason")CtcRatingReasonObjectKeyData GetIn) {
    super(id, "CtcRatingReasonGet");
    if (GetIn != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcRatingReasonObjectKeyData").get("CtcRatingReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcRatingReasonObjectData that results from the CtcRatingReasonGetRequest call
 * @return CtcRatingReasonObjectData resulting from udt call
 *
 */

  public CtcRatingReasonObjectData getOutput() {
    return CtcRatingReasonObjectHelper.fromMap(outputMap, "CtcRatingReason");
  }
}
