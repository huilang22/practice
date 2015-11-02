/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanFindRequest.java
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
 * Class used to create a CorridorPlanFindRequest Udt Request
 *
 */

public class CorridorPlanFindRequest extends CorridorPlanRequest {
/**
 *
 * Constructor to create a  CorridorPlanFindRequest
 * @param id Unique request name
 * @param CPFindIn CPObjectFilter for CorridorPlanFindRequest
 *
 */
@JsonCreator
  public CorridorPlanFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlan")CPObjectFilter CPFindIn) {
    super(id, "CorridorPlanFind");
    if (CPFindIn != null) {
      Integer index =  CPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CorridorPlan", CPObjectHelper.toMap(CPFindIn, new HashMap(), "CorridorPlan").get("CorridorPlan"));
    }
  }

/**
 *
 * Retrieves the CPObjectDataList that results from the CorridorPlanFindRequest call
 * @return CPObjectDataList resulting from udt call
 *
 */

  public CPObjectDataList getOutput() {
    return CPObjectHelper.fromMapList(outputMap, "CorridorPlanList");
  }
}
