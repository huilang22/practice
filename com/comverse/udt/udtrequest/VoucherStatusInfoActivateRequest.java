/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoActivateRequest.java
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
 * Class used to create a VoucherStatusInfoActivateRequest Udt Request
 *
 */

public class VoucherStatusInfoActivateRequest extends VoucherStatusInfoSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusInfoActivateRequest
 * @param id Unique request name
 * @param VouAcIn VoucherStatusInfoObjectData for VoucherStatusInfoActivateRequest
 *
 */
@JsonCreator
  public VoucherStatusInfoActivateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatusInfo")VoucherStatusInfoObjectData VouAcIn) {
    super(id, "VoucherStatusInfoActivate");
    if (VouAcIn != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(VouAcIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusInfoObjectData that results from the VoucherStatusInfoActivateRequest call
 * @return VoucherStatusInfoObjectData resulting from udt call
 *
 */

  public VoucherStatusInfoObjectData getOutput() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
}
