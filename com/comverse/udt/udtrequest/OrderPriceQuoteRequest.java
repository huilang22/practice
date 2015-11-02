/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderPriceQuoteRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderPriceQuoteRequest Udt Request
 *
 */

public class OrderPriceQuoteRequest extends OrderRequest {
/**
 *
 * Constructor to create a  OrderPriceQuoteRequest
 * @param id Unique request name
 * @param order_id BigInteger for OrderPriceQuoteRequest
 * @param as_of_date Date for OrderPriceQuoteRequest
 * @param account_no Integer for OrderPriceQuoteRequest
 * @param invoice_count Integer for OrderPriceQuoteRequest
 *
 */
@JsonCreator
  public OrderPriceQuoteRequest(@JsonProperty("RequestId") String id, @JsonProperty("OrderId")BigInteger order_id, @JsonProperty("AsOfDate")Date as_of_date, @JsonProperty("AccountInternalId")Integer account_no, @JsonProperty("InvoiceCount")Integer invoice_count) {
    super(id, "OrderPriceQuote");
    if (order_id != null) {
      addInput("OrderId", order_id);
    }
    if (as_of_date != null) {
      addInput("AsOfDate", as_of_date);
    }
    if (account_no != null) {
      addInput("AccountInternalId", account_no);
    }
    if (invoice_count != null) {
      addInput("InvoiceCount", invoice_count);
    }
  }

/**
 *
 * Retrieves the BillInvoiceObjectDataList that results from the OrderPriceQuoteRequest call
 * @return BillInvoiceObjectDataList resulting from udt call
 *
 */

  public BillInvoiceObjectDataList getOutput() {
    return BillInvoiceObjectHelper.fromMapList(outputMap, "PriceQuoteOutList");
  }
}
