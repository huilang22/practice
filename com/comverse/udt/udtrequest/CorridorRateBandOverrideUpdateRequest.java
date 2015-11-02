/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateBandOverrideUpdateRequest.java
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
 * Class used to create a CorridorRateBandOverrideUpdateRequest Udt Request
 *
 */

public class CorridorRateBandOverrideUpdateRequest extends CorridorRateBandOverrideSubRequestParent {
/**
 *
 * Constructor to create a  CorridorRateBandOverrideUpdateRequest
 * @param id Unique request name
 * @param CRBOUpdateIn CRBOObjectData for CorridorRateBandOverrideUpdateRequest
 *
 */
@JsonCreator
  public CorridorRateBandOverrideUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorRateBandOverride")CRBOObjectData CRBOUpdateIn) {
    super(id, "CorridorRateBandOverrideUpdate");
    if (CRBOUpdateIn != null) {
      addInput("CorridorRateBandOverride", CRBOObjectHelper.toMap(CRBOUpdateIn, new HashMap(), "CorridorRateBandOverride").get("CorridorRateBandOverride"));
    }
  }

/**
 *
 * Retrieves the CRBOObjectData that results from the CorridorRateBandOverrideUpdateRequest call
 * @return CRBOObjectData resulting from udt call
 *
 */

  public CRBOObjectData getOutput() {
    return CRBOObjectHelper.fromMap(outputMap, "CorridorRateBandOverride");
  }
}
