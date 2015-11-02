/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationAttributeConstraintRequest.java
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

import com.csgsystems.utl.data.*;
public final class BsdApplicationAttributeConstraintRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdApplicationAttributeConstraintRequest (String request, BsdApplicationAttributeConstraintRequestMethod method) {
    initialize(request, "BsdApplicationAttributeConstraint", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdApplicationAttributeConstraintRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActionNameForBsdApplicationAttributeConstraintActionFind(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  public void setApplicationNameForBsdApplicationAttributeConstraintActionFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdApplicationAttributeConstraintActionFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setEffectiveDateForBsdApplicationAttributeConstraintActionFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setLanguageCodeForBsdApplicationAttributeConstraintActionFind(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setObjectNameForBsdApplicationAttributeConstraintActionFind(String data) {
    if (data != null) {
      addInput("ObjectName", data);
    }
  }
  public void setApplicationNameForBsdApplicationAttributeConstraintFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdApplicationAttributeConstraintFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setLanguageCodeForBsdApplicationAttributeConstraintFind(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setBsdApplicationAttributeConstraintForBsdApplicationAttributeConstraintGet(BsdApplicationAttributeConstraintObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationAttributeConstraint", BsdApplicationAttributeConstraintObjectKeyHelper.toMap(data, new HashMap(), "BsdApplicationAttributeConstraint").get("BsdApplicationAttributeConstraint"));
    }
  }
  public BsdApplicationAttributeConstraintObjectDataList getBsdApplicationAttributeConstraintObjectDataBsdApplicationAttributeConstraintFromBsdApplicationAttributeConstraintActionFind() {
    return BsdApplicationAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeConstraintList");
  }
  public BsdApplicationAttributeConstraintObjectDataList getBsdApplicationAttributeConstraintObjectDataBsdApplicationAttributeConstraintFromBsdApplicationAttributeConstraintFind() {
    return BsdApplicationAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeConstraintList");
  }
  public BsdApplicationAttributeConstraintObjectData getBsdApplicationAttributeConstraintObjectDataBsdApplicationAttributeConstraintFromBsdApplicationAttributeConstraintGet() {
    return BsdApplicationAttributeConstraintObjectHelper.fromMap(outputMap, "BsdApplicationAttributeConstraint");
  }
  /**
   @deprecated
   */
  public void setActionName(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  /**
   @deprecated
   */
  public void setApplicationName(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  /**
   @deprecated
   */
  public void setBsdApplicationAttributeConstraintObjectKeyData(BsdApplicationAttributeConstraintObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationAttributeConstraint", BsdApplicationAttributeConstraintObjectKeyHelper.toMap(data, new HashMap()).get("BsdApplicationAttributeConstraintObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdApplicationAttributeConstraintObjectDataList getBsdApplicationAttributeConstraintObjectDataList() {
    return BsdApplicationAttributeConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationAttributeConstraintList");
  }
  /**
   @deprecated
   */
  public BsdApplicationAttributeConstraintObjectData getBsdApplicationAttributeConstraintObjectData() {
    return BsdApplicationAttributeConstraintObjectHelper.fromMap(outputMap, "BsdApplicationAttributeConstraint");
  }
  /**
   @deprecated
   */
  public void setBusinessUnitName(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  /**
   @deprecated
   */
  public void setEffectiveDate(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
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
  public void setObjectName(String data) {
    if (data != null) {
      addInput("ObjectName", data);
    }
  }
}
