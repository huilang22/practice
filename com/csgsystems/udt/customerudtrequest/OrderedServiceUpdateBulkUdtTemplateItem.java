/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedServiceUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OrderedServiceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedServiceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectData osUpdateServiceIn;
  protected OrderObjectData osUpdateOrderIn;
  protected ServiceOrderObjectData osUpdateServiceOrderIn;
  protected Date EffectiveDt;
  protected Boolean osuFindExistingSO;
  protected Boolean osuVerboseResponse;
/**
 *
 * Constructor to create a  OrderedServiceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedServiceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectData osUpdateServiceInIn, OrderObjectData osUpdateOrderInIn, ServiceOrderObjectData osUpdateServiceOrderInIn, Date EffectiveDtIn, Boolean osuFindExistingSOIn, Boolean osuVerboseResponseIn) {
    super(id, context, "OrderedServiceUpdate");
    osUpdateServiceIn = osUpdateServiceInIn;
    osUpdateOrderIn = osUpdateOrderInIn;
    osUpdateServiceOrderIn = osUpdateServiceOrderInIn;
    EffectiveDt = EffectiveDtIn;
    osuFindExistingSO = osuFindExistingSOIn;
    osuVerboseResponse = osuVerboseResponseIn;
  }

  public void translateToMap() {
    if (osUpdateServiceIn != null) {
      osUpdateServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(osUpdateServiceIn, new HashMap(), "OrderedServiceUpdateOutputData").get("OrderedServiceUpdateOutputData"));
    }
    if (osUpdateOrderIn != null) {
      osUpdateOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(osUpdateOrderIn, new HashMap(), "OrderedServiceUpdateOutputData").get("OrderedServiceUpdateOutputData"));
    }
    if (osUpdateServiceOrderIn != null) {
      osUpdateServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(osUpdateServiceOrderIn, new HashMap(), "OrderedServiceUpdateOutputData").get("OrderedServiceUpdateOutputData"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
    if (osuFindExistingSO != null) {
      addInput("FindExistingSO", osuFindExistingSO);
    }
    if (osuVerboseResponse != null) {
      addInput("VerboseResponse", osuVerboseResponse);
    }
  }


/**
 *
 * Sets the Service
 * @param osUpdateServiceInIn Value of the osUpdateServiceIn
 *
 */

  public void setService(ServiceObjectData osUpdateServiceInIn) {
    osUpdateServiceIn = osUpdateServiceInIn;
  }

/**
 *
 * Sets the Order
 * @param osUpdateOrderInIn Value of the osUpdateOrderIn
 *
 */

  public void setOrder(OrderObjectData osUpdateOrderInIn) {
    osUpdateOrderIn = osUpdateOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param osUpdateServiceOrderInIn Value of the osUpdateServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData osUpdateServiceOrderInIn) {
    osUpdateServiceOrderIn = osUpdateServiceOrderInIn;
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
 * @param osuFindExistingSOIn Value of the osuFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean osuFindExistingSOIn) {
    osuFindExistingSO = osuFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param osuVerboseResponseIn Value of the osuVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean osuVerboseResponseIn) {
    osuVerboseResponse = osuVerboseResponseIn;
  }

  public void translateFromMap() {
    osUpdateServiceIn = ServiceObjectHelper.fromMap(inputMap, "Service");
    osUpdateOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    osUpdateServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    EffectiveDt = (Date)inputMap.get("EffectiveDt");
    osuFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    osuVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectData getService( ) {
    return osUpdateServiceIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return osUpdateOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return osUpdateServiceOrderIn;
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
    return osuFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return osuVerboseResponse;
  }

}
