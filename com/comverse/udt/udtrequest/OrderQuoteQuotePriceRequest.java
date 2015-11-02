/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderQuoteQuotePriceRequest.java
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
 * Class used to create a OrderQuoteQuotePriceRequest Udt Request
 *
 */

public class OrderQuoteQuotePriceRequest extends OrderQuoteRequest {
/**
 *
 * Constructor to create a  OrderQuoteQuotePriceRequest
 * @param id Unique request name
 * @param oqqpChargesIn ChargeElementObjectData[] for OrderQuoteQuotePriceRequest
 * @param asOfDate Date for OrderQuoteQuotePriceRequest
 * @param accountNo Integer for OrderQuoteQuotePriceRequest
 * @param invoiceCount Integer for OrderQuoteQuotePriceRequest
 *
 */
@JsonCreator
  public OrderQuoteQuotePriceRequest(@JsonProperty("RequestId") String id, @JsonProperty("OqqpChargesIn")ChargeElementObjectData[] oqqpChargesIn, @JsonProperty("AsOfDate")Date asOfDate, @JsonProperty("AccountNo")Integer accountNo, @JsonProperty("InvoiceCount")Integer invoiceCount) {
    super(id, "OrderQuoteQuotePrice");
    if (oqqpChargesIn != null) {
      Object[] list = new Object[oqqpChargesIn.length];
      for (int i = 0; i < oqqpChargesIn.length; i++) {
        list[i] = ChargeElementObjectHelper.getMap(oqqpChargesIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "OqqpChargesIn");
      }
      addInput("OqqpChargesInList", list);
    }
    if (asOfDate != null) {
      addInput("AsOfDate", asOfDate);
    }
    if (accountNo != null) {
      addInput("AccountNo", accountNo);
    }
    if (invoiceCount != null) {
      addInput("InvoiceCount", invoiceCount);
    }
  }

/**
 *
 * Retrieves the BillInvoiceObjectDataList that results from the OrderQuoteQuotePriceRequest call
 * @return BillInvoiceObjectDataList resulting from udt call
 *
 */

  public BillInvoiceObjectDataList getOutput() {
    return BillInvoiceObjectHelper.fromMapList(outputMap, "OqqpBillInvoiceOutList");
  }
}
