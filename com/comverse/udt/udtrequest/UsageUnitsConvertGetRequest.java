/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageUnitsConvertGetRequest.java
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
 * Class used to create a UsageUnitsConvertGetRequest Udt Request
 *
 */

public class UsageUnitsConvertGetRequest extends UsageUnitsConvertSubRequestParent {
/**
 *
 * Constructor to create a  UsageUnitsConvertGetRequest
 * @param id Unique request name
 * @param UsageUnitsConvertGetIn UsageUnitsConvertObjectKeyData for UsageUnitsConvertGetRequest
 *
 */
@JsonCreator
  public UsageUnitsConvertGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageUnitsConvert")UsageUnitsConvertObjectKeyData UsageUnitsConvertGetIn) {
    super(id, "UsageUnitsConvertGet");
    if (UsageUnitsConvertGetIn != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectKeyHelper.toMap(UsageUnitsConvertGetIn, new HashMap(), "UsageUnitsConvertObjectKeyData").get("UsageUnitsConvertObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsageUnitsConvertObjectData that results from the UsageUnitsConvertGetRequest call
 * @return UsageUnitsConvertObjectData resulting from udt call
 *
 */

  public UsageUnitsConvertObjectData getOutput() {
    return UsageUnitsConvertObjectHelper.fromMap(outputMap, "UsageUnitsConvert");
  }
}
