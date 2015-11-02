/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesCreateRequest.java
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
 * Class used to create a LateFeeRateOverridesCreateRequest Udt Request
 *
 */

public class LateFeeRateOverridesCreateRequest extends LateFeeRateOverridesSubRequestParent {
/**
 *
 * Constructor to create a  LateFeeRateOverridesCreateRequest
 * @param id Unique request name
 * @param LFROcIn LateFeeRateOverridesObjectData for LateFeeRateOverridesCreateRequest
 *
 */
@JsonCreator
  public LateFeeRateOverridesCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("LateFeeRateOverrides")LateFeeRateOverridesObjectData LFROcIn) {
    super(id, "LateFeeRateOverridesCreate");
    if (LFROcIn != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(LFROcIn, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }

/**
 *
 * Retrieves the LateFeeRateOverridesObjectData that results from the LateFeeRateOverridesCreateRequest call
 * @return LateFeeRateOverridesObjectData resulting from udt call
 *
 */

  public LateFeeRateOverridesObjectData getOutput() {
    return LateFeeRateOverridesObjectHelper.fromMap(outputMap, "LateFeeRateOverrides");
  }
}
