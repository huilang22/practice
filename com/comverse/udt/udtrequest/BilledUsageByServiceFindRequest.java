/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageByServiceFindRequest.java
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
 * Class used to create a BilledUsageByServiceFindRequest Udt Request
 *
 */

public class BilledUsageByServiceFindRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a  BilledUsageByServiceFindRequest
 * @param id Unique request name
 * @param BilledUsageServicefindIn BilledUsageServiceObjectFilter for BilledUsageByServiceFindRequest
 * @param LatestInvoice2 Boolean for BilledUsageByServiceFindRequest
 *
 */
@JsonCreator
  public BilledUsageByServiceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageServiceObjectFilter BilledUsageServicefindIn, @JsonProperty("LatestInvoice")Boolean LatestInvoice2) {
    super(id, "BilledUsageByServiceFind");
    if (BilledUsageServicefindIn != null) {
      Integer index =  BilledUsageServicefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageServiceObjectHelper.toMap(BilledUsageServicefindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
    if (LatestInvoice2 != null) {
      addInput("LatestInvoice", LatestInvoice2);
    }
  }

/**
 *
 * Retrieves the BilledUsageObjectDataList that results from the BilledUsageByServiceFindRequest call
 * @return BilledUsageObjectDataList resulting from udt call
 *
 */

  public BilledUsageObjectDataList getOutput() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
}
