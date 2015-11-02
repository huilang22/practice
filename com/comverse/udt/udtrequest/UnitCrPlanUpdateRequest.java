/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanUpdateRequest.java
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
 * Class used to create a UnitCrPlanUpdateRequest Udt Request
 *
 */

public class UnitCrPlanUpdateRequest extends UnitCrPlanSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrPlanUpdateRequest
 * @param id Unique request name
 * @param UnitCrPlanUpdateIn UnitCrPlanObjectData for UnitCrPlanUpdateRequest
 * @param UnitCrPlanUpdateFilter UnitCrPlanObjectFilter for UnitCrPlanUpdateRequest
 * @param UnitCrPlanUpdateGet UnitCrPlanObjectData for UnitCrPlanUpdateRequest
 *
 */
@JsonCreator
  public UnitCrPlanUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrPlan")UnitCrPlanObjectData UnitCrPlanUpdateIn, @JsonProperty("UnitCrPlanUpdateFilter")UnitCrPlanObjectFilter UnitCrPlanUpdateFilter, @JsonProperty("UnitCrPlanUpdateGet")UnitCrPlanObjectData UnitCrPlanUpdateGet) {
    super(id, "UnitCrPlanUpdate");
    if (UnitCrPlanUpdateIn != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectHelper.toMap(UnitCrPlanUpdateIn, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
    if (UnitCrPlanUpdateFilter != null) {
      Integer index =  UnitCrPlanUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrPlanUpdateFilter", UnitCrPlanObjectHelper.toMap(UnitCrPlanUpdateFilter, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
    if (UnitCrPlanUpdateGet != null) {
      addInput("UnitCrPlanUpdateGet", UnitCrPlanObjectHelper.toMap(UnitCrPlanUpdateGet, new HashMap(), "UnitCrPlan").get("UnitCrPlan"));
    }
  }

/**
 *
 * Retrieves the UnitCrPlanObjectData that results from the UnitCrPlanUpdateRequest call
 * @return UnitCrPlanObjectData resulting from udt call
 *
 */

  public UnitCrPlanObjectData getOutput() {
    return UnitCrPlanObjectHelper.fromMap(outputMap, "UnitCrPlan");
  }
}
