/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInvPlaceholderCreateBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderedInvPlaceholderCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedInvPlaceholderCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvPlaceholderObjectData oipcInvPlaceholderIn;
  protected OrderObjectData oipcOrderIn;
  protected ServiceOrderObjectData oipcServiceOrderIn;
  protected Boolean oipcVerboseResponse;
/**
 *
 * Constructor to create a  OrderedInvPlaceholderCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedInvPlaceholderCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvPlaceholderObjectData oipcInvPlaceholderInIn, OrderObjectData oipcOrderInIn, ServiceOrderObjectData oipcServiceOrderInIn, Boolean oipcVerboseResponseIn) {
    super(id, context, "OrderedInvPlaceholderCreate");
    oipcInvPlaceholderIn = oipcInvPlaceholderInIn;
    oipcOrderIn = oipcOrderInIn;
    oipcServiceOrderIn = oipcServiceOrderInIn;
    oipcVerboseResponse = oipcVerboseResponseIn;
  }

  public void translateToMap() {
    if (oipcInvPlaceholderIn != null) {
      oipcInvPlaceholderIn.resetFlags(true, true);
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(oipcInvPlaceholderIn, new HashMap(), "OrderedInvPlaceholderCreateOutputData").get("OrderedInvPlaceholderCreateOutputData"));
    }
    if (oipcOrderIn != null) {
      oipcOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oipcOrderIn, new HashMap(), "OrderedInvPlaceholderCreateOutputData").get("OrderedInvPlaceholderCreateOutputData"));
    }
    if (oipcServiceOrderIn != null) {
      oipcServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oipcServiceOrderIn, new HashMap(), "OrderedInvPlaceholderCreateOutputData").get("OrderedInvPlaceholderCreateOutputData"));
    }
    if (oipcVerboseResponse != null) {
      addInput("VerboseResponse", oipcVerboseResponse);
    }
  }


/**
 *
 * Sets the InvPlaceholder
 * @param oipcInvPlaceholderInIn Value of the oipcInvPlaceholderIn
 *
 */

  public void setInvPlaceholder(InvPlaceholderObjectData oipcInvPlaceholderInIn) {
    oipcInvPlaceholderIn = oipcInvPlaceholderInIn;
  }

/**
 *
 * Sets the Order
 * @param oipcOrderInIn Value of the oipcOrderIn
 *
 */

  public void setOrder(OrderObjectData oipcOrderInIn) {
    oipcOrderIn = oipcOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param oipcServiceOrderInIn Value of the oipcServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData oipcServiceOrderInIn) {
    oipcServiceOrderIn = oipcServiceOrderInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oipcVerboseResponseIn Value of the oipcVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oipcVerboseResponseIn) {
    oipcVerboseResponse = oipcVerboseResponseIn;
  }

  public void translateFromMap() {
    oipcInvPlaceholderIn = InvPlaceholderObjectHelper.fromMap(inputMap, "InvPlaceholder");
    oipcOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oipcServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    oipcVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the InvPlaceholder
 * @return Value of the InvPlaceholder
 *
 */

  public InvPlaceholderObjectData getInvPlaceholder( ) {
    return oipcInvPlaceholderIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oipcOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return oipcServiceOrderIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oipcVerboseResponse;
  }

}
