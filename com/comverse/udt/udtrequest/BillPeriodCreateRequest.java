/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillPeriodCreateRequest.java
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
 * Class used to create a BillPeriodCreateRequest Udt Request
 *
 */

public class BillPeriodCreateRequest extends BillPeriodSubRequestParent {
/**
 *
 * Constructor to create a  BillPeriodCreateRequest
 * @param id Unique request name
 * @param BPCreateIn BPObjectData for BillPeriodCreateRequest
 *
 */
@JsonCreator
  public BillPeriodCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillPeriod")BPObjectData BPCreateIn) {
    super(id, "BillPeriodCreate");
    if (BPCreateIn != null) {
      addInput("BillPeriod", BPObjectHelper.toMap(BPCreateIn, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }

/**
 *
 * Retrieves the BPObjectData that results from the BillPeriodCreateRequest call
 * @return BPObjectData resulting from udt call
 *
 */

  public BPObjectData getOutput() {
    return BPObjectHelper.fromMap(outputMap, "BillPeriod");
  }
}
