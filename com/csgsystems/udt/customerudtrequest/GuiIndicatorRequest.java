/*
 * Generated code DO NOT EDIT
 * Generated file: GuiIndicatorRequest.java
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
public final class GuiIndicatorRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public GuiIndicatorRequest (String request, GuiIndicatorRequestMethod method) {
    initialize(request, "GuiIndicator", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (GuiIndicatorRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setGuiIndicatorForGuiIndicatorCreate(GuiIndicatorObjectData data) {
    if (data != null) {
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(data, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }
  public void setGuiIndicatorForGuiIndicatorDelete(GuiIndicatorObjectKeyData data) {
    if (data != null) {
      addInput("GuiIndicator", GuiIndicatorObjectKeyHelper.toMap(data, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }
  public void setGuiIndicatorForGuiIndicatorFind(GuiIndicatorObjectFilter data) {
    if (data != null) {
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(data, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }
  public void setGuiIndicatorForGuiIndicatorGet(GuiIndicatorObjectKeyData data) {
    if (data != null) {
      addInput("GuiIndicator", GuiIndicatorObjectKeyHelper.toMap(data, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }
  public void setGuiIndicatorForGuiIndicatorUpdate(GuiIndicatorObjectData data) {
    if (data != null) {
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(data, new HashMap(), "GuiIndicator").get("GuiIndicator"));
    }
  }
  public GuiIndicatorObjectData getGuiIndicatorObjectDataGuiIndicatorFromGuiIndicatorCreate() {
    return GuiIndicatorObjectHelper.fromMap(outputMap, "GuiIndicator");
  }
  public GuiIndicatorObjectData getGuiIndicatorObjectDataGuiIndicatorFromGuiIndicatorDelete() {
    return GuiIndicatorObjectHelper.fromMap(outputMap, "GuiIndicator");
  }
  public GuiIndicatorObjectDataList getGuiIndicatorObjectDataGuiIndicatorFromGuiIndicatorFind() {
    return GuiIndicatorObjectHelper.fromMapList(outputMap, "GuiIndicatorList");
  }
  public GuiIndicatorObjectData getGuiIndicatorObjectDataGuiIndicatorFromGuiIndicatorGet() {
    return GuiIndicatorObjectHelper.fromMap(outputMap, "GuiIndicator");
  }
  public GuiIndicatorObjectData getGuiIndicatorObjectDataGuiIndicatorFromGuiIndicatorUpdate() {
    return GuiIndicatorObjectHelper.fromMap(outputMap, "GuiIndicator");
  }
  /**
   @deprecated
   */
  public void setGuiIndicatorObjectFilter(GuiIndicatorObjectFilter data) {
    if (data != null) {
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(data, new HashMap()).get("GuiIndicatorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGuiIndicatorObjectData(GuiIndicatorObjectData data) {
    if (data != null) {
      addInput("GuiIndicator", GuiIndicatorObjectHelper.toMap(data, new HashMap()).get("GuiIndicatorObject"));
    }
  }
  /**
   @deprecated
   */
  public void setGuiIndicatorObjectKeyData(GuiIndicatorObjectKeyData data) {
    if (data != null) {
      addInput("GuiIndicator", GuiIndicatorObjectKeyHelper.toMap(data, new HashMap()).get("GuiIndicatorObject"));
    }
  }
  /**
   @deprecated
   */
  public GuiIndicatorObjectDataList getGuiIndicatorObjectDataList() {
    return GuiIndicatorObjectHelper.fromMapList(outputMap, "GuiIndicatorList");
  }
  /**
   @deprecated
   */
  public GuiIndicatorObjectData getGuiIndicatorObjectData() {
    return GuiIndicatorObjectHelper.fromMap(outputMap, "GuiIndicator");
  }
}
