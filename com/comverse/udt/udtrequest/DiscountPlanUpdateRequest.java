/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountPlanUpdateRequest.java
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
 * Class used to create a DiscountPlanUpdateRequest Udt Request
 *
 */

public class DiscountPlanUpdateRequest extends DiscountPlanSubRequestParent {
/**
 *
 * Constructor to create a  DiscountPlanUpdateRequest
 * @param id Unique request name
 * @param DPUpdateIn DPObjectData for DiscountPlanUpdateRequest
 * @param DPUpdateFilter DPObjectFilter for DiscountPlanUpdateRequest
 * @param DPUpdateGet DPObjectData for DiscountPlanUpdateRequest
 *
 */
@JsonCreator
  public DiscountPlanUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountPlan")DPObjectData DPUpdateIn, @JsonProperty("DPUpdateFilter")DPObjectFilter DPUpdateFilter, @JsonProperty("DPUpdateGet")DPObjectData DPUpdateGet) {
    super(id, "DiscountPlanUpdate");
    if (DPUpdateIn != null) {
      addInput("DiscountPlan", DPObjectHelper.toMap(DPUpdateIn, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
    if (DPUpdateFilter != null) {
      Integer index =  DPUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DPUpdateFilter", DPObjectHelper.toMap(DPUpdateFilter, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
    if (DPUpdateGet != null) {
      addInput("DPUpdateGet", DPObjectHelper.toMap(DPUpdateGet, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }

/**
 *
 * Retrieves the DPObjectData that results from the DiscountPlanUpdateRequest call
 * @return DPObjectData resulting from udt call
 *
 */

  public DPObjectData getOutput() {
    return DPObjectHelper.fromMap(outputMap, "DiscountPlan");
  }
}
