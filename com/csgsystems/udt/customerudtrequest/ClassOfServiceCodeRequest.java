/*
 * Generated code DO NOT EDIT
 * Generated file: ClassOfServiceCodeRequest.java
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

import com.csgsystems.cf.data.*;
public final class ClassOfServiceCodeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ClassOfServiceCodeRequest (String request, ClassOfServiceCodeRequestMethod method) {
    initialize(request, "ClassOfServiceCode", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ClassOfServiceCodeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setClassOfServiceCodeForClassOfServiceCodeCreate(COSCObjectData data) {
    if (data != null) {
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(data, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }
  public void setClassOfServiceCodeForClassOfServiceCodeDelete(COSCObjectKeyData data) {
    if (data != null) {
      addInput("ClassOfServiceCode", COSCObjectKeyHelper.toMap(data, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }
  public void setClassOfServiceCodeForClassOfServiceCodeFind(COSCObjectFilter data) {
    if (data != null) {
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(data, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }
  public void setClassOfServiceCodeForClassOfServiceCodeGet(COSCObjectKeyData data) {
    if (data != null) {
      addInput("ClassOfServiceCode", COSCObjectKeyHelper.toMap(data, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }
  public void setClassOfServiceCodeForClassOfServiceCodeUpdate(COSCObjectData data) {
    if (data != null) {
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(data, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }
  public COSCObjectData getCOSCObjectDataClassOfServiceCodeFromClassOfServiceCodeCreate() {
    return COSCObjectHelper.fromMap(outputMap, "ClassOfServiceCode");
  }
  public COSCObjectData getCOSCObjectDataClassOfServiceCodeFromClassOfServiceCodeDelete() {
    return COSCObjectHelper.fromMap(outputMap, "ClassOfServiceCode");
  }
  public COSCObjectDataList getCOSCObjectDataClassOfServiceCodeFromClassOfServiceCodeFind() {
    return COSCObjectHelper.fromMapList(outputMap, "ClassOfServiceCodeList");
  }
  public COSCObjectData getCOSCObjectDataClassOfServiceCodeFromClassOfServiceCodeGet() {
    return COSCObjectHelper.fromMap(outputMap, "ClassOfServiceCode");
  }
  public COSCObjectData getCOSCObjectDataClassOfServiceCodeFromClassOfServiceCodeUpdate() {
    return COSCObjectHelper.fromMap(outputMap, "ClassOfServiceCode");
  }
  /**
   @deprecated
   */
  public void setCOSCObjectFilter(COSCObjectFilter data) {
    if (data != null) {
      addInput("COSC", COSCObjectHelper.toMap(data, new HashMap()).get("COSCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCOSCObjectData(COSCObjectData data) {
    if (data != null) {
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(data, new HashMap()).get("COSCObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCOSCObjectKeyData(COSCObjectKeyData data) {
    if (data != null) {
      addInput("ClassOfServiceCode", COSCObjectKeyHelper.toMap(data, new HashMap()).get("COSCObject"));
    }
  }
  /**
   @deprecated
   */
  public COSCObjectDataList getCOSCObjectDataList() {
    return COSCObjectHelper.fromMapList(outputMap, "COSCList");
  }
  /**
   @deprecated
   */
  public COSCObjectData getCOSCObjectData() {
    return COSCObjectHelper.fromMap(outputMap, "ClassOfServiceCode");
  }
}
