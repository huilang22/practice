/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonDeleteRequest.java
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
 * Class used to create a AdjustmentReasonDeleteRequest Udt Request
 *
 */

public class AdjustmentReasonDeleteRequest extends AdjustmentReasonSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentReasonDeleteRequest
 * @param id Unique request name
 * @param ARDeleteIn AdjustmentReasonObjectKeyData for AdjustmentReasonDeleteRequest
 *
 */
@JsonCreator
  public AdjustmentReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentReason")AdjustmentReasonObjectKeyData ARDeleteIn) {
    super(id, "AdjustmentReasonDelete");
    if (ARDeleteIn != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectKeyHelper.toMap(ARDeleteIn, new HashMap(), "AdjustmentReasonObjectKeyData").get("AdjustmentReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AdjustmentReasonObjectData that results from the AdjustmentReasonDeleteRequest call
 * @return AdjustmentReasonObjectData resulting from udt call
 *
 */

  public AdjustmentReasonObjectData getOutput() {
    return AdjustmentReasonObjectHelper.fromMap(outputMap, "AdjustmentReason");
  }
}
