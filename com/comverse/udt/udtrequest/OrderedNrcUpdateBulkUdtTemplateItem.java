/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedNrcUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OrderedNrcUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedNrcUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectData onuNrcIn;
  protected OrderObjectData onuOrderIn;
  protected ServiceOrderObjectData onuServiceOrderIn;
  protected Date EffectiveDt;
  protected Boolean onuFindExistingSOIn;
  protected Boolean onuVerboseResponseIn;
/**
 *
 * Constructor to create a  OrderedNrcUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedNrcUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectData onuNrcInIn, OrderObjectData onuOrderInIn, ServiceOrderObjectData onuServiceOrderInIn, Date EffectiveDtIn, Boolean onuFindExistingSOInIn, Boolean onuVerboseResponseInIn) {
    super(id, context, "OrderedNrcUpdate");
    onuNrcIn = onuNrcInIn;
    onuOrderIn = onuOrderInIn;
    onuServiceOrderIn = onuServiceOrderInIn;
    EffectiveDt = EffectiveDtIn;
    onuFindExistingSOIn = onuFindExistingSOInIn;
    onuVerboseResponseIn = onuVerboseResponseInIn;
  }

  public void translateToMap() {
    if (onuNrcIn != null) {
      onuNrcIn.resetFlags(true, true);
      addInput("Nrc", NrcObjectHelper.toMap(onuNrcIn, new HashMap(), "OrderedNrcUpdateOutputData").get("OrderedNrcUpdateOutputData"));
    }
    if (onuOrderIn != null) {
      onuOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(onuOrderIn, new HashMap(), "OrderedNrcUpdateOutputData").get("OrderedNrcUpdateOutputData"));
    }
    if (onuServiceOrderIn != null) {
      onuServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(onuServiceOrderIn, new HashMap(), "OrderedNrcUpdateOutputData").get("OrderedNrcUpdateOutputData"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
    if (onuFindExistingSOIn != null) {
      addInput("FindExistingSO", onuFindExistingSOIn);
    }
    if (onuVerboseResponseIn != null) {
      addInput("VerboseResponse", onuVerboseResponseIn);
    }
  }


/**
 *
 * Sets the Nrc
 * @param onuNrcInIn Value of the onuNrcIn
 *
 */

  public void setNrc(NrcObjectData onuNrcInIn) {
    onuNrcIn = onuNrcInIn;
  }

/**
 *
 * Sets the Order
 * @param onuOrderInIn Value of the onuOrderIn
 *
 */

  public void setOrder(OrderObjectData onuOrderInIn) {
    onuOrderIn = onuOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param onuServiceOrderInIn Value of the onuServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData onuServiceOrderInIn) {
    onuServiceOrderIn = onuServiceOrderInIn;
  }

/**
 *
 * Sets the EffectiveDt
 * @param EffectiveDtIn Value of the EffectiveDt
 *
 */

  public void setEffectiveDt(Date EffectiveDtIn) {
    EffectiveDt = EffectiveDtIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param onuFindExistingSOInIn Value of the onuFindExistingSOIn
 *
 */

  public void setFindExistingSO(Boolean onuFindExistingSOInIn) {
    onuFindExistingSOIn = onuFindExistingSOInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param onuVerboseResponseInIn Value of the onuVerboseResponseIn
 *
 */

  public void setVerboseResponse(Boolean onuVerboseResponseInIn) {
    onuVerboseResponseIn = onuVerboseResponseInIn;
  }

  public void translateFromMap() {
    onuNrcIn = NrcObjectHelper.fromMap(inputMap, "Nrc");
    onuOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    onuServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    EffectiveDt = (Date)inputMap.get("EffectiveDt");
    onuFindExistingSOIn = (Boolean)inputMap.get("FindExistingSO");
    onuVerboseResponseIn = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectData getNrc( ) {
    return onuNrcIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return onuOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return onuServiceOrderIn;
  }

/**
 *
 * Gets the EffectiveDt
 * @return Value of the EffectiveDt
 *
 */

  public Date getEffectiveDt( ) {
    return EffectiveDt;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return onuFindExistingSOIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return onuVerboseResponseIn;
  }

}
