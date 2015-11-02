/*
 * Generated code DO NOT EDIT
 * Generated file: OccConeFxEntityMapRequest.java
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

import com.csgsystems.cf.data.*;
public final class OccConeFxEntityMapRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OccConeFxEntityMapRequest (String request, OccConeFxEntityMapRequestMethod method) {
    initialize(request, "OccConeFxEntityMap", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OccConeFxEntityMapRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setOccConeFxEntityMapForOccConeFxEntityMapFind(OCFEMObjectFilter data) {
    if (data != null) {
      addInput("OccConeFxEntityMap", OCFEMObjectHelper.toMap(data, new HashMap(), "OccConeFxEntityMap").get("OccConeFxEntityMap"));
    }
  }
  public OCFEMObjectDataList getOCFEMObjectDataOccConeFxEntityMapFromOccConeFxEntityMapFind() {
    return OCFEMObjectHelper.fromMapList(outputMap, "OccConeFxEntityMapList");
  }
  /**
   @deprecated
   */
  public void setOCFEMObjectFilter(OCFEMObjectFilter data) {
    if (data != null) {
      addInput("OCFEM", OCFEMObjectHelper.toMap(data, new HashMap()).get("OCFEMObject"));
    }
  }
  /**
   @deprecated
   */
  public OCFEMObjectDataList getOCFEMObjectDataList() {
    return OCFEMObjectHelper.fromMapList(outputMap, "OCFEMList");
  }
}
