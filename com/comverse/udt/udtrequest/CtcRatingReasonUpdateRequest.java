/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingReasonUpdateRequest.java
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
 * Class used to create a CtcRatingReasonUpdateRequest Udt Request
 *
 */

public class CtcRatingReasonUpdateRequest extends CtcRatingReasonSubRequestParent {
/**
 *
 * Constructor to create a  CtcRatingReasonUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcRatingReasonObjectData for CtcRatingReasonUpdateRequest
 *
 */
@JsonCreator
  public CtcRatingReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcRatingReason")CtcRatingReasonObjectData UpdateIn) {
    super(id, "CtcRatingReasonUpdate");
    if (UpdateIn != null) {
      addInput("CtcRatingReason", CtcRatingReasonObjectHelper.toMap(UpdateIn, new HashMap(), "CtcRatingReason").get("CtcRatingReason"));
    }
  }

/**
 *
 * Retrieves the CtcRatingReasonObjectData that results from the CtcRatingReasonUpdateRequest call
 * @return CtcRatingReasonObjectData resulting from udt call
 *
 */

  public CtcRatingReasonObjectData getOutput() {
    return CtcRatingReasonObjectHelper.fromMap(outputMap, "CtcRatingReason");
  }
}
