/*
 * Generated code DO NOT EDIT
 * Generated file: MIHSubscriberRequest.java
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
public final class MIHSubscriberRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public MIHSubscriberRequest (String request, MIHSubscriberRequestMethod method) {
    initialize(request, "MIHSubscriber", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (MIHSubscriberRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setMIHSubscriberForMIHSubscriberCreate(MIHSubscriberObjectData data) {
    if (data != null) {
      addInput("MIHSubscriber", MIHSubscriberObjectHelper.toMap(data, new HashMap(), "MIHSubscriber").get("MIHSubscriber"));
    }
  }
  public void setMsisdnForMIHSubscriberDelete(String data) {
    if (data != null) {
      addInput("Msisdn", data);
    }
  }
  public void setMsisdnForMIHSubscriberGet(String data) {
    if (data != null) {
      addInput("Msisdn", data);
    }
  }
  public void setMsisdnForMIHSubscriberSync(String data) {
    if (data != null) {
      addInput("Msisdn", data);
    }
  }
  public void setMIHSubscriberForMIHSubscriberUpdateCoses(MIHUpdateSubscriberObjectData data) {
    if (data != null) {
      addInput("MIHSubscriber", MIHUpdateSubscriberObjectHelper.toMap(data, new HashMap(), "MIHSubscriber").get("MIHSubscriber"));
    }
  }
  public void setMsisdnForMIHSubscriberUpdateCoses(String data) {
    if (data != null) {
      addInput("Msisdn", data);
    }
  }
  public Integer getIntegerOutputFromMIHSubscriberCreate() {
    return (Integer)outputMap.get("Output");
  }
  public Integer getIntegerOutputFromMIHSubscriberDelete() {
    return (Integer)outputMap.get("Output");
  }
  public MIHSubscriberGetOutputData getMIHSubscriberGetOutputDataMIHSubscriberGetOutputDataFromMIHSubscriberGet() {
    return MIHSubscriberGetOutputHelper.fromMap(outputMap);
  }
  public Integer getIntegerOutputFromMIHSubscriberSync() {
    return (Integer)outputMap.get("Output");
  }
  public Integer getIntegerOutputFromMIHSubscriberUpdateCoses() {
    return (Integer)outputMap.get("Output");
  }
  /**
   @deprecated
   */
  public MIHSubscriberGetOutputData getMIHSubscriberGetOutputData() {
    return MIHSubscriberGetOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setMIHSubscriberObjectData(MIHSubscriberObjectData data) {
    if (data != null) {
      addInput("MIHSubscriber", MIHSubscriberObjectHelper.toMap(data, new HashMap()).get("MIHSubscriberObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMIHUpdateSubscriberObjectData(MIHUpdateSubscriberObjectData data) {
    if (data != null) {
      addInput("MIHSubscriber", MIHUpdateSubscriberObjectHelper.toMap(data, new HashMap()).get("MIHUpdateSubscriberObject"));
    }
  }
  /**
   @deprecated
   */
  public void setMsisdn(String data) {
    if (data != null) {
      addInput("Msisdn", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getOutput() {
    return (Integer)outputMap.get("Output");
  }
}
