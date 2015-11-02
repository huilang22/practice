/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapDeleteRequest.java
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
 * Class used to create a HqgroupUsageRedirectMapDeleteRequest Udt Request
 *
 */

public class HqgroupUsageRedirectMapDeleteRequest extends HqgroupUsageRedirectMapSubRequestParent {
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapDeleteRequest
 * @param id Unique request name
 * @param HGURMDeleteIn HqGroupUsageRedirectMapObjectKeyData for HqgroupUsageRedirectMapDeleteRequest
 * @param HGURMDCeaseDate Date for HqgroupUsageRedirectMapDeleteRequest
 *
 */
@JsonCreator
  public HqgroupUsageRedirectMapDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqgroupUsageRedirectMap")HqGroupUsageRedirectMapObjectKeyData HGURMDeleteIn, @JsonProperty("HGURMDCeaseDate")Date HGURMDCeaseDate) {
    super(id, "HqgroupUsageRedirectMapDelete");
    if (HGURMDeleteIn != null) {
      addInput("HqgroupUsageRedirectMap", HqGroupUsageRedirectMapObjectKeyHelper.toMap(HGURMDeleteIn, new HashMap(), "HqGroupUsageRedirectMapObjectKeyData").get("HqGroupUsageRedirectMapObjectKeyData"));
    }
    if (HGURMDCeaseDate != null) {
      addInput("HGURMDCeaseDate", HGURMDCeaseDate);
    }
  }

/**
 *
 * Retrieves the HqGroupUsageRedirectMapObjectData that results from the HqgroupUsageRedirectMapDeleteRequest call
 * @return HqGroupUsageRedirectMapObjectData resulting from udt call
 *
 */

  public HqGroupUsageRedirectMapObjectData getOutput() {
    return HqGroupUsageRedirectMapObjectHelper.fromMap(outputMap, "HqgroupUsageRedirectMap");
  }
}
