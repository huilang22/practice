/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageFindFastCountRequest.java
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
 * Class used to create a UnbilledUsageFindFastCountRequest Udt Request
 *
 */

public class UnbilledUsageFindFastCountRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageFindFastCountRequest
 * @param id Unique request name
 * @param UnbilledUsageffindCountIn UnbilledUsageObjectFilter for UnbilledUsageFindFastCountRequest
 *
 */
@JsonCreator
  public UnbilledUsageFindFastCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageObjectFilter UnbilledUsageffindCountIn) {
    super(id, "UnbilledUsageFindFastCount");
    if (UnbilledUsageffindCountIn != null) {
      Integer index =  UnbilledUsageffindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsageffindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the UnbilledUsageFindFastCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
