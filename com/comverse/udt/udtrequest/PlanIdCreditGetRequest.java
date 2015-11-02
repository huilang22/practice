/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdCreditGetRequest.java
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
 * Class used to create a PlanIdCreditGetRequest Udt Request
 *
 */

public class PlanIdCreditGetRequest extends PlanIdCreditSubRequestParent {
/**
 *
 * Constructor to create a  PlanIdCreditGetRequest
 * @param id Unique request name
 * @param picGetIn PlanIdCreditObjectKeyData for PlanIdCreditGetRequest
 *
 */
@JsonCreator
  public PlanIdCreditGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("PlanIdCredit")PlanIdCreditObjectKeyData picGetIn) {
    super(id, "PlanIdCreditGet");
    if (picGetIn != null) {
      addInput("PlanIdCredit", PlanIdCreditObjectKeyHelper.toMap(picGetIn, new HashMap(), "PlanIdCreditObjectKeyData").get("PlanIdCreditObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PlanIdCreditObjectData that results from the PlanIdCreditGetRequest call
 * @return PlanIdCreditObjectData resulting from udt call
 *
 */

  public PlanIdCreditObjectData getOutput() {
    return PlanIdCreditObjectHelper.fromMap(outputMap, "PlanIdCredit");
  }
}
