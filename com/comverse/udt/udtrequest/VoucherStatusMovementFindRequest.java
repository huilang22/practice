/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementFindRequest.java
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
 * Class used to create a VoucherStatusMovementFindRequest Udt Request
 *
 */

public class VoucherStatusMovementFindRequest extends VoucherStatusMovementRequest {
/**
 *
 * Constructor to create a  VoucherStatusMovementFindRequest
 * @param id Unique request name
 * @param VouSMFIn VoucherStatusMovementObjectFilter for VoucherStatusMovementFindRequest
 *
 */
@JsonCreator
  public VoucherStatusMovementFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherStatusMovement")VoucherStatusMovementObjectFilter VouSMFIn) {
    super(id, "VoucherStatusMovementFind");
    if (VouSMFIn != null) {
      Integer index =  VouSMFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherStatusMovement", VoucherStatusMovementObjectHelper.toMap(VouSMFIn, new HashMap(), "VoucherStatusMovement").get("VoucherStatusMovement"));
    }
  }

/**
 *
 * Retrieves the VoucherStatusMovementObjectDataList that results from the VoucherStatusMovementFindRequest call
 * @return VoucherStatusMovementObjectDataList resulting from udt call
 *
 */

  public VoucherStatusMovementObjectDataList getOutput() {
    return VoucherStatusMovementObjectHelper.fromMapList(outputMap, "VoucherStatusMovementList");
  }
}
