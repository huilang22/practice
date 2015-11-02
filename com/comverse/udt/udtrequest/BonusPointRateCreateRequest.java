/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointRateCreateRequest.java
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
 * Class used to create a BonusPointRateCreateRequest Udt Request
 *
 */

public class BonusPointRateCreateRequest extends BonusPointRateSubRequestParent {
/**
 *
 * Constructor to create a  BonusPointRateCreateRequest
 * @param id Unique request name
 * @param BPRCreateIn BonusPointRateObjectData for BonusPointRateCreateRequest
 *
 */
@JsonCreator
  public BonusPointRateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointRate")BonusPointRateObjectData BPRCreateIn) {
    super(id, "BonusPointRateCreate");
    if (BPRCreateIn != null) {
      addInput("BonusPointRate", BonusPointRateObjectHelper.toMap(BPRCreateIn, new HashMap(), "BonusPointRate").get("BonusPointRate"));
    }
  }

/**
 *
 * Retrieves the BonusPointRateObjectData that results from the BonusPointRateCreateRequest call
 * @return BonusPointRateObjectData resulting from udt call
 *
 */

  public BonusPointRateObjectData getOutput() {
    return BonusPointRateObjectHelper.fromMap(outputMap, "BonusPointRate");
  }
}
