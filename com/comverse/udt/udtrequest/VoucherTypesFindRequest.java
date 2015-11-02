/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesFindRequest.java
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
 * Class used to create a VoucherTypesFindRequest Udt Request
 *
 */

public class VoucherTypesFindRequest extends VoucherTypesRequest {
/**
 *
 * Constructor to create a  VoucherTypesFindRequest
 * @param id Unique request name
 * @param VouTFIn VoucherTypesObjectFilter for VoucherTypesFindRequest
 *
 */
@JsonCreator
  public VoucherTypesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherTypes")VoucherTypesObjectFilter VouTFIn) {
    super(id, "VoucherTypesFind");
    if (VouTFIn != null) {
      Integer index =  VouTFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherTypes", VoucherTypesObjectHelper.toMap(VouTFIn, new HashMap(), "VoucherTypes").get("VoucherTypes"));
    }
  }

/**
 *
 * Retrieves the VoucherTypesObjectDataList that results from the VoucherTypesFindRequest call
 * @return VoucherTypesObjectDataList resulting from udt call
 *
 */

  public VoucherTypesObjectDataList getOutput() {
    return VoucherTypesObjectHelper.fromMapList(outputMap, "VoucherTypesList");
  }
}
