/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationUpdateRequest.java
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
 * Class used to create a VoucherLocationUpdateRequest Udt Request
 *
 */

public class VoucherLocationUpdateRequest extends VoucherLocationSubRequestParent {
/**
 *
 * Constructor to create a  VoucherLocationUpdateRequest
 * @param id Unique request name
 * @param VouLUIn VoucherLocationObjectData for VoucherLocationUpdateRequest
 *
 */
@JsonCreator
  public VoucherLocationUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherLocation")VoucherLocationObjectData VouLUIn) {
    super(id, "VoucherLocationUpdate");
    if (VouLUIn != null) {
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(VouLUIn, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }

/**
 *
 * Retrieves the VoucherLocationObjectData that results from the VoucherLocationUpdateRequest call
 * @return VoucherLocationObjectData resulting from udt call
 *
 */

  public VoucherLocationObjectData getOutput() {
    return VoucherLocationObjectHelper.fromMap(outputMap, "VoucherLocation");
  }
}
