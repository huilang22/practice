/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageByServiceFindCountRequest.java
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
 * Class used to create a UnbilledUsageByServiceFindCountRequest Udt Request
 *
 */

public class UnbilledUsageByServiceFindCountRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageByServiceFindCountRequest
 * @param id Unique request name
 * @param UnbilledUsageServicefindCountIn UnbilledUsageServiceObjectFilter for UnbilledUsageByServiceFindCountRequest
 *
 */
@JsonCreator
  public UnbilledUsageByServiceFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageServiceObjectFilter UnbilledUsageServicefindCountIn) {
    super(id, "UnbilledUsageByServiceFindCount");
    if (UnbilledUsageServicefindCountIn != null) {
      Integer index =  UnbilledUsageServicefindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageServiceObjectHelper.toMap(UnbilledUsageServicefindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the UnbilledUsageByServiceFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
