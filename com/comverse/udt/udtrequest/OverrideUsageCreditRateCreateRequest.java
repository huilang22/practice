/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateCreateRequest.java
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
 * Class used to create a OverrideUsageCreditRateCreateRequest Udt Request
 *
 */

public class OverrideUsageCreditRateCreateRequest extends OverrideUsageCreditRateSubRequestParent {
/**
 *
 * Constructor to create a  OverrideUsageCreditRateCreateRequest
 * @param id Unique request name
 * @param iRUCOCreateIn RUCOverrideObjectData for OverrideUsageCreditRateCreateRequest
 *
 */
@JsonCreator
  public OverrideUsageCreditRateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("OverrideUsageCreditRate")RUCOverrideObjectData iRUCOCreateIn) {
    super(id, "OverrideUsageCreditRateCreate");
    if (iRUCOCreateIn != null) {
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(iRUCOCreateIn, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }

/**
 *
 * Retrieves the RUCOverrideObjectData that results from the OverrideUsageCreditRateCreateRequest call
 * @return RUCOverrideObjectData resulting from udt call
 *
 */

  public RUCOverrideObjectData getOutput() {
    return RUCOverrideObjectHelper.fromMap(outputMap, "OverrideUsageCreditRate");
  }
}
