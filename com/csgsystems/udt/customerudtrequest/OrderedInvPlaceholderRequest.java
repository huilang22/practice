/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInvPlaceholderRequest.java
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
import com.csgsystems.om.data.*;
public final class OrderedInvPlaceholderRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderedInvPlaceholderRequest (String request, OrderedInvPlaceholderRequestMethod method) {
    initialize(request, "OrderedInvPlaceholder", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderedInvPlaceholderRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setEffectiveDtForOrderedInvPlaceholderAssign(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  public void setExternalIdTypeForOrderedInvPlaceholderAssign(Integer data) {
    if (data != null) {
      addInput("ExternalIdType", data);
    }
  }
  public void setFindExistingSOForOrderedInvPlaceholderAssign(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  public void setInvElementForOrderedInvPlaceholderAssign(InvElementObjData data) {
    if (data != null) {
      addInput("InvElement", InvElementObjHelper.toMap(data, new HashMap(), "InvElement").get("InvElement"));
    }
  }
  public void setInvPlaceholderForOrderedInvPlaceholderAssign(InvPlaceholderObjectData data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(data, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }
  public void setManageVanityChargesForOrderedInvPlaceholderAssign(Boolean data) {
    if (data != null) {
      addInput("ManageVanityCharges", data);
    }
  }
  public void setOrderForOrderedInvPlaceholderAssign(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceForOrderedInvPlaceholderAssign(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceOrderForOrderedInvPlaceholderAssign(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedInvPlaceholderAssign(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public void setInvPlaceholderForOrderedInvPlaceholderCreate(InvPlaceholderObjectData data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(data, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }
  public void setOrderForOrderedInvPlaceholderCreate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceOrderForOrderedInvPlaceholderCreate(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }
  public void setVerboseResponseForOrderedInvPlaceholderCreate(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public OrderedInvPlaceholderAssignOutputData getOrderedInvPlaceholderAssignOutputDataOrderedInvPlaceholderAssignOutputDataFromOrderedInvPlaceholderAssign() {
    return OrderedInvPlaceholderAssignOutputHelper.fromMap(outputMap);
  }
  public OrderedInvPlaceholderCreateOutputData getOrderedInvPlaceholderCreateOutputDataOrderedInvPlaceholderCreateOutputDataFromOrderedInvPlaceholderCreate() {
    return OrderedInvPlaceholderCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setEffectiveDt(Date data) {
    if (data != null) {
      addInput("EffectiveDt", data);
    }
  }
  /**
   @deprecated
   */
  public void setExternalIdType(Integer data) {
    if (data != null) {
      addInput("ExternalIdType", data);
    }
  }
  /**
   @deprecated
   */
  public void setFindExistingSO(Boolean data) {
    if (data != null) {
      addInput("FindExistingSO", data);
    }
  }
  /**
   @deprecated
   */
  public void setInvElementObjData(InvElementObjData data) {
    if (data != null) {
      addInput("InvElementObj", InvElementObjHelper.toMap(data, new HashMap()).get("InvElementObj"));
    }
  }
  /**
   @deprecated
   */
  public void setInvPlaceholderObjectData(InvPlaceholderObjectData data) {
    if (data != null) {
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(data, new HashMap()).get("InvPlaceholderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setManageVanityCharges(Boolean data) {
    if (data != null) {
      addInput("ManageVanityCharges", data);
    }
  }
  /**
   @deprecated
   */
  public void setOrderObjectData(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap()).get("OrderObject"));
    }
  }
  /**
   @deprecated
   */
  public OrderedInvPlaceholderAssignOutputData getOrderedInvPlaceholderAssignOutputData() {
    return OrderedInvPlaceholderAssignOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public OrderedInvPlaceholderCreateOutputData getOrderedInvPlaceholderCreateOutputData() {
    return OrderedInvPlaceholderCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setServiceObjectData(ServiceObjectData data) {
    if (data != null) {
      addInput("Service", ServiceObjectHelper.toMap(data, new HashMap()).get("ServiceObject"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderObjectData(ServiceOrderObjectData data) {
    if (data != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(data, new HashMap()).get("ServiceOrderObject"));
    }
  }
  /**
   @deprecated
   */
  public void setVerboseResponse(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
}
