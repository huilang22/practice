/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageByAccountServiceFindRequest.java
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
 * Class used to create a BilledUsageByAccountServiceFindRequest Udt Request
 *
 */

public class BilledUsageByAccountServiceFindRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a  BilledUsageByAccountServiceFindRequest
 * @param id Unique request name
 * @param BilledUsageAcctServicefindIn BilledUsageServiceObjectFilter for BilledUsageByAccountServiceFindRequest
 * @param LatestInvoice4 Boolean for BilledUsageByAccountServiceFindRequest
 *
 */
@JsonCreator
  public BilledUsageByAccountServiceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageServiceObjectFilter BilledUsageAcctServicefindIn, @JsonProperty("LatestInvoice4")Boolean LatestInvoice4) {
    super(id, "BilledUsageByAccountServiceFind");
    if (BilledUsageAcctServicefindIn != null) {
      Integer index =  BilledUsageAcctServicefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageServiceObjectHelper.toMap(BilledUsageAcctServicefindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
    if (LatestInvoice4 != null) {
      addInput("LatestInvoice4", LatestInvoice4);
    }
  }

/**
 *
 * Retrieves the BilledUsageObjectDataList that results from the BilledUsageByAccountServiceFindRequest call
 * @return BilledUsageObjectDataList resulting from udt call
 *
 */

  public BilledUsageObjectDataList getOutput() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
}
