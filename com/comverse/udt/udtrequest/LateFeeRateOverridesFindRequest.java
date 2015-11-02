/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeRateOverridesFindRequest.java
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
 * Class used to create a LateFeeRateOverridesFindRequest Udt Request
 *
 */

public class LateFeeRateOverridesFindRequest extends LateFeeRateOverridesRequest {
/**
 *
 * Constructor to create a  LateFeeRateOverridesFindRequest
 * @param id Unique request name
 * @param LFROfIn LateFeeRateOverridesObjectFilter for LateFeeRateOverridesFindRequest
 *
 */
@JsonCreator
  public LateFeeRateOverridesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("LateFeeRateOverrides")LateFeeRateOverridesObjectFilter LFROfIn) {
    super(id, "LateFeeRateOverridesFind");
    if (LFROfIn != null) {
      Integer index =  LFROfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LateFeeRateOverrides", LateFeeRateOverridesObjectHelper.toMap(LFROfIn, new HashMap(), "LateFeeRateOverrides").get("LateFeeRateOverrides"));
    }
  }

/**
 *
 * Retrieves the LateFeeRateOverridesObjectDataList that results from the LateFeeRateOverridesFindRequest call
 * @return LateFeeRateOverridesObjectDataList resulting from udt call
 *
 */

  public LateFeeRateOverridesObjectDataList getOutput() {
    return LateFeeRateOverridesObjectHelper.fromMapList(outputMap, "LateFeeRateOverridesList");
  }
}
