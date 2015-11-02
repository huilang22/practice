/*
 * Generated code DO NOT EDIT
 * Generated file: ProjectInstanceRequest.java
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
public final class ProjectInstanceRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ProjectInstanceRequest (String request, ProjectInstanceRequestMethod method) {
    initialize(request, "ProjectInstance", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ProjectInstanceRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setProjectInstanceForProjectInstanceCreate(ProjectInstanceObjectData data) {
    if (data != null) {
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(data, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }
  public void setProjectInstanceForProjectInstanceExtendedDataFind(ProjectInstanceObjectKeyData data) {
    if (data != null) {
      addInput("ProjectInstance", ProjectInstanceObjectKeyHelper.toMap(data, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }
  public void setProjectInstanceForProjectInstanceFind(ProjectInstanceObjectFilter data) {
    if (data != null) {
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(data, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }
  public void setProjectInstanceForProjectInstanceGet(ProjectInstanceObjectKeyData data) {
    if (data != null) {
      addInput("ProjectInstance", ProjectInstanceObjectKeyHelper.toMap(data, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }
  public void setProjectInstanceForProjectInstanceUpdate(ProjectInstanceObjectData data) {
    if (data != null) {
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(data, new HashMap(), "ProjectInstance").get("ProjectInstance"));
    }
  }
  public ProjectInstanceObjectData getProjectInstanceObjectDataProjectInstanceFromProjectInstanceCreate() {
    return ProjectInstanceObjectHelper.fromMap(outputMap, "ProjectInstance");
  }
  public ProjectInstanceEDObjectDataList getProjectInstanceEDObjectDataProjectInstanceExtendedDataFromProjectInstanceExtendedDataFind() {
    return ProjectInstanceEDObjectHelper.fromMapList(outputMap, "ProjectInstanceExtendedDataList");
  }
  public ProjectInstanceObjectDataList getProjectInstanceObjectDataProjectInstanceFromProjectInstanceFind() {
    return ProjectInstanceObjectHelper.fromMapList(outputMap, "ProjectInstanceList");
  }
  public ProjectInstanceObjectData getProjectInstanceObjectDataProjectInstanceFromProjectInstanceGet() {
    return ProjectInstanceObjectHelper.fromMap(outputMap, "ProjectInstance");
  }
  public ProjectInstanceObjectData getProjectInstanceObjectDataProjectInstanceFromProjectInstanceUpdate() {
    return ProjectInstanceObjectHelper.fromMap(outputMap, "ProjectInstance");
  }
  /**
   @deprecated
   */
  public ProjectInstanceEDObjectDataList getProjectInstanceEDObjectDataList() {
    return ProjectInstanceEDObjectHelper.fromMapList(outputMap, "ProjectInstanceList");
  }
  /**
   @deprecated
   */
  public void setProjectInstanceObjectFilter(ProjectInstanceObjectFilter data) {
    if (data != null) {
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(data, new HashMap()).get("ProjectInstanceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProjectInstanceObjectData(ProjectInstanceObjectData data) {
    if (data != null) {
      addInput("ProjectInstance", ProjectInstanceObjectHelper.toMap(data, new HashMap()).get("ProjectInstanceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setProjectInstanceObjectKeyData(ProjectInstanceObjectKeyData data) {
    if (data != null) {
      addInput("ProjectInstance", ProjectInstanceObjectKeyHelper.toMap(data, new HashMap()).get("ProjectInstanceObject"));
    }
  }
  /**
   @deprecated
   */
  public ProjectInstanceObjectDataList getProjectInstanceObjectDataList() {
    return ProjectInstanceObjectHelper.fromMapList(outputMap, "ProjectInstanceList");
  }
  /**
   @deprecated
   */
  public Map  getProjectInstanceObjectExtendedData() {
    return ProjectInstanceObjectHelper.fromMap(outputMap, "ProjectInstance").extendedData;
  }
  
  /**
   @deprecated
   */
  public ProjectInstanceObjectData getProjectInstanceObjectData() {
    return ProjectInstanceObjectHelper.fromMap(outputMap, "ProjectInstance");
  }
}
