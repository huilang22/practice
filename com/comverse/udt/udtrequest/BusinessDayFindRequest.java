/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayFindRequest.java
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
 * Class used to create a BusinessDayFindRequest Udt Request
 *
 */

public class BusinessDayFindRequest extends BusinessDayRequest {
/**
 *
 * Constructor to create a  BusinessDayFindRequest
 * @param id Unique request name
 * @param BDfind_In BusinessDayObjectFilter for BusinessDayFindRequest
 *
 */
@JsonCreator
  public BusinessDayFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessDay")BusinessDayObjectFilter BDfind_In) {
    super(id, "BusinessDayFind");
    if (BDfind_In != null) {
      Integer index =  BDfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(BDfind_In, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }

/**
 *
 * Retrieves the BusinessDayObjectDataList that results from the BusinessDayFindRequest call
 * @return BusinessDayObjectDataList resulting from udt call
 *
 */

  public BusinessDayObjectDataList getOutput() {
    return BusinessDayObjectHelper.fromMapList(outputMap, "BusinessDayList");
  }
}
