/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPpvCreateRequest.java
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
 * Class used to create a OrderedPpvCreateRequest Udt Request
 *
 */

public class OrderedPpvCreateRequest extends OrderedPpvSubRequestParent {
/**
 *
 * Constructor to create a  OrderedPpvCreateRequest
 * @param id Unique request name
 * @param ServiceIn ServiceObjectBaseKeyData for OrderedPpvCreateRequest
 * @param OppvDeliveryIn OppvDeliveryObjData for OrderedPpvCreateRequest
 * @param OrderIn OrderObjectData for OrderedPpvCreateRequest
 * @param VerboseResponse Boolean for OrderedPpvCreateRequest
 *
 */
@JsonCreator
  public OrderedPpvCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Service")ServiceObjectBaseKeyData ServiceIn, @JsonProperty("OppvDelivery")OppvDeliveryObjData OppvDeliveryIn, @JsonProperty("Order")OrderObjectData OrderIn, @JsonProperty("VerboseResponse")Boolean VerboseResponse) {
    super(id, "OrderedPpvCreate");
    if (ServiceIn != null) {
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(ServiceIn, new HashMap(), "ServiceObjectBaseKeyData").get("ServiceObjectBaseKeyData"));
    }
    if (OppvDeliveryIn != null) {
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(OppvDeliveryIn, new HashMap(), "OrderedPpvCreateOutputData").get("OrderedPpvCreateOutputData"));
    }
    if (OrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(OrderIn, new HashMap(), "OrderedPpvCreateOutputData").get("OrderedPpvCreateOutputData"));
    }
    if (VerboseResponse != null) {
      addInput("VerboseResponse", VerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedPpvCreateOutputData that results from the OrderedPpvCreateRequest call
 * @return OrderedPpvCreateOutputData resulting from udt call
 *
 */

  public OrderedPpvCreateOutputData getOutput() {
    return OrderedPpvCreateOutputHelper.fromMap(outputMap);
  }
}
