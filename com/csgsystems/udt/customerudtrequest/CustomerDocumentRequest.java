/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerDocumentRequest.java
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
public final class CustomerDocumentRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CustomerDocumentRequest (String request, CustomerDocumentRequestMethod method) {
    initialize(request, "CustomerDocument", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CustomerDocumentRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCustomerDocumentForCustomerDocumentCreate(CustomerDocumentObjectData data) {
    if (data != null) {
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(data, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }
  public void setCustomerDocumentForCustomerDocumentDelete(CustomerDocumentObjectData data) {
    if (data != null) {
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(data, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }
  public void setCustomerDocumentForCustomerDocumentFind(CustomerDocumentObjectFilter data) {
    if (data != null) {
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(data, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }
  public void setCustomerDocumentForCustomerDocumentGet(CustomerDocumentObjectKeyData data) {
    if (data != null) {
      addInput("CustomerDocument", CustomerDocumentObjectKeyHelper.toMap(data, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }
  public void setCustomerDocumentForCustomerDocumentUpdate(CustomerDocumentObjectData data) {
    if (data != null) {
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(data, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }
  public CustomerDocumentObjectData getCustomerDocumentObjectDataCustomerDocumentFromCustomerDocumentCreate() {
    return CustomerDocumentObjectHelper.fromMap(outputMap, "CustomerDocument");
  }
  public CustomerDocumentObjectData getCustomerDocumentObjectDataCustomerDocumentFromCustomerDocumentDelete() {
    return CustomerDocumentObjectHelper.fromMap(outputMap, "CustomerDocument");
  }
  public CustomerDocumentObjectDataList getCustomerDocumentObjectDataCustomerDocumentFromCustomerDocumentFind() {
    return CustomerDocumentObjectHelper.fromMapList(outputMap, "CustomerDocumentList");
  }
  public CustomerDocumentObjectData getCustomerDocumentObjectDataCustomerDocumentFromCustomerDocumentGet() {
    return CustomerDocumentObjectHelper.fromMap(outputMap, "CustomerDocument");
  }
  public CustomerDocumentObjectData getCustomerDocumentObjectDataCustomerDocumentFromCustomerDocumentUpdate() {
    return CustomerDocumentObjectHelper.fromMap(outputMap, "CustomerDocument");
  }
  /**
   @deprecated
   */
  public void setCustomerDocumentObjectFilter(CustomerDocumentObjectFilter data) {
    if (data != null) {
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(data, new HashMap()).get("CustomerDocumentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCustomerDocumentObjectData(CustomerDocumentObjectData data) {
    if (data != null) {
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(data, new HashMap()).get("CustomerDocumentObject"));
    }
  }
  /**
   @deprecated
   */
  public void setCustomerDocumentObjectKeyData(CustomerDocumentObjectKeyData data) {
    if (data != null) {
      addInput("CustomerDocument", CustomerDocumentObjectKeyHelper.toMap(data, new HashMap()).get("CustomerDocumentObject"));
    }
  }
  /**
   @deprecated
   */
  public CustomerDocumentObjectDataList getCustomerDocumentObjectDataList() {
    return CustomerDocumentObjectHelper.fromMapList(outputMap, "CustomerDocumentList");
  }
  /**
   @deprecated
   */
  public CustomerDocumentObjectData getCustomerDocumentObjectData() {
    return CustomerDocumentObjectHelper.fromMap(outputMap, "CustomerDocument");
  }
}
