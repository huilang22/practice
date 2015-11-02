/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapGetRequest.java
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
 * Class used to create a VanityCodeChargeMapGetRequest Udt Request
 *
 */

public class VanityCodeChargeMapGetRequest extends VanityCodeChargeMapSubRequestParent {
/**
 *
 * Constructor to create a  VanityCodeChargeMapGetRequest
 * @param id Unique request name
 * @param getIn VanityCodeChargeObjKeyData for VanityCodeChargeMapGetRequest
 *
 */
@JsonCreator
  public VanityCodeChargeMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("VanityCodeChargeMap")VanityCodeChargeObjKeyData getIn) {
    super(id, "VanityCodeChargeMapGet");
    if (getIn != null) {
      addInput("VanityCodeChargeMap", VanityCodeChargeObjKeyHelper.toMap(getIn, new HashMap(), "VanityCodeChargeObjKeyData").get("VanityCodeChargeObjKeyData"));
    }
  }

/**
 *
 * Retrieves the VanityCodeChargeObjData that results from the VanityCodeChargeMapGetRequest call
 * @return VanityCodeChargeObjData resulting from udt call
 *
 */

  public VanityCodeChargeObjData getOutput() {
    return VanityCodeChargeObjHelper.fromMap(outputMap, "VanityCodeChargeMap");
  }
}
