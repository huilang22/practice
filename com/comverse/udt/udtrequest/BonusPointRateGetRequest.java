/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointRateGetRequest.java
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
 * Class used to create a BonusPointRateGetRequest Udt Request
 *
 */

public class BonusPointRateGetRequest extends BonusPointRateSubRequestParent {
/**
 *
 * Constructor to create a  BonusPointRateGetRequest
 * @param id Unique request name
 * @param BPRGetIn BonusPointRateObjectKeyData for BonusPointRateGetRequest
 *
 */
@JsonCreator
  public BonusPointRateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointRate")BonusPointRateObjectKeyData BPRGetIn) {
    super(id, "BonusPointRateGet");
    if (BPRGetIn != null) {
      addInput("BonusPointRate", BonusPointRateObjectKeyHelper.toMap(BPRGetIn, new HashMap(), "BonusPointRateObjectKeyData").get("BonusPointRateObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BonusPointRateObjectData that results from the BonusPointRateGetRequest call
 * @return BonusPointRateObjectData resulting from udt call
 *
 */

  public BonusPointRateObjectData getOutput() {
    return BonusPointRateObjectHelper.fromMap(outputMap, "BonusPointRate");
  }
}
