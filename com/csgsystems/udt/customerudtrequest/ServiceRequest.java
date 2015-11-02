/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceRequest.java
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
public final class ServiceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceRequest (String request, ServiceRequestMethod method) {
    initialize(request, "Service", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CorridorRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CorridorRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerIdEquipMapRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerIdEquipMapRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(EmfConfigurationRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(EmfConfigurationRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvElementRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvElementRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(NrcRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(NrcRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OpenItemIdMapRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OpenItemIdMapRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedCiemRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedCiemRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedInventoryRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedNrcRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceOrderRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceOrderRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServicePricingPlanRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServicePricingPlanRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceStatusRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceStatusRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceZoneRequest request, ServiceRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceZoneRequest request, ServiceRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setServiceForServiceAlternateGet(ServiceObjectBaseData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceCreate(ServiceObjectBaseData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceExtendedDataFind(ServiceObjectBaseKeyData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceExternalFindAll(ServiceObjectFilter data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceExternalFind(ServiceObjectFilter data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceExternalGet(ServiceObjectBaseKeyData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceFindCount(ServiceObjectFilter data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceFind(ServiceObjectBaseFilter data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceFindWithExtendedData(ServiceObjectFilter data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceGet(ServiceObjectBaseKeyData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceUpdate(ServiceObjectBaseData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceUpdateValidate(ServiceObjectBaseData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceWithNonServiceMoveFind(ServiceObjectFilter data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceForServiceWithPendingFind(ServiceObjectFilter data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public ServiceObjectBaseData getServiceObjectBaseDataServiceFromServiceAlternateGet() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
  public ServiceObjectBaseData getServiceObjectBaseDataServiceFromServiceCreate() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
  public ServiceEDObjectDataList getServiceEDObjectDataServiceExtendedDataFromServiceExtendedDataFind() {
    return ServiceEDObjectHelper.fromMapList(outputMap, "ServiceExtendedDataList");
  }
  public ServiceObjectDataList getServiceObjectDataServiceFromServiceExternalFindAll() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
  public ServiceObjectDataList getServiceObjectDataServiceFromServiceExternalFind() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
  public ServiceObjectData getServiceObjectDataServiceFromServiceExternalGet() {
    return ServiceObjectHelper.fromMap(outputMap, "Service");
  }
  public Integer getIntegerTotalCountFromServiceFindCount() {
    return (Integer)outputMap.get("TotalCount");
  }
  public ServiceObjectBaseDataList getServiceObjectBaseDataServiceFromServiceFind() {
    return ServiceObjectBaseHelper.fromMapList(outputMap, "ServiceList");
  }
  public ServiceObjectDataList getServiceObjectDataServiceFromServiceFindWithExtendedData() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
  public ServiceObjectBaseData getServiceObjectBaseDataServiceFromServiceGet() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
  public ServiceObjectBaseData getServiceObjectBaseDataServiceFromServiceSequenceGet() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
  public ServiceObjectBaseData getServiceObjectBaseDataServiceFromServiceUpdate() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
  public ServiceObjectDataList getServiceObjectDataServiceFromServiceWithNonServiceMoveFind() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
  public ServiceObjectDataList getServiceObjectDataServiceFromServiceWithPendingFind() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
  /**
   @deprecated
   */
  public ServiceEDObjectDataList getServiceEDObjectDataList() {
    return ServiceEDObjectHelper.fromMapList(outputMap, "ServiceList");
  }
  /**
   @deprecated
   */
  public void setServiceObjectFilter(ServiceObjectFilter data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap()).get("ServiceObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceObjectDataList getServiceObjectDataList() {
    return ServiceObjectHelper.fromMapList(outputMap, "ServiceList");
  }
  /**
   @deprecated
   */
  public ServiceObjectData getServiceObjectData() {
    return ServiceObjectHelper.fromMap(outputMap, "Service");
  }
  /**
   @deprecated
   */
  public void setServiceObjectBaseFilter(ServiceObjectBaseFilter data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(data, new HashMap()).get("ServiceObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceObjectBaseData(ServiceObjectBaseData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseHelper.toMap(data, new HashMap()).get("ServiceObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceObjectBaseKeyData(ServiceObjectBaseKeyData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(data, new HashMap()).get("ServiceObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public ServiceObjectBaseDataList getServiceObjectBaseDataList() {
    return ServiceObjectBaseHelper.fromMapList(outputMap, "ServiceList");
  }
  /**
   @deprecated
   */
  public Map  getServiceObjectBaseExtendedData() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service").extendedData;
  }
  
  /**
   @deprecated
   */
  public ServiceObjectBaseData getServiceObjectBaseData() {
    return ServiceObjectBaseHelper.fromMap(outputMap, "Service");
  }
  /**
   @deprecated
   */
  public Integer getTotalCount() {
    return (Integer)outputMap.get("TotalCount");
  }
}
