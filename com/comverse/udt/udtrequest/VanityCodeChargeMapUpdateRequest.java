/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapUpdateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a VanityCodeChargeMapUpdateRequest Udt Request
 *
 */

public class VanityCodeChargeMapUpdateRequest extends VanityCodeChargeMapSubRequestParent {
/**
 *
 * Constructor to create a  VanityCodeChargeMapUpdateRequest
 * @param id Unique request name
 * @param updateIn VanityCodeChargeObjData for VanityCodeChargeMapUpdateRequest
 *
 */
@JsonCreator
  public VanityCodeChargeMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VanityCodeChargeMap")VanityCodeChargeObjData updateIn) {
    super(id, "VanityCodeChargeMapUpdate");
    if (updateIn != null) {
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(updateIn, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }

/**
 *
 * Retrieves the VanityCodeChargeObjData that results from the VanityCodeChargeMapUpdateRequest call
 * @return VanityCodeChargeObjData resulting from udt call
 *
 */

  public VanityCodeChargeObjData getOutput() {
    return VanityCodeChargeObjHelper.fromMap(outputMap, "VanityCodeChargeMap");
  }
}
