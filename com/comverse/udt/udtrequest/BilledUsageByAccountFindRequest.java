/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageByAccountFindRequest.java
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
 * Class used to create a BilledUsageByAccountFindRequest Udt Request
 *
 */

public class BilledUsageByAccountFindRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a  BilledUsageByAccountFindRequest
 * @param id Unique request name
 * @param BilledUsageAccountfindIn BilledUsageAccountObjectFilter for BilledUsageByAccountFindRequest
 * @param LatestInvoice Boolean for BilledUsageByAccountFindRequest
 *
 */
@JsonCreator
  public BilledUsageByAccountFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageAccountObjectFilter BilledUsageAccountfindIn, @JsonProperty("LatestInvoice")Boolean LatestInvoice) {
    super(id, "BilledUsageByAccountFind");
    if (BilledUsageAccountfindIn != null) {
      Integer index =  BilledUsageAccountfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageAccountObjectHelper.toMap(BilledUsageAccountfindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
    if (LatestInvoice != null) {
      addInput("LatestInvoice", LatestInvoice);
    }
  }

/**
 *
 * Retrieves the BilledUsageObjectDataList that results from the BilledUsageByAccountFindRequest call
 * @return BilledUsageObjectDataList resulting from udt call
 *
 */

  public BilledUsageObjectDataList getOutput() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
}
