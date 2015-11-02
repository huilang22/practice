/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataAssociationRequest.java
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
public final class ExtendedDataAssociationRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExtendedDataAssociationRequest (String request, ExtendedDataAssociationRequestMethod method) {
    initialize(request, "ExtendedDataAssociation", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExtendedDataAssociationRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExtendedDataAssociationForExtendedDataAssociationCreate(ExtendedDataObjectData data) {
    if (data != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(data, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }
  public void setExtendedDataAssociationForExtendedDataAssociationDelete(ExtendedDataObjectKeyData data) {
    if (data != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectKeyHelper.toMap(data, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }
  public void setExtendedDataAssociationForExtendedDataAssociationFind(ExtendedDataObjectFilter data) {
    if (data != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(data, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }
  public void setExtendedDataAssociationForExtendedDataAssociationGet(ExtendedDataObjectKeyData data) {
    if (data != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectKeyHelper.toMap(data, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }
  public void setExtendedDataAssociationForExtendedDataAssociationUpdate(ExtendedDataObjectData data) {
    if (data != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(data, new HashMap(), "ExtendedDataAssociation").get("ExtendedDataAssociation"));
    }
  }
  public ExtendedDataObjectData getExtendedDataObjectDataExtendedDataAssociationFromExtendedDataAssociationCreate() {
    return ExtendedDataObjectHelper.fromMap(outputMap, "ExtendedDataAssociation");
  }
  public ExtendedDataObjectData getExtendedDataObjectDataExtendedDataAssociationFromExtendedDataAssociationDelete() {
    return ExtendedDataObjectHelper.fromMap(outputMap, "ExtendedDataAssociation");
  }
  public ExtendedDataObjectDataList getExtendedDataObjectDataExtendedDataAssociationFromExtendedDataAssociationFind() {
    return ExtendedDataObjectHelper.fromMapList(outputMap, "ExtendedDataAssociationList");
  }
  public ExtendedDataObjectData getExtendedDataObjectDataExtendedDataAssociationFromExtendedDataAssociationGet() {
    return ExtendedDataObjectHelper.fromMap(outputMap, "ExtendedDataAssociation");
  }
  public ExtendedDataObjectData getExtendedDataObjectDataExtendedDataAssociationFromExtendedDataAssociationUpdate() {
    return ExtendedDataObjectHelper.fromMap(outputMap, "ExtendedDataAssociation");
  }
  /**
   @deprecated
   */
  public void setExtendedDataObjectFilter(ExtendedDataObjectFilter data) {
    if (data != null) {
      addInput("ExtendedData", ExtendedDataObjectHelper.toMap(data, new HashMap()).get("ExtendedDataObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExtendedDataObjectData(ExtendedDataObjectData data) {
    if (data != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectHelper.toMap(data, new HashMap()).get("ExtendedDataObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExtendedDataObjectKeyData(ExtendedDataObjectKeyData data) {
    if (data != null) {
      addInput("ExtendedDataAssociation", ExtendedDataObjectKeyHelper.toMap(data, new HashMap()).get("ExtendedDataObject"));
    }
  }
  /**
   @deprecated
   */
  public ExtendedDataObjectDataList getExtendedDataObjectDataList() {
    return ExtendedDataObjectHelper.fromMapList(outputMap, "ExtendedDataList");
  }
  /**
   @deprecated
   */
  public ExtendedDataObjectData getExtendedDataObjectData() {
    return ExtendedDataObjectHelper.fromMap(outputMap, "ExtendedDataAssociation");
  }
}
