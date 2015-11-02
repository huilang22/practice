/*
 * Generated code DO NOT EDIT
 * Generated file: LockManagerRequest.java
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
public final class LockManagerRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public LockManagerRequest (String request, LockManagerRequestMethod method) {
    initialize(request, "LockManager", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (LockManagerRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAccountInternalIdForAccountLockCreate(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setServiceOrderIdForAccountLockCreate(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
  public void setServiceInternalIdForServiceLockCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  public void setServiceInternalIdResetsForServiceLockCreate(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  public void setServiceOrderId2ForServiceLockCreate(String data) {
    if (data != null) {
      addInput("ServiceOrderId2", data);
    }
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceInternalId(Integer data) {
    if (data != null) {
      addInput("ServiceInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceInternalIdResets(Integer data) {
    if (data != null) {
      addInput("ServiceInternalIdResets", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderId(String data) {
    if (data != null) {
      addInput("ServiceOrderId", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderId2(String data) {
    if (data != null) {
      addInput("ServiceOrderId2", data);
    }
  }
}
