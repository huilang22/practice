/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDeleteRequest.java
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
 * Class used to create a BusinessDayDeleteRequest Udt Request
 *
 */

public class BusinessDayDeleteRequest extends BusinessDaySubRequestParent {
/**
 *
 * Constructor to create a  BusinessDayDeleteRequest
 * @param id Unique request name
 * @param BDdelete_In BusinessDayObjectKeyData for BusinessDayDeleteRequest
 *
 */
@JsonCreator
  public BusinessDayDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessDay")BusinessDayObjectKeyData BDdelete_In) {
    super(id, "BusinessDayDelete");
    if (BDdelete_In != null) {
      addInput("BusinessDay", BusinessDayObjectKeyHelper.toMap(BDdelete_In, new HashMap(), "BusinessDayObjectKeyData").get("BusinessDayObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BusinessDayObjectData that results from the BusinessDayDeleteRequest call
 * @return BusinessDayObjectData resulting from udt call
 *
 */

  public BusinessDayObjectData getOutput() {
    return BusinessDayObjectHelper.fromMap(outputMap, "BusinessDay");
  }
}
