/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentRequest.java
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
public final class ComponentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ComponentRequest (String request, ComponentRequestMethod method) {
    initialize(request, "Component", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ComponentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, ComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, ComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, ComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentElementRequest request, ComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ItemRequest request, ComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ItemRequest request, ComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, ComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedAccountRequest request, ComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedPackageRequest request, ComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedPackageRequest request, ComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, ComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedServiceRequest request, ComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductPackageRequest request, ComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductPackageRequest request, ComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ServiceRequest request, ComponentRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ServiceRequest request, ComponentRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setComponentForComponentActivate(ComponentObjectBaseKeyData data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setCancelDateForComponentCancel(Date data) {
    if (data != null) {
      addInput("CancelDate", data);
    }
  }
  public void setComponentForComponentCancel(ComponentObjectBaseKeyData data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setComponentForComponentCreate(ComponentObjectBaseData data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setComponentForComponentDelete(ComponentObjectBaseKeyData data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setInactiveDateForComponentDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setComponentFilterForComponentDeleteList(ComponentObjectBaseFilter data) {
    if (data != null) {
      addInput("ComponentFilter", ComponentObjectBaseHelper.toMap(data, new HashMap(), "ComponentFilter").get("ComponentFilter"));
    }
  }
  public void setInactiveDateForComponentDeleteList(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setComponentForComponentDisconnectValidate(ComponentObjectData data) {
    if (data != null) {
      addInput("Component", ComponentObjectHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setEffectiveDtForComponentDisconnectValidate(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setComponentForComponentExternalFind(ComponentObjectFilter data) {
    if (data != null) {
      addInput("Component", ComponentObjectHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setComponentForComponentFindByServiceOrder(ComponentObjectBaseFilter data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setServiceOrderIdForComponentFindByServiceOrder(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
  public void setComponentForComponentFind(ComponentObjectBaseFilter data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setComponentForComponentFindCount(ComponentObjectBaseFilter data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setComponentForComponentGet(ComponentObjectBaseKeyData data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setComponentForComponentRemove(ComponentObjectBaseKeyData data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public void setComponentForComponentUpdate(ComponentObjectBaseData data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseHelper.toMap(data, new HashMap(), "Component").get("Component"));
    }
  }
  public ComponentObjectBaseData getComponentObjectBaseDataComponentFromComponentActivate() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
  public ComponentObjectBaseData getComponentObjectBaseDataComponentFromComponentCreate() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
  public ComponentObjectBaseData getComponentObjectBaseDataComponentFromComponentDelete() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
  public ComponentObjectDataList getComponentObjectDataComponentFromComponentExternalFind() {
    return ComponentObjectHelper.fromMapList(outputMap, "ComponentList");
  }
  public ComponentObjectBaseDataList getComponentObjectBaseDataComponentFromComponentFindByServiceOrder() {
    return ComponentObjectBaseHelper.fromMapList(outputMap, "ComponentList");
  }
  public ComponentObjectBaseDataList getComponentObjectBaseDataComponentFromComponentFind() {
    return ComponentObjectBaseHelper.fromMapList(outputMap, "ComponentList");
  }
  public Integer getIntegerComponentCountFromComponentFindCount() {
    return (Integer)outputMap.get("ComponentCount");
  }
  public ComponentObjectBaseData getComponentObjectBaseDataComponentFromComponentGet() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
  public ComponentObjectBaseData getComponentObjectBaseDataComponentFromComponentUpdate() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
  /**
   @deprecated
   */
  public void setCancelDate(Date data) {
    if (data != null) {
      addInput("CancelDate", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getComponentCount() {
    return (Integer)outputMap.get("ComponentCount");
  }
  /**
   @deprecated
   */
  public void setComponentObjectFilter(ComponentObjectFilter data) {
    if (data != null) {
      addInput("Component", ComponentObjectHelper.toMap(data, new HashMap()).get("ComponentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setComponentObjectData(ComponentObjectData data) {
    if (data != null) {
      addInput("Component", ComponentObjectHelper.toMap(data, new HashMap()).get("ComponentObject"));
    }
  }
  /**
   @deprecated
   */
  public ComponentObjectDataList getComponentObjectDataList() {
    return ComponentObjectHelper.fromMapList(outputMap, "ComponentList");
  }
  /**
   @deprecated
   */
  public void setComponentObjectBaseFilter(ComponentObjectBaseFilter data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseHelper.toMap(data, new HashMap()).get("ComponentObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setComponentObjectBaseData(ComponentObjectBaseData data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseHelper.toMap(data, new HashMap()).get("ComponentObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setComponentObjectBaseKeyData(ComponentObjectBaseKeyData data) {
    if (data != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(data, new HashMap()).get("ComponentObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public ComponentObjectBaseDataList getComponentObjectBaseDataList() {
    return ComponentObjectBaseHelper.fromMapList(outputMap, "ComponentList");
  }
  /**
   @deprecated
   */
  public ComponentObjectBaseData getComponentObjectBaseData() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
  /**
   @deprecated
   */
  public void setEffectiveDt(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setInactiveDate(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderId(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
}
