/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundUpdateRequest.java
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
 * Class used to create a RefundUpdateRequest Udt Request
 *
 */

public class RefundUpdateRequest extends RefundSubRequestParent {
/**
 *
 * Constructor to create a  RefundUpdateRequest
 * @param id Unique request name
 * @param refundUpdateIn RefundObjectData for RefundUpdateRequest
 *
 */
@JsonCreator
  public RefundUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Refund")RefundObjectData refundUpdateIn) {
    super(id, "RefundUpdate");
    if (refundUpdateIn != null) {
      addInput("Refund", RefundObjectHelper.toMap(refundUpdateIn, new HashMap(), "Refund").get("Refund"));
    }
  }

/**
 *
 * Retrieves the RefundObjectData that results from the RefundUpdateRequest call
 * @return RefundObjectData resulting from udt call
 *
 */

  public RefundObjectData getOutput() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
}
