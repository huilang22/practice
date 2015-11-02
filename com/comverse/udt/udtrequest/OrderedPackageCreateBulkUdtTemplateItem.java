/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPackageCreateBulkUdtTemplateItem.java
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
 * Class used to create a OrderedPackageCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedPackageCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectData opcPackageIn;
  protected OrderObjectData opcOrderIn;
  protected ServiceOrderObjectData opcServiceOrderIn;
  protected Boolean opcFindExistingSO;
  protected Boolean opcVerboseResponse;
/**
 *
 * Constructor to create a  OrderedPackageCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedPackageCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectData opcPackageInIn, OrderObjectData opcOrderInIn, ServiceOrderObjectData opcServiceOrderInIn, Boolean opcFindExistingSOIn, Boolean opcVerboseResponseIn) {
    super(id, context, "OrderedPackageCreate");
    opcPackageIn = opcPackageInIn;
    opcOrderIn = opcOrderInIn;
    opcServiceOrderIn = opcServiceOrderInIn;
    opcFindExistingSO = opcFindExistingSOIn;
    opcVerboseResponse = opcVerboseResponseIn;
  }

  public void translateToMap() {
    if (opcPackageIn != null) {
      opcPackageIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(opcPackageIn, new HashMap(), "OrderedPackageCreateOutputData").get("OrderedPackageCreateOutputData"));
    }
    if (opcOrderIn != null) {
      opcOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(opcOrderIn, new HashMap(), "OrderedPackageCreateOutputData").get("OrderedPackageCreateOutputData"));
    }
    if (opcServiceOrderIn != null) {
      opcServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(opcServiceOrderIn, new HashMap(), "OrderedPackageCreateOutputData").get("OrderedPackageCreateOutputData"));
    }
    if (opcFindExistingSO != null) {
      addInput("FindExistingSO", opcFindExistingSO);
    }
    if (opcVerboseResponse != null) {
      addInput("VerboseResponse", opcVerboseResponse);
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param opcPackageInIn Value of the opcPackageIn
 *
 */

  public void setProductPackage(ProductPackageObjectData opcPackageInIn) {
    opcPackageIn = opcPackageInIn;
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
 * @param opcFindExistingSOIn Value of the opcFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean opcFindExistingSOIn) {
    opcFindExistingSO = opcFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param opcVerboseResponseIn Value of the opcVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean opcVerboseResponseIn) {
    opcVerboseResponse = opcVerboseResponseIn;
  }

  public void translateFromMap() {
    opcPackageIn = ProductPackageObjectHelper.fromMap(inputMap, "ProductPackage");
    opcOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    opcServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    opcFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    opcVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectData getProductPackage( ) {
    return opcPackageIn;
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
    return opcFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return opcVerboseResponse;
  }

}
