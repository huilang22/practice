/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanCreateRequest.java
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
 * Class used to create a UnitCrPlanCreateRequest Udt Request
 *
 */

public class UnitCrPlanCreateRequest extends UnitCrPlanSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrPlanCreateRequest
 * @param id Unique request name
 * @param UnitCrPlanCreateIn UnitCrPlanObjectData for UnitCrPlanCreateRequest
 *
 */
@JsonCreator
  public UnitCrPlanCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrPlan")UnitCrPlanObjectData UnitCrPlanCreateIn) {
    super(id, "UnitCrPlanCreate");
    if (UnitCrPlanCreateIn != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(UnitCrPlanCreateIn, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }

/**
 *
 * Retrieves the UnitCrPlanObjectData that results from the UnitCrPlanCreateRequest call
 * @return UnitCrPlanObjectData resulting from udt call
 *
 */

  public UnitCrPlanObjectData getOutput() {
    return UnitCrPlanObjectHelper.fromMap(outputMap, "UnitCrPlan");
  }
}
