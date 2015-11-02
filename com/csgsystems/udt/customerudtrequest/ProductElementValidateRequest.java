/*
 * Generated code DO NOT EDIT
 * Generated file: ProductElementValidateRequest.java
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
import com.csgsystems.om.data.*;
public final class ProductElementValidateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProductElementValidateRequest (String request, ProductElementValidateRequestMethod method) {
    initialize(request, "ProductElementValidate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProductElementValidateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setProductElementValidateForProductElementValidateCreate(ProductElementObjectData data) {
    if (data != null) {
      addInput("ProductElementValidate", ProductElementObjectHelper.toMap(data, new HashMap(), "ProductElementValidate").get("ProductElementValidate"));
    }
  }
  public void setServiceInternalIdForProductElementValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForProductElementValidateCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public ProductElementObjectData getProductElementObjectDataProductElementValidateFromProductElementValidateCreate() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElementValidate");
  }
  /**
   @deprecated
   */
  public void setProductElementObjectData(ProductElementObjectData data) {
    if (data != null) {
      addInput("ProductElementValidate", ProductElementObjectHelper.toMap(data, new HashMap()).get("ProductElementObject"));
    }
  }
  /**
   @deprecated
   */
  public ProductElementObjectData getProductElementObjectData() {
    return ProductElementObjectHelper.fromMap(outputMap, "ProductElementValidate");
  }
  /**
   @deprecated
   */
  public void setServiceInternalId(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceInternalIdResets(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
}
