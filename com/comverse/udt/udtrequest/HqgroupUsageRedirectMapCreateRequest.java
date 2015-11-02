/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapCreateRequest.java
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
 * Class used to create a HqgroupUsageRedirectMapCreateRequest Udt Request
 *
 */

public class HqgroupUsageRedirectMapCreateRequest extends HqgroupUsageRedirectMapSubRequestParent {
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapCreateRequest
 * @param id Unique request name
 * @param HGURMInsertIn HqGroupUsageRedirectMapObjectData for HqgroupUsageRedirectMapCreateRequest
 *
 */
@JsonCreator
  public HqgroupUsageRedirectMapCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqgroupUsageRedirectMap")HqGroupUsageRedirectMapObjectData HGURMInsertIn) {
    super(id, "HqgroupUsageRedirectMapCreate");
    if (HGURMInsertIn != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(HGURMInsertIn, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }

/**
 *
 * Retrieves the HqGroupUsageRedirectMapObjectData that results from the HqgroupUsageRedirectMapCreateRequest call
 * @return HqGroupUsageRedirectMapObjectData resulting from udt call
 *
 */

  public HqGroupUsageRedirectMapObjectData getOutput() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
}
