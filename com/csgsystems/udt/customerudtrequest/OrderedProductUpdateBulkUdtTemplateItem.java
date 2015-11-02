/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedProductUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OrderedProductUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedProductUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectData opuProductIn;
  protected OrderObjectData opuOrderIn;
  protected ServiceOrderObjectData opuServiceOrderIn;
  protected Boolean opuFindExistingSOIn;
  protected Boolean opuVerboseResponseIn;
  protected Date opuEffectiveDtIn;
/**
 *
 * Constructor to create a  OrderedProductUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedProductUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectData opuProductInIn, OrderObjectData opuOrderInIn, ServiceOrderObjectData opuServiceOrderInIn, Boolean opuFindExistingSOInIn, Boolean opuVerboseResponseInIn, Date opuEffectiveDtInIn) {
    super(id, context, "OrderedProductUpdate");
    opuProductIn = opuProductInIn;
    opuOrderIn = opuOrderInIn;
    opuServiceOrderIn = opuServiceOrderInIn;
    opuFindExistingSOIn = opuFindExistingSOInIn;
    opuVerboseResponseIn = opuVerboseResponseInIn;
    opuEffectiveDtIn = opuEffectiveDtInIn;
  }

  public void translateToMap() {
    if (opuProductIn != null) {
      opuProductIn.resetFlags(true, true);
      addInput("Product", ProductObjectHelper.toMap(opuProductIn, new HashMap(), "OrderedProductUpdateOutputData").get("OrderedProductUpdateOutputData"));
    }
    if (opuOrderIn != null) {
      opuOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(opuOrderIn, new HashMap(), "OrderedProductUpdateOutputData").get("OrderedProductUpdateOutputData"));
    }
    if (opuServiceOrderIn != null) {
      opuServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(opuServiceOrderIn, new HashMap(), "OrderedProductUpdateOutputData").get("OrderedProductUpdateOutputData"));
    }
    if (opuFindExistingSOIn != null) {
      addInput("FindExistingSO", opuFindExistingSOIn);
    }
    if (opuVerboseResponseIn != null) {
      addInput("VerboseResponse", opuVerboseResponseIn);
    }
    if (opuEffectiveDtIn != null) {
      addInput("EffectiveDt", opuEffectiveDtIn);
    }
  }


/**
 *
 * Sets the Product
 * @param opuProductInIn Value of the opuProductIn
 *
 */

  public void setProduct(ProductObjectData opuProductInIn) {
    opuProductIn = opuProductInIn;
  }

/**
 *
 * Sets the Order
 * @param opuOrderInIn Value of the opuOrderIn
 *
 */

  public void setOrder(OrderObjectData opuOrderInIn) {
    opuOrderIn = opuOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param opuServiceOrderInIn Value of the opuServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData opuServiceOrderInIn) {
    opuServiceOrderIn = opuServiceOrderInIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param opuFindExistingSOInIn Value of the opuFindExistingSOIn
 *
 */

  public void setFindExistingSO(Boolean opuFindExistingSOInIn) {
    opuFindExistingSOIn = opuFindExistingSOInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param opuVerboseResponseInIn Value of the opuVerboseResponseIn
 *
 */

  public void setVerboseResponse(Boolean opuVerboseResponseInIn) {
    opuVerboseResponseIn = opuVerboseResponseInIn;
  }

/**
 *
 * Sets the EffectiveDt
 * @param opuEffectiveDtInIn Value of the opuEffectiveDtIn
 *
 */

  public void setEffectiveDt(Date opuEffectiveDtInIn) {
    opuEffectiveDtIn = opuEffectiveDtInIn;
  }

  public void translateFromMap() {
    opuProductIn = ProductObjectHelper.fromMap(inputMap, "Product");
    opuOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    opuServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    opuFindExistingSOIn = (Boolean)inputMap.get("FindExistingSO");
    opuVerboseResponseIn = (Boolean)inputMap.get("VerboseResponse");
    opuEffectiveDtIn = (Date)inputMap.get("EffectiveDt");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectData getProduct( ) {
    return opuProductIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return opuOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return opuServiceOrderIn;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return opuFindExistingSOIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return opuVerboseResponseIn;
  }

/**
 *
 * Gets the EffectiveDt
 * @return Value of the EffectiveDt
 *
 */

  public Date getEffectiveDt( ) {
    return opuEffectiveDtIn;
  }

}
