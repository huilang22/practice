/*
 * Generated code DO NOT EDIT
 * Generated file: JobResourcesRequest.java
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
public final class JobResourcesRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public JobResourcesRequest (String request, JobResourcesRequestMethod method) {
    initialize(request, "JobResources", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (JobResourcesRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setJobResourcesForJobResourcesCreate(JobResourcesObjectData data) {
    if (data != null) {
      addInput("JobResources", JobResourcesObjectHelper.toMap(data, new HashMap(), "JobResources").get("JobResources"));
    }
  }
  public void setJobResourcesForJobResourcesFind(JobResourcesObjectFilter data) {
    if (data != null) {
      addInput("JobResources", JobResourcesObjectHelper.toMap(data, new HashMap(), "JobResources").get("JobResources"));
    }
  }
  public void setJobResourcesForJobResourcesGet(JobResourcesObjectKeyData data) {
    if (data != null) {
      addInput("JobResources", JobResourcesObjectKeyHelper.toMap(data, new HashMap(), "JobResources").get("JobResources"));
    }
  }
  public void setJobResourcesForJobResourcesUpdate(JobResourcesObjectData data) {
    if (data != null) {
      addInput("JobResources", JobResourcesObjectHelper.toMap(data, new HashMap(), "JobResources").get("JobResources"));
    }
  }
  public JobResourcesObjectData getJobResourcesObjectDataJobResourcesFromJobResourcesCreate() {
    return JobResourcesObjectHelper.fromMap(outputMap, "JobResources");
  }
  public JobResourcesObjectDataList getJobResourcesObjectDataJobResourcesFromJobResourcesFind() {
    return JobResourcesObjectHelper.fromMapList(outputMap, "JobResourcesList");
  }
  public JobResourcesObjectData getJobResourcesObjectDataJobResourcesFromJobResourcesGet() {
    return JobResourcesObjectHelper.fromMap(outputMap, "JobResources");
  }
  public JobResourcesObjectData getJobResourcesObjectDataJobResourcesFromJobResourcesUpdate() {
    return JobResourcesObjectHelper.fromMap(outputMap, "JobResources");
  }
  /**
   @deprecated
   */
  public void setJobResourcesObjectFilter(JobResourcesObjectFilter data) {
    if (data != null) {
      addInput("JobResources", JobResourcesObjectHelper.toMap(data, new HashMap()).get("JobResourcesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setJobResourcesObjectData(JobResourcesObjectData data) {
    if (data != null) {
      addInput("JobResources", JobResourcesObjectHelper.toMap(data, new HashMap()).get("JobResourcesObject"));
    }
  }
  /**
   @deprecated
   */
  public void setJobResourcesObjectKeyData(JobResourcesObjectKeyData data) {
    if (data != null) {
      addInput("JobResources", JobResourcesObjectKeyHelper.toMap(data, new HashMap()).get("JobResourcesObject"));
    }
  }
  /**
   @deprecated
   */
  public JobResourcesObjectDataList getJobResourcesObjectDataList() {
    return JobResourcesObjectHelper.fromMapList(outputMap, "JobResourcesList");
  }
  /**
   @deprecated
   */
  public JobResourcesObjectData getJobResourcesObjectData() {
    return JobResourcesObjectHelper.fromMap(outputMap, "JobResources");
  }
}
