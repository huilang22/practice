/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapCreateRequest.java
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
 * Class used to create a VanityCodeChargeMapCreateRequest Udt Request
 *
 */

public class VanityCodeChargeMapCreateRequest extends VanityCodeChargeMapSubRequestParent {
/**
 *
 * Constructor to create a  VanityCodeChargeMapCreateRequest
 * @param id Unique request name
 * @param createIn VanityCodeChargeObjData for VanityCodeChargeMapCreateRequest
 *
 */
@JsonCreator
  public VanityCodeChargeMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VanityCodeChargeMap")VanityCodeChargeObjData createIn) {
    super(id, "VanityCodeChargeMapCreate");
    if (createIn != null) {
      addInput("VanityCodeChargeMap", VanityCodeChargeObjHelper.toMap(createIn, new HashMap(), "VanityCodeChargeMap").get("VanityCodeChargeMap"));
    }
  }

/**
 *
 * Retrieves the VanityCodeChargeObjData that results from the VanityCodeChargeMapCreateRequest call
 * @return VanityCodeChargeObjData resulting from udt call
 *
 */

  public VanityCodeChargeObjData getOutput() {
    return VanityCodeChargeObjHelper.fromMap(outputMap, "VanityCodeChargeMap");
  }
}
