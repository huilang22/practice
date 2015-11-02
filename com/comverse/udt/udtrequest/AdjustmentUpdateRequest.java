/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentUpdateRequest.java
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
 * Class used to create a AdjustmentUpdateRequest Udt Request
 *
 */

public class AdjustmentUpdateRequest extends AdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentUpdateRequest
 * @param id Unique request name
 * @param adjUpdateIn AdjustmentObjectData for AdjustmentUpdateRequest
 *
 */
@JsonCreator
  public AdjustmentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectData adjUpdateIn) {
    super(id, "AdjustmentUpdate");
    if (adjUpdateIn != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjUpdateIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectData that results from the AdjustmentUpdateRequest call
 * @return AdjustmentObjectData resulting from udt call
 *
 */

  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
