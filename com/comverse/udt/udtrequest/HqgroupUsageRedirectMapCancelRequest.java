/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapCancelRequest.java
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
 * Class used to create a HqgroupUsageRedirectMapCancelRequest Udt Request
 *
 */

public class HqgroupUsageRedirectMapCancelRequest extends HqgroupUsageRedirectMapRequest {
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapCancelRequest
 * @param id Unique request name
 * @param HGURMCancelIn HqGroupUsageRedirectMapObjectData for HqgroupUsageRedirectMapCancelRequest
 *
 */
@JsonCreator
  public HqgroupUsageRedirectMapCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqgroupUsageRedirectMap")HqGroupUsageRedirectMapObjectData HGURMCancelIn) {
    super(id, "HqgroupUsageRedirectMapCancel");
    if (HGURMCancelIn != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(HGURMCancelIn, new HashMap(), "Void").get("Void"));
    }
  }

}
