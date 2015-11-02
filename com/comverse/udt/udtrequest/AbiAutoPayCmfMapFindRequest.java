/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiAutoPayCmfMapFindRequest.java
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
 * Class used to create a AbiAutoPayCmfMapFindRequest Udt Request
 *
 */

public class AbiAutoPayCmfMapFindRequest extends AbiAutoPayCmfMapRequest {
/**
 *
 * Constructor to create a  AbiAutoPayCmfMapFindRequest
 * @param id Unique request name
 * @param AbiAutoPayCmfMapFindIn AbiAutoPayCmfMapObjectFilter for AbiAutoPayCmfMapFindRequest
 *
 */
@JsonCreator
  public AbiAutoPayCmfMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiAutoPayCmfMap")AbiAutoPayCmfMapObjectFilter AbiAutoPayCmfMapFindIn) {
    super(id, "AbiAutoPayCmfMapFind");
    if (AbiAutoPayCmfMapFindIn != null) {
      Integer index =  AbiAutoPayCmfMapFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AbiAutoPayCmfMap", AbiAutoPayCmfMapObjectHelper.toMap(AbiAutoPayCmfMapFindIn, new HashMap(), "AbiAutoPayCmfMap").get("AbiAutoPayCmfMap"));
    }
  }

/**
 *
 * Retrieves the AbiAutoPayCmfMapObjectDataList that results from the AbiAutoPayCmfMapFindRequest call
 * @return AbiAutoPayCmfMapObjectDataList resulting from udt call
 *
 */

  public AbiAutoPayCmfMapObjectDataList getOutput() {
    return AbiAutoPayCmfMapObjectHelper.fromMapList(outputMap, "AbiAutoPayCmfMapList");
  }
}
