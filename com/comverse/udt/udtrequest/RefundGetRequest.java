/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundGetRequest.java
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
 * Class used to create a RefundGetRequest Udt Request
 *
 */

public class RefundGetRequest extends RefundSubRequestParent {
/**
 *
 * Constructor to create a  RefundGetRequest
 * @param id Unique request name
 * @param refundGetIn RefundObjectKeyData for RefundGetRequest
 *
 */
@JsonCreator
  public RefundGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Refund")RefundObjectKeyData refundGetIn) {
    super(id, "RefundGet");
    if (refundGetIn != null) {
      addInput("Refund", RefundObjectKeyHelper.toMap(refundGetIn, new HashMap(), "RefundObjectKeyData").get("RefundObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RefundObjectData that results from the RefundGetRequest call
 * @return RefundObjectData resulting from udt call
 *
 */

  public RefundObjectData getOutput() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
}
