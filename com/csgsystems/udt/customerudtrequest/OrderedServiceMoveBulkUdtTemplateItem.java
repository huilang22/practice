/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedServiceMoveBulkUdtTemplateItem.java
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
 * Class used to create a OrderedServiceMoveBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedServiceMoveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectData osMoveServiceIn;
  protected ServiceOrderObjectData osMoveReqServiceOrderIn;
  protected Integer AddressId;
  protected Date PivotDate;
  protected Integer UpdateAccountBillingAddress;
  protected Integer UpdateAccountAlternateAddress;
  protected Boolean osMoveVerboseResponse;
/**
 *
 * Constructor to create a  OrderedServiceMoveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedServiceMoveBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectData osMoveServiceInIn, ServiceOrderObjectData osMoveReqServiceOrderInIn, Integer AddressIdIn, Date PivotDateIn, Integer UpdateAccountBillingAddressIn, Integer UpdateAccountAlternateAddressIn, Boolean osMoveVerboseResponseIn) {
    super(id, context, "OrderedServiceMove");
    osMoveServiceIn = osMoveServiceInIn;
    osMoveReqServiceOrderIn = osMoveReqServiceOrderInIn;
    AddressId = AddressIdIn;
    PivotDate = PivotDateIn;
    UpdateAccountBillingAddress = UpdateAccountBillingAddressIn;
    UpdateAccountAlternateAddress = UpdateAccountAlternateAddressIn;
    osMoveVerboseResponse = osMoveVerboseResponseIn;
  }

  public void translateToMap() {
    if (osMoveServiceIn != null) {
      osMoveServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(osMoveServiceIn, new HashMap(), "OrderedServiceMoveOutputData").get("OrderedServiceMoveOutputData"));
    }
    if (osMoveReqServiceOrderIn != null) {
      osMoveReqServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(osMoveReqServiceOrderIn, new HashMap(), "OrderedServiceMoveOutputData").get("OrderedServiceMoveOutputData"));
    }
    if (AddressId != null) {
      addInput("AddressId", AddressId);
    }
    if (PivotDate != null) {
      addInput("PivotDate", PivotDate);
    }
    if (UpdateAccountBillingAddress != null) {
      addInput("UpdateAccountBillingAddress", UpdateAccountBillingAddress);
    }
    if (UpdateAccountAlternateAddress != null) {
      addInput("UpdateAccountAlternateAddress", UpdateAccountAlternateAddress);
    }
    if (osMoveVerboseResponse != null) {
      addInput("VerboseResponse", osMoveVerboseResponse);
    }
  }


/**
 *
 * Sets the Service
 * @param osMoveServiceInIn Value of the osMoveServiceIn
 *
 */

  public void setService(ServiceObjectData osMoveServiceInIn) {
    osMoveServiceIn = osMoveServiceInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param osMoveReqServiceOrderInIn Value of the osMoveReqServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData osMoveReqServiceOrderInIn) {
    osMoveReqServiceOrderIn = osMoveReqServiceOrderInIn;
  }

/**
 *
 * Sets the AddressId
 * @param AddressIdIn Value of the AddressId
 *
 */

  public void setAddressId(Integer AddressIdIn) {
    AddressId = AddressIdIn;
  }

/**
 *
 * Sets the PivotDate
 * @param PivotDateIn Value of the PivotDate
 *
 */

  public void setPivotDate(Date PivotDateIn) {
    PivotDate = PivotDateIn;
  }

/**
 *
 * Sets the UpdateAccountBillingAddress
 * @param UpdateAccountBillingAddressIn Value of the UpdateAccountBillingAddress
 *
 */

  public void setUpdateAccountBillingAddress(Integer UpdateAccountBillingAddressIn) {
    UpdateAccountBillingAddress = UpdateAccountBillingAddressIn;
  }

/**
 *
 * Sets the UpdateAccountAlternateAddress
 * @param UpdateAccountAlternateAddressIn Value of the UpdateAccountAlternateAddress
 *
 */

  public void setUpdateAccountAlternateAddress(Integer UpdateAccountAlternateAddressIn) {
    UpdateAccountAlternateAddress = UpdateAccountAlternateAddressIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param osMoveVerboseResponseIn Value of the osMoveVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean osMoveVerboseResponseIn) {
    osMoveVerboseResponse = osMoveVerboseResponseIn;
  }

  public void translateFromMap() {
    osMoveServiceIn = ServiceObjectHelper.fromMap(inputMap, "Service");
    osMoveReqServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    AddressId = (Integer)inputMap.get("AddressId");
    PivotDate = (Date)inputMap.get("PivotDate");
    UpdateAccountBillingAddress = (Integer)inputMap.get("UpdateAccountBillingAddress");
    UpdateAccountAlternateAddress = (Integer)inputMap.get("UpdateAccountAlternateAddress");
    osMoveVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectData getService( ) {
    return osMoveServiceIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return osMoveReqServiceOrderIn;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public Integer getAddressId( ) {
    return AddressId;
  }

/**
 *
 * Gets the PivotDate
 * @return Value of the PivotDate
 *
 */

  public Date getPivotDate( ) {
    return PivotDate;
  }

/**
 *
 * Gets the UpdateAccountBillingAddress
 * @return Value of the UpdateAccountBillingAddress
 *
 */

  public Integer getUpdateAccountBillingAddress( ) {
    return UpdateAccountBillingAddress;
  }

/**
 *
 * Gets the UpdateAccountAlternateAddress
 * @return Value of the UpdateAccountAlternateAddress
 *
 */

  public Integer getUpdateAccountAlternateAddress( ) {
    return UpdateAccountAlternateAddress;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return osMoveVerboseResponse;
  }

}
