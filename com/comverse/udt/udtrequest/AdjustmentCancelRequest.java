/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentCancelRequest.java
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
 * Class used to create a AdjustmentCancelRequest Udt Request
 *
 */

public class AdjustmentCancelRequest extends AdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentCancelRequest
 * @param id Unique request name
 * @param adjCancelIn AdjustmentObjectData for AdjustmentCancelRequest
 *
 */
@JsonCreator
  public AdjustmentCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectData adjCancelIn) {
    super(id, "AdjustmentCancel");
    if (adjCancelIn != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjCancelIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectData that results from the AdjustmentCancelRequest call
 * @return AdjustmentObjectData resulting from udt call
 *
 */

  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
