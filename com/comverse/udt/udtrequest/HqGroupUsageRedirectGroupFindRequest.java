/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupUsageRedirectGroupFindRequest.java
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
 * Class used to create a HqGroupUsageRedirectGroupFindRequest Udt Request
 *
 */

public class HqGroupUsageRedirectGroupFindRequest extends HqGroupUsageRedirectGroupRequest {
/**
 *
 * Constructor to create a  HqGroupUsageRedirectGroupFindRequest
 * @param id Unique request name
 * @param HqGroupUsageRedirectGroupFindIn HqGroupUsageRedirectGroupObjectFilter for HqGroupUsageRedirectGroupFindRequest
 *
 */
@JsonCreator
  public HqGroupUsageRedirectGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupUsageRedirectGroup")HqGroupUsageRedirectGroupObjectFilter HqGroupUsageRedirectGroupFindIn) {
    super(id, "HqGroupUsageRedirectGroupFind");
    if (HqGroupUsageRedirectGroupFindIn != null) {
      Integer index =  HqGroupUsageRedirectGroupFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(HqGroupUsageRedirectGroupFindIn, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }

/**
 *
 * Retrieves the HqGroupUsageRedirectGroupObjectDataList that results from the HqGroupUsageRedirectGroupFindRequest call
 * @return HqGroupUsageRedirectGroupObjectDataList resulting from udt call
 *
 */

  public HqGroupUsageRedirectGroupObjectDataList getOutput() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMapList(outputMap, "HqGroupUsageRedirectGroupList");
  }
}
