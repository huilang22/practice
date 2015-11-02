/*
 * Generated code DO NOT EDIT
 * Generated file: OrderQuoteRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.bp.data.*;
public final class OrderQuoteRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderQuoteRequest (String request, OrderQuoteRequestMethod method) {
    initialize(request, "OrderQuote", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderQuoteRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountNoForOrderQuoteQuotePrice(Integer data) {
    if (data != null) {
      addInput("AccountNo", data);
    }
  }
  public void setAsOfDateForOrderQuoteQuotePrice(Date data) {
    if (data != null) {
      addInput("AsOfDate", data);
    }
  }
  public void setInvoiceCountForOrderQuoteQuotePrice(Integer data) {
    if (data != null) {
      addInput("InvoiceCount", data);
    }
  }
  public void setOqqpChargesInForOrderQuoteQuotePrice(ChargeElementObjectData data) {
    if (data != null) {
      addInput("OqqpChargesIn", ChargeElementObjectHelper.toMap(data, new HashMap(), "OqqpChargesIn").get("OqqpChargesIn"));
    }
  }
  public BillInvoiceObjectDataList getBillInvoiceObjectDataOqqpBillInvoiceOutFromOrderQuoteQuotePrice() {
    return BillInvoiceObjectHelper.fromMapList(outputMap, "OqqpBillInvoiceOutList");
  }
  /**
   @deprecated
   */
  public void setAccountNo(Integer data) {
    if (data != null) {
      addInput("AccountNo", data);
    }
  }
  /**
   @deprecated
   */
  public void setAsOfDate(Date data) {
    if (data != null) {
      addInput("AsOfDate", data);
    }
  }
  /**
   @deprecated
   */
  public BillInvoiceObjectDataList getBillInvoiceObjectDataList() {
    return BillInvoiceObjectHelper.fromMapList(outputMap, "BillInvoiceList");
  }
  /**
   @deprecated
   */
  public void setChargeElementObjectDataArray(ChargeElementObjectData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = ChargeElementObjectHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ChargeElement");
      }
      addInput("ChargeElementList", list);
    }
  }
  /**
   @deprecated
   */
  public void setInvoiceCount(Integer data) {
    if (data != null) {
      addInput("InvoiceCount", data);
    }
  }
}
