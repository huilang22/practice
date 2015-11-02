/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedContractUpdateBulkUdtTemplateItem.java
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
 * Class used to create a OrderedContractUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedContractUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectData ocuContractIn;
  protected OrderObjectData ocuOrderIn;
  protected ServiceOrderObjectData ocuServiceOrderIn;
  protected Date EffectiveDt;
  protected Boolean ocuFindExistingSO;
  protected Boolean ocuVerboseResponse;
/**
 *
 * Constructor to create a  OrderedContractUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedContractUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectData ocuContractInIn, OrderObjectData ocuOrderInIn, ServiceOrderObjectData ocuServiceOrderInIn, Date EffectiveDtIn, Boolean ocuFindExistingSOIn, Boolean ocuVerboseResponseIn) {
    super(id, context, "OrderedContractUpdate");
    ocuContractIn = ocuContractInIn;
    ocuOrderIn = ocuOrderInIn;
    ocuServiceOrderIn = ocuServiceOrderInIn;
    EffectiveDt = EffectiveDtIn;
    ocuFindExistingSO = ocuFindExistingSOIn;
    ocuVerboseResponse = ocuVerboseResponseIn;
  }

  public void translateToMap() {
    if (ocuContractIn != null) {
      ocuContractIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(ocuContractIn, new HashMap(), "OrderedContractUpdateOutputData").get("OrderedContractUpdateOutputData"));
    }
    if (ocuOrderIn != null) {
      ocuOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(ocuOrderIn, new HashMap(), "OrderedContractUpdateOutputData").get("OrderedContractUpdateOutputData"));
    }
    if (ocuServiceOrderIn != null) {
      ocuServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ocuServiceOrderIn, new HashMap(), "OrderedContractUpdateOutputData").get("OrderedContractUpdateOutputData"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
    if (ocuFindExistingSO != null) {
      addInput("FindExistingSO", ocuFindExistingSO);
    }
    if (ocuVerboseResponse != null) {
      addInput("VerboseResponse", ocuVerboseResponse);
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param ocuContractInIn Value of the ocuContractIn
 *
 */

  public void setCustomerContract(CustomerContractObjectData ocuContractInIn) {
    ocuContractIn = ocuContractInIn;
  }

/**
 *
 * Sets the Order
 * @param ocuOrderInIn Value of the ocuOrderIn
 *
 */

  public void setOrder(OrderObjectData ocuOrderInIn) {
    ocuOrderIn = ocuOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param ocuServiceOrderInIn Value of the ocuServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData ocuServiceOrderInIn) {
    ocuServiceOrderIn = ocuServiceOrderInIn;
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
 * @param ocuFindExistingSOIn Value of the ocuFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean ocuFindExistingSOIn) {
    ocuFindExistingSO = ocuFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param ocuVerboseResponseIn Value of the ocuVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean ocuVerboseResponseIn) {
    ocuVerboseResponse = ocuVerboseResponseIn;
  }

  public void translateFromMap() {
    ocuContractIn = CustomerContractObjectHelper.fromMap(inputMap, "CustomerContract");
    ocuOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    ocuServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    EffectiveDt = (Date)inputMap.get("EffectiveDt");
    ocuFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    ocuVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectData getCustomerContract( ) {
    return ocuContractIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return ocuOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return ocuServiceOrderIn;
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
    return ocuFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return ocuVerboseResponse;
  }

}
