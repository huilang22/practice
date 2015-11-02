/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnitUpdateRequest.java
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
 * Class used to create a UsageTypeUnitUpdateRequest Udt Request
 *
 */

public class UsageTypeUnitUpdateRequest extends UsageTypeUnitSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeUnitUpdateRequest
 * @param id Unique request name
 * @param UsageTypeUnitUpdateIn UsageTypeUnitObjectData for UsageTypeUnitUpdateRequest
 * @param UsageTypeUnitUpdateFilter UsageTypeUnitObjectFilter for UsageTypeUnitUpdateRequest
 * @param UsageTypeUnitUpdateGet UsageTypeUnitObjectData for UsageTypeUnitUpdateRequest
 *
 */
@JsonCreator
  public UsageTypeUnitUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeUnit")UsageTypeUnitObjectData UsageTypeUnitUpdateIn, @JsonProperty("UsageTypeUnitUpdateFilter")UsageTypeUnitObjectFilter UsageTypeUnitUpdateFilter, @JsonProperty("UsageTypeUnitUpdateGet")UsageTypeUnitObjectData UsageTypeUnitUpdateGet) {
    super(id, "UsageTypeUnitUpdate");
    if (UsageTypeUnitUpdateIn != null) {
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(UsageTypeUnitUpdateIn, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
    if (UsageTypeUnitUpdateFilter != null) {
      Integer index =  UsageTypeUnitUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageTypeUnitUpdateFilter", UsageTypeUnitObjectHelper.toMap(UsageTypeUnitUpdateFilter, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
    if (UsageTypeUnitUpdateGet != null) {
      addInput("UsageTypeUnitUpdateGet", UsageTypeUnitObjectHelper.toMap(UsageTypeUnitUpdateGet, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }

/**
 *
 * Retrieves the UsageTypeUnitObjectData that results from the UsageTypeUnitUpdateRequest call
 * @return UsageTypeUnitObjectData resulting from udt call
 *
 */

  public UsageTypeUnitObjectData getOutput() {
    return UsageTypeUnitObjectHelper.fromMap(outputMap, "UsageTypeUnit");
  }
}
