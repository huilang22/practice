/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedCiemSetCurrentBulkUdtTemplateItem.java
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
 * Class used to create a OrderedCiemSetCurrentBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedCiemSetCurrentBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectData ociemUIn;
  protected OrderObjectData ociemUOrderIn;
  protected ServiceOrderObjectData ociemUServiceOrderIn;
  protected Date EffectiveDt;
  protected Boolean ociemUFindExistingSOIn;
  protected Boolean ociemUVerboseResponseIn;
/**
 *
 * Constructor to create a  OrderedCiemSetCurrentBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedCiemSetCurrentBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData ociemUInIn, OrderObjectData ociemUOrderInIn, ServiceOrderObjectData ociemUServiceOrderInIn, Date EffectiveDtIn, Boolean ociemUFindExistingSOInIn, Boolean ociemUVerboseResponseInIn) {
    super(id, context, "OrderedCiemSetCurrent");
    ociemUIn = ociemUInIn;
    ociemUOrderIn = ociemUOrderInIn;
    ociemUServiceOrderIn = ociemUServiceOrderInIn;
    EffectiveDt = EffectiveDtIn;
    ociemUFindExistingSOIn = ociemUFindExistingSOInIn;
    ociemUVerboseResponseIn = ociemUVerboseResponseInIn;
  }

  public void translateToMap() {
    if (ociemUIn != null) {
      ociemUIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(ociemUIn, new HashMap(), "OrderedCiemSetCurrentOutputData").get("OrderedCiemSetCurrentOutputData"));
    }
    if (ociemUOrderIn != null) {
      ociemUOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(ociemUOrderIn, new HashMap(), "OrderedCiemSetCurrentOutputData").get("OrderedCiemSetCurrentOutputData"));
    }
    if (ociemUServiceOrderIn != null) {
      ociemUServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ociemUServiceOrderIn, new HashMap(), "OrderedCiemSetCurrentOutputData").get("OrderedCiemSetCurrentOutputData"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
    if (ociemUFindExistingSOIn != null) {
      addInput("FindExistingSO", ociemUFindExistingSOIn);
    }
    if (ociemUVerboseResponseIn != null) {
      addInput("VerboseResponse", ociemUVerboseResponseIn);
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param ociemUInIn Value of the ociemUIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectData ociemUInIn) {
    ociemUIn = ociemUInIn;
  }

/**
 *
 * Sets the Order
 * @param ociemUOrderInIn Value of the ociemUOrderIn
 *
 */

  public void setOrder(OrderObjectData ociemUOrderInIn) {
    ociemUOrderIn = ociemUOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param ociemUServiceOrderInIn Value of the ociemUServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData ociemUServiceOrderInIn) {
    ociemUServiceOrderIn = ociemUServiceOrderInIn;
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
 * @param ociemUFindExistingSOInIn Value of the ociemUFindExistingSOIn
 *
 */

  public void setFindExistingSO(Boolean ociemUFindExistingSOInIn) {
    ociemUFindExistingSOIn = ociemUFindExistingSOInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param ociemUVerboseResponseInIn Value of the ociemUVerboseResponseIn
 *
 */

  public void setVerboseResponse(Boolean ociemUVerboseResponseInIn) {
    ociemUVerboseResponseIn = ociemUVerboseResponseInIn;
  }

  public void translateFromMap() {
    ociemUIn = CustomerIdEquipMapObjectHelper.fromMap(inputMap, "CustomerIdEquipMap");
    ociemUOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    ociemUServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    EffectiveDt = (Date)inputMap.get("EffectiveDt");
    ociemUFindExistingSOIn = (Boolean)inputMap.get("FindExistingSO");
    ociemUVerboseResponseIn = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectData getCustomerIdEquipMap( ) {
    return ociemUIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return ociemUOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return ociemUServiceOrderIn;
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
    return ociemUFindExistingSOIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return ociemUVerboseResponseIn;
  }

}
