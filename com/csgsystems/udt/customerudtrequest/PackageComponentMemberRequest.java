/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberRequest.java
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
public final class PackageComponentMemberRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public PackageComponentMemberRequest (String request, PackageComponentMemberRequestMethod method) {
    initialize(request, "PackageComponentMember", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (PackageComponentMemberRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setPackageComponentMemberForPackageComponentMemberCreate(PCMObjectData data) {
    if (data != null) {
      addInput("PackageComponentMember", PCMObjectHelper.toMap(data, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
  public void setPackageComponentMemberForPackageComponentMemberDelete(PCMObjectKeyData data) {
    if (data != null) {
      addInput("PackageComponentMember", PCMObjectKeyHelper.toMap(data, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
  public void setPackageComponentMemberForPackageComponentMemberFindPC(PCPCMObjectFilter data) {
    if (data != null) {
      addInput("PackageComponentMember", PCPCMObjectHelper.toMap(data, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
  public void setPackageComponentMemberForPackageComponentMemberFind(PCMObjectFilter data) {
    if (data != null) {
      addInput("PackageComponentMember", PCMObjectHelper.toMap(data, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
  public void setPackageComponentMemberForPackageComponentMemberGetPC(PCPCMObjectKeyData data) {
    if (data != null) {
      addInput("PackageComponentMember", PCPCMObjectKeyHelper.toMap(data, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
  public void setPackageComponentMemberForPackageComponentMemberGet(PCMObjectKeyData data) {
    if (data != null) {
      addInput("PackageComponentMember", PCMObjectKeyHelper.toMap(data, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
  public void setPCMUpdateFilterForPackageComponentMemberUpdate(PCMObjectFilter data) {
    if (data != null) {
      addInput("PCMUpdateFilter", PCMObjectHelper.toMap(data, new HashMap(), "PCMUpdateFilter").get("PCMUpdateFilter"));
    }
  }
  public void setPCMUpdateGetForPackageComponentMemberUpdate(PCMObjectData data) {
    if (data != null) {
      addInput("PCMUpdateGet", PCMObjectHelper.toMap(data, new HashMap(), "PCMUpdateGet").get("PCMUpdateGet"));
    }
  }
  public void setPackageComponentMemberForPackageComponentMemberUpdate(PCMObjectData data) {
    if (data != null) {
      addInput("PackageComponentMember", PCMObjectHelper.toMap(data, new HashMap(), "PackageComponentMember").get("PackageComponentMember"));
    }
  }
  public PCMObjectData getPCMObjectDataPackageComponentMemberFromPackageComponentMemberCreate() {
    return PCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
  public PCMObjectData getPCMObjectDataPackageComponentMemberFromPackageComponentMemberDelete() {
    return PCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
  public PCPCMObjectDataList getPCPCMObjectDataPackageComponentMemberFromPackageComponentMemberFindPC() {
    return PCPCMObjectHelper.fromMapList(outputMap, "PackageComponentMemberList");
  }
  public PCMObjectDataList getPCMObjectDataPackageComponentMemberFromPackageComponentMemberFind() {
    return PCMObjectHelper.fromMapList(outputMap, "PackageComponentMemberList");
  }
  public PCPCMObjectData getPCPCMObjectDataPackageComponentMemberFromPackageComponentMemberGetPC() {
    return PCPCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
  public PCMObjectData getPCMObjectDataPackageComponentMemberFromPackageComponentMemberGet() {
    return PCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
  public PCMObjectData getPCMObjectDataPackageComponentMemberFromPackageComponentMemberUpdate() {
    return PCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
  /**
   @deprecated
   */
  public void setPCMObjectFilter(PCMObjectFilter data) {
    if (data != null) {
      addInput("PCM", PCMObjectHelper.toMap(data, new HashMap()).get("PCMObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPCMObjectData(PCMObjectData data) {
    if (data != null) {
      addInput("PCM", PCMObjectHelper.toMap(data, new HashMap()).get("PCMObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPCMObjectKeyData(PCMObjectKeyData data) {
    if (data != null) {
      addInput("PackageComponentMember", PCMObjectKeyHelper.toMap(data, new HashMap()).get("PCMObject"));
    }
  }
  /**
   @deprecated
   */
  public PCMObjectDataList getPCMObjectDataList() {
    return PCMObjectHelper.fromMapList(outputMap, "PCMList");
  }
  /**
   @deprecated
   */
  public PCMObjectData getPCMObjectData() {
    return PCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
  /**
   @deprecated
   */
  public void setPCPCMObjectFilter(PCPCMObjectFilter data) {
    if (data != null) {
      addInput("PCPCM", PCPCMObjectHelper.toMap(data, new HashMap()).get("PCPCMObject"));
    }
  }
  /**
   @deprecated
   */
  public void setPCPCMObjectKeyData(PCPCMObjectKeyData data) {
    if (data != null) {
      addInput("PackageComponentMember", PCPCMObjectKeyHelper.toMap(data, new HashMap()).get("PCPCMObject"));
    }
  }
  /**
   @deprecated
   */
  public PCPCMObjectDataList getPCPCMObjectDataList() {
    return PCPCMObjectHelper.fromMapList(outputMap, "PCPCMList");
  }
  /**
   @deprecated
   */
  public PCPCMObjectData getPCPCMObjectData() {
    return PCPCMObjectHelper.fromMap(outputMap, "PackageComponentMember");
  }
}
