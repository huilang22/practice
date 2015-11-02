/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateBandOverrideGetRequest.java
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
 * Class used to create a CorridorRateBandOverrideGetRequest Udt Request
 *
 */

public class CorridorRateBandOverrideGetRequest extends CorridorRateBandOverrideSubRequestParent {
/**
 *
 * Constructor to create a  CorridorRateBandOverrideGetRequest
 * @param id Unique request name
 * @param CRBOGetIn CRBOObjectKeyData for CorridorRateBandOverrideGetRequest
 *
 */
@JsonCreator
  public CorridorRateBandOverrideGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CorridorRateBandOverride")CRBOObjectKeyData CRBOGetIn) {
    super(id, "CorridorRateBandOverrideGet");
    if (CRBOGetIn != null) {
      addInput("CorridorRateBandOverride", CRBOObjectKeyHelper.toMap(CRBOGetIn, new HashMap(), "CRBOObjectKeyData").get("CRBOObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CRBOObjectData that results from the CorridorRateBandOverrideGetRequest call
 * @return CRBOObjectData resulting from udt call
 *
 */

  public CRBOObjectData getOutput() {
    return CRBOObjectHelper.fromMap(outputMap, "CorridorRateBandOverride");
  }
}
