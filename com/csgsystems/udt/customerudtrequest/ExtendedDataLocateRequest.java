/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataLocateRequest.java
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

import com.csgsystems.bp.data.*;
public final class ExtendedDataLocateRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExtendedDataLocateRequest (String request, ExtendedDataLocateRequestMethod method) {
    initialize(request, "ExtendedDataLocate", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExtendedDataLocateRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExtendedDataLocateForExtendedDataLocateCreate(ExtendedDataLocateObjectData data) {
    if (data != null) {
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(data, new HashMap(), "ExtendedDataLocate").get("ExtendedDataLocate"));
    }
  }
  public void setExtendedDataLocateForExtendedDataLocateDeleteList(ExtendedDataLocateObjectFilter data) {
    if (data != null) {
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(data, new HashMap(), "ExtendedDataLocate").get("ExtendedDataLocate"));
    }
  }
  public void setExtendedDataLocateForExtendedDataLocateFind(ExtendedDataLocateObjectFilter data) {
    if (data != null) {
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(data, new HashMap(), "ExtendedDataLocate").get("ExtendedDataLocate"));
    }
  }
  public ExtendedDataLocateObjectData getExtendedDataLocateObjectDataExtendedDataLocateFromExtendedDataLocateDeleteList() {
    return ExtendedDataLocateObjectHelper.fromMap(outputMap, "ExtendedDataLocate");
  }
  public ExtendedDataLocateObjectDataList getExtendedDataLocateObjectDataExtendedDataLocateFromExtendedDataLocateFind() {
    return ExtendedDataLocateObjectHelper.fromMapList(outputMap, "ExtendedDataLocateList");
  }
  /**
   @deprecated
   */
  public void setExtendedDataLocateObjectFilter(ExtendedDataLocateObjectFilter data) {
    if (data != null) {
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(data, new HashMap()).get("ExtendedDataLocateObject"));
    }
  }
  /**
   @deprecated
   */
  public void setExtendedDataLocateObjectData(ExtendedDataLocateObjectData data) {
    if (data != null) {
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(data, new HashMap()).get("ExtendedDataLocateObject"));
    }
  }
  /**
   @deprecated
   */
  public ExtendedDataLocateObjectDataList getExtendedDataLocateObjectDataList() {
    return ExtendedDataLocateObjectHelper.fromMapList(outputMap, "ExtendedDataLocateList");
  }
  /**
   @deprecated
   */
  public ExtendedDataLocateObjectData getExtendedDataLocateObjectData() {
    return ExtendedDataLocateObjectHelper.fromMap(outputMap, "ExtendedDataLocate");
  }
}
