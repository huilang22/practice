/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusFindRequest.java
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
 * Class used to create a VoucherStatusFindRequest Udt Request
 *
 */

public class VoucherStatusFindRequest extends VoucherStatusRequest {
/**
 *
 * Constructor to create a  VoucherStatusFindRequest
 * @param id Unique request name
 * @param VouSFIn VoucherStatusObjectFilter for VoucherStatusFindRequest
 *
 */
@JsonCreator
  public VoucherStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatus")VoucherStatusObjectFilter VouSFIn) {
    super(id, "VoucherStatusFind");
    if (VouSFIn != null) {
      Integer index =  VouSFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherStatus", VoucherStatusObjectHelper.toMap(VouSFIn, new HashMap(), "VoucherStatus").get("VoucherStatus"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusObjectDataList that results from the VoucherStatusFindRequest call
 * @return VoucherStatusObjectDataList resulting from udt call
 *
 */

  public VoucherStatusObjectDataList getOutput() {
    return VoucherStatusObjectHelper.fromMapList(outputMap, "VoucherStatusList");
  }
}
