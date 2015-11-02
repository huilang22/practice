/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapPriorityUpdateRequest.java
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
 * Class used to create a HqgroupUsageRedirectMapPriorityUpdateRequest Udt Request
 *
 */

public class HqgroupUsageRedirectMapPriorityUpdateRequest extends HqgroupUsageRedirectMapSubRequestParent {
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapPriorityUpdateRequest
 * @param id Unique request name
 * @param HGURMPrioUpdIn HqGroupUsageRedirectMapObjectData for HqgroupUsageRedirectMapPriorityUpdateRequest
 *
 */
@JsonCreator
  public HqgroupUsageRedirectMapPriorityUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqgroupUsageRedirectMap")HqGroupUsageRedirectMapObjectData HGURMPrioUpdIn) {
    super(id, "HqgroupUsageRedirectMapPriorityUpdate");
    if (HGURMPrioUpdIn != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(HGURMPrioUpdIn, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }

/**
 *
 * Retrieves the HqGroupUsageRedirectMapObjectData that results from the HqgroupUsageRedirectMapPriorityUpdateRequest call
 * @return HqGroupUsageRedirectMapObjectData resulting from udt call
 *
 */

  public HqGroupUsageRedirectMapObjectData getOutput() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
}
