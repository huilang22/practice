/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillPeriodGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BillPeriodGetRequest Udt Request
 *
 */

public class BillPeriodGetRequest extends BillPeriodSubRequestParent {
/**
 *
 * Constructor to create a  BillPeriodGetRequest
 * @param id Unique request name
 * @param BPGetIn BPObjectKeyData for BillPeriodGetRequest
 *
 */
@JsonCreator
  public BillPeriodGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillPeriod")BPObjectKeyData BPGetIn) {
    super(id, "BillPeriodGet");
    if (BPGetIn != null) {
      addInput("BillPeriod", BPObjectKeyHelper.toMap(BPGetIn, new HashMap(), "BPObjectKeyData").get("BPObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BPObjectData that results from the BillPeriodGetRequest call
 * @return BPObjectData resulting from udt call
 *
 */

  public BPObjectData getOutput() {
    return BPObjectHelper.fromMap(outputMap, "BillPeriod");
  }
}
