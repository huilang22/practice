/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqgroupUsageRedirectMapDeleteListRequest.java
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
 * Class used to create a HqgroupUsageRedirectMapDeleteListRequest Udt Request
 *
 */

public class HqgroupUsageRedirectMapDeleteListRequest extends HqgroupUsageRedirectMapRequest {
/**
 *
 * Constructor to create a  HqgroupUsageRedirectMapDeleteListRequest
 * @param id Unique request name
 * @param HqGroupUsageRedirectMapFilter HqGroupUsageRedirectMapObjectFilter for HqgroupUsageRedirectMapDeleteListRequest
 * @param HGURMDLCeaseDate Date for HqgroupUsageRedirectMapDeleteListRequest
 *
 */
@JsonCreator
  public HqgroupUsageRedirectMapDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupUsageRedirectMapFilter")HqGroupUsageRedirectMapObjectFilter HqGroupUsageRedirectMapFilter, @JsonProperty("HGURMDLCeaseDate")Date HGURMDLCeaseDate) {
    super(id, "HqgroupUsageRedirectMapDeleteList");
    if (HqGroupUsageRedirectMapFilter != null) {
      Integer index =  HqGroupUsageRedirectMapFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupUsageRedirectMapFilter", HqGroupUsageRedirectMapObjectHelper.toMap(HqGroupUsageRedirectMapFilter, new HashMap(), "Void").get("Void"));
    }
    if (HGURMDLCeaseDate != null) {
      addInput("HGURMDLCeaseDate", HGURMDLCeaseDate);
    }
  }

}
