/*
 * Generated code DO NOT EDIT
 * Generated file: BillImageRequest.java
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
public final class BillImageRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BillImageRequest (String request, BillImageRequestMethod method) {
    initialize(request, "BillImage", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BillImageRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(BillImagePageRequest request, BillImageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(BillImagePageRequest request, BillImageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, BillImageRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, BillImageRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setBillImageForBillImageFind(BillImageObjectFilter data) {
    if (data != null) {
      addInput("BillImage", BillImageObjectHelper.toMap(data, new HashMap(), "BillImage").get("BillImage"));
    }
  }
  public void setBillImageForBillImageGet(BillImageObjectKeyData data) {
    if (data != null) {
      addInput("BillImage", BillImageObjectKeyHelper.toMap(data, new HashMap(), "BillImage").get("BillImage"));
    }
  }
  public BillImageObjectDataList getBillImageObjectDataBillImageFromBillImageFind() {
    return BillImageObjectHelper.fromMapList(outputMap, "BillImageList");
  }
  public BillImageObjectData getBillImageObjectDataBillImageFromBillImageGet() {
    return BillImageObjectHelper.fromMap(outputMap, "BillImage");
  }
  /**
   @deprecated
   */
  public void setBillImageObjectFilter(BillImageObjectFilter data) {
    if (data != null) {
      addInput("BillImage", BillImageObjectHelper.toMap(data, new HashMap()).get("BillImageObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBillImageObjectKeyData(BillImageObjectKeyData data) {
    if (data != null) {
      addInput("BillImage", BillImageObjectKeyHelper.toMap(data, new HashMap()).get("BillImageObject"));
    }
  }
  /**
   @deprecated
   */
  public BillImageObjectDataList getBillImageObjectDataList() {
    return BillImageObjectHelper.fromMapList(outputMap, "BillImageList");
  }
  /**
   @deprecated
   */
  public BillImageObjectData getBillImageObjectData() {
    return BillImageObjectHelper.fromMap(outputMap, "BillImage");
  }
}
