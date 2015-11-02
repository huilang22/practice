/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditCreateRequest.java
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
 * Class used to create a PlanIdCreditCreateRequest Udt Request
 *
 */

public class PlanIdCreditCreateRequest extends PlanIdCreditSubRequestParent {
/**
 *
 * Constructor to create a  PlanIdCreditCreateRequest
 * @param id Unique request name
 * @param picCrIn PlanIdCreditObjectData for PlanIdCreditCreateRequest
 *
 */
@JsonCreator
  public PlanIdCreditCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdCredit")PlanIdCreditObjectData picCrIn) {
    super(id, "PlanIdCreditCreate");
    if (picCrIn != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(picCrIn, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }

/**
 *
 * Retrieves the PlanIdCreditObjectData that results from the PlanIdCreditCreateRequest call
 * @return PlanIdCreditObjectData resulting from udt call
 *
 */

  public PlanIdCreditObjectData getOutput() {
    return PlanIdCreditObjectHelper.fromMap(outputMap, "PlanIdCredit");
  }
}
