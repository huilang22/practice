/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedCiemCreateBulkUdtTemplateItem.java
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
 * Class used to create a OrderedCiemCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedCiemCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectData ociemIn;
  protected OrderObjectData ociemOrderIn;
  protected ServiceOrderObjectData ociemServiceOrderIn;
  protected Boolean ociemFindExistingSOIn;
  protected Boolean ociemVerboseResponseIn;
/**
 *
 * Constructor to create a  OrderedCiemCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedCiemCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData ociemInIn, OrderObjectData ociemOrderInIn, ServiceOrderObjectData ociemServiceOrderInIn, Boolean ociemFindExistingSOInIn, Boolean ociemVerboseResponseInIn) {
    super(id, context, "OrderedCiemCreate");
    ociemIn = ociemInIn;
    ociemOrderIn = ociemOrderInIn;
    ociemServiceOrderIn = ociemServiceOrderInIn;
    ociemFindExistingSOIn = ociemFindExistingSOInIn;
    ociemVerboseResponseIn = ociemVerboseResponseInIn;
  }

  public void translateToMap() {
    if (ociemIn != null) {
      ociemIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(ociemIn, new HashMap(), "OrderedCiemCreateOutputData").get("OrderedCiemCreateOutputData"));
    }
    if (ociemOrderIn != null) {
      ociemOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(ociemOrderIn, new HashMap(), "OrderedCiemCreateOutputData").get("OrderedCiemCreateOutputData"));
    }
    if (ociemServiceOrderIn != null) {
      ociemServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ociemServiceOrderIn, new HashMap(), "OrderedCiemCreateOutputData").get("OrderedCiemCreateOutputData"));
    }
    if (ociemFindExistingSOIn != null) {
      addInput("FindExistingSO", ociemFindExistingSOIn);
    }
    if (ociemVerboseResponseIn != null) {
      addInput("VerboseResponse", ociemVerboseResponseIn);
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param ociemInIn Value of the ociemIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectData ociemInIn) {
    ociemIn = ociemInIn;
  }

/**
 *
 * Sets the Order
 * @param ociemOrderInIn Value of the ociemOrderIn
 *
 */

  public void setOrder(OrderObjectData ociemOrderInIn) {
    ociemOrderIn = ociemOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param ociemServiceOrderInIn Value of the ociemServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData ociemServiceOrderInIn) {
    ociemServiceOrderIn = ociemServiceOrderInIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param ociemFindExistingSOInIn Value of the ociemFindExistingSOIn
 *
 */

  public void setFindExistingSO(Boolean ociemFindExistingSOInIn) {
    ociemFindExistingSOIn = ociemFindExistingSOInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param ociemVerboseResponseInIn Value of the ociemVerboseResponseIn
 *
 */

  public void setVerboseResponse(Boolean ociemVerboseResponseInIn) {
    ociemVerboseResponseIn = ociemVerboseResponseInIn;
  }

  public void translateFromMap() {
    ociemIn = CustomerIdEquipMapObjectHelper.fromMap(inputMap, "CustomerIdEquipMap");
    ociemOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    ociemServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    ociemFindExistingSOIn = (Boolean)inputMap.get("FindExistingSO");
    ociemVerboseResponseIn = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectData getCustomerIdEquipMap( ) {
    return ociemIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return ociemOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return ociemServiceOrderIn;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return ociemFindExistingSOIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return ociemVerboseResponseIn;
  }

}
