/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateOverrideUpdateRequest.java
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
 * Class used to create a CorridorRateOverrideUpdateRequest Udt Request
 *
 */

public class CorridorRateOverrideUpdateRequest extends CorridorRateOverrideSubRequestParent {
/**
 *
 * Constructor to create a  CorridorRateOverrideUpdateRequest
 * @param id Unique request name
 * @param CROUpdateIn CROObjectData for CorridorRateOverrideUpdateRequest
 *
 */
@JsonCreator
  public CorridorRateOverrideUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorRateOverride")CROObjectData CROUpdateIn) {
    super(id, "CorridorRateOverrideUpdate");
    if (CROUpdateIn != null) {
      addInput("CorridorRateOverride", CROObjectHelper.toMap(CROUpdateIn, new HashMap(), "CorridorRateOverride").get("CorridorRateOverride"));
    }
  }

/**
 *
 * Retrieves the CROObjectData that results from the CorridorRateOverrideUpdateRequest call
 * @return CROObjectData resulting from udt call
 *
 */

  public CROObjectData getOutput() {
    return CROObjectHelper.fromMap(outputMap, "CorridorRateOverride");
  }
}
