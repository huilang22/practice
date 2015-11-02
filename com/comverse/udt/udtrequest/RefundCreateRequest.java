/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundCreateRequest.java
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
 * Class used to create a RefundCreateRequest Udt Request
 *
 */

public class RefundCreateRequest extends RefundSubRequestParent {
/**
 *
 * Constructor to create a  RefundCreateRequest
 * @param id Unique request name
 * @param refundCreateIn RefundObjectData for RefundCreateRequest
 *
 */
@JsonCreator
  public RefundCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Refund")RefundObjectData refundCreateIn) {
    super(id, "RefundCreate");
    if (refundCreateIn != null) {
      addInput("Refund", RefundObjectHelper.toMap(refundCreateIn, new HashMap(), "Refund").get("Refund"));
    }
  }

/**
 *
 * Retrieves the RefundObjectData that results from the RefundCreateRequest call
 * @return RefundObjectData resulting from udt call
 *
 */

  public RefundObjectData getOutput() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
}
