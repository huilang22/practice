/*
 * Generated code DO NOT EDIT
 * Generated file: TechnicianRequest.java
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

import com.csgsystems.we.data.*;
public final class TechnicianRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public TechnicianRequest (String request, TechnicianRequestMethod method) {
    initialize(request, "Technician", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (TechnicianRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setTechnicianForTechnicianCreate(TechnicianObjectData data) {
    if (data != null) {
      addInput("Technician", TechnicianObjectHelper.toMap(data, new HashMap(), "Technician").get("Technician"));
    }
  }
  public void setTechnicianForTechnicianFind(TechnicianObjectFilter data) {
    if (data != null) {
      addInput("Technician", TechnicianObjectHelper.toMap(data, new HashMap(), "Technician").get("Technician"));
    }
  }
  public void setTechnicianForTechnicianGet(TechnicianObjectKeyData data) {
    if (data != null) {
      addInput("Technician", TechnicianObjectKeyHelper.toMap(data, new HashMap(), "Technician").get("Technician"));
    }
  }
  public void setTechnicianForTechnicianUpdate(TechnicianObjectData data) {
    if (data != null) {
      addInput("Technician", TechnicianObjectHelper.toMap(data, new HashMap(), "Technician").get("Technician"));
    }
  }
  public TechnicianObjectData getTechnicianObjectDataTechnicianFromTechnicianCreate() {
    return TechnicianObjectHelper.fromMap(outputMap, "Technician");
  }
  public TechnicianObjectDataList getTechnicianObjectDataTechnicianFromTechnicianFind() {
    return TechnicianObjectHelper.fromMapList(outputMap, "TechnicianList");
  }
  public TechnicianObjectData getTechnicianObjectDataTechnicianFromTechnicianGet() {
    return TechnicianObjectHelper.fromMap(outputMap, "Technician");
  }
  public TechnicianObjectData getTechnicianObjectDataTechnicianFromTechnicianUpdate() {
    return TechnicianObjectHelper.fromMap(outputMap, "Technician");
  }
  /**
   @deprecated
   */
  public void setTechnicianObjectFilter(TechnicianObjectFilter data) {
    if (data != null) {
      addInput("Technician", TechnicianObjectHelper.toMap(data, new HashMap()).get("TechnicianObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTechnicianObjectData(TechnicianObjectData data) {
    if (data != null) {
      addInput("Technician", TechnicianObjectHelper.toMap(data, new HashMap()).get("TechnicianObject"));
    }
  }
  /**
   @deprecated
   */
  public void setTechnicianObjectKeyData(TechnicianObjectKeyData data) {
    if (data != null) {
      addInput("Technician", TechnicianObjectKeyHelper.toMap(data, new HashMap()).get("TechnicianObject"));
    }
  }
  /**
   @deprecated
   */
  public TechnicianObjectDataList getTechnicianObjectDataList() {
    return TechnicianObjectHelper.fromMapList(outputMap, "TechnicianList");
  }
  /**
   @deprecated
   */
  public TechnicianObjectData getTechnicianObjectData() {
    return TechnicianObjectHelper.fromMap(outputMap, "Technician");
  }
}
