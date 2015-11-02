/*
 * Generated code DO NOT EDIT
 * Generated file: LogRequest.java
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
public final class LogRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public LogRequest (String request, LogRequestMethod method) {
    initialize(request, "Log", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (LogRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setLogForLogFileFind(LogfileObjectKeyData data) {
    if (data != null) {
      addInput("Log", LogfileObjectKeyHelper.toMap(data, new HashMap(), "Log").get("Log"));
    }
  }
  public void setLogForLogFind(LogfileObjectData data) {
    if (data != null) {
      addInput("Log", LogfileObjectHelper.toMap(data, new HashMap(), "Log").get("Log"));
    }
  }
  public void setLogCriteriaForLogGenerate(LogCriteriaObjectData data) {
    if (data != null) {
      addInput("LogCriteria", LogCriteriaObjectHelper.toMap(data, new HashMap(), "LogCriteria").get("LogCriteria"));
    }
  }
  public String[] getStringLineFromLogFileFind() {
    return (String[])outputMap.get("Line");
  }
  public LogfileObjectDataList getLogfileObjectDataLogFromLogFind() {
    return LogfileObjectHelper.fromMapList(outputMap, "LogList");
  }
  public LogGenerateOutputData getLogGenerateOutputDataLogGenerateOutputDataFromLogGenerate() {
    return LogGenerateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setLogCriteriaObjectData(LogCriteriaObjectData data) {
    if (data != null) {
      addInput("LogCriteria", LogCriteriaObjectHelper.toMap(data, new HashMap()).get("LogCriteriaObject"));
    }
  }
  /**
   @deprecated
   */
  public LogGenerateOutputData getLogGenerateOutputData() {
    return LogGenerateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setLogfileObjectData(LogfileObjectData data) {
    if (data != null) {
      addInput("Log", LogfileObjectHelper.toMap(data, new HashMap()).get("LogfileObject"));
    }
  }
  /**
   @deprecated
   */
  public void setLogfileObjectKeyData(LogfileObjectKeyData data) {
    if (data != null) {
      addInput("Log", LogfileObjectKeyHelper.toMap(data, new HashMap()).get("LogfileObject"));
    }
  }
  /**
   @deprecated
   */
  public LogfileObjectDataList getLogfileObjectDataList() {
    return LogfileObjectHelper.fromMapList(outputMap, "LogList");
  }
  /**
   @deprecated
   */
  public String getLine() {
    return (String)outputMap.get("Line");
  }
}
