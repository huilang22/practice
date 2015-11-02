/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageFindRequest.java
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
 * Class used to create a BilledUsageFindRequest Udt Request
 *
 */

public class BilledUsageFindRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a  BilledUsageFindRequest
 * @param id Unique request name
 * @param BilledUsagefindIn BilledUsageObjectFilter for BilledUsageFindRequest
 *
 */
@JsonCreator
  public BilledUsageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageObjectFilter BilledUsagefindIn) {
    super(id, "BilledUsageFind");
    if (BilledUsagefindIn != null) {
      Integer index =  BilledUsagefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsagefindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }

/**
 *
 * Retrieves the BilledUsageObjectDataList that results from the BilledUsageFindRequest call
 * @return BilledUsageObjectDataList resulting from udt call
 *
 */

  public BilledUsageObjectDataList getOutput() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
}
