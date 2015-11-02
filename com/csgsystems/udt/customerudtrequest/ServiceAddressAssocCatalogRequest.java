/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocCatalogRequest.java
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
public final class ServiceAddressAssocCatalogRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ServiceAddressAssocCatalogRequest (String request, ServiceAddressAssocCatalogRequestMethod method) {
    initialize(request, "ServiceAddressAssocCatalog", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ServiceAddressAssocCatalogRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setServiceAddressAssocCatalogForServiceAddressAssocCatalogCreate(ServiceAddressAssocCatalogObjData data) {
    if (data != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(data, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }
  public void setServiceAddressAssocCatalogForServiceAddressAssocCatalogExternalFind(ServiceAddressAssocCatalogObjectFilter data) {
    if (data != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjectHelper.toMap(data, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }
  public void setServiceAddressAssocCatalogForServiceAddressAssocCatalogFind(ServiceAddressAssocCatalogObjFilter data) {
    if (data != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(data, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }
  public void setServiceAddressAssocCatalogForServiceAddressAssocCatalogGet(ServiceAddressAssocCatalogObjKeyData data) {
    if (data != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjKeyHelper.toMap(data, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }
  public void setServiceAddressAssocCatalogForServiceAddressAssocCatalogUpdate(ServiceAddressAssocCatalogObjData data) {
    if (data != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(data, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }
  public ServiceAddressAssocCatalogObjData getServiceAddressAssocCatalogObjDataServiceAddressAssocCatalogFromServiceAddressAssocCatalogCreate() {
    return ServiceAddressAssocCatalogObjHelper.fromMap(outputMap, "ServiceAddressAssocCatalog");
  }
  public ServiceAddressAssocCatalogObjectDataList getServiceAddressAssocCatalogObjectDataServiceAddressAssocCatalogFromServiceAddressAssocCatalogExternalFind() {
    return ServiceAddressAssocCatalogObjectHelper.fromMapList(outputMap, "ServiceAddressAssocCatalogList");
  }
  public ServiceAddressAssocCatalogObjDataList getServiceAddressAssocCatalogObjDataServiceAddressAssocCatalogFromServiceAddressAssocCatalogFind() {
    return ServiceAddressAssocCatalogObjHelper.fromMapList(outputMap, "ServiceAddressAssocCatalogList");
  }
  public ServiceAddressAssocCatalogObjData getServiceAddressAssocCatalogObjDataServiceAddressAssocCatalogFromServiceAddressAssocCatalogGet() {
    return ServiceAddressAssocCatalogObjHelper.fromMap(outputMap, "ServiceAddressAssocCatalog");
  }
  public ServiceAddressAssocCatalogObjData getServiceAddressAssocCatalogObjDataServiceAddressAssocCatalogFromServiceAddressAssocCatalogUpdate() {
    return ServiceAddressAssocCatalogObjHelper.fromMap(outputMap, "ServiceAddressAssocCatalog");
  }
  /**
   @deprecated
   */
  public void setServiceAddressAssocCatalogObjFilter(ServiceAddressAssocCatalogObjFilter data) {
    if (data != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(data, new HashMap()).get("ServiceAddressAssocCatalogObj"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceAddressAssocCatalogObjData(ServiceAddressAssocCatalogObjData data) {
    if (data != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(data, new HashMap()).get("ServiceAddressAssocCatalogObj"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceAddressAssocCatalogObjKeyData(ServiceAddressAssocCatalogObjKeyData data) {
    if (data != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjKeyHelper.toMap(data, new HashMap()).get("ServiceAddressAssocCatalogObj"));
    }
  }
  /**
   @deprecated
   */
  public ServiceAddressAssocCatalogObjDataList getServiceAddressAssocCatalogObjDataList() {
    return ServiceAddressAssocCatalogObjHelper.fromMapList(outputMap, "ServiceAddressAssocCatalogList");
  }
  /**
   @deprecated
   */
  public ServiceAddressAssocCatalogObjData getServiceAddressAssocCatalogObjData() {
    return ServiceAddressAssocCatalogObjHelper.fromMap(outputMap, "ServiceAddressAssocCatalog");
  }
  /**
   @deprecated
   */
  public void setServiceAddressAssocCatalogObjectFilter(ServiceAddressAssocCatalogObjectFilter data) {
    if (data != null) {
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjectHelper.toMap(data, new HashMap()).get("ServiceAddressAssocCatalogObject"));
    }
  }
  /**
   @deprecated
   */
  public ServiceAddressAssocCatalogObjectDataList getServiceAddressAssocCatalogObjectDataList() {
    return ServiceAddressAssocCatalogObjectHelper.fromMapList(outputMap, "ServiceAddressAssocCatalogList");
  }
}
