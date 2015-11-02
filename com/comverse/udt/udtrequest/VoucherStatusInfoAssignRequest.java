/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoAssignRequest.java
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
 * Class used to create a VoucherStatusInfoAssignRequest Udt Request
 *
 */

public class VoucherStatusInfoAssignRequest extends VoucherStatusInfoSubRequestParent {
/**
 *
 * Constructor to create a  VoucherStatusInfoAssignRequest
 * @param id Unique request name
 * @param VouAsIn VoucherStatusInfoObjectData for VoucherStatusInfoAssignRequest
 *
 */
@JsonCreator
  public VoucherStatusInfoAssignRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatusInfo")VoucherStatusInfoObjectData VouAsIn) {
    super(id, "VoucherStatusInfoAssign");
    if (VouAsIn != null) {
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(VouAsIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusInfoObjectData that results from the VoucherStatusInfoAssignRequest call
 * @return VoucherStatusInfoObjectData resulting from udt call
 *
 */

  public VoucherStatusInfoObjectData getOutput() {
    return VoucherStatusInfoObjectHelper.fromMap(outputMap, "VoucherStatusInfo");
  }
}
