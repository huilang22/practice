/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a HqgroupUsageRedirectMapGetRequest Udt Request
 *
 */

public class HqgroupUsageRedirectMapGetRequest extends HqgroupUsageRedirectMapSubRequestParent {
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapGetRequest
 * @param id Unique request name
 * @param HGURMGetIn HqGroupUsageRedirectMapObjectKeyData for HqgroupUsageRedirectMapGetRequest
 *
 */
@JsonCreator
  public HqgroupUsageRedirectMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqgroupUsageRedirectMap")HqGroupUsageRedirectMapObjectKeyData HGURMGetIn) {
    super(id, "HqgroupUsageRedirectMapGet");
    if (HGURMGetIn != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectKeyHelper.toMap(HGURMGetIn, new HashMap(), "HqGroupUsageRedirectMapObjectKeyData").get("HqGroupUsageRedirectMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the HqGroupUsageRedirectMapObjectData that results from the HqgroupUsageRedirectMapGetRequest call
 * @return HqGroupUsageRedirectMapObjectData resulting from udt call
 *
 */

  public HqGroupUsageRedirectMapObjectData getOutput() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
}
