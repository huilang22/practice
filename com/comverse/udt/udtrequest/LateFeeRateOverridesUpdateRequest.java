/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesUpdateRequest.java
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
 * Class used to create a LateFeeRateOverridesUpdateRequest Udt Request
 *
 */

public class LateFeeRateOverridesUpdateRequest extends LateFeeRateOverridesSubRequestParent {
/**
 *
 * Constructor to create a  LateFeeRateOverridesUpdateRequest
 * @param id Unique request name
 * @param LFROuIn LateFeeRateOverridesObjectData for LateFeeRateOverridesUpdateRequest
 *
 */
@JsonCreator
  public LateFeeRateOverridesUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("LateFeeRateOverrides")LateFeeRateOverridesObjectData LFROuIn) {
    super(id, "LateFeeRateOverridesUpdate");
    if (LFROuIn != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(LFROuIn, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }

/**
 *
 * Retrieves the LateFeeRateOverridesObjectData that results from the LateFeeRateOverridesUpdateRequest call
 * @return LateFeeRateOverridesObjectData resulting from udt call
 *
 */

  public LateFeeRateOverridesObjectData getOutput() {
    return LateFeeRateOverridesObjectHelper.fromMap(outputMap, "LateFeeRateOverrides");
  }
}
