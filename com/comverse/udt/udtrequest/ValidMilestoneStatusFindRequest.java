/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ValidMilestoneStatusFindRequest.java
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
 * Class used to create a ValidMilestoneStatusFindRequest Udt Request
 *
 */

public class ValidMilestoneStatusFindRequest extends ValidMilestoneStatusRequest {
/**
 *
 * Constructor to create a  ValidMilestoneStatusFindRequest
 * @param id Unique request name
 * @param ValidMilestoneStatusFindIn ValidMilestoneStatusObjectFilter for ValidMilestoneStatusFindRequest
 *
 */
@JsonCreator
  public ValidMilestoneStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ValidMilestoneStatus")ValidMilestoneStatusObjectFilter ValidMilestoneStatusFindIn) {
    super(id, "ValidMilestoneStatusFind");
    if (ValidMilestoneStatusFindIn != null) {
      Integer index =  ValidMilestoneStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ValidMilestoneStatus", ValidMilestoneStatusObjectHelper.toMap(ValidMilestoneStatusFindIn, new HashMap(), "ValidMilestoneStatus").get("ValidMilestoneStatus"));
    }
  }

/**
 *
 * Retrieves the ValidMilestoneStatusObjectDataList that results from the ValidMilestoneStatusFindRequest call
 * @return ValidMilestoneStatusObjectDataList resulting from udt call
 *
 */

  public ValidMilestoneStatusObjectDataList getOutput() {
    return ValidMilestoneStatusObjectHelper.fromMapList(outputMap, "ValidMilestoneStatusList");
  }
}
