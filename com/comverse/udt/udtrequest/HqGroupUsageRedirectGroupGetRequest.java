/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupUsageRedirectGroupGetRequest.java
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
 * Class used to create a HqGroupUsageRedirectGroupGetRequest Udt Request
 *
 */

public class HqGroupUsageRedirectGroupGetRequest extends HqGroupUsageRedirectGroupSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupUsageRedirectGroupGetRequest
 * @param id Unique request name
 * @param HqGroupUsageRedirectGroupGetIn HqGroupUsageRedirectGroupObjectKeyData for HqGroupUsageRedirectGroupGetRequest
 *
 */
@JsonCreator
  public HqGroupUsageRedirectGroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupUsageRedirectGroup")HqGroupUsageRedirectGroupObjectKeyData HqGroupUsageRedirectGroupGetIn) {
    super(id, "HqGroupUsageRedirectGroupGet");
    if (HqGroupUsageRedirectGroupGetIn != null) {
      addInput("HqGroupUsageRedirectGroup", HqGroupUsageRedirectGroupObjectKeyHelper.toMap(HqGroupUsageRedirectGroupGetIn, new HashMap(), "HqGroupUsageRedirectGroupObjectKeyData").get("HqGroupUsageRedirectGroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the HqGroupUsageRedirectGroupObjectData that results from the HqGroupUsageRedirectGroupGetRequest call
 * @return HqGroupUsageRedirectGroupObjectData resulting from udt call
 *
 */

  public HqGroupUsageRedirectGroupObjectData getOutput() {
    return HqGroupUsageRedirectGroupObjectHelper.fromMap(outputMap, "HqGroupUsageRedirectGroup");
  }
}
