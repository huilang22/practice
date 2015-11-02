/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedPpvRequest.java
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
import com.csgsystems.ppv.data.*;
public final class OrderedPpvRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public OrderedPpvRequest (String request, OrderedPpvRequestMethod method) {
    initialize(request, "OrderedPpv", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (OrderedPpvRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  public void setOppvDeliveryForOrderedPpvCreate(OppvDeliveryObjData data) {
    if (data != null) {
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(data, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
  public void setOrderForOrderedPpvCreate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceForOrderedPpvCreate(ServiceObjectBaseKeyData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setOppvDeliveryForOrderedPpvCreateValidate(OppvDeliveryObjData data) {
    if (data != null) {
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(data, new HashMap(), "OppvDelivery").get("OppvDelivery"));
    }
  }
  public void setOrderForOrderedPpvCreateValidate(OrderObjectData data) {
    if (data != null) {
      addInput("Order", OrderObjectHelper.toMap(data, new HashMap(), "Order").get("Order"));
    }
  }
  public void setServiceForOrderedPpvCreateValidate(ServiceObjectBaseKeyData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(data, new HashMap(), "Service").get("Service"));
    }
  }
  public void setServiceOrderValidationForOrderedPpvCreateValidate(Boolean data) {
    if (data != null) {
      addInput("ServiceOrderValidation", data);
    }
  }
  public void setVerboseResponseForOrderedPpvCreate(Boolean data) {
    if (data != null) {
      addInput("VerboseResponse", data);
    }
  }
  public OrderedPpvCreateOutputData getOrderedPpvCreateOutputDataOrderedPpvCreateOutputDataFromOrderedPpvCreate() {
    return OrderedPpvCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setOppvDeliveryObjData(OppvDeliveryObjData data) {
    if (data != null) {
      addInput("OppvDeliveryObj", OppvDeliveryObjHelper.toMap(data, new HashMap()).get("OppvDeliveryObj"));
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
  public OrderedPpvCreateOutputData getOrderedPpvCreateOutputData() {
    return OrderedPpvCreateOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setServiceObjectBaseKeyData(ServiceObjectBaseKeyData data) {
    if (data != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(data, new HashMap()).get("ServiceObjectBase"));
    }
  }
  /**
   @deprecated
   */
  public void setServiceOrderValidation(Boolean data) {
    if (data != null) {
      addInput("ServiceOrderValidation", data);
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
