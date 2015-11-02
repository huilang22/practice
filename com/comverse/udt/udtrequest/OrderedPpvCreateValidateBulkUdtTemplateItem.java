/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPpvCreateValidateBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * Class used to create a OrderedPpvCreateValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedPpvCreateValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseKeyData ServiceVIn;
  protected OppvDeliveryObjData OppvDeliveryVIn;
  protected OrderObjectData OrderVIn;
  protected Boolean ServiceOrderValidation;
/**
 *
 * Constructor to create a  OrderedPpvCreateValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedPpvCreateValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseKeyData ServiceVInIn, OppvDeliveryObjData OppvDeliveryVInIn, OrderObjectData OrderVInIn, Boolean ServiceOrderValidationIn) {
    super(id, context, "OrderedPpvCreateValidate");
    ServiceVIn = ServiceVInIn;
    OppvDeliveryVIn = OppvDeliveryVInIn;
    OrderVIn = OrderVInIn;
    ServiceOrderValidation = ServiceOrderValidationIn;
  }

  public void translateToMap() {
    if (ServiceVIn != null) {
      ServiceVIn.resetFlags(true, true);
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(ServiceVIn, new HashMap(), "ServiceObjectBaseKeyData").get("ServiceObjectBaseKeyData"));
    }
    if (OppvDeliveryVIn != null) {
      OppvDeliveryVIn.resetFlags(true, true);
      addInput("OppvDelivery", OppvDeliveryObjHelper.toMap(OppvDeliveryVIn, new HashMap(), "Void").get("Void"));
    }
    if (OrderVIn != null) {
      OrderVIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(OrderVIn, new HashMap(), "Void").get("Void"));
    }
    if (ServiceOrderValidation != null) {
      addInput("ServiceOrderValidation", ServiceOrderValidation);
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceVInIn Value of the ServiceVIn
 *
 */

  public void setService(ServiceObjectBaseKeyData ServiceVInIn) {
    ServiceVIn = ServiceVInIn;
  }

/**
 *
 * Sets the OppvDelivery
 * @param OppvDeliveryVInIn Value of the OppvDeliveryVIn
 *
 */

  public void setOppvDelivery(OppvDeliveryObjData OppvDeliveryVInIn) {
    OppvDeliveryVIn = OppvDeliveryVInIn;
  }

/**
 *
 * Sets the Order
 * @param OrderVInIn Value of the OrderVIn
 *
 */

  public void setOrder(OrderObjectData OrderVInIn) {
    OrderVIn = OrderVInIn;
  }

/**
 *
 * Sets the ServiceOrderValidation
 * @param ServiceOrderValidationIn Value of the ServiceOrderValidation
 *
 */

  public void setServiceOrderValidation(Boolean ServiceOrderValidationIn) {
    ServiceOrderValidation = ServiceOrderValidationIn;
  }

  public void translateFromMap() {
    ServiceVIn = ServiceObjectBaseKeyHelper.fromMap(inputMap, "Service");
    OppvDeliveryVIn = OppvDeliveryObjHelper.fromMap(inputMap, "OppvDelivery");
    OrderVIn = OrderObjectHelper.fromMap(inputMap, "Order");
    ServiceOrderValidation = (Boolean)inputMap.get("ServiceOrderValidation");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseKeyData getService( ) {
    return ServiceVIn;
  }

/**
 *
 * Gets the OppvDelivery
 * @return Value of the OppvDelivery
 *
 */

  public OppvDeliveryObjData getOppvDelivery( ) {
    return OppvDeliveryVIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return OrderVIn;
  }

/**
 *
 * Gets the ServiceOrderValidation
 * @return Value of the ServiceOrderValidation
 *
 */

  public Boolean getServiceOrderValidation( ) {
    return ServiceOrderValidation;
  }

}
