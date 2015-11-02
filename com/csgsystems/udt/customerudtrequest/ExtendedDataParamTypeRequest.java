/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataParamTypeRequest.java
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
public final class ExtendedDataParamTypeRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public ExtendedDataParamTypeRequest (String request, ExtendedDataParamTypeRequestMethod method) {
    initialize(request, "ExtendedDataParamType", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (ExtendedDataParamTypeRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setExtendedDataParamTypeForExtendedDataParamTypeFind(XPTObjectFilter data) {
    if (data != null) {
      addInput("ExtendedDataParamType", XPTObjectHelper.toMap(data, new HashMap(), "ExtendedDataParamType").get("ExtendedDataParamType"));
    }
  }
  public XPTObjectDataList getXPTObjectDataExtendedDataParamTypeFromExtendedDataParamTypeFind() {
    return XPTObjectHelper.fromMapList(outputMap, "ExtendedDataParamTypeList");
  }
  /**
   @deprecated
   */
  public void setXPTObjectFilter(XPTObjectFilter data) {
    if (data != null) {
      addInput("XPT", XPTObjectHelper.toMap(data, new HashMap()).get("XPTObject"));
    }
  }
  /**
   @deprecated
   */
  public XPTObjectDataList getXPTObjectDataList() {
    return XPTObjectHelper.fromMapList(outputMap, "XPTList");
  }
}
