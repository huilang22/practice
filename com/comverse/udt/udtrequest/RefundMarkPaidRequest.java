/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundMarkPaidRequest.java
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
 * Class used to create a RefundMarkPaidRequest Udt Request
 *
 */

public class RefundMarkPaidRequest extends RefundSubRequestParent {
/**
 *
 * Constructor to create a  RefundMarkPaidRequest
 * @param id Unique request name
 * @param refundMarkIn RefundObjectKeyData for RefundMarkPaidRequest
 * @param TreasuryDate Date for RefundMarkPaidRequest
 * @param CheckNum String for RefundMarkPaidRequest
 *
 */
@JsonCreator
  public RefundMarkPaidRequest(@JsonProperty("RequestId") String id, @JsonProperty("Refund")RefundObjectKeyData refundMarkIn, @JsonProperty("TreasuryDate")Date TreasuryDate, @JsonProperty("CheckNum")String CheckNum) {
    super(id, "RefundMarkPaid");
    if (refundMarkIn != null) {
      addInput("Refund", RefundObjectKeyHelper.toMap(refundMarkIn, new HashMap(), "RefundObjectKeyData").get("RefundObjectKeyData"));
    }
    if (TreasuryDate != null) {
      addInput("TreasuryDate", TreasuryDate);
    }
    if (CheckNum != null) {
      addInput("CheckNum", CheckNum);
    }
  }

/**
 *
 * Retrieves the RefundObjectData that results from the RefundMarkPaidRequest call
 * @return RefundObjectData resulting from udt call
 *
 */

  public RefundObjectData getOutput() {
    return RefundObjectHelper.fromMap(outputMap, "Refund");
  }
}
