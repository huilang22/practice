/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesGetRequest.java
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
 * Class used to create a VoucherTypesGetRequest Udt Request
 *
 */

public class VoucherTypesGetRequest extends VoucherTypesSubRequestParent {
/**
 *
 * Constructor to create a  VoucherTypesGetRequest
 * @param id Unique request name
 * @param VouTGIn VoucherTypesObjectKeyData for VoucherTypesGetRequest
 *
 */
@JsonCreator
  public VoucherTypesGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherTypes")VoucherTypesObjectKeyData VouTGIn) {
    super(id, "VoucherTypesGet");
    if (VouTGIn != null) {
      addInput("VoucherTypes", VoucherTypesObjectKeyHelper.toMap(VouTGIn, new HashMap(), "VoucherTypesObjectKeyData").get("VoucherTypesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the VoucherTypesObjectData that results from the VoucherTypesGetRequest call
 * @return VoucherTypesObjectData resulting from udt call
 *
 */

  public VoucherTypesObjectData getOutput() {
    return VoucherTypesObjectHelper.fromMap(outputMap, "VoucherTypes");
  }
}
