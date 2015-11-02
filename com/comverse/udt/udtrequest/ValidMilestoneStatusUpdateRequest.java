/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusUpdateRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ValidMilestoneStatusUpdateRequest Udt Request
 *
 */

public class ValidMilestoneStatusUpdateRequest extends ValidMilestoneStatusSubRequestParent {
/**
 *
 * Constructor to create a  ValidMilestoneStatusUpdateRequest
 * @param id Unique request name
 * @param ValidMilestoneStatusUpdateIn ValidMilestoneStatusObjectData for ValidMilestoneStatusUpdateRequest
 *
 */
@JsonCreator
  public ValidMilestoneStatusUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ValidMilestoneStatus")ValidMilestoneStatusObjectData ValidMilestoneStatusUpdateIn) {
    super(id, "ValidMilestoneStatusUpdate");
    if (ValidMilestoneStatusUpdateIn != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(ValidMilestoneStatusUpdateIn, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }

/**
 *
 * Retrieves the ValidMilestoneStatusObjectData that results from the ValidMilestoneStatusUpdateRequest call
 * @return ValidMilestoneStatusObjectData resulting from udt call
 *
 */

  public ValidMilestoneStatusObjectData getOutput() {
    return ValidMilestoneStatusObjectHelper.fromMap(outputMap, "ValidMilestoneStatus");
  }
}
