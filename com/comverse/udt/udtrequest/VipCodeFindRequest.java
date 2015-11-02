/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeFindRequest.java
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
 * Class used to create a VipCodeFindRequest Udt Request
 *
 */

public class VipCodeFindRequest extends VipCodeRequest {
/**
 *
 * Constructor to create a  VipCodeFindRequest
 * @param id Unique request name
 * @param VCFindIn VipCodeObjectFilter for VipCodeFindRequest
 *
 */
@JsonCreator
  public VipCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("VipCode")VipCodeObjectFilter VCFindIn) {
    super(id, "VipCodeFind");
    if (VCFindIn != null) {
      Integer index =  VCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VipCode", VipCodeObjectHelper.toMap(VCFindIn, new HashMap(), "VipCode").get("VipCode"));
    }
  }

/**
 *
 * Retrieves the VipCodeObjectDataList that results from the VipCodeFindRequest call
 * @return VipCodeObjectDataList resulting from udt call
 *
 */

  public VipCodeObjectDataList getOutput() {
    return VipCodeObjectHelper.fromMapList(outputMap, "VipCodeList");
  }
}
