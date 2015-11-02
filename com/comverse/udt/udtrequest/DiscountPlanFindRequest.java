/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountPlanFindRequest.java
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
 * Class used to create a DiscountPlanFindRequest Udt Request
 *
 */

public class DiscountPlanFindRequest extends DiscountPlanRequest {
/**
 *
 * Constructor to create a  DiscountPlanFindRequest
 * @param id Unique request name
 * @param DPFindIn DPObjectFilter for DiscountPlanFindRequest
 *
 */
@JsonCreator
  public DiscountPlanFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountPlan")DPObjectFilter DPFindIn) {
    super(id, "DiscountPlanFind");
    if (DPFindIn != null) {
      Integer index =  DPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscountPlan", DPObjectHelper.toMap(DPFindIn, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }

/**
 *
 * Retrieves the DPObjectDataList that results from the DiscountPlanFindRequest call
 * @return DPObjectDataList resulting from udt call
 *
 */

  public DPObjectDataList getOutput() {
    return DPObjectHelper.fromMapList(outputMap, "DiscountPlanList");
  }
}
