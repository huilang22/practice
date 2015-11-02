/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusCreateRequest.java
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
 * Class used to create a VoucherStatusCreateRequest Udt Request
 *
 */

public class VoucherStatusCreateRequest extends VoucherStatusSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusCreateRequest
 * @param id Unique request name
 * @param VouSCIn VoucherStatusObjectData for VoucherStatusCreateRequest
 *
 */
@JsonCreator
  public VoucherStatusCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatus")VoucherStatusObjectData VouSCIn) {
    super(id, "VoucherStatusCreate");
    if (VouSCIn != null) {
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(VouSCIn, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusObjectData that results from the VoucherStatusCreateRequest call
 * @return VoucherStatusObjectData resulting from udt call
 *
 */

  public VoucherStatusObjectData getOutput() {
    return VoucherStatusObjectHelper.fromMap(outputMap, "VoucherStatus");
  }
}
