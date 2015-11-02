/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedContractDisconnectBulkUdtTemplateItem.java
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
 * Class used to create a OrderedContractDisconnectBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedContractDisconnectBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectData ocdContractIn;
  protected OrderObjectData ocdOrderIn;
  protected ServiceOrderObjectData ocdServiceOrderIn;
  protected Boolean WaiveTermination;
  protected Boolean WaiveUnmetObligation;
  protected Date InactiveDt;
  protected Boolean ocdFindExistingSO;
  protected Boolean ocdVerboseResponse;
/**
 *
 * Constructor to create a  OrderedContractDisconnectBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedContractDisconnectBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectData ocdContractInIn, OrderObjectData ocdOrderInIn, ServiceOrderObjectData ocdServiceOrderInIn, Boolean WaiveTerminationIn, Boolean WaiveUnmetObligationIn, Date InactiveDtIn, Boolean ocdFindExistingSOIn, Boolean ocdVerboseResponseIn) {
    super(id, context, "OrderedContractDisconnect");
    ocdContractIn = ocdContractInIn;
    ocdOrderIn = ocdOrderInIn;
    ocdServiceOrderIn = ocdServiceOrderInIn;
    WaiveTermination = WaiveTerminationIn;
    WaiveUnmetObligation = WaiveUnmetObligationIn;
    InactiveDt = InactiveDtIn;
    ocdFindExistingSO = ocdFindExistingSOIn;
    ocdVerboseResponse = ocdVerboseResponseIn;
  }

  public void translateToMap() {
    if (ocdContractIn != null) {
      ocdContractIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectHelper.toMap(ocdContractIn, new HashMap(), "OrderedContractDisconnectOutputData").get("OrderedContractDisconnectOutputData"));
    }
    if (ocdOrderIn != null) {
      ocdOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(ocdOrderIn, new HashMap(), "OrderedContractDisconnectOutputData").get("OrderedContractDisconnectOutputData"));
    }
    if (ocdServiceOrderIn != null) {
      ocdServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ocdServiceOrderIn, new HashMap(), "OrderedContractDisconnectOutputData").get("OrderedContractDisconnectOutputData"));
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
    if (ocdFindExistingSO != null) {
      addInput("FindExistingSO", ocdFindExistingSO);
    }
    if (ocdVerboseResponse != null) {
      addInput("VerboseResponse", ocdVerboseResponse);
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param ocdContractInIn Value of the ocdContractIn
 *
 */

  public void setCustomerContract(CustomerContractObjectData ocdContractInIn) {
    ocdContractIn = ocdContractInIn;
  }

/**
 *
 * Sets the Order
 * @param ocdOrderInIn Value of the ocdOrderIn
 *
 */

  public void setOrder(OrderObjectData ocdOrderInIn) {
    ocdOrderIn = ocdOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param ocdServiceOrderInIn Value of the ocdServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData ocdServiceOrderInIn) {
    ocdServiceOrderIn = ocdServiceOrderInIn;
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
 * @param ocdFindExistingSOIn Value of the ocdFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean ocdFindExistingSOIn) {
    ocdFindExistingSO = ocdFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param ocdVerboseResponseIn Value of the ocdVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean ocdVerboseResponseIn) {
    ocdVerboseResponse = ocdVerboseResponseIn;
  }

  public void translateFromMap() {
    ocdContractIn = CustomerContractObjectHelper.fromMap(inputMap, "CustomerContract");
    ocdOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    ocdServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    WaiveTermination = (Boolean)inputMap.get("WaiveTermination");
    WaiveUnmetObligation = (Boolean)inputMap.get("WaiveUnmetObligation");
    InactiveDt = (Date)inputMap.get("InactiveDt");
    ocdFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    ocdVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectData getCustomerContract( ) {
    return ocdContractIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return ocdOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return ocdServiceOrderIn;
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
    return ocdFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return ocdVerboseResponse;
  }

}
