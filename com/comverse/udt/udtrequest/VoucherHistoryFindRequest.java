/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherHistoryFindRequest.java
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
 * Class used to create a VoucherHistoryFindRequest Udt Request
 *
 */

public class VoucherHistoryFindRequest extends VoucherHistoryRequest {
/**
 *
 * Constructor to create a  VoucherHistoryFindRequest
 * @param id Unique request name
 * @param VouFIn VoucherHistoryObjectFilter for VoucherHistoryFindRequest
 *
 */
@JsonCreator
  public VoucherHistoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherHistory")VoucherHistoryObjectFilter VouFIn) {
    super(id, "VoucherHistoryFind");
    if (VouFIn != null) {
      Integer index =  VouFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherHistory", VoucherHistoryObjectHelper.toMap(VouFIn, new HashMap(), "VoucherHistory").get("VoucherHistory"));
    }
  }

/**
 *
 * Retrieves the VoucherHistoryObjectDataList that results from the VoucherHistoryFindRequest call
 * @return VoucherHistoryObjectDataList resulting from udt call
 *
 */

  public VoucherHistoryObjectDataList getOutput() {
    return VoucherHistoryObjectHelper.fromMapList(outputMap, "VoucherHistoryList");
  }
}
