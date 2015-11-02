/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentReasonGetRequest.java
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
 * Class used to create a AdjustmentReasonGetRequest Udt Request
 *
 */

public class AdjustmentReasonGetRequest extends AdjustmentReasonSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentReasonGetRequest
 * @param id Unique request name
 * @param ARGetIn AdjustmentReasonObjectKeyData for AdjustmentReasonGetRequest
 *
 */
@JsonCreator
  public AdjustmentReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjustmentReason")AdjustmentReasonObjectKeyData ARGetIn) {
    super(id, "AdjustmentReasonGet");
    if (ARGetIn != null) {
      addInput("AdjustmentReason", AdjustmentReasonObjectKeyHelper.toMap(ARGetIn, new HashMap(), "AdjustmentReasonObjectKeyData").get("AdjustmentReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AdjustmentReasonObjectData that results from the AdjustmentReasonGetRequest call
 * @return AdjustmentReasonObjectData resulting from udt call
 *
 */

  public AdjustmentReasonObjectData getOutput() {
    return AdjustmentReasonObjectHelper.fromMap(outputMap, "AdjustmentReason");
  }
}
