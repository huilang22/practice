/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeEligibleFindRequest.java
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
 * Class used to create a AdjustmentTypeEligibleFindRequest Udt Request
 *
 */

public class AdjustmentTypeEligibleFindRequest extends AdjustmentTypeRequest {
/**
 *
 * Constructor to create a  AdjustmentTypeEligibleFindRequest
 * @param id Unique request name
 * @param unbilled_usage UnbilledUsageObjectData for AdjustmentTypeEligibleFindRequest
 * @param billed_usage BilledUsageObjectData for AdjustmentTypeEligibleFindRequest
 * @param invoice_detail InvoiceDetailObjectData for AdjustmentTypeEligibleFindRequest
 * @param balance_line_item BalanceLineItemObjectData for AdjustmentTypeEligibleFindRequest
 * @param invoice InvoiceObjectData for AdjustmentTypeEligibleFindRequest
 * @param language_code Integer for AdjustmentTypeEligibleFindRequest
 * @param trans_sign Integer for AdjustmentTypeEligibleFindRequest
 *
 */
@JsonCreator
  public AdjustmentTypeEligibleFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageObjectData unbilled_usage, @JsonProperty("BilledUsage")BilledUsageObjectData billed_usage, @JsonProperty("InvoiceDetail")InvoiceDetailObjectData invoice_detail, @JsonProperty("BalanceLineItem")BalanceLineItemObjectData balance_line_item, @JsonProperty("Invoice")InvoiceObjectData invoice, @JsonProperty("LanguageCode")Integer language_code, @JsonProperty("TransSign")Integer trans_sign) {
    super(id, "AdjustmentTypeEligibleFind");
    if (unbilled_usage != null) {
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(unbilled_usage, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
    if (billed_usage != null) {
      addInput("BilledUsage", BilledUsageObjectHelper.toMap(billed_usage, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
    if (invoice_detail != null) {
      addInput("InvoiceDetail", InvoiceDetailObjectHelper.toMap(invoice_detail, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
    if (balance_line_item != null) {
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(balance_line_item, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
    if (invoice != null) {
      addInput("Invoice", InvoiceObjectHelper.toMap(invoice, new HashMap(), "AdjustmentType").get("AdjustmentType"));
    }
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
    if (trans_sign != null) {
      addInput("TransSign", trans_sign);
    }
  }

/**
 *
 * Retrieves the AdjustmentTypeObjectDataList that results from the AdjustmentTypeEligibleFindRequest call
 * @return AdjustmentTypeObjectDataList resulting from udt call
 *
 */

  public AdjustmentTypeObjectDataList getOutput() {
    return AdjustmentTypeObjectHelper.fromMapList(outputMap, "AdjustmentTypeList");
  }
}
