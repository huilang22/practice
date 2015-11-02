/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseFindRequest.java
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
 * Class used to create a ClearingHouseFindRequest Udt Request
 *
 */

public class ClearingHouseFindRequest extends ClearingHouseRequest {
/**
 *
 * Constructor to create a  ClearingHouseFindRequest
 * @param id Unique request name
 * @param CHIFindIn ClearingHouseObjectFilter for ClearingHouseFindRequest
 *
 */
@JsonCreator
  public ClearingHouseFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ClearingHouse")ClearingHouseObjectFilter CHIFindIn) {
    super(id, "ClearingHouseFind");
    if (CHIFindIn != null) {
      Integer index =  CHIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ClearingHouse", ClearingHouseObjectHelper.toMap(CHIFindIn, new HashMap(), "ClearingHouse").get("ClearingHouse"));
    }
  }

/**
 *
 * Retrieves the ClearingHouseObjectDataList that results from the ClearingHouseFindRequest call
 * @return ClearingHouseObjectDataList resulting from udt call
 *
 */

  public ClearingHouseObjectDataList getOutput() {
    return ClearingHouseObjectHelper.fromMapList(outputMap, "ClearingHouseList");
  }
}
