/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeGetRequest.java
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
 * Class used to create a VipCodeGetRequest Udt Request
 *
 */

public class VipCodeGetRequest extends VipCodeSubRequestParent {
/**
 *
 * Constructor to create a  VipCodeGetRequest
 * @param id Unique request name
 * @param VCGetIn VipCodeObjectKeyData for VipCodeGetRequest
 *
 */
@JsonCreator
  public VipCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("VipCode")VipCodeObjectKeyData VCGetIn) {
    super(id, "VipCodeGet");
    if (VCGetIn != null) {
      addInput("VipCode", VipCodeObjectKeyHelper.toMap(VCGetIn, new HashMap(), "VipCodeObjectKeyData").get("VipCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the VipCodeObjectData that results from the VipCodeGetRequest call
 * @return VipCodeObjectData resulting from udt call
 *
 */

  public VipCodeObjectData getOutput() {
    return VipCodeObjectHelper.fromMap(outputMap, "VipCode");
  }
}
