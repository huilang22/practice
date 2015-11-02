/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefinancePlanFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a RefinancePlanFindRequest Udt Request
 *
 */

public class RefinancePlanFindRequest extends RefinancePlanRequest {
/**
 *
 * Constructor to create a  RefinancePlanFindRequest
 * @param id Unique request name
 * @param RefinancePlanFindIn RefinancePlanObjectFilter for RefinancePlanFindRequest
 *
 */
@JsonCreator
  public RefinancePlanFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RefinancePlan")RefinancePlanObjectFilter RefinancePlanFindIn) {
    super(id, "RefinancePlanFind");
    if (RefinancePlanFindIn != null) {
      Integer index =  RefinancePlanFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RefinancePlan", RefinancePlanObjectHelper.toMap(RefinancePlanFindIn, new HashMap(), "RefinancePlan").get("RefinancePlan"));
    }
  }

/**
 *
 * Retrieves the RefinancePlanObjectDataList that results from the RefinancePlanFindRequest call
 * @return RefinancePlanObjectDataList resulting from udt call
 *
 */

  public RefinancePlanObjectDataList getOutput() {
    return RefinancePlanObjectHelper.fromMapList(outputMap, "RefinancePlanList");
  }
}
