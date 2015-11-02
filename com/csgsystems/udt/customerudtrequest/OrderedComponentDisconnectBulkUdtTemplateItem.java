/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedComponentDisconnectBulkUdtTemplateItem.java
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
 * Class used to create a OrderedComponentDisconnectBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedComponentDisconnectBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ComponentObjectData oCdComponentIn;
  protected OrderObjectData oCdOrderIn;
  protected ServiceOrderObjectData oCdServiceOrderIn;
  protected Boolean WaiveTermination;
  protected Boolean WaiveUnmetObligation;
  protected Date InactiveDt;
  protected Boolean oCdFindExistingSO;
  protected Boolean oCdVerboseResponse;
/**
 *
 * Constructor to create a  OrderedComponentDisconnectBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedComponentDisconnectBulkUdtTemplateItem(String id, BSDMSessionContext context, ComponentObjectData oCdComponentInIn, OrderObjectData oCdOrderInIn, ServiceOrderObjectData oCdServiceOrderInIn, Boolean WaiveTerminationIn, Boolean WaiveUnmetObligationIn, Date InactiveDtIn, Boolean oCdFindExistingSOIn, Boolean oCdVerboseResponseIn) {
    super(id, context, "OrderedComponentDisconnect");
    oCdComponentIn = oCdComponentInIn;
    oCdOrderIn = oCdOrderInIn;
    oCdServiceOrderIn = oCdServiceOrderInIn;
    WaiveTermination = WaiveTerminationIn;
    WaiveUnmetObligation = WaiveUnmetObligationIn;
    InactiveDt = InactiveDtIn;
    oCdFindExistingSO = oCdFindExistingSOIn;
    oCdVerboseResponse = oCdVerboseResponseIn;
  }

  public void translateToMap() {
    if (oCdComponentIn != null) {
      oCdComponentIn.resetFlags(true, true);
      addInput("Component", ComponentObjectHelper.toMap(oCdComponentIn, new HashMap(), "OrderedComponentDisconnectOutputData").get("OrderedComponentDisconnectOutputData"));
    }
    if (oCdOrderIn != null) {
      oCdOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oCdOrderIn, new HashMap(), "OrderedComponentDisconnectOutputData").get("OrderedComponentDisconnectOutputData"));
    }
    if (oCdServiceOrderIn != null) {
      oCdServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oCdServiceOrderIn, new HashMap(), "OrderedComponentDisconnectOutputData").get("OrderedComponentDisconnectOutputData"));
    }
    if (WaiveTermination != null) {
      addInput("WaiveTermination", WaiveTermination);
    }
    if (WaiveUnmetObligation != null) {
      addInput("WaiveUnmetObligation", WaiveUnmetObligation);
    }
    if (InactiveDt != null) {
      addInput("InactiveDt", InactiveDt);
    }
    if (oCdFindExistingSO != null) {
      addInput("FindExistingSO", oCdFindExistingSO);
    }
    if (oCdVerboseResponse != null) {
      addInput("VerboseResponse", oCdVerboseResponse);
    }
  }


/**
 *
 * Sets the Component
 * @param oCdComponentInIn Value of the oCdComponentIn
 *
 */

  public void setComponent(ComponentObjectData oCdComponentInIn) {
    oCdComponentIn = oCdComponentInIn;
  }

/**
 *
 * Sets the Order
 * @param oCdOrderInIn Value of the oCdOrderIn
 *
 */

  public void setOrder(OrderObjectData oCdOrderInIn) {
    oCdOrderIn = oCdOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param oCdServiceOrderInIn Value of the oCdServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData oCdServiceOrderInIn) {
    oCdServiceOrderIn = oCdServiceOrderInIn;
  }

/**
 *
 * Sets the WaiveTermination
 * @param WaiveTerminationIn Value of the WaiveTermination
 *
 */

  public void setWaiveTermination(Boolean WaiveTerminationIn) {
    WaiveTermination = WaiveTerminationIn;
  }

/**
 *
 * Sets the WaiveUnmetObligation
 * @param WaiveUnmetObligationIn Value of the WaiveUnmetObligation
 *
 */

  public void setWaiveUnmetObligation(Boolean WaiveUnmetObligationIn) {
    WaiveUnmetObligation = WaiveUnmetObligationIn;
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
 * @param oCdFindExistingSOIn Value of the oCdFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean oCdFindExistingSOIn) {
    oCdFindExistingSO = oCdFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oCdVerboseResponseIn Value of the oCdVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oCdVerboseResponseIn) {
    oCdVerboseResponse = oCdVerboseResponseIn;
  }

  public void translateFromMap() {
    oCdComponentIn = ComponentObjectHelper.fromMap(inputMap, "Component");
    oCdOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oCdServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    WaiveTermination = (Boolean)inputMap.get("WaiveTermination");
    WaiveUnmetObligation = (Boolean)inputMap.get("WaiveUnmetObligation");
    InactiveDt = (Date)inputMap.get("InactiveDt");
    oCdFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    oCdVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Component
 * @return Value of the Component
 *
 */

  public ComponentObjectData getComponent( ) {
    return oCdComponentIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oCdOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return oCdServiceOrderIn;
  }

/**
 *
 * Gets the WaiveTermination
 * @return Value of the WaiveTermination
 *
 */

  public Boolean getWaiveTermination( ) {
    return WaiveTermination;
  }

/**
 *
 * Gets the WaiveUnmetObligation
 * @return Value of the WaiveUnmetObligation
 *
 */

  public Boolean getWaiveUnmetObligation( ) {
    return WaiveUnmetObligation;
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
    return oCdFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oCdVerboseResponse;
  }

}
