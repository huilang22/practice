/*
 * Generated code DO NOT EDIT
 * Generated file: InvAutoAssocRequest.java
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

import com.csgsystems.iv.data.*;
import com.csgsystems.svbl.data.*;
public final class InvAutoAssocRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public InvAutoAssocRequest (String request, InvAutoAssocRequestMethod method) {
    initialize(request, "InvAutoAssoc", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (InvAutoAssocRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setBoundaryIdForGeoAreaInventoryAutoAssociate(Integer data) {
    if (data != null) {
      addInput("BoundaryId", data);
    }
  }
  public void setEmailForGeoAreaInventoryAutoAssociate(String data) {
    if (data != null) {
      addInput("Email", data);
    }
  }
  public void setEnableAsyncForGeoAreaInventoryAutoAssociate(Integer data) {
    if (data != null) {
      addInput("EnableAsync", data);
    }
  }
  public void setInvElementBulkInForGeoAreaInventoryAutoAssociate(InvElementObjData data) {
    if (data != null) {
      addInput("InvElementBulkIn", InvElementObjHelper.toMap(data, new HashMap(), "InvElementBulkIn").get("InvElementBulkIn"));
    }
  }
  public void setInventoryIdForGeoAreaInventoryAutoAssociate(Integer data) {
    if (data != null) {
      addInput("InventoryId", data);
    }
  }
  public void setInventoryIdResetsForGeoAreaInventoryAutoAssociate(Integer data) {
    if (data != null) {
      addInput("InventoryIdResets", data);
    }
  }
  public void setServiceNumberHiForGeoAreaInventoryAutoAssociate(String data) {
    if (data != null) {
      addInput("ServiceNumberHi", data);
    }
  }
  public void setServiceNumberLoForGeoAreaInventoryAutoAssociate(String data) {
    if (data != null) {
      addInput("ServiceNumberLo", data);
    }
  }
  public GeoAreaInventoryAutoAssociateOutputData getGeoAreaInventoryAutoAssociateOutputDataGeoAreaInventoryAutoAssociateOutputDataFromGeoAreaInventoryAutoAssociate() {
    return GeoAreaInventoryAutoAssociateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setBoundaryId(Integer data) {
    if (data != null) {
      addInput("BoundaryId", data);
    }
  }
  /**
   @deprecated
   */
  public void setEmail(String data) {
    if (data != null) {
      addInput("Email", data);
    }
  }
  /**
   @deprecated
   */
  public void setEnableAsync(Integer data) {
    if (data != null) {
      addInput("EnableAsync", data);
    }
  }
  /**
   @deprecated
   */
  public GeoAreaInventoryAutoAssociateOutputData getGeoAreaInventoryAutoAssociateOutputData() {
    return GeoAreaInventoryAutoAssociateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setInvElementObjDataArray(InvElementObjData[] data) {
    if (data != null) {
      Object[] list = new Object[data.length];
      for (int i = 0; i < data.length; i++) {
        list[i] = InvElementObjHelper.getMap (data[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvElementObj");
      }
      addInput("InvElementObjList", list);
    }
  }
  /**
   @deprecated
   */
  public void setInventoryId(Integer data) {
    if (data != null) {
      addInput("InventoryId", data);
    }
  }
  /**
   @deprecated
   */
  public void setInventoryIdResets(Integer data) {
    if (data != null) {
      addInput("InventoryIdResets", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceNumberHi(String data) {
    if (data != null) {
      addInput("ServiceNumberHi", data);
    }
  }
  /**
   @deprecated
   */
  public void setServiceNumberLo(String data) {
    if (data != null) {
      addInput("ServiceNumberLo", data);
    }
  }
}
