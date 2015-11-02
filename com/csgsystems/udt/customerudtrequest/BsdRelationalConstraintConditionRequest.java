/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintConditionRequest.java
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
public final class BsdRelationalConstraintConditionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdRelationalConstraintConditionRequest (String request, BsdRelationalConstraintConditionRequestMethod method) {
    initialize(request, "BsdRelationalConstraintCondition", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdRelationalConstraintConditionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActionNameForBsdRelationalConstraintConditionActionFind(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  public void setApplicationNameForBsdRelationalConstraintConditionActionFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdRelationalConstraintConditionActionFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setEffectiveDateForBsdRelationalConstraintConditionActionFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setSourceObjectNameForBsdRelationalConstraintConditionActionFind(String data) {
    if (data != null) {
      addInput("SourceObjectName", data);
    }
  }
  public void setTargetObjectNameForBsdRelationalConstraintConditionActionFind(String data) {
    if (data != null) {
      addInput("TargetObjectName", data);
    }
  }
  public void setBsdRelationalConstraintConditionForBsdRelationalConstraintConditionCreate(BsdRelationalConstraintConditionObjectData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(data, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }
  public void setBsdRelationalConstraintConditionForBsdRelationalConstraintConditionDelete(BsdRelationalConstraintConditionObjectKeyData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectKeyHelper.toMap(data, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }
  public void setBsdRelationalConstraintConditionForBsdRelationalConstraintConditionFind(BsdRelationalConstraintConditionObjectFilter data) {
    if (data != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(data, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }
  public void setBsdRelationalConstraintConditionForBsdRelationalConstraintConditionGet(BsdRelationalConstraintConditionObjectKeyData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectKeyHelper.toMap(data, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }
  public void setBsdRelationalConstraintConditionForBsdRelationalConstraintConditionUpdate(BsdRelationalConstraintConditionObjectData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(data, new HashMap(), "BsdRelationalConstraintCondition").get("BsdRelationalConstraintCondition"));
    }
  }
  public BsdRelationalConstraintConditionDescObjectDataList getBsdRelationalConstraintConditionDescObjectDataBsdRelationalConstraintConditionFromBsdRelationalConstraintConditionActionFind() {
    return BsdRelationalConstraintConditionDescObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintConditionList");
  }
  public BsdRelationalConstraintConditionObjectData getBsdRelationalConstraintConditionObjectDataBsdRelationalConstraintConditionFromBsdRelationalConstraintConditionCreate() {
    return BsdRelationalConstraintConditionObjectHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
  public BsdRelationalConstraintConditionObjectData getBsdRelationalConstraintConditionObjectDataBsdRelationalConstraintConditionFromBsdRelationalConstraintConditionDelete() {
    return BsdRelationalConstraintConditionObjectHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
  public BsdRelationalConstraintConditionObjectDataList getBsdRelationalConstraintConditionObjectDataBsdRelationalConstraintConditionFromBsdRelationalConstraintConditionFind() {
    return BsdRelationalConstraintConditionObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintConditionList");
  }
  public BsdRelationalConstraintConditionObjectData getBsdRelationalConstraintConditionObjectDataBsdRelationalConstraintConditionFromBsdRelationalConstraintConditionGet() {
    return BsdRelationalConstraintConditionObjectHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
  public BsdRelationalConstraintConditionObjectKeyData getBsdRelationalConstraintConditionObjectKeyDataBsdRelationalConstraintConditionFromBsdRelationalConstraintConditionSequenceGet() {
    return BsdRelationalConstraintConditionObjectKeyHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
  public BsdRelationalConstraintConditionObjectData getBsdRelationalConstraintConditionObjectDataBsdRelationalConstraintConditionFromBsdRelationalConstraintConditionUpdate() {
    return BsdRelationalConstraintConditionObjectHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
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
  public BsdRelationalConstraintConditionDescObjectDataList getBsdRelationalConstraintConditionDescObjectDataList() {
    return BsdRelationalConstraintConditionDescObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintConditionList");
  }
  /**
   @deprecated
   */
  public void setBsdRelationalConstraintConditionObjectFilter(BsdRelationalConstraintConditionObjectFilter data) {
    if (data != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(data, new HashMap()).get("BsdRelationalConstraintConditionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdRelationalConstraintConditionObjectData(BsdRelationalConstraintConditionObjectData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectHelper.toMap(data, new HashMap()).get("BsdRelationalConstraintConditionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdRelationalConstraintConditionObjectKeyData(BsdRelationalConstraintConditionObjectKeyData data) {
    if (data != null) {
      addInput("BsdRelationalConstraintCondition", BsdRelationalConstraintConditionObjectKeyHelper.toMap(data, new HashMap()).get("BsdRelationalConstraintConditionObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdRelationalConstraintConditionObjectDataList getBsdRelationalConstraintConditionObjectDataList() {
    return BsdRelationalConstraintConditionObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintConditionList");
  }
  /**
   @deprecated
   */
  public BsdRelationalConstraintConditionObjectKeyData getBsdRelationalConstraintConditionObjectKeyData() {
    return BsdRelationalConstraintConditionObjectKeyHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
  /**
   @deprecated
   */
  public BsdRelationalConstraintConditionObjectData getBsdRelationalConstraintConditionObjectData() {
    return BsdRelationalConstraintConditionObjectHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
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
