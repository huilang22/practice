/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintRequest.java
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
public final class BsdRelationalConstraintRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public BsdRelationalConstraintRequest (String request, BsdRelationalConstraintRequestMethod method) {
    initialize(request, "BsdRelationalConstraint", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (BsdRelationalConstraintRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setActionNameForBsdRelationalConstraintActionFind(String data) {
    if (data != null) {
      addInput("ActionName", data);
    }
  }
  public void setApplicationNameForBsdRelationalConstraintActionFind(String data) {
    if (data != null) {
      addInput("ApplicationName", data);
    }
  }
  public void setBusinessUnitNameForBsdRelationalConstraintActionFind(String data) {
    if (data != null) {
      addInput("BusinessUnitName", data);
    }
  }
  public void setEffectiveDateForBsdRelationalConstraintActionFind(Date data) {
    if (data != null) {
      addInput("EffectiveDate", data);
    }
  }
  public void setSourceObjectNameForBsdRelationalConstraintActionFind(String data) {
    if (data != null) {
      addInput("SourceObjectName", data);
    }
  }
  public void setTargetObjectNameForBsdRelationalConstraintActionFind(String data) {
    if (data != null) {
      addInput("TargetObjectName", data);
    }
  }
  public void setBsdRelationalConstraintForBsdRelationalConstraintCreate(BsdRelationalConstraintObjectBaseData data) {
    if (data != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseHelper.toMap(data, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
  public void setBsdRelationalConstraintForBsdRelationalConstraintDelete(BsdRelationalConstraintObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
  public void setBsdRelationalConstraintForBsdRelationalConstraintFind(BsdRelationalConstraintObjectFilter data) {
    if (data != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectHelper.toMap(data, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
  public void setBsdRelationalConstraintForBsdRelationalConstraintGet(BsdRelationalConstraintObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseKeyHelper.toMap(data, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
  public void setBsdRelationalConstraintForBsdRelationalConstraintUpdate(BsdRelationalConstraintObjectBaseData data) {
    if (data != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseHelper.toMap(data, new HashMap(), "BsdRelationalConstraint").get("BsdRelationalConstraint"));
    }
  }
  public BsdRelationalConstraintObjectDataList getBsdRelationalConstraintObjectDataBsdRelationalConstraintFromBsdRelationalConstraintActionFind() {
    return BsdRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintList");
  }
  public BsdRelationalConstraintObjectData getBsdRelationalConstraintObjectDataBsdRelationalConstraintFromBsdRelationalConstraintCreate() {
    return BsdRelationalConstraintObjectHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
  public BsdRelationalConstraintObjectBaseData getBsdRelationalConstraintObjectBaseDataBsdRelationalConstraintFromBsdRelationalConstraintDelete() {
    return BsdRelationalConstraintObjectBaseHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
  public BsdRelationalConstraintObjectDataList getBsdRelationalConstraintObjectDataBsdRelationalConstraintFromBsdRelationalConstraintFind() {
    return BsdRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintList");
  }
  public BsdRelationalConstraintObjectData getBsdRelationalConstraintObjectDataBsdRelationalConstraintFromBsdRelationalConstraintGet() {
    return BsdRelationalConstraintObjectHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
  public BsdRelationalConstraintObjectBaseKeyData getBsdRelationalConstraintObjectBaseKeyDataBsdRelationalConstraintFromBsdRelationalConstraintSequenceGet() {
    return BsdRelationalConstraintObjectBaseKeyHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
  public BsdRelationalConstraintObjectData getBsdRelationalConstraintObjectDataBsdRelationalConstraintFromBsdRelationalConstraintUpdate() {
    return BsdRelationalConstraintObjectHelper.fromMap(outputMap, "BsdRelationalConstraint");
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
  public void setBsdRelationalConstraintObjectFilter(BsdRelationalConstraintObjectFilter data) {
    if (data != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectHelper.toMap(data, new HashMap()).get("BsdRelationalConstraintObject"));
    }
  }
  /**
   @deprecated
   */
  public BsdRelationalConstraintObjectDataList getBsdRelationalConstraintObjectDataList() {
    return BsdRelationalConstraintObjectHelper.fromMapList(outputMap, "BsdRelationalConstraintList");
  }
  /**
   @deprecated
   */
  public BsdRelationalConstraintObjectData getBsdRelationalConstraintObjectData() {
    return BsdRelationalConstraintObjectHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
  /**
   @deprecated
   */
  public void setBsdRelationalConstraintObjectBaseData(BsdRelationalConstraintObjectBaseData data) {
    if (data != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseHelper.toMap(data, new HashMap()).get("BsdRelationalConstraintObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setBsdRelationalConstraintObjectBaseKeyData(BsdRelationalConstraintObjectBaseKeyData data) {
    if (data != null) {
      addInput("BsdRelationalConstraint", BsdRelationalConstraintObjectBaseKeyHelper.toMap(data, new HashMap()).get("BsdRelationalConstraintObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public BsdRelationalConstraintObjectBaseKeyData getBsdRelationalConstraintObjectBaseKeyData() {
    return BsdRelationalConstraintObjectBaseKeyHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
  /**
   @deprecated
   */
  public BsdRelationalConstraintObjectBaseData getBsdRelationalConstraintObjectBaseData() {
    return BsdRelationalConstraintObjectBaseHelper.fromMap(outputMap, "BsdRelationalConstraint");
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
