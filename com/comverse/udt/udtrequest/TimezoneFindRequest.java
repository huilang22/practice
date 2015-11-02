/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TimezoneFindRequest.java
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
 * Class used to create a TimezoneFindRequest Udt Request
 *
 */

public class TimezoneFindRequest extends TimezoneRequest {
/**
 *
 * Constructor to create a  TimezoneFindRequest
 * @param id Unique request name
 * @param TZFindIn TimezoneObjectFilter for TimezoneFindRequest
 *
 */
@JsonCreator
  public TimezoneFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Timezone")TimezoneObjectFilter TZFindIn) {
    super(id, "TimezoneFind");
    if (TZFindIn != null) {
      Integer index =  TZFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Timezone", TimezoneObjectHelper.toMap(TZFindIn, new HashMap(), "Timezone").get("Timezone"));
    }
  }

/**
 *
 * Retrieves the TimezoneObjectDataList that results from the TimezoneFindRequest call
 * @return TimezoneObjectDataList resulting from udt call
 *
 */

  public TimezoneObjectDataList getOutput() {
    return TimezoneObjectHelper.fromMapList(outputMap, "TimezoneList");
  }
}
