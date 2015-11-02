/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementGetRequest.java
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
 * Class used to create a VoucherStatusMovementGetRequest Udt Request
 *
 */

public class VoucherStatusMovementGetRequest extends VoucherStatusMovementSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusMovementGetRequest
 * @param id Unique request name
 * @param VouSMGIn VoucherStatusMovementObjectKeyData for VoucherStatusMovementGetRequest
 *
 */
@JsonCreator
  public VoucherStatusMovementGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatusMovement")VoucherStatusMovementObjectKeyData VouSMGIn) {
    super(id, "VoucherStatusMovementGet");
    if (VouSMGIn != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectKeyHelper.toMap(VouSMGIn, new HashMap(), "VoucherStatusMovementObjectKeyData").get("VoucherStatusMovementObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusMovementObjectData that results from the VoucherStatusMovementGetRequest call
 * @return VoucherStatusMovementObjectData resulting from udt call
 *
 */

  public VoucherStatusMovementObjectData getOutput() {
    return VoucherStatusMovementObjectHelper.fromMap(outputMap, "VoucherStatusMovement");
  }
}
