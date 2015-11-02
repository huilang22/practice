/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeUpdateRequest.java
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
 * Class used to create a VipCodeUpdateRequest Udt Request
 *
 */

public class VipCodeUpdateRequest extends VipCodeSubRequestParent {
/**
 *
 * Constructor to create a  VipCodeUpdateRequest
 * @param id Unique request name
 * @param VCUpdateIn VipCodeObjectData for VipCodeUpdateRequest
 *
 */
@JsonCreator
  public VipCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VipCode")VipCodeObjectData VCUpdateIn) {
    super(id, "VipCodeUpdate");
    if (VCUpdateIn != null) {
      addInput("VipCode", VipCodeObjectHelper.toMap(VCUpdateIn, new HashMap(), "VipCode").get("VipCode"));
    }
  }

/**
 *
 * Retrieves the VipCodeObjectData that results from the VipCodeUpdateRequest call
 * @return VipCodeObjectData resulting from udt call
 *
 */

  public VipCodeObjectData getOutput() {
    return VipCodeObjectHelper.fromMap(outputMap, "VipCode");
  }
}
