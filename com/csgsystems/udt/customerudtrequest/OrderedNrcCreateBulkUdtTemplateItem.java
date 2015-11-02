/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedNrcCreateBulkUdtTemplateItem.java
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

/**
 *
 * Class used to create a OrderedNrcCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedNrcCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectData oncNrcIn;
  protected OrderObjectData oncOrderIn;
  protected ServiceOrderObjectData oncServiceOrderIn;
  protected Boolean oncFindExistingSOIn;
  protected Boolean oncVerboseResponseIn;
/**
 *
 * Constructor to create a  OrderedNrcCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedNrcCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectData oncNrcInIn, OrderObjectData oncOrderInIn, ServiceOrderObjectData oncServiceOrderInIn, Boolean oncFindExistingSOInIn, Boolean oncVerboseResponseInIn) {
    super(id, context, "OrderedNrcCreate");
    oncNrcIn = oncNrcInIn;
    oncOrderIn = oncOrderInIn;
    oncServiceOrderIn = oncServiceOrderInIn;
    oncFindExistingSOIn = oncFindExistingSOInIn;
    oncVerboseResponseIn = oncVerboseResponseInIn;
  }

  public void translateToMap() {
    if (oncNrcIn != null) {
      oncNrcIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectHelper.toMap(oncNrcIn, new HashMap(), "OrderedNrcCreateOutputData").get("OrderedNrcCreateOutputData"));
    }
    if (oncOrderIn != null) {
      oncOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oncOrderIn, new HashMap(), "OrderedNrcCreateOutputData").get("OrderedNrcCreateOutputData"));
    }
    if (oncServiceOrderIn != null) {
      oncServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oncServiceOrderIn, new HashMap(), "OrderedNrcCreateOutputData").get("OrderedNrcCreateOutputData"));
    }
    if (oncFindExistingSOIn != null) {
      addInput("FindExistingSO", oncFindExistingSOIn);
    }
    if (oncVerboseResponseIn != null) {
      addInput("VerboseResponse", oncVerboseResponseIn);
    }
  }


/**
 *
 * Sets the Nrc
 * @param oncNrcInIn Value of the oncNrcIn
 *
 */

  public void setNrc(NrcObjectData oncNrcInIn) {
    oncNrcIn = oncNrcInIn;
  }

/**
 *
 * Sets the Order
 * @param oncOrderInIn Value of the oncOrderIn
 *
 */

  public void setOrder(OrderObjectData oncOrderInIn) {
    oncOrderIn = oncOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param oncServiceOrderInIn Value of the oncServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData oncServiceOrderInIn) {
    oncServiceOrderIn = oncServiceOrderInIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param oncFindExistingSOInIn Value of the oncFindExistingSOIn
 *
 */

  public void setFindExistingSO(Boolean oncFindExistingSOInIn) {
    oncFindExistingSOIn = oncFindExistingSOInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oncVerboseResponseInIn Value of the oncVerboseResponseIn
 *
 */

  public void setVerboseResponse(Boolean oncVerboseResponseInIn) {
    oncVerboseResponseIn = oncVerboseResponseInIn;
  }

  public void translateFromMap() {
    oncNrcIn = NrcObjectHelper.fromMap(inputMap, "Nrc");
    oncOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oncServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    oncFindExistingSOIn = (Boolean)inputMap.get("FindExistingSO");
    oncVerboseResponseIn = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectData getNrc( ) {
    return oncNrcIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oncOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return oncServiceOrderIn;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return oncFindExistingSOIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oncVerboseResponseIn;
  }

}
