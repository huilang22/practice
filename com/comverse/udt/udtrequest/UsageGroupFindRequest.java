/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageGroupFindRequest.java
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
 * Class used to create a UsageGroupFindRequest Udt Request
 *
 */

public class UsageGroupFindRequest extends UsageGroupRequest {
/**
 *
 * Constructor to create a  UsageGroupFindRequest
 * @param id Unique request name
 * @param ugFndIn UsageGroupObjectFilter for UsageGroupFindRequest
 *
 */
@JsonCreator
  public UsageGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageGroup")UsageGroupObjectFilter ugFndIn) {
    super(id, "UsageGroupFind");
    if (ugFndIn != null) {
      Integer index =  ugFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageGroup", UsageGroupObjectHelper.toMap(ugFndIn, new HashMap(), "UsageGroup").get("UsageGroup"));
    }
  }

/**
 *
 * Retrieves the UsageGroupObjectDataList that results from the UsageGroupFindRequest call
 * @return UsageGroupObjectDataList resulting from udt call
 *
 */

  public UsageGroupObjectDataList getOutput() {
    return UsageGroupObjectHelper.fromMapList(outputMap, "UsageGroupList");
  }
}
