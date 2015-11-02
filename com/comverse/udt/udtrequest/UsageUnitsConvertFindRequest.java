/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageUnitsConvertFindRequest.java
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
 * Class used to create a UsageUnitsConvertFindRequest Udt Request
 *
 */

public class UsageUnitsConvertFindRequest extends UsageUnitsConvertRequest {
/**
 *
 * Constructor to create a  UsageUnitsConvertFindRequest
 * @param id Unique request name
 * @param UsageUnitsConvertFindIn UsageUnitsConvertObjectFilter for UsageUnitsConvertFindRequest
 *
 */
@JsonCreator
  public UsageUnitsConvertFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageUnitsConvert")UsageUnitsConvertObjectFilter UsageUnitsConvertFindIn) {
    super(id, "UsageUnitsConvertFind");
    if (UsageUnitsConvertFindIn != null) {
      Integer index =  UsageUnitsConvertFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageUnitsConvert", UsageUnitsConvertObjectHelper.toMap(UsageUnitsConvertFindIn, new HashMap(), "UsageUnitsConvert").get("UsageUnitsConvert"));
    }
  }

/**
 *
 * Retrieves the UsageUnitsConvertObjectDataList that results from the UsageUnitsConvertFindRequest call
 * @return UsageUnitsConvertObjectDataList resulting from udt call
 *
 */

  public UsageUnitsConvertObjectDataList getOutput() {
    return UsageUnitsConvertObjectHelper.fromMapList(outputMap, "UsageUnitsConvertList");
  }
}
