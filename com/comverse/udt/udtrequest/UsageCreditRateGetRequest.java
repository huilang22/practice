/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageCreditRateGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a UsageCreditRateGetRequest Udt Request
 *
 */

public class UsageCreditRateGetRequest extends UsageCreditRateSubRequestParent {
/**
 *
 * Constructor to create a  UsageCreditRateGetRequest
 * @param id Unique request name
 * @param RUCGetIn RUCreditObjectKeyData for UsageCreditRateGetRequest
 *
 */
@JsonCreator
  public UsageCreditRateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageCreditRate")RUCreditObjectKeyData RUCGetIn) {
    super(id, "UsageCreditRateGet");
    if (RUCGetIn != null) {
      addInput("UsageCreditRate", RUCreditObjectKeyHelper.toMap(RUCGetIn, new HashMap(), "RUCreditObjectKeyData").get("RUCreditObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RUCreditObjectData that results from the UsageCreditRateGetRequest call
 * @return RUCreditObjectData resulting from udt call
 *
 */

  public RUCreditObjectData getOutput() {
    return RUCreditObjectHelper.fromMap(outputMap, "UsageCreditRate");
  }
}
