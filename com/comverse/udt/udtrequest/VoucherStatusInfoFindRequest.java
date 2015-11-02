/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoFindRequest.java
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
 * Class used to create a VoucherStatusInfoFindRequest Udt Request
 *
 */

public class VoucherStatusInfoFindRequest extends VoucherStatusInfoRequest {
/**
 *
 * Constructor to create a  VoucherStatusInfoFindRequest
 * @param id Unique request name
 * @param VouFIn VoucherStatusInfoObjectFilter for VoucherStatusInfoFindRequest
 *
 */
@JsonCreator
  public VoucherStatusInfoFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatusInfo")VoucherStatusInfoObjectFilter VouFIn) {
    super(id, "VoucherStatusInfoFind");
    if (VouFIn != null) {
      Integer index =  VouFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherStatusInfo", VoucherStatusInfoObjectHelper.toMap(VouFIn, new HashMap(), "VoucherStatusInfo").get("VoucherStatusInfo"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusInfoObjectDataList that results from the VoucherStatusInfoFindRequest call
 * @return VoucherStatusInfoObjectDataList resulting from udt call
 *
 */

  public VoucherStatusInfoObjectDataList getOutput() {
    return VoucherStatusInfoObjectHelper.fromMapList(outputMap, "VoucherStatusInfoList");
  }
}
