/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupUsageRedirectGroupCreateRequest.java
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
 * Class used to create a HqGroupUsageRedirectGroupCreateRequest Udt Request
 *
 */

public class HqGroupUsageRedirectGroupCreateRequest extends HqGroupUsageRedirectGroupSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupUsageRedirectGroupCreateRequest
 * @param id Unique request name
 * @param HqGroupUsageRedirectGroupCreateIn HqGroupUsageRedirectGroupObjectData for HqGroupUsageRedirectGroupCreateRequest
 *
 */
@JsonCreator
  public HqGroupUsageRedirectGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupUsageRedirectGroup")HqGroupUsageRedirectGroupObjectData HqGroupUsageRedirectGroupCreateIn) {
    super(id, "HqGroupUsageRedirectGroupCreate");
    if (HqGroupUsageRedirectGroupCreateIn != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(HqGroupUsageRedirectGroupCreateIn, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }

/**
 *
 * Retrieves the HqGroupUsageRedirectGroupObjectData that results from the HqGroupUsageRedirectGroupCreateRequest call
 * @return HqGroupUsageRedirectGroupObjectData resulting from udt call
 *
 */

  public HqGroupUsageRedirectGroupObjectData getOutput() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMap(outputMap, "HqGroupUsageRedirectGroup");
  }
}
