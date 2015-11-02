/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentModifyRequest.java
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
 * Class used to create a AdjustmentModifyRequest Udt Request
 *
 */

public class AdjustmentModifyRequest extends AdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentModifyRequest
 * @param id Unique request name
 * @param adjModifyIn AdjustmentObjectData for AdjustmentModifyRequest
 *
 */
@JsonCreator
  public AdjustmentModifyRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectData adjModifyIn) {
    super(id, "AdjustmentModify");
    if (adjModifyIn != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjModifyIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectData that results from the AdjustmentModifyRequest call
 * @return AdjustmentObjectData resulting from udt call
 *
 */

  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
