/*
 * Generated code DO NOT EDIT
 * Generated file: ContractTypeRequest.java
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
public final class ContractTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ContractTypeRequest (String request, ContractTypeRequestMethod method) {
    initialize(request, "ContractType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ContractTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setContractTypeForContractTypeCreate(ContractTypeObjectData data) {
    if (data != null) {
      addInput("ContractType", ContractTypeObjectHelper.toMap(data, new HashMap(), "ContractType").get("ContractType"));
    }
  }
  public void setAccountInternalIdForContractTypeFindByAccount(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setLanguageCodeForContractTypeFindByAccount(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setLanguageCodeForContractTypeFindByService(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setServiceInternalIdForContractTypeFindByService(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForContractTypeFindByService(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setContractTypeForContractTypeFind(ContractTypeObjectFilter data) {
    if (data != null) {
      addInput("ContractType", ContractTypeObjectHelper.toMap(data, new HashMap(), "ContractType").get("ContractType"));
    }
  }
  public void setContractTypeForContractTypeGet(ContractTypeObjectKeyData data) {
    if (data != null) {
      addInput("ContractType", ContractTypeObjectKeyHelper.toMap(data, new HashMap(), "ContractType").get("ContractType"));
    }
  }
  public void setContractTypeForContractTypePrice(ContractTypeObjectKeyData data) {
    if (data != null) {
      addInput("ContractType", ContractTypeObjectKeyHelper.toMap(data, new HashMap(), "ContractType").get("ContractType"));
    }
  }
  public void setRatingKeyForContractTypePrice(RatingKeyObjectData data) {
    if (data != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(data, new HashMap(), "RatingKey").get("RatingKey"));
    }
  }
  public void setContractTypeForContractTypeUpdate(ContractTypeObjectData data) {
    if (data != null) {
      addInput("ContractType", ContractTypeObjectHelper.toMap(data, new HashMap(), "ContractType").get("ContractType"));
    }
  }
  public ContractTypeObjectData getContractTypeObjectDataContractTypeFromContractTypeCreate() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractType");
  }
  public ContractTypeObjectDataList getContractTypeObjectDataContractTypeFromContractTypeFindByAccount() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
  public ContractTypeObjectDataList getContractTypeObjectDataContractTypeFromContractTypeFindByService() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
  public ContractTypeObjectDataList getContractTypeObjectDataContractTypeFromContractTypeFind() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
  public ContractTypeObjectData getContractTypeObjectDataContractTypeFromContractTypeGet() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractType");
  }
  public BigInteger getBigIntegerCtPriceFromContractTypePrice() {
    return (BigInteger)outputMap.get("CtPrice");
  }
  public ContractTypeObjectData getContractTypeObjectDataContractTypeFromContractTypeUpdate() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractType");
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setContractTypeObjectFilter(ContractTypeObjectFilter data) {
    if (data != null) {
      addInput("ContractType", ContractTypeObjectHelper.toMap(data, new HashMap()).get("ContractTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setContractTypeObjectData(ContractTypeObjectData data) {
    if (data != null) {
      addInput("ContractType", ContractTypeObjectHelper.toMap(data, new HashMap()).get("ContractTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public void setContractTypeObjectKeyData(ContractTypeObjectKeyData data) {
    if (data != null) {
      addInput("ContractType", ContractTypeObjectKeyHelper.toMap(data, new HashMap()).get("ContractTypeObject"));
    }
  }
  /**
   @deprecated
   */
  public ContractTypeObjectDataList getContractTypeObjectDataList() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
  /**
   @deprecated
   */
  public ContractTypeObjectData getContractTypeObjectData() {
    return ContractTypeObjectHelper.fromMap(outputMap, "ContractType");
  }
  /**
   @deprecated
   */
  public void setLanguageCode(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setRatingKeyObjectData(RatingKeyObjectData data) {
    if (data != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(data, new HashMap()).get("RatingKeyObject"));
    }
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
  /**
   @deprecated
   */
  public BigInteger getCtPrice() {
    return (BigInteger)outputMap.get("CtPrice");
  }
}
