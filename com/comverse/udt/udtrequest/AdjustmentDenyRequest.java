/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentDenyRequest.java
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
 * Class used to create a AdjustmentDenyRequest Udt Request
 *
 */

public class AdjustmentDenyRequest extends AdjustmentSubRequestParent {
/**
 *
 * Constructor to create a  AdjustmentDenyRequest
 * @param id Unique request name
 * @param adjDenyIn AdjustmentObjectData for AdjustmentDenyRequest
 * @param supervisor_name String for AdjustmentDenyRequest
 *
 */
@JsonCreator
  public AdjustmentDenyRequest(@JsonProperty("RequestId") String id, @JsonProperty("Adjustment")AdjustmentObjectData adjDenyIn, @JsonProperty("SupervisorName")String supervisor_name) {
    super(id, "AdjustmentDeny");
    if (adjDenyIn != null) {
      addInput("Adjustment", AdjustmentObjectHelper.toMap(adjDenyIn, new HashMap(), "Adjustment").get("Adjustment"));
    }
    if (supervisor_name != null) {
      addInput("SupervisorName", supervisor_name);
    }
  }

/**
 *
 * Retrieves the AdjustmentObjectData that results from the AdjustmentDenyRequest call
 * @return AdjustmentObjectData resulting from udt call
 *
 */

  public AdjustmentObjectData getOutput() {
    return AdjustmentObjectHelper.fromMap(outputMap, "Adjustment");
  }
}
