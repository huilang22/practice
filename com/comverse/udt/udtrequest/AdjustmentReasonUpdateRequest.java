/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonUpdateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AdjustmentReasonUpdateRequest Udt Request
 *
 */

public class AdjustmentReasonUpdateRequest extends AdjustmentReasonSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentReasonUpdateRequest
 * @param id Unique request name
 * @param ARUpdateIn AdjustmentReasonObjectData for AdjustmentReasonUpdateRequest
 *
 */
@JsonCreator
  public AdjustmentReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentReason")AdjustmentReasonObjectData ARUpdateIn) {
    super(id, "AdjustmentReasonUpdate");
    if (ARUpdateIn != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(ARUpdateIn, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }

/**
 *
 * Retrieves the AdjustmentReasonObjectData that results from the AdjustmentReasonUpdateRequest call
 * @return AdjustmentReasonObjectData resulting from udt call
 *
 */

  public AdjustmentReasonObjectData getOutput() {
    return AdjustmentReasonObjectHelper.fromMap(outputMap, "AdjustmentReason");
  }
}
