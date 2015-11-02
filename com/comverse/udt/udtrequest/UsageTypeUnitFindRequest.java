/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeUnitFindRequest.java
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
 * Class used to create a UsageTypeUnitFindRequest Udt Request
 *
 */

public class UsageTypeUnitFindRequest extends UsageTypeUnitRequest {
/**
 *
 * Constructor to create a  UsageTypeUnitFindRequest
 * @param id Unique request name
 * @param UsageTypeUnitFindIn UsageTypeUnitObjectFilter for UsageTypeUnitFindRequest
 *
 */
@JsonCreator
  public UsageTypeUnitFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeUnit")UsageTypeUnitObjectFilter UsageTypeUnitFindIn) {
    super(id, "UsageTypeUnitFind");
    if (UsageTypeUnitFindIn != null) {
      Integer index =  UsageTypeUnitFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageTypeUnit", UsageTypeUnitObjectHelper.toMap(UsageTypeUnitFindIn, new HashMap(), "UsageTypeUnit").get("UsageTypeUnit"));
    }
  }

/**
 *
 * Retrieves the UsageTypeUnitObjectDataList that results from the UsageTypeUnitFindRequest call
 * @return UsageTypeUnitObjectDataList resulting from udt call
 *
 */

  public UsageTypeUnitObjectDataList getOutput() {
    return UsageTypeUnitObjectHelper.fromMapList(outputMap, "UsageTypeUnitList");
  }
}
