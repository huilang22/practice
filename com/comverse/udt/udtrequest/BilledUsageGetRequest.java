/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BilledUsageGetRequest.java
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
 * Class used to create a BilledUsageGetRequest Udt Request
 *
 */

public class BilledUsageGetRequest extends BilledUsageSubRequestParent {
/**
 *
 * Constructor to create a  BilledUsageGetRequest
 * @param id Unique request name
 * @param BilledUsagegetIn BilledUsageObjectKeyData for BilledUsageGetRequest
 *
 */
@JsonCreator
  public BilledUsageGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BilledUsage")BilledUsageObjectKeyData BilledUsagegetIn) {
    super(id, "BilledUsageGet");
    if (BilledUsagegetIn != null) {
      addInput("BilledUsage", BilledUsageObjectKeyHelper.toMap(BilledUsagegetIn, new HashMap(), "BilledUsageObjectKeyData").get("BilledUsageObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BilledUsageObjectData that results from the BilledUsageGetRequest call
 * @return BilledUsageObjectData resulting from udt call
 *
 */

  public BilledUsageObjectData getOutput() {
    return BilledUsageObjectHelper.fromMap(outputMap, "BilledUsage");
  }
}
