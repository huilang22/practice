/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditUpdateRequest.java
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
 * Class used to create a PlanIdCreditUpdateRequest Udt Request
 *
 */

public class PlanIdCreditUpdateRequest extends PlanIdCreditSubRequestParent {
/**
 *
 * Constructor to create a  PlanIdCreditUpdateRequest
 * @param id Unique request name
 * @param picUpdIn PlanIdCreditObjectData for PlanIdCreditUpdateRequest
 *
 */
@JsonCreator
  public PlanIdCreditUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdCredit")PlanIdCreditObjectData picUpdIn) {
    super(id, "PlanIdCreditUpdate");
    if (picUpdIn != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectHelper.toMap(picUpdIn, new HashMap(), "PlanIdCredit").get("PlanIdCredit"));
    }
  }

/**
 *
 * Retrieves the PlanIdCreditObjectData that results from the PlanIdCreditUpdateRequest call
 * @return PlanIdCreditObjectData resulting from udt call
 *
 */

  public PlanIdCreditObjectData getOutput() {
    return PlanIdCreditObjectHelper.fromMap(outputMap, "PlanIdCredit");
  }
}
