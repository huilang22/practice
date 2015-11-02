/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneStatusFindRequest.java
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
 * Class used to create a MilestoneStatusFindRequest Udt Request
 *
 */

public class MilestoneStatusFindRequest extends MilestoneStatusRequest {
/**
 *
 * Constructor to create a  MilestoneStatusFindRequest
 * @param id Unique request name
 * @param MilestoneStatusFindIn MilestoneStatusObjectFilter for MilestoneStatusFindRequest
 *
 */
@JsonCreator
  public MilestoneStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneStatus")MilestoneStatusObjectFilter MilestoneStatusFindIn) {
    super(id, "MilestoneStatusFind");
    if (MilestoneStatusFindIn != null) {
      Integer index =  MilestoneStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MilestoneStatus", MilestoneStatusObjectHelper.toMap(MilestoneStatusFindIn, new HashMap(), "MilestoneStatus").get("MilestoneStatus"));
    }
  }

/**
 *
 * Retrieves the MilestoneStatusObjectDataList that results from the MilestoneStatusFindRequest call
 * @return MilestoneStatusObjectDataList resulting from udt call
 *
 */

  public MilestoneStatusObjectDataList getOutput() {
    return MilestoneStatusObjectHelper.fromMapList(outputMap, "MilestoneStatusList");
  }
}
