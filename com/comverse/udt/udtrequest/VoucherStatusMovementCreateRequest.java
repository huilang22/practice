/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementCreateRequest.java
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
 * Class used to create a VoucherStatusMovementCreateRequest Udt Request
 *
 */

public class VoucherStatusMovementCreateRequest extends VoucherStatusMovementSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusMovementCreateRequest
 * @param id Unique request name
 * @param VouSMCIn VoucherStatusMovementObjectData for VoucherStatusMovementCreateRequest
 *
 */
@JsonCreator
  public VoucherStatusMovementCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatusMovement")VoucherStatusMovementObjectData VouSMCIn) {
    super(id, "VoucherStatusMovementCreate");
    if (VouSMCIn != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(VouSMCIn, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusMovementObjectData that results from the VoucherStatusMovementCreateRequest call
 * @return VoucherStatusMovementObjectData resulting from udt call
 *
 */

  public VoucherStatusMovementObjectData getOutput() {
    return VoucherStatusMovementObjectHelper.fromMap(outputMap, "VoucherStatusMovement");
  }
}
