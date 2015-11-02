/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusUpdateRequest.java
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
 * Class used to create a VoucherStatusUpdateRequest Udt Request
 *
 */

public class VoucherStatusUpdateRequest extends VoucherStatusSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusUpdateRequest
 * @param id Unique request name
 * @param VouSUIn VoucherStatusObjectData for VoucherStatusUpdateRequest
 *
 */
@JsonCreator
  public VoucherStatusUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatus")VoucherStatusObjectData VouSUIn) {
    super(id, "VoucherStatusUpdate");
    if (VouSUIn != null) {
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(VouSUIn, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusObjectData that results from the VoucherStatusUpdateRequest call
 * @return VoucherStatusObjectData resulting from udt call
 *
 */

  public VoucherStatusObjectData getOutput() {
    return VoucherStatusObjectHelper.fromMap(outputMap, "VoucherStatus");
  }
}
