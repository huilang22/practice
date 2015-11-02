/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstFindRequest.java
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
 * Class used to create a MilestoneInstFindRequest Udt Request
 *
 */

public class MilestoneInstFindRequest extends MilestoneInstRequest {
/**
 *
 * Constructor to create a  MilestoneInstFindRequest
 * @param id Unique request name
 * @param MilestoneInstFindIn MilestoneInstObjectFilter for MilestoneInstFindRequest
 *
 */
@JsonCreator
  public MilestoneInstFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneInst")MilestoneInstObjectFilter MilestoneInstFindIn) {
    super(id, "MilestoneInstFind");
    if (MilestoneInstFindIn != null) {
      Integer index =  MilestoneInstFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MilestoneInst", MilestoneInstObjectHelper.toMap(MilestoneInstFindIn, new HashMap(), "MilestoneInst").get("MilestoneInst"));
    }
  }

/**
 *
 * Retrieves the MilestoneInstObjectDataList that results from the MilestoneInstFindRequest call
 * @return MilestoneInstObjectDataList resulting from udt call
 *
 */

  public MilestoneInstObjectDataList getOutput() {
    return MilestoneInstObjectHelper.fromMapList(outputMap, "MilestoneInstList");
  }
}
