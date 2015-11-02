/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeSplitFindRequest.java
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
 * Class used to create a UsageTypeSplitFindRequest Udt Request
 *
 */

public class UsageTypeSplitFindRequest extends UsageTypeSplitRequest {
/**
 *
 * Constructor to create a  UsageTypeSplitFindRequest
 * @param id Unique request name
 * @param UsageTypeSplitFindIn UsageTypeSplitObjectFilter for UsageTypeSplitFindRequest
 *
 */
@JsonCreator
  public UsageTypeSplitFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeSplit")UsageTypeSplitObjectFilter UsageTypeSplitFindIn) {
    super(id, "UsageTypeSplitFind");
    if (UsageTypeSplitFindIn != null) {
      Integer index =  UsageTypeSplitFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageTypeSplit", UsageTypeSplitObjectHelper.toMap(UsageTypeSplitFindIn, new HashMap(), "UsageTypeSplit").get("UsageTypeSplit"));
    }
  }

/**
 *
 * Retrieves the UsageTypeSplitObjectDataList that results from the UsageTypeSplitFindRequest call
 * @return UsageTypeSplitObjectDataList resulting from udt call
 *
 */

  public UsageTypeSplitObjectDataList getOutput() {
    return UsageTypeSplitObjectHelper.fromMapList(outputMap, "UsageTypeSplitList");
  }
}
