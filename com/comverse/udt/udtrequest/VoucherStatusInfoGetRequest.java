/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoGetRequest.java
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
 * Class used to create a VoucherStatusInfoGetRequest Udt Request
 *
 */

public class VoucherStatusInfoGetRequest extends VoucherStatusInfoSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusInfoGetRequest
 * @param id Unique request name
 * @param VouGIn VoucherStatusInfoObjectKeyData for VoucherStatusInfoGetRequest
 *
 */
@JsonCreator
  public VoucherStatusInfoGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatusInfo")VoucherStatusInfoObjectKeyData VouGIn) {
    super(id, "VoucherStatusInfoGet");
    if (VouGIn != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectKeyHelper.toMap(VouGIn, new HashMap(), "VoucherStatusInfoObjectKeyData").get("VoucherStatusInfoObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusInfoObjectData that results from the VoucherStatusInfoGetRequest call
 * @return VoucherStatusInfoObjectData resulting from udt call
 *
 */

  public VoucherStatusInfoObjectData getOutput() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
}
