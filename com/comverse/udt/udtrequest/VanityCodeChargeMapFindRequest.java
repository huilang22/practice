/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapFindRequest.java
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
 * Class used to create a VanityCodeChargeMapFindRequest Udt Request
 *
 */

public class VanityCodeChargeMapFindRequest extends VanityCodeChargeMapRequest {
/**
 *
 * Constructor to create a  VanityCodeChargeMapFindRequest
 * @param id Unique request name
 * @param findIn VanityCodeChargeObjFilter for VanityCodeChargeMapFindRequest
 *
 */
@JsonCreator
  public VanityCodeChargeMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("VanityCodeChargeMap")VanityCodeChargeObjFilter findIn) {
    super(id, "VanityCodeChargeMapFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(findIn, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }

/**
 *
 * Retrieves the VanityCodeChargeObjDataList that results from the VanityCodeChargeMapFindRequest call
 * @return VanityCodeChargeObjDataList resulting from udt call
 *
 */

  public VanityCodeChargeObjDataList getOutput() {
    return VanityCodeChargeObjHelper.fromMapList(outputMap, "VanityCodeChargeMapList");
  }
}
