/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoConsumedRequest.java
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
 * Class used to create a VoucherStatusInfoConsumedRequest Udt Request
 *
 */

public class VoucherStatusInfoConsumedRequest extends VoucherStatusInfoSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusInfoConsumedRequest
 * @param id Unique request name
 * @param VouCoIn VoucherStatusInfoObjectData for VoucherStatusInfoConsumedRequest
 *
 */
@JsonCreator
  public VoucherStatusInfoConsumedRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatusInfo")VoucherStatusInfoObjectData VouCoIn) {
    super(id, "VoucherStatusInfoConsumed");
    if (VouCoIn != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(VouCoIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusInfoObjectData that results from the VoucherStatusInfoConsumedRequest call
 * @return VoucherStatusInfoObjectData resulting from udt call
 *
 */

  public VoucherStatusInfoObjectData getOutput() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
}
