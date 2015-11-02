/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageFindCountRequest.java
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
 * Class used to create a UnbilledUsageFindCountRequest Udt Request
 *
 */

public class UnbilledUsageFindCountRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageFindCountRequest
 * @param id Unique request name
 * @param UnbilledUsagefindCountIn UnbilledUsageObjectFilter for UnbilledUsageFindCountRequest
 *
 */
@JsonCreator
  public UnbilledUsageFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageObjectFilter UnbilledUsagefindCountIn) {
    super(id, "UnbilledUsageFindCount");
    if (UnbilledUsagefindCountIn != null) {
      Integer index =  UnbilledUsagefindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsagefindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the UnbilledUsageFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
