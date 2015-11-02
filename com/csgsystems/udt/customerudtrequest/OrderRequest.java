/*
 * Generated code DO NOT EDIT
 * Generated file: OrderRequest.java
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
import com.csgsystems.om.data.*;
public final class OrderRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderRequest (String request, OrderRequestMethod method) {
    initialize(request, "Order", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, OrderRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderRequest request, OrderRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderRequest request, OrderRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, OrderRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceOrderRequest request, OrderRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceOrderRequest request, OrderRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setOrderForOrderCancel(OrderObjectKeyData data) {
    if (data != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setForceForOrderCommit(Integer data) {
    if (data != null) {
      addInput("Force", data);
    }
  }
  public void setOrderForOrderCommit(OrderObjectKeyData data) {
    if (data != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setOrderForOrderCreate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setOrderForOrderExtendedDataFind(OrderObjectKeyData data) {
    if (data != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setOrderForOrderFind(OrderObjectFilter data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setOrderForOrderFindWithExtendedData(OrderObjectFilter data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setOrderForOrderGetDetail(OrderObjectKeyData data) {
    if (data != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setOrderForOrderGet(OrderObjectKeyData data) {
    if (data != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setOrderForOrderLock(OrderObjectKeyData data) {
    if (data != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setAccountInternalIdForOrderPriceQuote(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setAsOfDateForOrderPriceQuote(Date data) {
    if (data != null) {
      addInput("AsOfDate", data);
    }
  }
  public void setInvoiceCountForOrderPriceQuote(Integer data) {
    if (data != null) {
      addInput("InvoiceCount", data);
    }
  }
  public void setOrderIdForOrderPriceQuote(BigInteger data) {
    if (data != null) {
      addInput("OrderId", data);
    }
  }
  public void setOrderForOrderUnlock(OrderObjectKeyData data) {
    if (data != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setOrderForOrderUpdate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public OrderObjectData getOrderObjectDataOrderFromOrderCancel() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
  public OrderObjectData getOrderObjectDataOrderFromOrderCommit() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
  public OrderObjectData getOrderObjectDataOrderFromOrderCreate() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
  public OrderEDObjectDataList getOrderEDObjectDataOrderExtendedDataFromOrderExtendedDataFind() {
    return OrderEDObjectHelper.fromMapList(outputMap, "OrderExtendedDataList");
  }
  public OrderObjectDataList getOrderObjectDataOrderFromOrderFind() {
    return OrderObjectHelper.fromMapList(outputMap, "OrderList");
  }
  public OrderObjectDataList getOrderObjectDataOrderFromOrderFindWithExtendedData() {
    return OrderObjectHelper.fromMapList(outputMap, "OrderList");
  }
  public OrderGetDetailOutputData getOrderGetDetailOutputDataOrderGetDetailOutputDataFromOrderGetDetail() {
    return OrderGetDetailOutputHelper.fromMap(outputMap);
  }
  public OrderObjectData getOrderObjectDataOrderFromOrderGet() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
  public OrderObjectData getOrderObjectDataOrderFromOrderLock() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
  public BillInvoiceObjectDataList getBillInvoiceObjectDataPriceQuoteOutFromOrderPriceQuote() {
    return BillInvoiceObjectHelper.fromMapList(outputMap, "PriceQuoteOutList");
  }
  public OrderObjectData getOrderObjectDataOrderFromOrderUnlock() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
  public OrderObjectData getOrderObjectDataOrderFromOrderUpdate() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
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
  public void setForce(Integer data) {
    if (data != null) {
      addInput("Force", data);
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
  /**
   @deprecated
   */
  public OrderEDObjectDataList getOrderEDObjectDataList() {
    return OrderEDObjectHelper.fromMapList(outputMap, "OrderList");
  }
  /**
   @deprecated
   */
  public OrderGetDetailOutputData getOrderGetDetailOutputData() {
    return OrderGetDetailOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setOrderId(BigInteger data) {
    if (data != null) {
      addInput("OrderId", data);
    }
  }
  /**
   @deprecated
   */
  public void setOrderObjectFilter(OrderObjectFilter data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap()).get("OrderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOrderObjectData(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap()).get("OrderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setOrderObjectKeyData(OrderObjectKeyData data) {
    if (data != null) {
      addInput("Order", OrderObjectKeyHelper.toMap(data, new HashMap()).get("OrderObject"));
    }
  }
  /**
   @deprecated
   */
  public OrderObjectDataList getOrderObjectDataList() {
    return OrderObjectHelper.fromMapList(outputMap, "OrderList");
  }
  /**
   @deprecated
   */
  public Map  getOrderObjectExtendedData() {
    return OrderObjectHelper.fromMap(outputMap, "Order").extendedData;
  }
  
  /**
   @deprecated
   */
  public OrderObjectData getOrderObjectData() {
    return OrderObjectHelper.fromMap(outputMap, "Order");
  }
}
