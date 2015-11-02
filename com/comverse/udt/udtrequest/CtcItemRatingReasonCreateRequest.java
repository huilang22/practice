/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonCreateRequest.java
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
 * Class used to create a CtcItemRatingReasonCreateRequest Udt Request
 *
 */

public class CtcItemRatingReasonCreateRequest extends CtcItemRatingReasonSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemRatingReasonCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcItemRatingReasonObjectData for CtcItemRatingReasonCreateRequest
 *
 */
@JsonCreator
  public CtcItemRatingReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemRatingReason")CtcItemRatingReasonObjectData CreateIn) {
    super(id, "CtcItemRatingReasonCreate");
    if (CreateIn != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectHelper.toMap(CreateIn, new HashMap(), "CtcItemRatingReason").get("CtcItemRatingReason"));
    }
  }

/**
 *
 * Retrieves the CtcItemRatingReasonObjectData that results from the CtcItemRatingReasonCreateRequest call
 * @return CtcItemRatingReasonObjectData resulting from udt call
 *
 */

  public CtcItemRatingReasonObjectData getOutput() {
    return CtcItemRatingReasonObjectHelper.fromMap(outputMap, "CtcItemRatingReason");
  }
}
