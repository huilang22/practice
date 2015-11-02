/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusGetRequest.java
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
 * Class used to create a VoucherStatusGetRequest Udt Request
 *
 */

public class VoucherStatusGetRequest extends VoucherStatusSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusGetRequest
 * @param id Unique request name
 * @param VouSGIn VoucherStatusObjectKeyData for VoucherStatusGetRequest
 *
 */
@JsonCreator
  public VoucherStatusGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatus")VoucherStatusObjectKeyData VouSGIn) {
    super(id, "VoucherStatusGet");
    if (VouSGIn != null) {
      addInput("VoucherStatus", VoucherStatusObjectKeyHelper.toMap(VouSGIn, new HashMap(), "VoucherStatusObjectKeyData").get("VoucherStatusObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusObjectData that results from the VoucherStatusGetRequest call
 * @return VoucherStatusObjectData resulting from udt call
 *
 */

  public VoucherStatusObjectData getOutput() {
    return VoucherStatusObjectHelper.fromMap(outputMap, "VoucherStatus");
  }
}
