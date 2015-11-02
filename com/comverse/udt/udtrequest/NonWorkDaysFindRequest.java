/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NonWorkDaysFindRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NonWorkDaysFindRequest Udt Request
 *
 */

public class NonWorkDaysFindRequest extends NonWorkDaysRequest {
/**
 *
 * Constructor to create a  NonWorkDaysFindRequest
 * @param id Unique request name
 * @param NonWorkDaysFindIn NonWorkDaysObjectFilter for NonWorkDaysFindRequest
 *
 */
@JsonCreator
  public NonWorkDaysFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("NonWorkDays")NonWorkDaysObjectFilter NonWorkDaysFindIn) {
    super(id, "NonWorkDaysFind");
    if (NonWorkDaysFindIn != null) {
      Integer index =  NonWorkDaysFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NonWorkDays", NonWorkDaysObjectHelper.toMap(NonWorkDaysFindIn, new HashMap(), "NonWorkDays").get("NonWorkDays"));
    }
  }

/**
 *
 * Retrieves the NonWorkDaysObjectDataList that results from the NonWorkDaysFindRequest call
 * @return NonWorkDaysObjectDataList resulting from udt call
 *
 */

  public NonWorkDaysObjectDataList getOutput() {
    return NonWorkDaysObjectHelper.fromMapList(outputMap, "NonWorkDaysList");
  }
}
