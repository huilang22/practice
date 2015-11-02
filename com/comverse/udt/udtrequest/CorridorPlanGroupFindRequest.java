/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanGroupFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CorridorPlanGroupFindRequest Udt Request
 *
 */

public class CorridorPlanGroupFindRequest extends CorridorPlanGroupRequest {
/**
 *
 * Constructor to create a  CorridorPlanGroupFindRequest
 * @param id Unique request name
 * @param CPGFindIn CPGObjectFilter for CorridorPlanGroupFindRequest
 *
 */
@JsonCreator
  public CorridorPlanGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlanGroup")CPGObjectFilter CPGFindIn) {
    super(id, "CorridorPlanGroupFind");
    if (CPGFindIn != null) {
      Integer index =  CPGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CorridorPlanGroup", CPGObjectHelper.toMap(CPGFindIn, new HashMap(), "CorridorPlanGroup").get("CorridorPlanGroup"));
    }
  }

/**
 *
 * Retrieves the CPGObjectDataList that results from the CorridorPlanGroupFindRequest call
 * @return CPGObjectDataList resulting from udt call
 *
 */

  public CPGObjectDataList getOutput() {
    return CPGObjectHelper.fromMapList(outputMap, "CorridorPlanGroupList");
  }
}
