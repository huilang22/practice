/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesDeleteRequest.java
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
 * Class used to create a LateFeeRateOverridesDeleteRequest Udt Request
 *
 */

public class LateFeeRateOverridesDeleteRequest extends LateFeeRateOverridesSubRequestParent {
/**
 *
 * Constructor to create a  LateFeeRateOverridesDeleteRequest
 * @param id Unique request name
 * @param LFROdIn LateFeeRateOverridesObjectKeyData for LateFeeRateOverridesDeleteRequest
 * @param LFROCeaseDate Date for LateFeeRateOverridesDeleteRequest
 *
 */
@JsonCreator
  public LateFeeRateOverridesDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("LateFeeRateOverrides")LateFeeRateOverridesObjectKeyData LFROdIn, @JsonProperty("LFROCeaseDate")Date LFROCeaseDate) {
    super(id, "LateFeeRateOverridesDelete");
    if (LFROdIn != null) {
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectKeyHelper.toMap(LFROdIn, new HashMap(), "LateFeeRateOverridesObjectKeyData").get("LateFeeRateOverridesObjectKeyData"));
    }
    if (LFROCeaseDate != null) {
      addInput("LFROCeaseDate", LFROCeaseDate);
    }
  }

/**
 *
 * Retrieves the LateFeeRateOverridesObjectData that results from the LateFeeRateOverridesDeleteRequest call
 * @return LateFeeRateOverridesObjectData resulting from udt call
 *
 */

  public LateFeeRateOverridesObjectData getOutput() {
    return LateFeeRateOverridesObjectHelper.fromMap(outputMap, "LateFeeRateOverrides");
  }
}
