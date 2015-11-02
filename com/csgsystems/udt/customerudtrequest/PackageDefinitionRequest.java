/*
 * Generated code DO NOT EDIT
 * Generated file: PackageDefinitionRequest.java
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
public final class PackageDefinitionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PackageDefinitionRequest (String request, PackageDefinitionRequestMethod method) {
    initialize(request, "PackageDefinition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PackageDefinitionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPackageDefinitionForPackageDefinitionCreate(PDObjectData data) {
    if (data != null) {
      addInput("PackageDefinition", PDObjectHelper.toMap(data, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }
  public void setPackageDefinitionForPackageDefinitionDelete(PDObjectKeyData data) {
    if (data != null) {
      addInput("PackageDefinition", PDObjectKeyHelper.toMap(data, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }
  public void setAccountInternalIdForPackageDefinitionFindByAccount(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setLanguageCodeForPackageDefinitionFindByAccount(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setAccountInternalIdForPackageDefinitionFindByComponentAccount(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setLanguageCodeForPackageDefinitionFindByComponentAccount(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setLanguageCodeForPackageDefinitionFindByComponentService(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setServiceInternalIdForPackageDefinitionFindByComponentService(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForPackageDefinitionFindByComponentService(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setPackageDefinitionForPackageDefinitionFind(PDObjectFilter data) {
    if (data != null) {
      addInput("PackageDefinition", PDObjectHelper.toMap(data, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }
  public void setPackageDefinitionForPackageDefinitionGet(PDObjectKeyData data) {
    if (data != null) {
      addInput("PackageDefinition", PDObjectKeyHelper.toMap(data, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }
  public void setPackageForPackageDefinitionPrice(PDObjectKeyData data) {
    if (data != null) {
      addInput("Package", PDObjectKeyHelper.toMap(data, new HashMap(), "Package").get("Package"));
    }
  }
  public void setRatingKeyForPackageDefinitionPrice(RatingKeyObjectData data) {
    if (data != null) {
      addInput("RatingKey", RatingKeyObjectHelper.toMap(data, new HashMap(), "RatingKey").get("RatingKey"));
    }
  }
  public void setPackageDefinitionForPackageDefinitionUpdate(PDObjectData data) {
    if (data != null) {
      addInput("PackageDefinition", PDObjectHelper.toMap(data, new HashMap(), "PackageDefinition").get("PackageDefinition"));
    }
  }
  public PDObjectData getPDObjectDataPackageDefinitionFromPackageDefinitionCreate() {
    return PDObjectHelper.fromMap(outputMap, "PackageDefinition");
  }
  public PDObjectData getPDObjectDataPackageDefinitionFromPackageDefinitionDelete() {
    return PDObjectHelper.fromMap(outputMap, "PackageDefinition");
  }
  public PDObjectDataList getPDObjectDataPackageDefinitionFromPackageDefinitionFindByAccount() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
  public PDObjectDataList getPDObjectDataPackageDefinitionFromPackageDefinitionFindByComponentAccount() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
  public PDObjectDataList getPDObjectDataPackageDefinitionFromPackageDefinitionFindByComponentService() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
  public PDObjectDataList getPDObjectDataPackageDefinitionFromPackageDefinitionFind() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
  public PDObjectData getPDObjectDataPackageDefinitionFromPackageDefinitionGet() {
    return PDObjectHelper.fromMap(outputMap, "PackageDefinition");
  }
  public BigInteger getBigIntegerPdPriceFromPackageDefinitionPrice() {
    return (BigInteger)outputMap.get("PdPrice");
  }
  public PDObjectData getPDObjectDataPackageDefinitionFromPackageDefinitionUpdate() {
    return PDObjectHelper.fromMap(outputMap, "PackageDefinition");
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
  public void setLanguageCode(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  /**
   @deprecated
   */
  public void setPDObjectFilter(PDObjectFilter data) {
    if (data != null) {
      addInput("PD", PDObjectHelper.toMap(data, new HashMap()).get("PDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPDObjectData(PDObjectData data) {
    if (data != null) {
      addInput("PackageDefinition", PDObjectHelper.toMap(data, new HashMap()).get("PDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPDObjectKeyData(PDObjectKeyData data) {
    if (data != null) {
      addInput("PD", PDObjectKeyHelper.toMap(data, new HashMap()).get("PDObject"));
    }
  }
  /**
   @deprecated
   */
  public PDObjectDataList getPDObjectDataList() {
    return PDObjectHelper.fromMapList(outputMap, "PDList");
  }
  /**
   @deprecated
   */
  public PDObjectData getPDObjectData() {
    return PDObjectHelper.fromMap(outputMap, "PackageDefinition");
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
  public BigInteger getPdPrice() {
    return (BigInteger)outputMap.get("PdPrice");
  }
}
