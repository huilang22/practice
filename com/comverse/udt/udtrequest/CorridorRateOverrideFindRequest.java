/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateOverrideFindRequest.java
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
 * Class used to create a CorridorRateOverrideFindRequest Udt Request
 *
 */

public class CorridorRateOverrideFindRequest extends CorridorRateOverrideRequest {
/**
 *
 * Constructor to create a  CorridorRateOverrideFindRequest
 * @param id Unique request name
 * @param CROFindIn CROObjectFilter for CorridorRateOverrideFindRequest
 *
 */
@JsonCreator
  public CorridorRateOverrideFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorRateOverride")CROObjectFilter CROFindIn) {
    super(id, "CorridorRateOverrideFind");
    if (CROFindIn != null) {
      Integer index =  CROFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CorridorRateOverride", CROObjectHelper.toMap(CROFindIn, new HashMap(), "CorridorRateOverride").get("CorridorRateOverride"));
    }
  }

/**
 *
 * Retrieves the CROObjectDataList that results from the CorridorRateOverrideFindRequest call
 * @return CROObjectDataList resulting from udt call
 *
 */

  public CROObjectDataList getOutput() {
    return CROObjectHelper.fromMapList(outputMap, "CorridorRateOverrideList");
  }
}
