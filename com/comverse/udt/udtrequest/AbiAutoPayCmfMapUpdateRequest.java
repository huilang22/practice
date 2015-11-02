/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiAutoPayCmfMapUpdateRequest.java
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
 * Class used to create a AbiAutoPayCmfMapUpdateRequest Udt Request
 *
 */

public class AbiAutoPayCmfMapUpdateRequest extends AbiAutoPayCmfMapSubRequestParent {
/**
 *
 * Constructor to create a  AbiAutoPayCmfMapUpdateRequest
 * @param id Unique request name
 * @param AbiAutoPayCmfMapUpdateIn AbiAutoPayCmfMapObjectData for AbiAutoPayCmfMapUpdateRequest
 *
 */
@JsonCreator
  public AbiAutoPayCmfMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiAutoPayCmfMap")AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapUpdateIn) {
    super(id, "AbiAutoPayCmfMapUpdate");
    if (AbiAutoPayCmfMapUpdateIn != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(AbiAutoPayCmfMapUpdateIn, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }

/**
 *
 * Retrieves the AbiAutoPayCmfMapObjectData that results from the AbiAutoPayCmfMapUpdateRequest call
 * @return AbiAutoPayCmfMapObjectData resulting from udt call
 *
 */

  public AbiAutoPayCmfMapObjectData getOutput() {
    return AbiAutoPayCmfMapObjectHelper.fromMap(outputMap, "AbiAutoPayCmfMap");
  }
}
