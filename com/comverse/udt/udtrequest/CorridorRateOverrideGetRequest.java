/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateOverrideGetRequest.java
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
 * Class used to create a CorridorRateOverrideGetRequest Udt Request
 *
 */

public class CorridorRateOverrideGetRequest extends CorridorRateOverrideSubRequestParent {
/**
 *
 * Constructor to create a  CorridorRateOverrideGetRequest
 * @param id Unique request name
 * @param CROGetIn CROObjectKeyData for CorridorRateOverrideGetRequest
 *
 */
@JsonCreator
  public CorridorRateOverrideGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorRateOverride")CROObjectKeyData CROGetIn) {
    super(id, "CorridorRateOverrideGet");
    if (CROGetIn != null) {
      addInput("CorridorRateOverride", CROObjectKeyHelper.toMap(CROGetIn, new HashMap(), "CROObjectKeyData").get("CROObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CROObjectData that results from the CorridorRateOverrideGetRequest call
 * @return CROObjectData resulting from udt call
 *
 */

  public CROObjectData getOutput() {
    return CROObjectHelper.fromMap(outputMap, "CorridorRateOverride");
  }
}
