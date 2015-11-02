/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseInfoFindRequest.java
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
 * Class used to create a ClearingHouseInfoFindRequest Udt Request
 *
 */

public class ClearingHouseInfoFindRequest extends ClearingHouseInfoRequest {
/**
 *
 * Constructor to create a  ClearingHouseInfoFindRequest
 * @param id Unique request name
 * @param CHIFindIn ClearingHouseInfoObjectFilter for ClearingHouseInfoFindRequest
 *
 */
@JsonCreator
  public ClearingHouseInfoFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClearingHouseInfo")ClearingHouseInfoObjectFilter CHIFindIn) {
    super(id, "ClearingHouseInfoFind");
    if (CHIFindIn != null) {
      Integer index =  CHIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ClearingHouseInfo", ClearingHouseInfoObjectHelper.toMap(CHIFindIn, new HashMap(), "ClearingHouseInfo").get("ClearingHouseInfo"));
    }
  }

/**
 *
 * Retrieves the ClearingHouseInfoObjectDataList that results from the ClearingHouseInfoFindRequest call
 * @return ClearingHouseInfoObjectDataList resulting from udt call
 *
 */

  public ClearingHouseInfoObjectDataList getOutput() {
    return ClearingHouseInfoObjectHelper.fromMapList(outputMap, "ClearingHouseInfoList");
  }
}
