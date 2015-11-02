/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiAutoPayCmfMapGetRequest.java
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
 * Class used to create a AbiAutoPayCmfMapGetRequest Udt Request
 *
 */

public class AbiAutoPayCmfMapGetRequest extends AbiAutoPayCmfMapSubRequestParent {
/**
 *
 * Constructor to create a  AbiAutoPayCmfMapGetRequest
 * @param id Unique request name
 * @param AbiAutoPayCmfMapGetIn AbiAutoPayCmfMapObjectKeyData for AbiAutoPayCmfMapGetRequest
 *
 */
@JsonCreator
  public AbiAutoPayCmfMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiAutoPayCmfMap")AbiAutoPayCmfMapObjectKeyData AbiAutoPayCmfMapGetIn) {
    super(id, "AbiAutoPayCmfMapGet");
    if (AbiAutoPayCmfMapGetIn != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectKeyHelper.toMap(AbiAutoPayCmfMapGetIn, new HashMap(), "AbiAutoPayCmfMapObjectKeyData").get("AbiAutoPayCmfMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AbiAutoPayCmfMapObjectData that results from the AbiAutoPayCmfMapGetRequest call
 * @return AbiAutoPayCmfMapObjectData resulting from udt call
 *
 */

  public AbiAutoPayCmfMapObjectData getOutput() {
    return AbiAutoPayCmfMapObjectHelper.fromMap(outputMap, "AbiAutoPayCmfMap");
  }
}
