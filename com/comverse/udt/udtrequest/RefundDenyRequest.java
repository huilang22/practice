/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundDenyRequest.java
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
 * Class used to create a RefundDenyRequest Udt Request
 *
 */

public class RefundDenyRequest extends RefundSubRequestParent {
/**
 *
 * Constructor to create a  RefundDenyRequest
 * @param id Unique request name
 * @param refundDenyIn RefundObjectKeyData for RefundDenyRequest
 * @param TreasuryFlag Integer for RefundDenyRequest
 *
 */
@JsonCreator
  public RefundDenyRequest(@JsonProperty("RequestId") String id, @JsonProperty("Refund")RefundObjectKeyData refundDenyIn, @JsonProperty("TreasuryFlag")Integer TreasuryFlag) {
    super(id, "RefundDeny");
    if (refundDenyIn != null) {
      addInput("Refund", RefundObjectKeyHelper.toMap(refundDenyIn, new HashMap(), "RefundObjectKeyData").get("RefundObjectKeyData"));
    }
    if (TreasuryFlag != null) {
      addInput("TreasuryFlag", TreasuryFlag);
    }
  }

/**
 *
 * Retrieves the RefundObjectData that results from the RefundDenyRequest call
 * @return RefundObjectData resulting from udt call
 *
 */

  public RefundObjectData getOutput() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
}
