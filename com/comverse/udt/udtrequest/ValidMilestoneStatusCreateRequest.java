/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusCreateRequest.java
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
 * Class used to create a ValidMilestoneStatusCreateRequest Udt Request
 *
 */

public class ValidMilestoneStatusCreateRequest extends ValidMilestoneStatusSubRequestParent {
/**
 *
 * Constructor to create a  ValidMilestoneStatusCreateRequest
 * @param id Unique request name
 * @param ValidMilestoneStatusCreateIn ValidMilestoneStatusObjectData for ValidMilestoneStatusCreateRequest
 *
 */
@JsonCreator
  public ValidMilestoneStatusCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ValidMilestoneStatus")ValidMilestoneStatusObjectData ValidMilestoneStatusCreateIn) {
    super(id, "ValidMilestoneStatusCreate");
    if (ValidMilestoneStatusCreateIn != null) {
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(ValidMilestoneStatusCreateIn, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }

/**
 *
 * Retrieves the ValidMilestoneStatusObjectData that results from the ValidMilestoneStatusCreateRequest call
 * @return ValidMilestoneStatusObjectData resulting from udt call
 *
 */

  public ValidMilestoneStatusObjectData getOutput() {
    return ValidMilestoneStatusObjectHelper.fromMap(outputMap, "ValidMilestoneStatus");
  }
}
