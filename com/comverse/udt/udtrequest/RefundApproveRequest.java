/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundApproveRequest.java
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
 * Class used to create a RefundApproveRequest Udt Request
 *
 */

public class RefundApproveRequest extends RefundSubRequestParent {
/**
 *
 * Constructor to create a  RefundApproveRequest
 * @param id Unique request name
 * @param refundApproveIn RefundObjectKeyData for RefundApproveRequest
 * @param AccountInternalId Integer for RefundApproveRequest
 * @param User String for RefundApproveRequest
 * @param Supervisor String for RefundApproveRequest
 * @param Amount BigInteger for RefundApproveRequest
 *
 */
@JsonCreator
  public RefundApproveRequest(@JsonProperty("RequestId") String id, @JsonProperty("Refund")RefundObjectKeyData refundApproveIn, @JsonProperty("AccountInternalId")Integer AccountInternalId, @JsonProperty("User")String User, @JsonProperty("Supervisor")String Supervisor, @JsonProperty("Amount")BigInteger Amount) {
    super(id, "RefundApprove");
    if (refundApproveIn != null) {
      addInput("Refund", RefundObjectKeyHelper.toMap(refundApproveIn, new HashMap(), "RefundObjectKeyData").get("RefundObjectKeyData"));
    }
    if (AccountInternalId != null) {
      addInput("AccountInternalId", AccountInternalId);
    }
    if (User != null) {
      addInput("User", User);
    }
    if (Supervisor != null) {
      addInput("Supervisor", Supervisor);
    }
    if (Amount != null) {
      addInput("Amount", Amount);
    }
  }

/**
 *
 * Retrieves the RefundObjectData that results from the RefundApproveRequest call
 * @return RefundObjectData resulting from udt call
 *
 */

  public RefundObjectData getOutput() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
}
