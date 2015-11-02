/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesUpdateRequest.java
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
 * Class used to create a VoucherTypesUpdateRequest Udt Request
 *
 */

public class VoucherTypesUpdateRequest extends VoucherTypesSubRequestParent {
/**
 *
 * Constructor to create a  VoucherTypesUpdateRequest
 * @param id Unique request name
 * @param VouTUIn VoucherTypesObjectData for VoucherTypesUpdateRequest
 *
 */
@JsonCreator
  public VoucherTypesUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherTypes")VoucherTypesObjectData VouTUIn) {
    super(id, "VoucherTypesUpdate");
    if (VouTUIn != null) {
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(VouTUIn, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }

/**
 *
 * Retrieves the VoucherTypesObjectData that results from the VoucherTypesUpdateRequest call
 * @return VoucherTypesObjectData resulting from udt call
 *
 */

  public VoucherTypesObjectData getOutput() {
    return VoucherTypesObjectHelper.fromMap(outputMap, "VoucherTypes");
  }
}
