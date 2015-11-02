/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorPlanIdFindRequest.java
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
 * Class used to create a CorridorPlanIdFindRequest Udt Request
 *
 */

public class CorridorPlanIdFindRequest extends CorridorPlanIdRequest {
/**
 *
 * Constructor to create a  CorridorPlanIdFindRequest
 * @param id Unique request name
 * @param CPIFindIn CPIObjectFilter for CorridorPlanIdFindRequest
 *
 */
@JsonCreator
  public CorridorPlanIdFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorPlanId")CPIObjectFilter CPIFindIn) {
    super(id, "CorridorPlanIdFind");
    if (CPIFindIn != null) {
      Integer index =  CPIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CorridorPlanId", CPIObjectHelper.toMap(CPIFindIn, new HashMap(), "CorridorPlanId").get("CorridorPlanId"));
    }
  }

/**
 *
 * Retrieves the CPIObjectDataList that results from the CorridorPlanIdFindRequest call
 * @return CPIObjectDataList resulting from udt call
 *
 */

  public CPIObjectDataList getOutput() {
    return CPIObjectHelper.fromMapList(outputMap, "CorridorPlanIdList");
  }
}
