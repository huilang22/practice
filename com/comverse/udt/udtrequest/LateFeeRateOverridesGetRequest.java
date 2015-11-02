/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesGetRequest.java
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
 * Class used to create a LateFeeRateOverridesGetRequest Udt Request
 *
 */

public class LateFeeRateOverridesGetRequest extends LateFeeRateOverridesSubRequestParent {
/**
 *
 * Constructor to create a  LateFeeRateOverridesGetRequest
 * @param id Unique request name
 * @param LFROgIn LateFeeRateOverridesObjectKeyData for LateFeeRateOverridesGetRequest
 *
 */
@JsonCreator
  public LateFeeRateOverridesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("LateFeeRateOverrides")LateFeeRateOverridesObjectKeyData LFROgIn) {
    super(id, "LateFeeRateOverridesGet");
    if (LFROgIn != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectKeyHelper.toMap(LFROgIn, new HashMap(), "LateFeeRateOverridesObjectKeyData").get("LateFeeRateOverridesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the LateFeeRateOverridesObjectData that results from the LateFeeRateOverridesGetRequest call
 * @return LateFeeRateOverridesObjectData resulting from udt call
 *
 */

  public LateFeeRateOverridesObjectData getOutput() {
    return LateFeeRateOverridesObjectHelper.fromMap(outputMap, "LateFeeRateOverrides");
  }
}
