/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageByAccountFindCountRequest.java
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
 * Class used to create a UnbilledUsageByAccountFindCountRequest Udt Request
 *
 */

public class UnbilledUsageByAccountFindCountRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageByAccountFindCountRequest
 * @param id Unique request name
 * @param UnbilledUsageAccountfindCountIn UnbilledUsageAccountObjectFilter for UnbilledUsageByAccountFindCountRequest
 *
 */
@JsonCreator
  public UnbilledUsageByAccountFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageAccountObjectFilter UnbilledUsageAccountfindCountIn) {
    super(id, "UnbilledUsageByAccountFindCount");
    if (UnbilledUsageAccountfindCountIn != null) {
      Integer index =  UnbilledUsageAccountfindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageAccountObjectHelper.toMap(UnbilledUsageAccountfindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the UnbilledUsageByAccountFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
