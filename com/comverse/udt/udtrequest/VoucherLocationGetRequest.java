/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationGetRequest.java
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
 * Class used to create a VoucherLocationGetRequest Udt Request
 *
 */

public class VoucherLocationGetRequest extends VoucherLocationSubRequestParent {
/**
 *
 * Constructor to create a  VoucherLocationGetRequest
 * @param id Unique request name
 * @param VouLGIn VoucherLocationObjectKeyData for VoucherLocationGetRequest
 *
 */
@JsonCreator
  public VoucherLocationGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherLocation")VoucherLocationObjectKeyData VouLGIn) {
    super(id, "VoucherLocationGet");
    if (VouLGIn != null) {
      addInput("VoucherLocation", VoucherLocationObjectKeyHelper.toMap(VouLGIn, new HashMap(), "VoucherLocationObjectKeyData").get("VoucherLocationObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the VoucherLocationObjectData that results from the VoucherLocationGetRequest call
 * @return VoucherLocationObjectData resulting from udt call
 *
 */

  public VoucherLocationObjectData getOutput() {
    return VoucherLocationObjectHelper.fromMap(outputMap, "VoucherLocation");
  }
}
