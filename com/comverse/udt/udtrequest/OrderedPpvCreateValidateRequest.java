/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPpvCreateValidateRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderedPpvCreateValidateRequest Udt Request
 *
 */

public class OrderedPpvCreateValidateRequest extends OrderedPpvRequest {
/**
 *
 * Constructor to create a  OrderedPpvCreateValidateRequest
 * @param id Unique request name
 * @param ServiceVIn ServiceObjectBaseKeyData for OrderedPpvCreateValidateRequest
 * @param OppvDeliveryVIn OppvDeliveryObjData for OrderedPpvCreateValidateRequest
 * @param OrderVIn OrderObjectData for OrderedPpvCreateValidateRequest
 * @param ServiceOrderValidation Boolean for OrderedPpvCreateValidateRequest
 *
 */
@JsonCreator
  public OrderedPpvCreateValidateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseKeyData ServiceVIn, @JsonProperty("OppvDelivery")OppvDeliveryObjData OppvDeliveryVIn, @JsonProperty("Order")OrderObjectData OrderVIn, @JsonProperty("ServiceOrderValidation")Boolean ServiceOrderValidation) {
    super(id, "OrderedPpvCreateValidate");
    if (ServiceVIn != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(ServiceVIn, new HashMap(), "ServiceObjectBaseKeyData").get("ServiceObjectBaseKeyData"));
    }
    if (OppvDeliveryVIn != null) {
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(OppvDeliveryVIn, new HashMap(), "Void").get("Void"));
    }
    if (OrderVIn != null) {
      addInput("Order", OrderObjectHelper.toMap(OrderVIn, new HashMap(), "Void").get("Void"));
    }
    if (ServiceOrderValidation != null) {
      addInput("ServiceOrderValidation", ServiceOrderValidation);
    }
  }

}
