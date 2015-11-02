/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonDeleteRequest.java
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
 * Class used to create a CtcRatingReasonDeleteRequest Udt Request
 *
 */

public class CtcRatingReasonDeleteRequest extends CtcRatingReasonSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingReasonDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcRatingReasonObjectKeyData for CtcRatingReasonDeleteRequest
 *
 */
@JsonCreator
  public CtcRatingReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRatingReason")CtcRatingReasonObjectKeyData DeleteIn) {
    super(id, "CtcRatingReasonDelete");
    if (DeleteIn != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcRatingReasonObjectKeyData").get("CtcRatingReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcRatingReasonObjectData that results from the CtcRatingReasonDeleteRequest call
 * @return CtcRatingReasonObjectData resulting from udt call
 *
 */

  public CtcRatingReasonObjectData getOutput() {
    return CtcRatingReasonObjectHelper.fromMap(outputMap, "CtcRatingReason");
  }
}
