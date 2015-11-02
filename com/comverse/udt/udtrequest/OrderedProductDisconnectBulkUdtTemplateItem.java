/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedProductDisconnectBulkUdtTemplateItem.java
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
 * Class used to create a OrderedProductDisconnectBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedProductDisconnectBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductObjectData opdProductIn;
  protected OrderObjectData opdOrderIn;
  protected ServiceOrderObjectData opdServiceOrderIn;
  protected Date InactiveDt;
  protected Boolean opdFindExistingSOIn;
  protected Boolean opdVerboseResponseIn;
/**
 *
 * Constructor to create a  OrderedProductDisconnectBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedProductDisconnectBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectData opdProductInIn, OrderObjectData opdOrderInIn, ServiceOrderObjectData opdServiceOrderInIn, Date InactiveDtIn, Boolean opdFindExistingSOInIn, Boolean opdVerboseResponseInIn) {
    super(id, context, "OrderedProductDisconnect");
    opdProductIn = opdProductInIn;
    opdOrderIn = opdOrderInIn;
    opdServiceOrderIn = opdServiceOrderInIn;
    InactiveDt = InactiveDtIn;
    opdFindExistingSOIn = opdFindExistingSOInIn;
    opdVerboseResponseIn = opdVerboseResponseInIn;
  }

  public void translateToMap() {
    if (opdProductIn != null) {
      opdProductIn.resetFlags(true, true);
      addInput("Product", ProductObjectHelper.toMap(opdProductIn, new HashMap(), "OrderedProductDisconnectOutputData").get("OrderedProductDisconnectOutputData"));
    }
    if (opdOrderIn != null) {
      opdOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(opdOrderIn, new HashMap(), "OrderedProductDisconnectOutputData").get("OrderedProductDisconnectOutputData"));
    }
    if (opdServiceOrderIn != null) {
      opdServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(opdServiceOrderIn, new HashMap(), "OrderedProductDisconnectOutputData").get("OrderedProductDisconnectOutputData"));
    }
    if (InactiveDt != null) {
      addInput("InactiveDt", InactiveDt);
    }
    if (opdFindExistingSOIn != null) {
      addInput("FindExistingSO", opdFindExistingSOIn);
    }
    if (opdVerboseResponseIn != null) {
      addInput("VerboseResponse", opdVerboseResponseIn);
    }
  }


/**
 *
 * Sets the Product
 * @param opdProductInIn Value of the opdProductIn
 *
 */

  public void setProduct(ProductObjectData opdProductInIn) {
    opdProductIn = opdProductInIn;
  }

/**
 *
 * Sets the Order
 * @param opdOrderInIn Value of the opdOrderIn
 *
 */

  public void setOrder(OrderObjectData opdOrderInIn) {
    opdOrderIn = opdOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param opdServiceOrderInIn Value of the opdServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData opdServiceOrderInIn) {
    opdServiceOrderIn = opdServiceOrderInIn;
  }

/**
 *
 * Sets the InactiveDt
 * @param InactiveDtIn Value of the InactiveDt
 *
 */

  public void setInactiveDt(Date InactiveDtIn) {
    InactiveDt = InactiveDtIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param opdFindExistingSOInIn Value of the opdFindExistingSOIn
 *
 */

  public void setFindExistingSO(Boolean opdFindExistingSOInIn) {
    opdFindExistingSOIn = opdFindExistingSOInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param opdVerboseResponseInIn Value of the opdVerboseResponseIn
 *
 */

  public void setVerboseResponse(Boolean opdVerboseResponseInIn) {
    opdVerboseResponseIn = opdVerboseResponseInIn;
  }

  public void translateFromMap() {
    opdProductIn = ProductObjectHelper.fromMap(inputMap, "Product");
    opdOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    opdServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    InactiveDt = (Date)inputMap.get("InactiveDt");
    opdFindExistingSOIn = (Boolean)inputMap.get("FindExistingSO");
    opdVerboseResponseIn = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Product
 * @return Value of the Product
 *
 */

  public ProductObjectData getProduct( ) {
    return opdProductIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return opdOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return opdServiceOrderIn;
  }

/**
 *
 * Gets the InactiveDt
 * @return Value of the InactiveDt
 *
 */

  public Date getInactiveDt( ) {
    return InactiveDt;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return opdFindExistingSOIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return opdVerboseResponseIn;
  }

}
