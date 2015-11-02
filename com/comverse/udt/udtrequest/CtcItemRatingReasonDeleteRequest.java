/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemRatingReasonDeleteRequest.java
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
 * Class used to create a CtcItemRatingReasonDeleteRequest Udt Request
 *
 */

public class CtcItemRatingReasonDeleteRequest extends CtcItemRatingReasonSubRequestParent {
/**
 *
 * Constructor to create a  CtcItemRatingReasonDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcItemRatingReasonObjectKeyData for CtcItemRatingReasonDeleteRequest
 *
 */
@JsonCreator
  public CtcItemRatingReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcItemRatingReason")CtcItemRatingReasonObjectKeyData DeleteIn) {
    super(id, "CtcItemRatingReasonDelete");
    if (DeleteIn != null) {
      addInput("CtcItemRatingReason", CtcItemRatingReasonObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcItemRatingReasonObjectKeyData").get("CtcItemRatingReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcItemRatingReasonObjectData that results from the CtcItemRatingReasonDeleteRequest call
 * @return CtcItemRatingReasonObjectData resulting from udt call
 *
 */

  public CtcItemRatingReasonObjectData getOutput() {
    return CtcItemRatingReasonObjectHelper.fromMap(outputMap, "CtcItemRatingReason");
  }
}
