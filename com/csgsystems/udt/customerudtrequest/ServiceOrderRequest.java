/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderRequest.java
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

import com.csgsystems.om.data.*;
public final class ServiceOrderRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceOrderRequest (String request, ServiceOrderRequestMethod method) {
    initialize(request, "ServiceOrder", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceOrderRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, ServiceOrderRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, ServiceOrderRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, ServiceOrderRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, ServiceOrderRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderRequest request, ServiceOrderRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderRequest request, ServiceOrderRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, ServiceOrderRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, ServiceOrderRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, ServiceOrderRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, ServiceOrderRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, ServiceOrderRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, ServiceOrderRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setServiceOrderForServiceOrderCancelComplete(ServiceOrderObjectBaseData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderCancel(ServiceOrderObjectBaseKeyData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderCancelValidate(ServiceOrderObjectBaseKeyData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderCommit(ServiceOrderObjectBaseKeyData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderCreate(ServiceOrderObjectBaseData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderExtendedDataFind(ServiceOrderObjectBaseKeyData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderExternalFind(ServiceOrderObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderFindCount(ServiceOrderObjectBaseFilter data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderFindInner(ServiceOrderObjectBaseFilter data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderFind(ServiceOrderObjectBaseFilter data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderFindWithExtendedData(ServiceOrderObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderGet(ServiceOrderObjectBaseKeyData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderInvContainerFind(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setOrderForServiceOrderListSchedule(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForServiceOrderListSchedule(ServiceOrderObjectBaseData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderListUpdate(ServiceOrderObjectBaseData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderLogicalExpand(ServiceOrderObjectBaseKeyData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderPpvUsageRequired(ServiceOrderObjectBaseKeyData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setResumeDateForServiceOrderSuspendCreate(Date data) {
    if (data != null) {
      addInput("ResumeDate", data);
    }
  }
  public void setServiceOrderForServiceOrderSuspendCreate(ServiceOrderObjectBaseData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderUpdate(ServiceOrderObjectBaseData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setDateBasedValidationForServiceOrderValidateCreate(Boolean data) {
    if (data != null) {
      addInput("DateBasedValidation", data);
    }
  }
  public void setResumeDtForServiceOrderValidateCreate(Date data) {
    if (data != null) {
      addInput("ResumeDt", data);
    }
  }
  public void setServiceOrderForServiceOrderValidateCreate(ServiceOrderObjectBaseData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderValidate(ServiceOrderObjectBaseData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setServiceOrderForServiceOrderWithLogicalFind(ServiceOrderObjectBaseFilter data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public ServiceOrderObjectBaseData getServiceOrderObjectBaseDataServiceOrderFromServiceOrderCancelComplete() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
  public ServiceOrderObjectBaseData getServiceOrderObjectBaseDataServiceOrderFromServiceOrderCancel() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
  public ItemObjectDataList getItemObjectDataServiceOrderFromServiceOrderCancelValidate() {
    return ItemObjectHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  public ServiceOrderObjectBaseData getServiceOrderObjectBaseDataServiceOrderFromServiceOrderCommit() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
  public ServiceOrderObjectBaseData getServiceOrderObjectBaseDataServiceOrderFromServiceOrderCreate() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
  public ServiceOrderEDObjectDataList getServiceOrderEDObjectDataServiceOrderExtendedDataFromServiceOrderExtendedDataFind() {
    return ServiceOrderEDObjectHelper.fromMapList(outputMap, "ServiceOrderExtendedDataList");
  }
  public ServiceOrderObjectDataList getServiceOrderObjectDataServiceOrderFromServiceOrderExternalFind() {
    return ServiceOrderObjectHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  public Integer getIntegerServiceOrderCountFromServiceOrderFindCount() {
    return (Integer)outputMap.get("ServiceOrderCount");
  }
  public ServiceOrderObjectBaseDataList getServiceOrderObjectBaseDataServiceOrderFromServiceOrderFindInner() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  public ServiceOrderObjectBaseDataList getServiceOrderObjectBaseDataServiceOrderFromServiceOrderFind() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  public ServiceOrderObjectDataList getServiceOrderObjectDataServiceOrderFromServiceOrderFindWithExtendedData() {
    return ServiceOrderObjectHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  public ServiceOrderObjectBaseData getServiceOrderObjectBaseDataServiceOrderFromServiceOrderGet() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
  public InvContainerIdObjectDataList getInvContainerIdObjectDataInvContainerFromServiceOrderInvContainerFind() {
    return InvContainerIdObjectHelper.fromMapList(outputMap, "InvContainerList");
  }
  public ServiceOrderListScheduleOutputData getServiceOrderListScheduleOutputDataServiceOrderListScheduleOutputDataFromServiceOrderListSchedule() {
    return ServiceOrderListScheduleOutputHelper.fromMap(outputMap);
  }
  public ServiceOrderObjectBaseDataList getServiceOrderObjectBaseDataServiceOrderFromServiceOrderListUpdate() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  public ServiceOrderObjectBaseData getServiceOrderObjectBaseDataServiceOrderFromServiceOrderLogicalExpand() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
  public Integer getIntegerResultFromServiceOrderPpvUsageRequired() {
    return (Integer)outputMap.get("Result");
  }
  public ServiceOrderObjectBaseDataList getServiceOrderObjectBaseDataServiceOrderFromServiceOrderSuspendCreate() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  public ServiceOrderObjectBaseData getServiceOrderObjectBaseDataServiceOrderFromServiceOrderUpdate() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
  public ServiceOrderObjectBaseDataList getServiceOrderObjectBaseDataServiceOrderFromServiceOrderValidateCreate() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  public ServiceOrderObjectBaseDataList getServiceOrderObjectBaseDataServiceOrderFromServiceOrderValidate() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  public ServiceOrderObjectBaseDataList getServiceOrderObjectBaseDataServiceOrderFromServiceOrderWithLogicalFind() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  /**
   @deprecated
   */
  public void setDateBasedValidation(Boolean data) {
    if (data != null) {
      addInput("DateBasedValidation", data);
    }
  }
  /**
   @deprecated
   */
  public InvContainerIdObjectDataList getInvContainerIdObjectDataList() {
    return InvContainerIdObjectHelper.fromMapList(outputMap, "InvContainerIdList");
  }
  /**
   @deprecated
   */
  public ItemObjectDataList getItemObjectDataList() {
    return ItemObjectHelper.fromMapList(outputMap, "ItemList");
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
  public Integer getResult() {
    return (Integer)outputMap.get("Result");
  }
  /**
   @deprecated
   */
  public void setResumeDate(Date data) {
    if (data != null) {
      addInput("ResumeDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setResumeDt(Date data) {
    if (data != null) {
      addInput("ResumeDt", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getServiceOrderCount() {
    return (Integer)outputMap.get("ServiceOrderCount");
  }
  /**
   @deprecated
   */
  public ServiceOrderEDObjectDataList getServiceOrderEDObjectDataList() {
    return ServiceOrderEDObjectHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  /**
   @deprecated
   */
  public ServiceOrderListScheduleOutputData getServiceOrderListScheduleOutputData() {
    return ServiceOrderListScheduleOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setServiceOrderObjectFilter(ServiceOrderObjectFilter data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap()).get("ServiceOrderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderObjectData(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap()).get("ServiceOrderObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceOrderObjectDataList getServiceOrderObjectDataList() {
    return ServiceOrderObjectHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  /**
   @deprecated
   */
  public void setServiceOrderObjectBaseFilter(ServiceOrderObjectBaseFilter data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap()).get("ServiceOrderObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderObjectBaseData(ServiceOrderObjectBaseData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(data, new HashMap()).get("ServiceOrderObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderObjectBaseKeyData(ServiceOrderObjectBaseKeyData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(data, new HashMap()).get("ServiceOrderObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderObjectBaseDataArray(ServiceOrderObjectBaseData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = ServiceOrderObjectBaseHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrder");
      }
      addInput("ServiceOrderList", list);
    }
  }
  /**
   @deprecated
   */
  public ServiceOrderObjectBaseDataList getServiceOrderObjectBaseDataList() {
    return ServiceOrderObjectBaseHelper.fromMapList(outputMap, "ServiceOrderList");
  }
  /**
   @deprecated
   */
  public Map  getServiceOrderObjectBaseExtendedData() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder").extendedData;
  }
  
  /**
   @deprecated
   */
  public ServiceOrderObjectBaseData getServiceOrderObjectBaseData() {
    return ServiceOrderObjectBaseHelper.fromMap(outputMap, "ServiceOrder");
  }
}
