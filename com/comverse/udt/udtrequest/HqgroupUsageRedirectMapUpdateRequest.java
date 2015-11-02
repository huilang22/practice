/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapUpdateRequest.java
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
 * Class used to create a HqgroupUsageRedirectMapUpdateRequest Udt Request
 *
 */

public class HqgroupUsageRedirectMapUpdateRequest extends HqgroupUsageRedirectMapSubRequestParent {
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapUpdateRequest
 * @param id Unique request name
 * @param HGURMUpdateIn HqGroupUsageRedirectMapObjectData for HqgroupUsageRedirectMapUpdateRequest
 *
 */
@JsonCreator
  public HqgroupUsageRedirectMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqgroupUsageRedirectMap")HqGroupUsageRedirectMapObjectData HGURMUpdateIn) {
    super(id, "HqgroupUsageRedirectMapUpdate");
    if (HGURMUpdateIn != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(HGURMUpdateIn, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }

/**
 *
 * Retrieves the HqGroupUsageRedirectMapObjectData that results from the HqgroupUsageRedirectMapUpdateRequest call
 * @return HqGroupUsageRedirectMapObjectData resulting from udt call
 *
 */

  public HqGroupUsageRedirectMapObjectData getOutput() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
}
