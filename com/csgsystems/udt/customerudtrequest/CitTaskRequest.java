/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskRequest.java
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

import com.csgsystems.cit.data.*;
public final class CitTaskRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public CitTaskRequest (String request, CitTaskRequestMethod method) {
    initialize(request, "CitTask", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (CitTaskRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setCitTaskForCitTaskCreate(CitTaskObjectBaseData data) {
    if (data != null) {
      addInput("CitTask", CitTaskObjectBaseHelper.toMap(data, new HashMap(), "CitTask").get("CitTask"));
    }
  }
  public void setCitTaskForCitTaskDelete(CitTaskObjectBaseKeyData data) {
    if (data != null) {
      addInput("CitTask", CitTaskObjectBaseKeyHelper.toMap(data, new HashMap(), "CitTask").get("CitTask"));
    }
  }
  public void setCitTaskForCitTaskFindByUser(CitTaskObjectFilter data) {
    if (data != null) {
      addInput("CitTask", CitTaskObjectHelper.toMap(data, new HashMap(), "CitTask").get("CitTask"));
    }
  }
  public void setLoginIdForCitTaskFindByUser(String data) {
    if (data != null) {
      addInput("LoginId", data);
    }
  }
  public void setCitTaskForCitTaskFind(CitTaskObjectFilter data) {
    if (data != null) {
      addInput("CitTask", CitTaskObjectHelper.toMap(data, new HashMap(), "CitTask").get("CitTask"));
    }
  }
  public void setCitTaskForCitTaskFindForInvalidUser(CitTaskObjectFilter data) {
    if (data != null) {
      addInput("CitTask", CitTaskObjectHelper.toMap(data, new HashMap(), "CitTask").get("CitTask"));
    }
  }
  public void setCitTaskForCitTaskGet(CitTaskObjectBaseKeyData data) {
    if (data != null) {
      addInput("CitTask", CitTaskObjectBaseKeyHelper.toMap(data, new HashMap(), "CitTask").get("CitTask"));
    }
  }
  public void setCitTaskForCitTaskUpdate(CitTaskObjectBaseData data) {
    if (data != null) {
      addInput("CitTask", CitTaskObjectBaseHelper.toMap(data, new HashMap(), "CitTask").get("CitTask"));
    }
  }
  public CitTaskObjectBaseData getCitTaskObjectBaseDataCitTaskFromCitTaskCreate() {
    return CitTaskObjectBaseHelper.fromMap(outputMap, "CitTask");
  }
  public CitTaskObjectBaseData getCitTaskObjectBaseDataCitTaskFromCitTaskDelete() {
    return CitTaskObjectBaseHelper.fromMap(outputMap, "CitTask");
  }
  public CitTaskObjectDataList getCitTaskObjectDataCitTaskFromCitTaskFindByUser() {
    return CitTaskObjectHelper.fromMapList(outputMap, "CitTaskList");
  }
  public CitTaskObjectDataList getCitTaskObjectDataCitTaskFromCitTaskFind() {
    return CitTaskObjectHelper.fromMapList(outputMap, "CitTaskList");
  }
  public CitTaskObjectDataList getCitTaskObjectDataCitTaskFromCitTaskFindForInvalidUser() {
    return CitTaskObjectHelper.fromMapList(outputMap, "CitTaskList");
  }
  public CitTaskObjectData getCitTaskObjectDataCitTaskFromCitTaskGet() {
    return CitTaskObjectHelper.fromMap(outputMap, "CitTask");
  }
  public CitTaskObjectBaseKeyData getCitTaskObjectBaseKeyDataCitTaskFromCitTaskSequenceGet() {
    return CitTaskObjectBaseKeyHelper.fromMap(outputMap, "CitTask");
  }
  public CitTaskObjectBaseData getCitTaskObjectBaseDataCitTaskFromCitTaskUpdate() {
    return CitTaskObjectBaseHelper.fromMap(outputMap, "CitTask");
  }
  /**
   @deprecated
   */
  public void setCitTaskObjectFilter(CitTaskObjectFilter data) {
    if (data != null) {
      addInput("CitTask", CitTaskObjectHelper.toMap(data, new HashMap()).get("CitTaskObject"));
    }
  }
  /**
   @deprecated
   */
  public CitTaskObjectDataList getCitTaskObjectDataList() {
    return CitTaskObjectHelper.fromMapList(outputMap, "CitTaskList");
  }
  /**
   @deprecated
   */
  public CitTaskObjectData getCitTaskObjectData() {
    return CitTaskObjectHelper.fromMap(outputMap, "CitTask");
  }
  /**
   @deprecated
   */
  public void setCitTaskObjectBaseData(CitTaskObjectBaseData data) {
    if (data != null) {
      addInput("CitTask", CitTaskObjectBaseHelper.toMap(data, new HashMap()).get("CitTaskObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setCitTaskObjectBaseKeyData(CitTaskObjectBaseKeyData data) {
    if (data != null) {
      addInput("CitTask", CitTaskObjectBaseKeyHelper.toMap(data, new HashMap()).get("CitTaskObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public CitTaskObjectBaseKeyData getCitTaskObjectBaseKeyData() {
    return CitTaskObjectBaseKeyHelper.fromMap(outputMap, "CitTask");
  }
  /**
   @deprecated
   */
  public CitTaskObjectBaseData getCitTaskObjectBaseData() {
    return CitTaskObjectBaseHelper.fromMap(outputMap, "CitTask");
  }
  /**
   @deprecated
   */
  public void setLoginId(String data) {
    if (data != null) {
      addInput("LoginId", data);
    }
  }
}
