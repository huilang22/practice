/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentCreateRequest.java
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
 * Class used to create a AdjustmentCreateRequest Udt Request
 *
 */

public class AdjustmentCreateRequest extends AdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentCreateRequest
 * @param id Unique request name
 * @param adjCreateIn AdjustmentObjectData for AdjustmentCreateRequest
 *
 */
@JsonCreator
  public AdjustmentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectData adjCreateIn) {
    super(id, "AdjustmentCreate");
    if (adjCreateIn != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjCreateIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectData that results from the AdjustmentCreateRequest call
 * @return AdjustmentObjectData resulting from udt call
 *
 */

  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
