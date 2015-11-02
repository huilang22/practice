/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateUpdateRequest.java
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
 * Class used to create a OverrideUsageCreditRateUpdateRequest Udt Request
 *
 */

public class OverrideUsageCreditRateUpdateRequest extends OverrideUsageCreditRateSubRequestParent {
/**
 *
 * Constructor to create a  OverrideUsageCreditRateUpdateRequest
 * @param id Unique request name
 * @param iRUCOUpdateIn RUCOverrideObjectData for OverrideUsageCreditRateUpdateRequest
 *
 */
@JsonCreator
  public OverrideUsageCreditRateUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OverrideUsageCreditRate")RUCOverrideObjectData iRUCOUpdateIn) {
    super(id, "OverrideUsageCreditRateUpdate");
    if (iRUCOUpdateIn != null) {
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(iRUCOUpdateIn, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }

/**
 *
 * Retrieves the RUCOverrideObjectData that results from the OverrideUsageCreditRateUpdateRequest call
 * @return RUCOverrideObjectData resulting from udt call
 *
 */

  public RUCOverrideObjectData getOutput() {
    return RUCOverrideObjectHelper.fromMap(outputMap, "OverrideUsageCreditRate");
  }
}
