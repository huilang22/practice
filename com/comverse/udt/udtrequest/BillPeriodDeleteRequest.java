/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillPeriodDeleteRequest.java
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
 * Class used to create a BillPeriodDeleteRequest Udt Request
 *
 */

public class BillPeriodDeleteRequest extends BillPeriodSubRequestParent {
/**
 *
 * Constructor to create a  BillPeriodDeleteRequest
 * @param id Unique request name
 * @param BPDeleteIn BPObjectKeyData for BillPeriodDeleteRequest
 *
 */
@JsonCreator
  public BillPeriodDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillPeriod")BPObjectKeyData BPDeleteIn) {
    super(id, "BillPeriodDelete");
    if (BPDeleteIn != null) {
      addInput("BillPeriod", BPObjectKeyHelper.toMap(BPDeleteIn, new HashMap(), "BPObjectKeyData").get("BPObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BPObjectData that results from the BillPeriodDeleteRequest call
 * @return BPObjectData resulting from udt call
 *
 */

  public BPObjectData getOutput() {
    return BPObjectHelper.fromMap(outputMap, "BillPeriod");
  }
}
