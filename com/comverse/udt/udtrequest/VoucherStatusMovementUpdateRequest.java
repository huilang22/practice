/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementUpdateRequest.java
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
 * Class used to create a VoucherStatusMovementUpdateRequest Udt Request
 *
 */

public class VoucherStatusMovementUpdateRequest extends VoucherStatusMovementSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusMovementUpdateRequest
 * @param id Unique request name
 * @param VouSMUIn VoucherStatusMovementObjectData for VoucherStatusMovementUpdateRequest
 *
 */
@JsonCreator
  public VoucherStatusMovementUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatusMovement")VoucherStatusMovementObjectData VouSMUIn) {
    super(id, "VoucherStatusMovementUpdate");
    if (VouSMUIn != null) {
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(VouSMUIn, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusMovementObjectData that results from the VoucherStatusMovementUpdateRequest call
 * @return VoucherStatusMovementObjectData resulting from udt call
 *
 */

  public VoucherStatusMovementObjectData getOutput() {
    return VoucherStatusMovementObjectHelper.fromMap(outputMap, "VoucherStatusMovement");
  }
}
