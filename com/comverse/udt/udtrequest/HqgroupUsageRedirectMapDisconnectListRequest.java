/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapDisconnectListRequest.java
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
 * Class used to create a HqgroupUsageRedirectMapDisconnectListRequest Udt Request
 *
 */

public class HqgroupUsageRedirectMapDisconnectListRequest extends HqgroupUsageRedirectMapRequest {
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapDisconnectListRequest
 * @param id Unique request name
 * @param discIn HqGroupUsageRedirectMapObjectData for HqgroupUsageRedirectMapDisconnectListRequest
 *
 */
@JsonCreator
  public HqgroupUsageRedirectMapDisconnectListRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqgroupUsageRedirectMap")HqGroupUsageRedirectMapObjectData discIn) {
    super(id, "HqgroupUsageRedirectMapDisconnectList");
    if (discIn != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(discIn, new HashMap(), "Void").get("Void"));
    }
  }

}
