/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoUpdateRequest.java
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
 * Class used to create a VoucherStatusInfoUpdateRequest Udt Request
 *
 */

public class VoucherStatusInfoUpdateRequest extends VoucherStatusInfoSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusInfoUpdateRequest
 * @param id Unique request name
 * @param VouUIn VoucherStatusInfoObjectData for VoucherStatusInfoUpdateRequest
 *
 */
@JsonCreator
  public VoucherStatusInfoUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatusInfo")VoucherStatusInfoObjectData VouUIn) {
    super(id, "VoucherStatusInfoUpdate");
    if (VouUIn != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(VouUIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusInfoObjectData that results from the VoucherStatusInfoUpdateRequest call
 * @return VoucherStatusInfoObjectData resulting from udt call
 *
 */

  public VoucherStatusInfoObjectData getOutput() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
}
