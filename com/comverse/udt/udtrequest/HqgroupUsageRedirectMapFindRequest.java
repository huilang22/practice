/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapFindRequest.java
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
 * Class used to create a HqgroupUsageRedirectMapFindRequest Udt Request
 *
 */

public class HqgroupUsageRedirectMapFindRequest extends HqgroupUsageRedirectMapRequest {
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapFindRequest
 * @param id Unique request name
 * @param HGURMFindIn HqGroupUsageRedirectMapObjectFilter for HqgroupUsageRedirectMapFindRequest
 *
 */
@JsonCreator
  public HqgroupUsageRedirectMapFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqgroupUsageRedirectMap")HqGroupUsageRedirectMapObjectFilter HGURMFindIn) {
    super(id, "HqgroupUsageRedirectMapFind");
    if (HGURMFindIn != null) {
      Integer index =  HGURMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectHelper.toMap(HGURMFindIn, new HashMap(), "HqgroupUsageRedirectMap").get("HqgroupUsageRedirectMap"));
    }
  }

/**
 *
 * Retrieves the HqGroupUsageRedirectMapObjectDataList that results from the HqgroupUsageRedirectMapFindRequest call
 * @return HqGroupUsageRedirectMapObjectDataList resulting from udt call
 *
 */

  public HqGroupUsageRedirectMapObjectDataList getOutput() {
    return HqGroupUsageRedirectMapObjectHelper.fromMapList(outputMap, "HqgroupUsageRedirectMapList");
  }
}
