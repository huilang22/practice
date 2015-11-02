/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneFindRequest.java
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
 * Class used to create a MilestoneFindRequest Udt Request
 *
 */

public class MilestoneFindRequest extends MilestoneRequest {
/**
 *
 * Constructor to create a  MilestoneFindRequest
 * @param id Unique request name
 * @param MilestoneFindIn MilestoneObjectFilter for MilestoneFindRequest
 *
 */
@JsonCreator
  public MilestoneFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Milestone")MilestoneObjectFilter MilestoneFindIn) {
    super(id, "MilestoneFind");
    if (MilestoneFindIn != null) {
      Integer index =  MilestoneFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Milestone", MilestoneObjectHelper.toMap(MilestoneFindIn, new HashMap(), "Milestone").get("Milestone"));
    }
  }

/**
 *
 * Retrieves the MilestoneObjectDataList that results from the MilestoneFindRequest call
 * @return MilestoneObjectDataList resulting from udt call
 *
 */

  public MilestoneObjectDataList getOutput() {
    return MilestoneObjectHelper.fromMapList(outputMap, "MilestoneList");
  }
}
