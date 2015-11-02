/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrPlanGetRequest.java
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
 * Class used to create a UnitCrPlanGetRequest Udt Request
 *
 */

public class UnitCrPlanGetRequest extends UnitCrPlanSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrPlanGetRequest
 * @param id Unique request name
 * @param UnitCrPlanGetIn UnitCrPlanObjectKeyData for UnitCrPlanGetRequest
 *
 */
@JsonCreator
  public UnitCrPlanGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrPlan")UnitCrPlanObjectKeyData UnitCrPlanGetIn) {
    super(id, "UnitCrPlanGet");
    if (UnitCrPlanGetIn != null) {
      addInput("UnitCrPlan", UnitCrPlanObjectKeyHelper.toMap(UnitCrPlanGetIn, new HashMap(), "UnitCrPlanObjectKeyData").get("UnitCrPlanObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnitCrPlanObjectData that results from the UnitCrPlanGetRequest call
 * @return UnitCrPlanObjectData resulting from udt call
 *
 */

  public UnitCrPlanObjectData getOutput() {
    return UnitCrPlanObjectHelper.fromMap(outputMap, "UnitCrPlan");
  }
}
