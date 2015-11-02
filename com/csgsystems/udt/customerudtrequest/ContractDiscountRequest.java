/*
 * Generated code DO NOT EDIT
 * Generated file: ContractDiscountRequest.java
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
public final class ContractDiscountRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ContractDiscountRequest (String request, ContractDiscountRequestMethod method) {
    initialize(request, "ContractDiscount", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ContractDiscountRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setContractDiscountForContractDiscountFind(ContractDiscountObjectFilter data) {
    if (data != null) {
      addInput("ContractDiscount", ContractDiscountObjectHelper.toMap(data, new HashMap(), "ContractDiscount").get("ContractDiscount"));
    }
  }
  public void setContractDiscountForContractDiscountGet(ContractDiscountObjectKeyData data) {
    if (data != null) {
      addInput("ContractDiscount", ContractDiscountObjectKeyHelper.toMap(data, new HashMap(), "ContractDiscount").get("ContractDiscount"));
    }
  }
  public ContractDiscountObjectDataList getContractDiscountObjectDataContractDiscountFromContractDiscountFind() {
    return ContractDiscountObjectHelper.fromMapList(outputMap, "ContractDiscountList");
  }
  public ContractDiscountObjectData getContractDiscountObjectDataContractDiscountFromContractDiscountGet() {
    return ContractDiscountObjectHelper.fromMap(outputMap, "ContractDiscount");
  }
  /**
   @deprecated
   */
  public void setContractDiscountObjectFilter(ContractDiscountObjectFilter data) {
    if (data != null) {
      addInput("ContractDiscount", ContractDiscountObjectHelper.toMap(data, new HashMap()).get("ContractDiscountObject"));
    }
  }
  /**
   @deprecated
   */
  public void setContractDiscountObjectKeyData(ContractDiscountObjectKeyData data) {
    if (data != null) {
      addInput("ContractDiscount", ContractDiscountObjectKeyHelper.toMap(data, new HashMap()).get("ContractDiscountObject"));
    }
  }
  /**
   @deprecated
   */
  public ContractDiscountObjectDataList getContractDiscountObjectDataList() {
    return ContractDiscountObjectHelper.fromMapList(outputMap, "ContractDiscountList");
  }
  /**
   @deprecated
   */
  public ContractDiscountObjectData getContractDiscountObjectData() {
    return ContractDiscountObjectHelper.fromMap(outputMap, "ContractDiscount");
  }
}
