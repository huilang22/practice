/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayCreateRequest.java
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
 * Class used to create a BusinessDayCreateRequest Udt Request
 *
 */

public class BusinessDayCreateRequest extends BusinessDaySubRequestParent {
/**
 *
 * Constructor to create a  BusinessDayCreateRequest
 * @param id Unique request name
 * @param BDcreate_In BusinessDayObjectData for BusinessDayCreateRequest
 *
 */
@JsonCreator
  public BusinessDayCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessDay")BusinessDayObjectData BDcreate_In) {
    super(id, "BusinessDayCreate");
    if (BDcreate_In != null) {
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(BDcreate_In, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }

/**
 *
 * Retrieves the BusinessDayObjectData that results from the BusinessDayCreateRequest call
 * @return BusinessDayObjectData resulting from udt call
 *
 */

  public BusinessDayObjectData getOutput() {
    return BusinessDayObjectHelper.fromMap(outputMap, "BusinessDay");
  }
}
