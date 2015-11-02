/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesCreateRequest.java
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
 * Class used to create a VoucherTypesCreateRequest Udt Request
 *
 */

public class VoucherTypesCreateRequest extends VoucherTypesSubRequestParent {
/**
 *
 * Constructor to create a  VoucherTypesCreateRequest
 * @param id Unique request name
 * @param VouTCIn VoucherTypesObjectData for VoucherTypesCreateRequest
 *
 */
@JsonCreator
  public VoucherTypesCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherTypes")VoucherTypesObjectData VouTCIn) {
    super(id, "VoucherTypesCreate");
    if (VouTCIn != null) {
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(VouTCIn, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }

/**
 *
 * Retrieves the VoucherTypesObjectData that results from the VoucherTypesCreateRequest call
 * @return VoucherTypesObjectData resulting from udt call
 *
 */

  public VoucherTypesObjectData getOutput() {
    return VoucherTypesObjectHelper.fromMap(outputMap, "VoucherTypes");
  }
}
