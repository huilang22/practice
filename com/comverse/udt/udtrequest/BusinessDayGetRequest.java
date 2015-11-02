/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayGetRequest.java
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
 * Class used to create a BusinessDayGetRequest Udt Request
 *
 */

public class BusinessDayGetRequest extends BusinessDaySubRequestParent {
/**
 *
 * Constructor to create a  BusinessDayGetRequest
 * @param id Unique request name
 * @param BDget_In BusinessDayObjectKeyData for BusinessDayGetRequest
 *
 */
@JsonCreator
  public BusinessDayGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessDay")BusinessDayObjectKeyData BDget_In) {
    super(id, "BusinessDayGet");
    if (BDget_In != null) {
      addInput("BusinessDay", BusinessDayObjectKeyHelper.toMap(BDget_In, new HashMap(), "BusinessDayObjectKeyData").get("BusinessDayObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BusinessDayObjectData that results from the BusinessDayGetRequest call
 * @return BusinessDayObjectData resulting from udt call
 *
 */

  public BusinessDayObjectData getOutput() {
    return BusinessDayObjectHelper.fromMap(outputMap, "BusinessDay");
  }
}
