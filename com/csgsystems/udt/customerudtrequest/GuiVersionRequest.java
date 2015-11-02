/*
 * Generated code DO NOT EDIT
 * Generated file: GuiVersionRequest.java
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
public final class GuiVersionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GuiVersionRequest (String request, GuiVersionRequestMethod method) {
    initialize(request, "GuiVersion", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GuiVersionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGuiVersionForGuiVersionFind(GuiVersionObjectFilter data) {
    if (data != null) {
      addInput("GuiVersion", GuiVersionObjectHelper.toMap(data, new HashMap(), "GuiVersion").get("GuiVersion"));
    }
  }
  public void setGuiVersionForGuiVersionGet(GuiVersionObjectKeyData data) {
    if (data != null) {
      addInput("GuiVersion", GuiVersionObjectKeyHelper.toMap(data, new HashMap(), "GuiVersion").get("GuiVersion"));
    }
  }
  public GuiVersionObjectDataList getGuiVersionObjectDataGuiVersionFromGuiVersionFind() {
    return GuiVersionObjectHelper.fromMapList(outputMap, "GuiVersionList");
  }
  public GuiVersionObjectData getGuiVersionObjectDataGuiVersionFromGuiVersionGet() {
    return GuiVersionObjectHelper.fromMap(outputMap, "GuiVersion");
  }
  /**
   @deprecated
   */
  public void setGuiVersionObjectFilter(GuiVersionObjectFilter data) {
    if (data != null) {
      addInput("GuiVersion", GuiVersionObjectHelper.toMap(data, new HashMap()).get("GuiVersionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGuiVersionObjectKeyData(GuiVersionObjectKeyData data) {
    if (data != null) {
      addInput("GuiVersion", GuiVersionObjectKeyHelper.toMap(data, new HashMap()).get("GuiVersionObject"));
    }
  }
  /**
   @deprecated
   */
  public GuiVersionObjectDataList getGuiVersionObjectDataList() {
    return GuiVersionObjectHelper.fromMapList(outputMap, "GuiVersionList");
  }
  /**
   @deprecated
   */
  public GuiVersionObjectData getGuiVersionObjectData() {
    return GuiVersionObjectHelper.fromMap(outputMap, "GuiVersion");
  }
}
