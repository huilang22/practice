/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentApproveRequest.java
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
 * Class used to create a AdjustmentApproveRequest Udt Request
 *
 */

public class AdjustmentApproveRequest extends AdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentApproveRequest
 * @param id Unique request name
 * @param adjApproveIn AdjustmentObjectData for AdjustmentApproveRequest
 * @param SupervisorName String for AdjustmentApproveRequest
 *
 */
@JsonCreator
  public AdjustmentApproveRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectData adjApproveIn, @JsonProperty("SupervisorName")String SupervisorName) {
    super(id, "AdjustmentApprove");
    if (adjApproveIn != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjApproveIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
    if (SupervisorName != null) {
      addInput("SupervisorName", SupervisorName);
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectData that results from the AdjustmentApproveRequest call
 * @return AdjustmentObjectData resulting from udt call
 *
 */

  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
