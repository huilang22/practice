/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonCreateRequest.java
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
 * Class used to create a AdjustmentReasonCreateRequest Udt Request
 *
 */

public class AdjustmentReasonCreateRequest extends AdjustmentReasonSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentReasonCreateRequest
 * @param id Unique request name
 * @param ARCreateIn AdjustmentReasonObjectData for AdjustmentReasonCreateRequest
 *
 */
@JsonCreator
  public AdjustmentReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentReason")AdjustmentReasonObjectData ARCreateIn) {
    super(id, "AdjustmentReasonCreate");
    if (ARCreateIn != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectHelper.toMap(ARCreateIn, new HashMap(), "AdjustmentReason").get("AdjustmentReason"));
    }
  }

/**
 *
 * Retrieves the AdjustmentReasonObjectData that results from the AdjustmentReasonCreateRequest call
 * @return AdjustmentReasonObjectData resulting from udt call
 *
 */

  public AdjustmentReasonObjectData getOutput() {
    return AdjustmentReasonObjectHelper.fromMap(outputMap, "AdjustmentReason");
  }
}
