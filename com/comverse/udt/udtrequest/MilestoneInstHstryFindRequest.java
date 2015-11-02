/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MilestoneInstHstryFindRequest.java
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
 * Class used to create a MilestoneInstHstryFindRequest Udt Request
 *
 */

public class MilestoneInstHstryFindRequest extends MilestoneInstHstryRequest {
/**
 *
 * Constructor to create a  MilestoneInstHstryFindRequest
 * @param id Unique request name
 * @param MilestoneInstHstryFindIn MilestoneInstHstryObjectFilter for MilestoneInstHstryFindRequest
 *
 */
@JsonCreator
  public MilestoneInstHstryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("MilestoneInstHstry")MilestoneInstHstryObjectFilter MilestoneInstHstryFindIn) {
    super(id, "MilestoneInstHstryFind");
    if (MilestoneInstHstryFindIn != null) {
      Integer index =  MilestoneInstHstryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MilestoneInstHstry", MilestoneInstHstryObjectHelper.toMap(MilestoneInstHstryFindIn, new HashMap(), "MilestoneInstHstry").get("MilestoneInstHstry"));
    }
  }

/**
 *
 * Retrieves the MilestoneInstHstryObjectDataList that results from the MilestoneInstHstryFindRequest call
 * @return MilestoneInstHstryObjectDataList resulting from udt call
 *
 */

  public MilestoneInstHstryObjectDataList getOutput() {
    return MilestoneInstHstryObjectHelper.fromMapList(outputMap, "MilestoneInstHstryList");
  }
}
