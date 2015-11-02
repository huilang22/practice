/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LocationCodeFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a LocationCodeFindRequest Udt Request
 *
 */

public class LocationCodeFindRequest extends LocationCodeRequest {
/**
 *
 * Constructor to create a  LocationCodeFindRequest
 * @param id Unique request name
 * @param LOCFindIn LOCObjectFilter for LocationCodeFindRequest
 *
 */
@JsonCreator
  public LocationCodeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("LocationCode")LOCObjectFilter LOCFindIn) {
    super(id, "LocationCodeFind");
    if (LOCFindIn != null) {
      Integer index =  LOCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("LocationCode", LOCObjectHelper.toMap(LOCFindIn, new HashMap(), "LocationCode").get("LocationCode"));
    }
  }

/**
 *
 * Retrieves the LOCObjectDataList that results from the LocationCodeFindRequest call
 * @return LOCObjectDataList resulting from udt call
 *
 */

  public LOCObjectDataList getOutput() {
    return LOCObjectHelper.fromMapList(outputMap, "LocationCodeList");
  }
}
