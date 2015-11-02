/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationCreateRequest.java
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
 * Class used to create a VoucherLocationCreateRequest Udt Request
 *
 */

public class VoucherLocationCreateRequest extends VoucherLocationSubRequestParent {
/**
 *
 * Constructor to create a  VoucherLocationCreateRequest
 * @param id Unique request name
 * @param VouLCIn VoucherLocationObjectData for VoucherLocationCreateRequest
 *
 */
@JsonCreator
  public VoucherLocationCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherLocation")VoucherLocationObjectData VouLCIn) {
    super(id, "VoucherLocationCreate");
    if (VouLCIn != null) {
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(VouLCIn, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }

/**
 *
 * Retrieves the VoucherLocationObjectData that results from the VoucherLocationCreateRequest call
 * @return VoucherLocationObjectData resulting from udt call
 *
 */

  public VoucherLocationObjectData getOutput() {
    return VoucherLocationObjectHelper.fromMap(outputMap, "VoucherLocation");
  }
}
