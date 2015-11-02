/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeDeleteRequest.java
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
 * Class used to create a VipCodeDeleteRequest Udt Request
 *
 */

public class VipCodeDeleteRequest extends VipCodeSubRequestParent {
/**
 *
 * Constructor to create a  VipCodeDeleteRequest
 * @param id Unique request name
 * @param VCDeleteIn VipCodeObjectKeyData for VipCodeDeleteRequest
 *
 */
@JsonCreator
  public VipCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("VipCode")VipCodeObjectKeyData VCDeleteIn) {
    super(id, "VipCodeDelete");
    if (VCDeleteIn != null) {
      addInput("VipCode", VipCodeObjectKeyHelper.toMap(VCDeleteIn, new HashMap(), "VipCodeObjectKeyData").get("VipCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the VipCodeObjectData that results from the VipCodeDeleteRequest call
 * @return VipCodeObjectData resulting from udt call
 *
 */

  public VipCodeObjectData getOutput() {
    return VipCodeObjectHelper.fromMap(outputMap, "VipCode");
  }
}
