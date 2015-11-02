/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupUsageRedirectGroupDeleteRequest.java
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
 * Class used to create a HqGroupUsageRedirectGroupDeleteRequest Udt Request
 *
 */

public class HqGroupUsageRedirectGroupDeleteRequest extends HqGroupUsageRedirectGroupSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupUsageRedirectGroupDeleteRequest
 * @param id Unique request name
 * @param HqGroupUsageRedirectGroupDeleteIn HqGroupUsageRedirectGroupObjectData for HqGroupUsageRedirectGroupDeleteRequest
 *
 */
@JsonCreator
  public HqGroupUsageRedirectGroupDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupUsageRedirectGroup")HqGroupUsageRedirectGroupObjectData HqGroupUsageRedirectGroupDeleteIn) {
    super(id, "HqGroupUsageRedirectGroupDelete");
    if (HqGroupUsageRedirectGroupDeleteIn != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectHelper.toMap(HqGroupUsageRedirectGroupDeleteIn, new HashMap(), "HqGroupUsageRedirectGroup").get("HqGroupUsageRedirectGroup"));
    }
  }

/**
 *
 * Retrieves the HqGroupUsageRedirectGroupObjectData that results from the HqGroupUsageRedirectGroupDeleteRequest call
 * @return HqGroupUsageRedirectGroupObjectData resulting from udt call
 *
 */

  public HqGroupUsageRedirectGroupObjectData getOutput() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMap(outputMap, "HqGroupUsageRedirectGroup");
  }
}
