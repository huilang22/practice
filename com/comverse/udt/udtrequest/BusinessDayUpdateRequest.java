/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayUpdateRequest.java
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
 * Class used to create a BusinessDayUpdateRequest Udt Request
 *
 */

public class BusinessDayUpdateRequest extends BusinessDaySubRequestParent {
/**
 *
 * Constructor to create a  BusinessDayUpdateRequest
 * @param id Unique request name
 * @param BDupdate_In BusinessDayObjectData for BusinessDayUpdateRequest
 *
 */
@JsonCreator
  public BusinessDayUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessDay")BusinessDayObjectData BDupdate_In) {
    super(id, "BusinessDayUpdate");
    if (BDupdate_In != null) {
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(BDupdate_In, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }

/**
 *
 * Retrieves the BusinessDayObjectData that results from the BusinessDayUpdateRequest call
 * @return BusinessDayObjectData resulting from udt call
 *
 */

  public BusinessDayObjectData getOutput() {
    return BusinessDayObjectHelper.fromMap(outputMap, "BusinessDay");
  }
}
