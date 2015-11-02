/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanFindRequest.java
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
 * Class used to create a UnitCrPlanFindRequest Udt Request
 *
 */

public class UnitCrPlanFindRequest extends UnitCrPlanRequest {
/**
 *
 * Constructor to create a  UnitCrPlanFindRequest
 * @param id Unique request name
 * @param UnitCrPlanFindIn UnitCrPlanObjectFilter for UnitCrPlanFindRequest
 *
 */
@JsonCreator
  public UnitCrPlanFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrPlan")UnitCrPlanObjectFilter UnitCrPlanFindIn) {
    super(id, "UnitCrPlanFind");
    if (UnitCrPlanFindIn != null) {
      Integer index =  UnitCrPlanFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(UnitCrPlanFindIn, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }

/**
 *
 * Retrieves the UnitCrPlanObjectDataList that results from the UnitCrPlanFindRequest call
 * @return UnitCrPlanObjectDataList resulting from udt call
 *
 */

  public UnitCrPlanObjectDataList getOutput() {
    return UnitCrPlanObjectHelper.fromMapList(outputMap, "UnitCrPlanList");
  }
}
