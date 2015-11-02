/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageUnitsConvertUpdateRequest.java
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
 * Class used to create a UsageUnitsConvertUpdateRequest Udt Request
 *
 */

public class UsageUnitsConvertUpdateRequest extends UsageUnitsConvertSubRequestParent {
/**
 *
 * Constructor to create a  UsageUnitsConvertUpdateRequest
 * @param id Unique request name
 * @param UsageUnitsConvertUpdateIn UsageUnitsConvertObjectData for UsageUnitsConvertUpdateRequest
 * @param UsageUnitsConvertUpdateFilter UsageUnitsConvertObjectFilter for UsageUnitsConvertUpdateRequest
 * @param UsageUnitsConvertUpdateGet UsageUnitsConvertObjectData for UsageUnitsConvertUpdateRequest
 *
 */
@JsonCreator
  public UsageUnitsConvertUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageUnitsConvert")UsageUnitsConvertObjectData UsageUnitsConvertUpdateIn, @JsonProperty("UsageUnitsConvertUpdateFilter")UsageUnitsConvertObjectFilter UsageUnitsConvertUpdateFilter, @JsonProperty("UsageUnitsConvertUpdateGet")UsageUnitsConvertObjectData UsageUnitsConvertUpdateGet) {
    super(id, "UsageUnitsConvertUpdate");
    if (UsageUnitsConvertUpdateIn != null) {
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(UsageUnitsConvertUpdateIn, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
    if (UsageUnitsConvertUpdateFilter != null) {
      Integer index =  UsageUnitsConvertUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageUnitsConvertUpdateFilter", UsageUnitsConvertObjectHelper.toMap(UsageUnitsConvertUpdateFilter, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
    if (UsageUnitsConvertUpdateGet != null) {
      addInput("UsageUnitsConvertUpdateGet", UsageUnitsConvertObjectHelper.toMap(UsageUnitsConvertUpdateGet, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }

/**
 *
 * Retrieves the UsageUnitsConvertObjectData that results from the UsageUnitsConvertUpdateRequest call
 * @return UsageUnitsConvertObjectData resulting from udt call
 *
 */

  public UsageUnitsConvertObjectData getOutput() {
    return UsageUnitsConvertObjectHelper.fromMap(outputMap, "UsageUnitsConvert");
  }
}
