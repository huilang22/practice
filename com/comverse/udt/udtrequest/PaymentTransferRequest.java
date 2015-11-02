/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTransferRequest.java
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
 * Class used to create a PaymentTransferRequest Udt Request
 *
 */

public class PaymentTransferRequest extends PaymentSubRequestParent {
/**
 *
 * Constructor to create a  PaymentTransferRequest
 * @param id Unique request name
 * @param payXferIn PaymentObjectKeyData for PaymentTransferRequest
 * @param account_external_id String for PaymentTransferRequest
 * @param account_external_id_type Integer for PaymentTransferRequest
 * @param bill_ref_no Integer for PaymentTransferRequest
 * @param bill_ref_resets Integer for PaymentTransferRequest
 * @param open_item_id Integer for PaymentTransferRequest
 *
 */
@JsonCreator
  public PaymentTransferRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectKeyData payXferIn, @JsonProperty("AccountExternalId")String account_external_id, @JsonProperty("AccountExternalIdType")Integer account_external_id_type, @JsonProperty("BillRefNo")Integer bill_ref_no, @JsonProperty("BillRefResets")Integer bill_ref_resets, @JsonProperty("OpenItemId")Integer open_item_id) {
    super(id, "PaymentTransfer");
    if (payXferIn != null) {
      addInput("Payment", PaymentObjectKeyHelper.toMap(payXferIn, new HashMap(), "PaymentObjectKeyData").get("PaymentObjectKeyData"));
    }
    if (account_external_id != null) {
      addInput("AccountExternalId", account_external_id);
    }
    if (account_external_id_type != null) {
      addInput("AccountExternalIdType", account_external_id_type);
    }
    if (bill_ref_no != null) {
      addInput("BillRefNo", bill_ref_no);
    }
    if (bill_ref_resets != null) {
      addInput("BillRefResets", bill_ref_resets);
    }
    if (open_item_id != null) {
      addInput("OpenItemId", open_item_id);
    }
  }

/**
 *
 * Retrieves the PaymentObjectData that results from the PaymentTransferRequest call
 * @return PaymentObjectData resulting from udt call
 *
 */

  public PaymentObjectData getOutput() {
    return PaymentObjectHelper.fromMap(outputMap, "Payment");
  }
}
