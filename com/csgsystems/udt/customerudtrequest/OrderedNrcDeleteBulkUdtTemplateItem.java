/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedNrcDeleteBulkUdtTemplateItem.java
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
 * Class used to create a OrderedNrcDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedNrcDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectData ondNrcIn;
  protected OrderObjectData ondOrderIn;
  protected ServiceOrderObjectData ondServiceOrderIn;
  protected Boolean ondFindExistingSOIn;
  protected Boolean ondVerboseResponseIn;
/**
 *
 * Constructor to create a  OrderedNrcDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedNrcDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectData ondNrcInIn, OrderObjectData ondOrderInIn, ServiceOrderObjectData ondServiceOrderInIn, Boolean ondFindExistingSOInIn, Boolean ondVerboseResponseInIn) {
    super(id, context, "OrderedNrcDelete");
    ondNrcIn = ondNrcInIn;
    ondOrderIn = ondOrderInIn;
    ondServiceOrderIn = ondServiceOrderInIn;
    ondFindExistingSOIn = ondFindExistingSOInIn;
    ondVerboseResponseIn = ondVerboseResponseInIn;
  }

  public void translateToMap() {
    if (ondNrcIn != null) {
      ondNrcIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectHelper.toMap(ondNrcIn, new HashMap(), "OrderedNrcDeleteOutputData").get("OrderedNrcDeleteOutputData"));
    }
    if (ondOrderIn != null) {
      ondOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(ondOrderIn, new HashMap(), "OrderedNrcDeleteOutputData").get("OrderedNrcDeleteOutputData"));
    }
    if (ondServiceOrderIn != null) {
      ondServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ondServiceOrderIn, new HashMap(), "OrderedNrcDeleteOutputData").get("OrderedNrcDeleteOutputData"));
    }
    if (ondFindExistingSOIn != null) {
      addInput("FindExistingSO", ondFindExistingSOIn);
    }
    if (ondVerboseResponseIn != null) {
      addInput("VerboseResponse", ondVerboseResponseIn);
    }
  }


/**
 *
 * Sets the Nrc
 * @param ondNrcInIn Value of the ondNrcIn
 *
 */

  public void setNrc(NrcObjectData ondNrcInIn) {
    ondNrcIn = ondNrcInIn;
  }

/**
 *
 * Sets the Order
 * @param ondOrderInIn Value of the ondOrderIn
 *
 */

  public void setOrder(OrderObjectData ondOrderInIn) {
    ondOrderIn = ondOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param ondServiceOrderInIn Value of the ondServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData ondServiceOrderInIn) {
    ondServiceOrderIn = ondServiceOrderInIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param ondFindExistingSOInIn Value of the ondFindExistingSOIn
 *
 */

  public void setFindExistingSO(Boolean ondFindExistingSOInIn) {
    ondFindExistingSOIn = ondFindExistingSOInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param ondVerboseResponseInIn Value of the ondVerboseResponseIn
 *
 */

  public void setVerboseResponse(Boolean ondVerboseResponseInIn) {
    ondVerboseResponseIn = ondVerboseResponseInIn;
  }

  public void translateFromMap() {
    ondNrcIn = NrcObjectHelper.fromMap(inputMap, "Nrc");
    ondOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    ondServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    ondFindExistingSOIn = (Boolean)inputMap.get("FindExistingSO");
    ondVerboseResponseIn = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectData getNrc( ) {
    return ondNrcIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return ondOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return ondServiceOrderIn;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return ondFindExistingSOIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return ondVerboseResponseIn;
  }

}
