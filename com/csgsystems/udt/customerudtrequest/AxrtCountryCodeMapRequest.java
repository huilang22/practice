/*
 * Generated code DO NOT EDIT
 * Generated file: AxrtCountryCodeMapRequest.java
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
public final class AxrtCountryCodeMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AxrtCountryCodeMapRequest (String request, AxrtCountryCodeMapRequestMethod method) {
    initialize(request, "AxrtCountryCodeMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AxrtCountryCodeMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAxrtCountryCodeMapForAxrtCountryCodeMapGet(AxrtCountryCodeMapObjectKeyData data) {
    if (data != null) {
      addInput("AxrtCountryCodeMap", AxrtCountryCodeMapObjectKeyHelper.toMap(data, new HashMap(), "AxrtCountryCodeMap").get("AxrtCountryCodeMap"));
    }
  }
  public AxrtCountryCodeMapObjectData getAxrtCountryCodeMapObjectDataAxrtCountryCodeMapFromAxrtCountryCodeMapGet() {
    return AxrtCountryCodeMapObjectHelper.fromMap(outputMap, "AxrtCountryCodeMap");
  }
  /**
   @deprecated
   */
  public void setAxrtCountryCodeMapObjectKeyData(AxrtCountryCodeMapObjectKeyData data) {
    if (data != null) {
      addInput("AxrtCountryCodeMap", AxrtCountryCodeMapObjectKeyHelper.toMap(data, new HashMap()).get("AxrtCountryCodeMapObject"));
    }
  }
  /**
   @deprecated
   */
  public AxrtCountryCodeMapObjectData getAxrtCountryCodeMapObjectData() {
    return AxrtCountryCodeMapObjectHelper.fromMap(outputMap, "AxrtCountryCodeMap");
  }
}
