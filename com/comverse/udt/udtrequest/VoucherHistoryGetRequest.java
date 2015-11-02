/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherHistoryGetRequest.java
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
 * Class used to create a VoucherHistoryGetRequest Udt Request
 *
 */

public class VoucherHistoryGetRequest extends VoucherHistorySubRequestParent {
/**
 *
 * Constructor to create a  VoucherHistoryGetRequest
 * @param id Unique request name
 * @param VouGIn VoucherHistoryObjectKeyData for VoucherHistoryGetRequest
 *
 */
@JsonCreator
  public VoucherHistoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherHistory")VoucherHistoryObjectKeyData VouGIn) {
    super(id, "VoucherHistoryGet");
    if (VouGIn != null) {
      addInput("VoucherHistory", VoucherHistoryObjectKeyHelper.toMap(VouGIn, new HashMap(), "VoucherHistoryObjectKeyData").get("VoucherHistoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the VoucherHistoryObjectData that results from the VoucherHistoryGetRequest call
 * @return VoucherHistoryObjectData resulting from udt call
 *
 */

  public VoucherHistoryObjectData getOutput() {
    return VoucherHistoryObjectHelper.fromMap(outputMap, "VoucherHistory");
  }
}
