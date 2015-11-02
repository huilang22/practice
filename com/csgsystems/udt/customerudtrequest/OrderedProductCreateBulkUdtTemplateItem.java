/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedProductCreateBulkUdtTemplateItem.java
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
 * Class used to create a OrderedProductCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedProductCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectData opcProductIn;
  protected OrderObjectData opcOrderIn;
  protected ServiceOrderObjectData opcServiceOrderIn;
  protected Boolean opcFindExistingSOIn;
  protected Boolean opcVerboseResponseIn;
/**
 *
 * Constructor to create a  OrderedProductCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedProductCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectData opcProductInIn, OrderObjectData opcOrderInIn, ServiceOrderObjectData opcServiceOrderInIn, Boolean opcFindExistingSOInIn, Boolean opcVerboseResponseInIn) {
    super(id, context, "OrderedProductCreate");
    opcProductIn = opcProductInIn;
    opcOrderIn = opcOrderInIn;
    opcServiceOrderIn = opcServiceOrderInIn;
    opcFindExistingSOIn = opcFindExistingSOInIn;
    opcVerboseResponseIn = opcVerboseResponseInIn;
  }

  public void translateToMap() {
    if (opcProductIn != null) {
      opcProductIn.resetFlags(true, true);
      addInput("Product", ProductObjectHelper.toMap(opcProductIn, new HashMap(), "OrderedProductCreateOutputData").get("OrderedProductCreateOutputData"));
    }
    if (opcOrderIn != null) {
      opcOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(opcOrderIn, new HashMap(), "OrderedProductCreateOutputData").get("OrderedProductCreateOutputData"));
    }
    if (opcServiceOrderIn != null) {
      opcServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(opcServiceOrderIn, new HashMap(), "OrderedProductCreateOutputData").get("OrderedProductCreateOutputData"));
    }
    if (opcFindExistingSOIn != null) {
      addInput("FindExistingSO", opcFindExistingSOIn);
    }
    if (opcVerboseResponseIn != null) {
      addInput("VerboseResponse", opcVerboseResponseIn);
    }
  }


/**
 *
 * Sets the Product
 * @param opcProductInIn Value of the opcProductIn
 *
 */

  public void setProduct(ProductObjectData opcProductInIn) {
    opcProductIn = opcProductInIn;
  }

/**
 *
 * Sets the Order
 * @param opcOrderInIn Value of the opcOrderIn
 *
 */

  public void setOrder(OrderObjectData opcOrderInIn) {
    opcOrderIn = opcOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param opcServiceOrderInIn Value of the opcServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData opcServiceOrderInIn) {
    opcServiceOrderIn = opcServiceOrderInIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param opcFindExistingSOInIn Value of the opcFindExistingSOIn
 *
 */

  public void setFindExistingSO(Boolean opcFindExistingSOInIn) {
    opcFindExistingSOIn = opcFindExistingSOInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param opcVerboseResponseInIn Value of the opcVerboseResponseIn
 *
 */

  public void setVerboseResponse(Boolean opcVerboseResponseInIn) {
    opcVerboseResponseIn = opcVerboseResponseInIn;
  }

  public void translateFromMap() {
    opcProductIn = ProductObjectHelper.fromMap(inputMap, "Product");
    opcOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    opcServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    opcFindExistingSOIn = (Boolean)inputMap.get("FindExistingSO");
    opcVerboseResponseIn = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectData getProduct( ) {
    return opcProductIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return opcOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return opcServiceOrderIn;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return opcFindExistingSOIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return opcVerboseResponseIn;
  }

}
