/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageFindCountRequest.java
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
 * Class used to create a BilledUsageFindCountRequest Udt Request
 *
 */

public class BilledUsageFindCountRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a  BilledUsageFindCountRequest
 * @param id Unique request name
 * @param BilledUsagefindCountIn BilledUsageObjectFilter for BilledUsageFindCountRequest
 *
 */
@JsonCreator
  public BilledUsageFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageObjectFilter BilledUsagefindCountIn) {
    super(id, "BilledUsageFindCount");
    if (BilledUsagefindCountIn != null) {
      Integer index =  BilledUsagefindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsagefindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the BilledUsageFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
