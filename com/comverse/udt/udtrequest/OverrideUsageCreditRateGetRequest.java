/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateGetRequest.java
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
 * Class used to create a OverrideUsageCreditRateGetRequest Udt Request
 *
 */

public class OverrideUsageCreditRateGetRequest extends OverrideUsageCreditRateSubRequestParent {
/**
 *
 * Constructor to create a  OverrideUsageCreditRateGetRequest
 * @param id Unique request name
 * @param fRUCOGetIn RUCBaseOverrideObjectKeyData for OverrideUsageCreditRateGetRequest
 *
 */
@JsonCreator
  public OverrideUsageCreditRateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("OverrideUsageCreditRate")RUCBaseOverrideObjectKeyData fRUCOGetIn) {
    super(id, "OverrideUsageCreditRateGet");
    if (fRUCOGetIn != null) {
      addInput("OverrideUsageCreditRate", RUCBaseOverrideObjectKeyHelper.toMap(fRUCOGetIn, new HashMap(), "RUCBaseOverrideObjectKeyData").get("RUCBaseOverrideObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RUCOverrideObjectData that results from the OverrideUsageCreditRateGetRequest call
 * @return RUCOverrideObjectData resulting from udt call
 *
 */

  public RUCOverrideObjectData getOutput() {
    return RUCOverrideObjectHelper.fromMap(outputMap, "OverrideUsageCreditRate");
  }
}
