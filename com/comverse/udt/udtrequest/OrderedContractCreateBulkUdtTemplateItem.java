/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractCreateBulkUdtTemplateItem.java
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
 * Class used to create a OrderedContractCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedContractCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectData occContractIn;
  protected OrderObjectData occOrderIn;
  protected ServiceOrderObjectData occServiceOrderIn;
  protected Boolean WaiveActivation;
  protected Boolean occFindExistingSO;
  protected Boolean occVerboseResponse;
/**
 *
 * Constructor to create a  OrderedContractCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedContractCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectData occContractInIn, OrderObjectData occOrderInIn, ServiceOrderObjectData occServiceOrderInIn, Boolean WaiveActivationIn, Boolean occFindExistingSOIn, Boolean occVerboseResponseIn) {
    super(id, context, "OrderedContractCreate");
    occContractIn = occContractInIn;
    occOrderIn = occOrderInIn;
    occServiceOrderIn = occServiceOrderInIn;
    WaiveActivation = WaiveActivationIn;
    occFindExistingSO = occFindExistingSOIn;
    occVerboseResponse = occVerboseResponseIn;
  }

  public void translateToMap() {
    if (occContractIn != null) {
      occContractIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(occContractIn, new HashMap(), "OrderedContractCreateOutputData").get("OrderedContractCreateOutputData"));
    }
    if (occOrderIn != null) {
      occOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(occOrderIn, new HashMap(), "OrderedContractCreateOutputData").get("OrderedContractCreateOutputData"));
    }
    if (occServiceOrderIn != null) {
      occServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(occServiceOrderIn, new HashMap(), "OrderedContractCreateOutputData").get("OrderedContractCreateOutputData"));
    }
    if (WaiveActivation != null) {
      addInput("WaiveActivation", WaiveActivation);
    }
    if (occFindExistingSO != null) {
      addInput("FindExistingSO", occFindExistingSO);
    }
    if (occVerboseResponse != null) {
      addInput("VerboseResponse", occVerboseResponse);
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param occContractInIn Value of the occContractIn
 *
 */

  public void setCustomerContract(CustomerContractObjectData occContractInIn) {
    occContractIn = occContractInIn;
  }

/**
 *
 * Sets the Order
 * @param occOrderInIn Value of the occOrderIn
 *
 */

  public void setOrder(OrderObjectData occOrderInIn) {
    occOrderIn = occOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param occServiceOrderInIn Value of the occServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData occServiceOrderInIn) {
    occServiceOrderIn = occServiceOrderInIn;
  }

/**
 *
 * Sets the WaiveActivation
 * @param WaiveActivationIn Value of the WaiveActivation
 *
 */

  public void setWaiveActivation(Boolean WaiveActivationIn) {
    WaiveActivation = WaiveActivationIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param occFindExistingSOIn Value of the occFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean occFindExistingSOIn) {
    occFindExistingSO = occFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param occVerboseResponseIn Value of the occVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean occVerboseResponseIn) {
    occVerboseResponse = occVerboseResponseIn;
  }

  public void translateFromMap() {
    occContractIn = CustomerContractObjectHelper.fromMap(inputMap, "CustomerContract");
    occOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    occServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    WaiveActivation = (Boolean)inputMap.get("WaiveActivation");
    occFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    occVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectData getCustomerContract( ) {
    return occContractIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return occOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return occServiceOrderIn;
  }

/**
 *
 * Gets the WaiveActivation
 * @return Value of the WaiveActivation
 *
 */

  public Boolean getWaiveActivation( ) {
    return WaiveActivation;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return occFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return occVerboseResponse;
  }

}
