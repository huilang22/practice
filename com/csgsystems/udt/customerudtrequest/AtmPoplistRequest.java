/*
 * Generated code DO NOT EDIT
 * Generated file: AtmPoplistRequest.java
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
public final class AtmPoplistRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AtmPoplistRequest (String request, AtmPoplistRequestMethod method) {
    initialize(request, "AtmPoplist", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AtmPoplistRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setAtmPoplistForAtmPoplistCreate(AtmPoplistObjectData data) {
    if (data != null) {
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(data, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }
  public void setAtmPoplistForAtmPoplistFind(AtmPoplistObjectFilter data) {
    if (data != null) {
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(data, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }
  public void setAtmPoplistForAtmPoplistGet(AtmPoplistObjectKeyData data) {
    if (data != null) {
      addInput("AtmPoplist", AtmPoplistObjectKeyHelper.toMap(data, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }
  public void setAtmPoplistForAtmPoplistUpdate(AtmPoplistObjectData data) {
    if (data != null) {
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(data, new HashMap(), "AtmPoplist").get("AtmPoplist"));
    }
  }
  public AtmPoplistObjectData getAtmPoplistObjectDataAtmPoplistFromAtmPoplistCreate() {
    return AtmPoplistObjectHelper.fromMap(outputMap, "AtmPoplist");
  }
  public AtmPoplistObjectDataList getAtmPoplistObjectDataAtmPoplistFromAtmPoplistFind() {
    return AtmPoplistObjectHelper.fromMapList(outputMap, "AtmPoplistList");
  }
  public AtmPoplistObjectData getAtmPoplistObjectDataAtmPoplistFromAtmPoplistGet() {
    return AtmPoplistObjectHelper.fromMap(outputMap, "AtmPoplist");
  }
  public AtmPoplistObjectData getAtmPoplistObjectDataAtmPoplistFromAtmPoplistUpdate() {
    return AtmPoplistObjectHelper.fromMap(outputMap, "AtmPoplist");
  }
  /**
   @deprecated
   */
  public void setAtmPoplistObjectFilter(AtmPoplistObjectFilter data) {
    if (data != null) {
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(data, new HashMap()).get("AtmPoplistObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAtmPoplistObjectData(AtmPoplistObjectData data) {
    if (data != null) {
      addInput("AtmPoplist", AtmPoplistObjectHelper.toMap(data, new HashMap()).get("AtmPoplistObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAtmPoplistObjectKeyData(AtmPoplistObjectKeyData data) {
    if (data != null) {
      addInput("AtmPoplist", AtmPoplistObjectKeyHelper.toMap(data, new HashMap()).get("AtmPoplistObject"));
    }
  }
  /**
   @deprecated
   */
  public AtmPoplistObjectDataList getAtmPoplistObjectDataList() {
    return AtmPoplistObjectHelper.fromMapList(outputMap, "AtmPoplistList");
  }
  /**
   @deprecated
   */
  public AtmPoplistObjectData getAtmPoplistObjectData() {
    return AtmPoplistObjectHelper.fromMap(outputMap, "AtmPoplist");
  }
}
