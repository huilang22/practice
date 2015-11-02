/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageByAccountFindCountRequest.java
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
 * Class used to create a BilledUsageByAccountFindCountRequest Udt Request
 *
 */

public class BilledUsageByAccountFindCountRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a  BilledUsageByAccountFindCountRequest
 * @param id Unique request name
 * @param BilledUsagefindAccountCountIn BilledUsageAccountObjectFilter for BilledUsageByAccountFindCountRequest
 * @param LatestInvoice1 Boolean for BilledUsageByAccountFindCountRequest
 *
 */
@JsonCreator
  public BilledUsageByAccountFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageAccountObjectFilter BilledUsagefindAccountCountIn, @JsonProperty("LatestInvoice")Boolean LatestInvoice1) {
    super(id, "BilledUsageByAccountFindCount");
    if (BilledUsagefindAccountCountIn != null) {
      Integer index =  BilledUsagefindAccountCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageAccountObjectHelper.toMap(BilledUsagefindAccountCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
    if (LatestInvoice1 != null) {
      addInput("LatestInvoice", LatestInvoice1);
    }
  }

/**
 *
 * Retrieves the Integer that results from the BilledUsageByAccountFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
