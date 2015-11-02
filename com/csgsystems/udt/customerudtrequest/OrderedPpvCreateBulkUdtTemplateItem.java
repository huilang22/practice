/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedPpvCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * Class used to create a OrderedPpvCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedPpvCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseKeyData ServiceIn;
  protected OppvDeliveryObjData OppvDeliveryIn;
  protected OrderObjectData OrderIn;
  protected Boolean VerboseResponse;
/**
 *
 * Constructor to create a  OrderedPpvCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedPpvCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseKeyData ServiceInIn, OppvDeliveryObjData OppvDeliveryInIn, OrderObjectData OrderInIn, Boolean VerboseResponseIn) {
    super(id, context, "OrderedPpvCreate");
    ServiceIn = ServiceInIn;
    OppvDeliveryIn = OppvDeliveryInIn;
    OrderIn = OrderInIn;
    VerboseResponse = VerboseResponseIn;
  }

  public void translateToMap() {
    if (ServiceIn != null) {
      ServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(ServiceIn, new HashMap(), "ServiceObjectBaseKeyData").get("ServiceObjectBaseKeyData"));
    }
    if (OppvDeliveryIn != null) {
      OppvDeliveryIn.resetFlags(true, true);
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(OppvDeliveryIn, new HashMap(), "OrderedPpvCreateOutputData").get("OrderedPpvCreateOutputData"));
    }
    if (OrderIn != null) {
      OrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(OrderIn, new HashMap(), "OrderedPpvCreateOutputData").get("OrderedPpvCreateOutputData"));
    }
    if (VerboseResponse != null) {
      addInput("VerboseResponse", VerboseResponse);
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceInIn Value of the ServiceIn
 *
 */

  public void setService(ServiceObjectBaseKeyData ServiceInIn) {
    ServiceIn = ServiceInIn;
  }

/**
 *
 * Sets the OppvDelivery
 * @param OppvDeliveryInIn Value of the OppvDeliveryIn
 *
 */

  public void setOppvDelivery(OppvDeliveryObjData OppvDeliveryInIn) {
    OppvDeliveryIn = OppvDeliveryInIn;
  }

/**
 *
 * Sets the Order
 * @param OrderInIn Value of the OrderIn
 *
 */

  public void setOrder(OrderObjectData OrderInIn) {
    OrderIn = OrderInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param VerboseResponseIn Value of the VerboseResponse
 *
 */

  public void setVerboseResponse(Boolean VerboseResponseIn) {
    VerboseResponse = VerboseResponseIn;
  }

  public void translateFromMap() {
    ServiceIn = ServiceObjectBaseKeyHelper.fromMap(inputMap, "Service");
    OppvDeliveryIn = OppvDeliveryObjHelper.fromMap(inputMap, "OppvDelivery");
    OrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    VerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseKeyData getService( ) {
    return ServiceIn;
  }

/**
 *
 * Gets the OppvDelivery
 * @return Value of the OppvDelivery
 *
 */

  public OppvDeliveryObjData getOppvDelivery( ) {
    return OppvDeliveryIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return OrderIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return VerboseResponse;
  }

}
