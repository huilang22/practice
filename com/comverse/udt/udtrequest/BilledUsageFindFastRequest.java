/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageFindFastRequest.java
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
 * Class used to create a BilledUsageFindFastRequest Udt Request
 *
 */

public class BilledUsageFindFastRequest extends BilledUsageRequest {
/**
 *
 * Constructor to create a  BilledUsageFindFastRequest
 * @param id Unique request name
 * @param BilledUsageffindIn BilledUsageObjectFilter for BilledUsageFindFastRequest
 *
 */
@JsonCreator
  public BilledUsageFindFastRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageObjectFilter BilledUsageffindIn) {
    super(id, "BilledUsageFindFast");
    if (BilledUsageffindIn != null) {
      Integer index =  BilledUsageffindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(BilledUsageffindIn, new HashMap(), "BilledUsage").get("BilledUsage"));
    }
  }

/**
 *
 * Retrieves the BilledUsageObjectDataList that results from the BilledUsageFindFastRequest call
 * @return BilledUsageObjectDataList resulting from udt call
 *
 */

  public BilledUsageObjectDataList getOutput() {
    return BilledUsageObjectHelper.fromMapList(outputMap, "BilledUsageList");
  }
}
