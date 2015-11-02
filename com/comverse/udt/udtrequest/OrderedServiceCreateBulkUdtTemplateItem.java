/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceCreateBulkUdtTemplateItem.java
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

/**
 *
 * Class used to create a OrderedServiceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedServiceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectData oscServiceIn;
  protected OrderObjectData oscOrderIn;
  protected Boolean oscVerboseResponse;
/**
 *
 * Constructor to create a  OrderedServiceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedServiceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectData oscServiceInIn, OrderObjectData oscOrderInIn, Boolean oscVerboseResponseIn) {
    super(id, context, "OrderedServiceCreate");
    oscServiceIn = oscServiceInIn;
    oscOrderIn = oscOrderInIn;
    oscVerboseResponse = oscVerboseResponseIn;
  }

  public void translateToMap() {
    if (oscServiceIn != null) {
      oscServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(oscServiceIn, new HashMap(), "OrderedServiceCreateOutputData").get("OrderedServiceCreateOutputData"));
    }
    if (oscOrderIn != null) {
      oscOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oscOrderIn, new HashMap(), "OrderedServiceCreateOutputData").get("OrderedServiceCreateOutputData"));
    }
    if (oscVerboseResponse != null) {
      addInput("VerboseResponse", oscVerboseResponse);
    }
  }


/**
 *
 * Sets the Service
 * @param oscServiceInIn Value of the oscServiceIn
 *
 */

  public void setService(ServiceObjectData oscServiceInIn) {
    oscServiceIn = oscServiceInIn;
  }

/**
 *
 * Sets the Order
 * @param oscOrderInIn Value of the oscOrderIn
 *
 */

  public void setOrder(OrderObjectData oscOrderInIn) {
    oscOrderIn = oscOrderInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oscVerboseResponseIn Value of the oscVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oscVerboseResponseIn) {
    oscVerboseResponse = oscVerboseResponseIn;
  }

  public void translateFromMap() {
    oscServiceIn = ServiceObjectHelper.fromMap(inputMap, "Service");
    oscOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oscVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectData getService( ) {
    return oscServiceIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oscOrderIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oscVerboseResponse;
  }

}
