/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationFindRequest.java
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
 * Class used to create a VoucherLocationFindRequest Udt Request
 *
 */

public class VoucherLocationFindRequest extends VoucherLocationRequest {
/**
 *
 * Constructor to create a  VoucherLocationFindRequest
 * @param id Unique request name
 * @param VouLFIn VoucherLocationObjectFilter for VoucherLocationFindRequest
 *
 */
@JsonCreator
  public VoucherLocationFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherLocation")VoucherLocationObjectFilter VouLFIn) {
    super(id, "VoucherLocationFind");
    if (VouLFIn != null) {
      Integer index =  VouLFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherLocation", VoucherLocationObjectHelper.toMap(VouLFIn, new HashMap(), "VoucherLocation").get("VoucherLocation"));
    }
  }

/**
 *
 * Retrieves the VoucherLocationObjectDataList that results from the VoucherLocationFindRequest call
 * @return VoucherLocationObjectDataList resulting from udt call
 *
 */

  public VoucherLocationObjectDataList getOutput() {
    return VoucherLocationObjectHelper.fromMapList(outputMap, "VoucherLocationList");
  }
}
