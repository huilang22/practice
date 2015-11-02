/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillPeriodUpdateRequest.java
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
 * Class used to create a BillPeriodUpdateRequest Udt Request
 *
 */

public class BillPeriodUpdateRequest extends BillPeriodSubRequestParent {
/**
 *
 * Constructor to create a  BillPeriodUpdateRequest
 * @param id Unique request name
 * @param BPUpdateIn BPObjectData for BillPeriodUpdateRequest
 *
 */
@JsonCreator
  public BillPeriodUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BillPeriod")BPObjectData BPUpdateIn) {
    super(id, "BillPeriodUpdate");
    if (BPUpdateIn != null) {
      addInput("BillPeriod", BPObjectHelper.toMap(BPUpdateIn, new HashMap(), "BillPeriod").get("BillPeriod"));
    }
  }

/**
 *
 * Retrieves the BPObjectData that results from the BillPeriodUpdateRequest call
 * @return BPObjectData resulting from udt call
 *
 */

  public BPObjectData getOutput() {
    return BPObjectHelper.fromMap(outputMap, "BillPeriod");
  }
}
