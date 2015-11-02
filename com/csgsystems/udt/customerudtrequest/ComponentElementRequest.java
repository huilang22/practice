/*
 * Generated code DO NOT EDIT
 * Generated file: ComponentElementRequest.java
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
public final class ComponentElementRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ComponentElementRequest (String request, ComponentElementRequestMethod method) {
    initialize(request, "ComponentElement", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ComponentElementRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ComponentRequest request, ComponentElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ComponentRequest request, ComponentElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, ComponentElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(CustomerContractRequest request, ComponentElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, ComponentElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedComponentRequest request, ComponentElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, ComponentElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedContractRequest request, ComponentElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedPackageRequest request, ComponentElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedPackageRequest request, ComponentElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, ComponentElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(OrderedProductRequest request, ComponentElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductRequest request, ComponentElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductRequest request, ComponentElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(ProductPackageRequest request, ComponentElementRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(ProductPackageRequest request, ComponentElementRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setComponentElementForComponentElementCreate(ComponentElementObjectData data) {
    if (data != null) {
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(data, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }
  public void setComponentElementForComponentElementDelete(ComponentElementObjectKeyData data) {
    if (data != null) {
      addInput("ComponentElement", ComponentElementObjectKeyHelper.toMap(data, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }
  public void setInactiveDateForComponentElementDelete(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
  public void setComponentElementForComponentElementFind(ComponentElementObjectFilter data) {
    if (data != null) {
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(data, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }
  public void setComponentElementForComponentElementGet(ComponentElementObjectKeyData data) {
    if (data != null) {
      addInput("ComponentElement", ComponentElementObjectKeyHelper.toMap(data, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }
  public void setComponentElementForComponentElementUpdate(ComponentElementObjectData data) {
    if (data != null) {
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(data, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }
  public ComponentElementObjectData getComponentElementObjectDataComponentElementFromComponentElementCreate() {
    return ComponentElementObjectHelper.fromMap(outputMap, "ComponentElement");
  }
  public ComponentElementObjectData getComponentElementObjectDataComponentElementFromComponentElementDelete() {
    return ComponentElementObjectHelper.fromMap(outputMap, "ComponentElement");
  }
  public ComponentElementObjectDataList getComponentElementObjectDataComponentElementFromComponentElementFind() {
    return ComponentElementObjectHelper.fromMapList(outputMap, "ComponentElementList");
  }
  public ComponentElementObjectData getComponentElementObjectDataComponentElementFromComponentElementGet() {
    return ComponentElementObjectHelper.fromMap(outputMap, "ComponentElement");
  }
  public ComponentElementObjectData getComponentElementObjectDataComponentElementFromComponentElementUpdate() {
    return ComponentElementObjectHelper.fromMap(outputMap, "ComponentElement");
  }
  /**
   @deprecated
   */
  public void setComponentElementObjectFilter(ComponentElementObjectFilter data) {
    if (data != null) {
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(data, new HashMap()).get("ComponentElementObject"));
    }
  }
  /**
   @deprecated
   */
  public void setComponentElementObjectData(ComponentElementObjectData data) {
    if (data != null) {
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(data, new HashMap()).get("ComponentElementObject"));
    }
  }
  /**
   @deprecated
   */
  public void setComponentElementObjectKeyData(ComponentElementObjectKeyData data) {
    if (data != null) {
      addInput("ComponentElement", ComponentElementObjectKeyHelper.toMap(data, new HashMap()).get("ComponentElementObject"));
    }
  }
  /**
   @deprecated
   */
  public ComponentElementObjectDataList getComponentElementObjectDataList() {
    return ComponentElementObjectHelper.fromMapList(outputMap, "ComponentElementList");
  }
  /**
   @deprecated
   */
  public ComponentElementObjectData getComponentElementObjectData() {
    return ComponentElementObjectHelper.fromMap(outputMap, "ComponentElement");
  }
  /**
   @deprecated
   */
  public void setInactiveDate(Date data) {
    if (data != null) {
      addInput("InactiveDate", data);
    }
  }
}
