/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonCreateRequest.java
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
 * Class used to create a CtcRatingReasonCreateRequest Udt Request
 *
 */

public class CtcRatingReasonCreateRequest extends CtcRatingReasonSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingReasonCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcRatingReasonObjectData for CtcRatingReasonCreateRequest
 *
 */
@JsonCreator
  public CtcRatingReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRatingReason")CtcRatingReasonObjectData CreateIn) {
    super(id, "CtcRatingReasonCreate");
    if (CreateIn != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(CreateIn, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }

/**
 *
 * Retrieves the CtcRatingReasonObjectData that results from the CtcRatingReasonCreateRequest call
 * @return CtcRatingReasonObjectData resulting from udt call
 *
 */

  public CtcRatingReasonObjectData getOutput() {
    return CtcRatingReasonObjectHelper.fromMap(outputMap, "CtcRatingReason");
  }
}
