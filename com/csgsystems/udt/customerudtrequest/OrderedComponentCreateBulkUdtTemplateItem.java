/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedComponentCreateBulkUdtTemplateItem.java
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
 * Class used to create a OrderedComponentCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedComponentCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectData oCcComponentIn;
  protected OrderObjectData oCcOrderIn;
  protected ServiceOrderObjectData oCcServiceOrderIn;
  protected Boolean WaiveActivation;
  protected Integer OwningAccountInternalId;
  protected Boolean oCcFindExistingSO;
  protected Boolean oCcVerboseResponse;
  protected Integer GroupId;
  protected Integer GroupIdServ;
/**
 *
 * Constructor to create a  OrderedComponentCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedComponentCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectData oCcComponentInIn, OrderObjectData oCcOrderInIn, ServiceOrderObjectData oCcServiceOrderInIn, Boolean WaiveActivationIn, Integer OwningAccountInternalIdIn, Boolean oCcFindExistingSOIn, Boolean oCcVerboseResponseIn, Integer GroupIdIn, Integer GroupIdServIn) {
    super(id, context, "OrderedComponentCreate");
    oCcComponentIn = oCcComponentInIn;
    oCcOrderIn = oCcOrderInIn;
    oCcServiceOrderIn = oCcServiceOrderInIn;
    WaiveActivation = WaiveActivationIn;
    OwningAccountInternalId = OwningAccountInternalIdIn;
    oCcFindExistingSO = oCcFindExistingSOIn;
    oCcVerboseResponse = oCcVerboseResponseIn;
    GroupId = GroupIdIn;
    GroupIdServ = GroupIdServIn;
  }

  public void translateToMap() {
    if (oCcComponentIn != null) {
      oCcComponentIn.resetFlags(true, true);
      addInput("Component", ComponentObjectHelper.toMap(oCcComponentIn, new HashMap(), "OrderedComponentCreateOutputData").get("OrderedComponentCreateOutputData"));
    }
    if (oCcOrderIn != null) {
      oCcOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oCcOrderIn, new HashMap(), "OrderedComponentCreateOutputData").get("OrderedComponentCreateOutputData"));
    }
    if (oCcServiceOrderIn != null) {
      oCcServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oCcServiceOrderIn, new HashMap(), "OrderedComponentCreateOutputData").get("OrderedComponentCreateOutputData"));
    }
    if (WaiveActivation != null) {
      addInput("WaiveActivation", WaiveActivation);
    }
    if (OwningAccountInternalId != null) {
      addInput("OwningAccountInternalId", OwningAccountInternalId);
    }
    if (oCcFindExistingSO != null) {
      addInput("FindExistingSO", oCcFindExistingSO);
    }
    if (oCcVerboseResponse != null) {
      addInput("VerboseResponse", oCcVerboseResponse);
    }
    if (GroupId != null) {
      addInput("GroupId", GroupId);
    }
    if (GroupIdServ != null) {
      addInput("GroupIdServ", GroupIdServ);
    }
  }


/**
 *
 * Sets the Component
 * @param oCcComponentInIn Value of the oCcComponentIn
 *
 */

  public void setComponent(ComponentObjectData oCcComponentInIn) {
    oCcComponentIn = oCcComponentInIn;
  }

/**
 *
 * Sets the Order
 * @param oCcOrderInIn Value of the oCcOrderIn
 *
 */

  public void setOrder(OrderObjectData oCcOrderInIn) {
    oCcOrderIn = oCcOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param oCcServiceOrderInIn Value of the oCcServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData oCcServiceOrderInIn) {
    oCcServiceOrderIn = oCcServiceOrderInIn;
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
 * Sets the OwningAccountInternalId
 * @param OwningAccountInternalIdIn Value of the OwningAccountInternalId
 *
 */

  public void setOwningAccountInternalId(Integer OwningAccountInternalIdIn) {
    OwningAccountInternalId = OwningAccountInternalIdIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param oCcFindExistingSOIn Value of the oCcFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean oCcFindExistingSOIn) {
    oCcFindExistingSO = oCcFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oCcVerboseResponseIn Value of the oCcVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oCcVerboseResponseIn) {
    oCcVerboseResponse = oCcVerboseResponseIn;
  }

/**
 *
 * Sets the GroupId
 * @param GroupIdIn Value of the GroupId
 *
 */

  public void setGroupId(Integer GroupIdIn) {
    GroupId = GroupIdIn;
  }

/**
 *
 * Sets the GroupIdServ
 * @param GroupIdServIn Value of the GroupIdServ
 *
 */

  public void setGroupIdServ(Integer GroupIdServIn) {
    GroupIdServ = GroupIdServIn;
  }

  public void translateFromMap() {
    oCcComponentIn = ComponentObjectHelper.fromMap(inputMap, "Component");
    oCcOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oCcServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    WaiveActivation = (Boolean)inputMap.get("WaiveActivation");
    OwningAccountInternalId = (Integer)inputMap.get("OwningAccountInternalId");
    oCcFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    oCcVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
    GroupId = (Integer)inputMap.get("GroupId");
    GroupIdServ = (Integer)inputMap.get("GroupIdServ");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectData getComponent( ) {
    return oCcComponentIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oCcOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return oCcServiceOrderIn;
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
 * Gets the OwningAccountInternalId
 * @return Value of the OwningAccountInternalId
 *
 */

  public Integer getOwningAccountInternalId( ) {
    return OwningAccountInternalId;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return oCcFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oCcVerboseResponse;
  }

/**
 *
 * Gets the GroupId
 * @return Value of the GroupId
 *
 */

  public Integer getGroupId( ) {
    return GroupId;
  }

/**
 *
 * Gets the GroupIdServ
 * @return Value of the GroupIdServ
 *
 */

  public Integer getGroupIdServ( ) {
    return GroupIdServ;
  }

}
