/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeCreateRequest.java
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
 * Class used to create a VipCodeCreateRequest Udt Request
 *
 */

public class VipCodeCreateRequest extends VipCodeSubRequestParent {
/**
 *
 * Constructor to create a  VipCodeCreateRequest
 * @param id Unique request name
 * @param VCCreateIn VipCodeObjectData for VipCodeCreateRequest
 *
 */
@JsonCreator
  public VipCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VipCode")VipCodeObjectData VCCreateIn) {
    super(id, "VipCodeCreate");
    if (VCCreateIn != null) {
      addInput("VipCode", VipCodeObjectHelper.toMap(VCCreateIn, new HashMap(), "VipCode").get("VipCode"));
    }
  }

/**
 *
 * Retrieves the VipCodeObjectData that results from the VipCodeCreateRequest call
 * @return VipCodeObjectData resulting from udt call
 *
 */

  public VipCodeObjectData getOutput() {
    return VipCodeObjectHelper.fromMap(outputMap, "VipCode");
  }
}
