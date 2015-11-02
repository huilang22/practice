/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountFindRequest.java
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
 * Class used to create a PlanIdDiscountFindRequest Udt Request
 *
 */

public class PlanIdDiscountFindRequest extends PlanIdDiscountRequest {
/**
 *
 * Constructor to create a  PlanIdDiscountFindRequest
 * @param id Unique request name
 * @param PIDFindIn PIDObjectFilter for PlanIdDiscountFindRequest
 *
 */
@JsonCreator
  public PlanIdDiscountFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdDiscount")PIDObjectFilter PIDFindIn) {
    super(id, "PlanIdDiscountFind");
    if (PIDFindIn != null) {
      Integer index =  PIDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(PIDFindIn, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }

/**
 *
 * Retrieves the PIDObjectDataList that results from the PlanIdDiscountFindRequest call
 * @return PIDObjectDataList resulting from udt call
 *
 */

  public PIDObjectDataList getOutput() {
    return PIDObjectHelper.fromMapList(outputMap, "PlanIdDiscountList");
  }
}
