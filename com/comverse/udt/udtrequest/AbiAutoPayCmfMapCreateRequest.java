/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiAutoPayCmfMapCreateRequest.java
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
 * Class used to create a AbiAutoPayCmfMapCreateRequest Udt Request
 *
 */

public class AbiAutoPayCmfMapCreateRequest extends AbiAutoPayCmfMapSubRequestParent {
/**
 *
 * Constructor to create a  AbiAutoPayCmfMapCreateRequest
 * @param id Unique request name
 * @param AbiAutoPayCmfMapCreateIn AbiAutoPayCmfMapObjectData for AbiAutoPayCmfMapCreateRequest
 *
 */
@JsonCreator
  public AbiAutoPayCmfMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiAutoPayCmfMap")AbiAutoPayCmfMapObjectData AbiAutoPayCmfMapCreateIn) {
    super(id, "AbiAutoPayCmfMapCreate");
    if (AbiAutoPayCmfMapCreateIn != null) {
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(AbiAutoPayCmfMapCreateIn, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }

/**
 *
 * Retrieves the AbiAutoPayCmfMapObjectData that results from the AbiAutoPayCmfMapCreateRequest call
 * @return AbiAutoPayCmfMapObjectData resulting from udt call
 *
 */

  public AbiAutoPayCmfMapObjectData getOutput() {
    return AbiAutoPayCmfMapObjectHelper.fromMap(outputMap, "AbiAutoPayCmfMap");
  }
}
