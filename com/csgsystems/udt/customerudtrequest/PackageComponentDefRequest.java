/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentDefRequest.java
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
public final class PackageComponentDefRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PackageComponentDefRequest (String request, PackageComponentDefRequestMethod method) {
    initialize(request, "PackageComponentDef", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PackageComponentDefRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountInternalIdForPackageComponentDefFindByAccount(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setLanguageCodeForPackageComponentDefFindByAccount(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setLanguageCodeForPackageComponentDefFindByService(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setServiceInternalIdForPackageComponentDefFindByService(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForPackageComponentDefFindByService(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setPackageComponentDefForPackageComponentDefFind(PCDObjectFilter data) {
    if (data != null) {
      addInput("PackageComponentDef", PCDObjectHelper.toMap(data, new HashMap(), "PackageComponentDef").get("PackageComponentDef"));
    }
  }
  public void setPackageComponentDefForPackageComponentDefGet(PCDObjectKeyData data) {
    if (data != null) {
      addInput("PackageComponentDef", PCDObjectKeyHelper.toMap(data, new HashMap(), "PackageComponentDef").get("PackageComponentDef"));
    }
  }
  public PCDObjectDataList getPCDObjectDataPackageComponentDefFromPackageComponentDefFindByAccount() {
    return PCDObjectHelper.fromMapList(outputMap, "PackageComponentDefList");
  }
  public PCDObjectDataList getPCDObjectDataPackageComponentDefFromPackageComponentDefFindByService() {
    return PCDObjectHelper.fromMapList(outputMap, "PackageComponentDefList");
  }
  public PCDObjectDataList getPCDObjectDataPackageComponentDefFromPackageComponentDefFind() {
    return PCDObjectHelper.fromMapList(outputMap, "PackageComponentDefList");
  }
  public PCDObjectData getPCDObjectDataPackageComponentDefFromPackageComponentDefGet() {
    return PCDObjectHelper.fromMap(outputMap, "PackageComponentDef");
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
  public void setPCDObjectFilter(PCDObjectFilter data) {
    if (data != null) {
      addInput("PCD", PCDObjectHelper.toMap(data, new HashMap()).get("PCDObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPCDObjectKeyData(PCDObjectKeyData data) {
    if (data != null) {
      addInput("PackageComponentDef", PCDObjectKeyHelper.toMap(data, new HashMap()).get("PCDObject"));
    }
  }
  /**
   @deprecated
   */
  public PCDObjectDataList getPCDObjectDataList() {
    return PCDObjectHelper.fromMapList(outputMap, "PCDList");
  }
  /**
   @deprecated
   */
  public PCDObjectData getPCDObjectData() {
    return PCDObjectHelper.fromMap(outputMap, "PackageComponentDef");
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
