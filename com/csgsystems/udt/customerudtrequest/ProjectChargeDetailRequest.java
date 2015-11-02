/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectChargeDetailRequest.java
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

import com.csgsystems.om.data.*;
public final class ProjectChargeDetailRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProjectChargeDetailRequest (String request, ProjectChargeDetailRequestMethod method) {
    initialize(request, "ProjectChargeDetail", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProjectChargeDetailRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setProjectChargeDetailForProjectChargeDetailFind(ProjectChargeDetailObjectFilter data) {
    if (data != null) {
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectHelper.toMap(data, new HashMap(), "ProjectChargeDetail").get("ProjectChargeDetail"));
    }
  }
  public void setProjectChargeDetailForProjectChargeDetailGet(ProjectChargeDetailObjectKeyData data) {
    if (data != null) {
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectKeyHelper.toMap(data, new HashMap(), "ProjectChargeDetail").get("ProjectChargeDetail"));
    }
  }
  public void setProjectChargeDetailForProjectChargeDetailUpdate(ProjectChargeDetailObjectData data) {
    if (data != null) {
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectHelper.toMap(data, new HashMap(), "ProjectChargeDetail").get("ProjectChargeDetail"));
    }
  }
  public ProjectChargeDetailObjectDataList getProjectChargeDetailObjectDataProjectChargeDetailFromProjectChargeDetailFind() {
    return ProjectChargeDetailObjectHelper.fromMapList(outputMap, "ProjectChargeDetailList");
  }
  public ProjectChargeDetailObjectData getProjectChargeDetailObjectDataProjectChargeDetailFromProjectChargeDetailGet() {
    return ProjectChargeDetailObjectHelper.fromMap(outputMap, "ProjectChargeDetail");
  }
  public ProjectChargeDetailObjectData getProjectChargeDetailObjectDataProjectChargeDetailFromProjectChargeDetailUpdate() {
    return ProjectChargeDetailObjectHelper.fromMap(outputMap, "ProjectChargeDetail");
  }
  /**
   @deprecated
   */
  public void setProjectChargeDetailObjectFilter(ProjectChargeDetailObjectFilter data) {
    if (data != null) {
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectHelper.toMap(data, new HashMap()).get("ProjectChargeDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProjectChargeDetailObjectData(ProjectChargeDetailObjectData data) {
    if (data != null) {
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectHelper.toMap(data, new HashMap()).get("ProjectChargeDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProjectChargeDetailObjectKeyData(ProjectChargeDetailObjectKeyData data) {
    if (data != null) {
      addInput("ProjectChargeDetail", ProjectChargeDetailObjectKeyHelper.toMap(data, new HashMap()).get("ProjectChargeDetailObject"));
    }
  }
  /**
   @deprecated
   */
  public ProjectChargeDetailObjectDataList getProjectChargeDetailObjectDataList() {
    return ProjectChargeDetailObjectHelper.fromMapList(outputMap, "ProjectChargeDetailList");
  }
  /**
   @deprecated
   */
  public ProjectChargeDetailObjectData getProjectChargeDetailObjectData() {
    return ProjectChargeDetailObjectHelper.fromMap(outputMap, "ProjectChargeDetail");
  }
}
