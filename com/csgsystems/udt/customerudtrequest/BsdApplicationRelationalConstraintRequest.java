/*
 * Generated code DO NOT EDIT
 * Generated file: BsdApplicationRelationalConstraintRequest.java
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
public final class BsdApplicationRelationalConstraintRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdApplicationRelationalConstraintRequest (String request, BsdApplicationRelationalConstraintRequestMethod method) {
    initialize(request, "BsdApplicationRelationalConstraint", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdApplicationRelationalConstraintRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActionNameForBsdApplicationRelationalConstraintActionFind(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  public void setApplicationNameForBsdApplicationRelationalConstraintActionFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdApplicationRelationalConstraintActionFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setEffectiveDateForBsdApplicationRelationalConstraintActionFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setLanguageCodeForBsdApplicationRelationalConstraintActionFind(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setSourceObjectNameForBsdApplicationRelationalConstraintActionFind(String data) {
    if (data != null) {
      addInput("SourceObjectName", data);
    }
  }
  public void setTargetObjectNameForBsdApplicationRelationalConstraintActionFind(String data) {
    if (data != null) {
      addInput("TargetObjectName", data);
    }
  }
  public void setApplicationNameForBsdApplicationRelationalConstraintFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdApplicationRelationalConstraintFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setLanguageCodeForBsdApplicationRelationalConstraintFind(Integer data) {
    if (data != null) {
      addInput("LanguageCode", data);
    }
  }
  public void setBsdApplicationRelationalConstraintForBsdApplicationRelationalConstraintGet(BsdApplicationRelationalConstraintObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationRelationalConstraint", BsdApplicationRelationalConstraintObjectKeyHelper.toMap(data, new HashMap(), "BsdApplicationRelationalConstraint").get("BsdApplicationRelationalConstraint"));
    }
  }
  public BsdApplicationRelationalConstraintObjectDataList getBsdApplicationRelationalConstraintObjectDataBsdApplicationRelationalConstraintFromBsdApplicationRelationalConstraintActionFind() {
    return BsdApplicationRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalConstraintList");
  }
  public BsdApplicationRelationalConstraintObjectDataList getBsdApplicationRelationalConstraintObjectDataBsdApplicationRelationalConstraintFromBsdApplicationRelationalConstraintFind() {
    return BsdApplicationRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalConstraintList");
  }
  public BsdApplicationRelationalConstraintObjectData getBsdApplicationRelationalConstraintObjectDataBsdApplicationRelationalConstraintFromBsdApplicationRelationalConstraintGet() {
    return BsdApplicationRelationalConstraintObjectHelper.fromMap(outputMap, "BsdApplicationRelationalConstraint");
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
  public void setBsdApplicationRelationalConstraintObjectKeyData(BsdApplicationRelationalConstraintObjectKeyData data) {
    if (data != null) {
      addInput("BsdApplicationRelationalConstraint", BsdApplicationRelationalConstraintObjectKeyHelper.toMap(data, new HashMap()).get("BsdApplicationRelationalConstraintObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdApplicationRelationalConstraintObjectDataList getBsdApplicationRelationalConstraintObjectDataList() {
    return BsdApplicationRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdApplicationRelationalConstraintList");
  }
  /**
   @deprecated
   */
  public BsdApplicationRelationalConstraintObjectData getBsdApplicationRelationalConstraintObjectData() {
    return BsdApplicationRelationalConstraintObjectHelper.fromMap(outputMap, "BsdApplicationRelationalConstraint");
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
  public void setSourceObjectName(String data) {
    if (data != null) {
      addInput("SourceObjectName", data);
    }
  }
  /**
   @deprecated
   */
  public void setTargetObjectName(String data) {
    if (data != null) {
      addInput("TargetObjectName", data);
    }
  }
}
