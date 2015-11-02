/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageByServiceFindCountRequest.java
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
 * Class used to create a BilledUsageByServiceFindCountRequest Udt Request
 *
 */

public class BilledUsageByServiceFindCountRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a  BilledUsageByServiceFindCountRequest
 * @param id Unique request name
 * @param BilledUsagefindServiceCountIn BilledUsageServiceObjectFilter for BilledUsageByServiceFindCountRequest
 * @param LatestInvoice3 Boolean for BilledUsageByServiceFindCountRequest
 *
 */
@JsonCreator
  public BilledUsageByServiceFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageServiceObjectFilter BilledUsagefindServiceCountIn, @JsonProperty("LatestInvoice")Boolean LatestInvoice3) {
    super(id, "BilledUsageByServiceFindCount");
    if (BilledUsagefindServiceCountIn != null) {
      Integer index =  BilledUsagefindServiceCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageServiceObjectHelper.toMap(BilledUsagefindServiceCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
    if (LatestInvoice3 != null) {
      addInput("LatestInvoice", LatestInvoice3);
    }
  }

/**
 *
 * Retrieves the Integer that results from the BilledUsageByServiceFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
