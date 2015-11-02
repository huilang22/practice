/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedCiemDisconnectBulkUdtTemplateItem.java
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
 * Class used to create a OrderedCiemDisconnectBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedCiemDisconnectBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerIdEquipMapObjectData ociemDiscIn;
  protected OrderObjectData ociemDiscOrderIn;
  protected ServiceOrderObjectData ociemDiscServiceOrderIn;
  protected Date InactiveDt;
  protected Boolean ociemDiscFindExistingSOIn;
  protected Boolean ociemDiscVerboseResponseIn;
/**
 *
 * Constructor to create a  OrderedCiemDisconnectBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedCiemDisconnectBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerIdEquipMapObjectData ociemDiscInIn, OrderObjectData ociemDiscOrderInIn, ServiceOrderObjectData ociemDiscServiceOrderInIn, Date InactiveDtIn, Boolean ociemDiscFindExistingSOInIn, Boolean ociemDiscVerboseResponseInIn) {
    super(id, context, "OrderedCiemDisconnect");
    ociemDiscIn = ociemDiscInIn;
    ociemDiscOrderIn = ociemDiscOrderInIn;
    ociemDiscServiceOrderIn = ociemDiscServiceOrderInIn;
    InactiveDt = InactiveDtIn;
    ociemDiscFindExistingSOIn = ociemDiscFindExistingSOInIn;
    ociemDiscVerboseResponseIn = ociemDiscVerboseResponseInIn;
  }

  public void translateToMap() {
    if (ociemDiscIn != null) {
      ociemDiscIn.resetFlags(true, true);
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectHelper.toMap(ociemDiscIn, new HashMap(), "OrderedCiemDisconnectOutputData").get("OrderedCiemDisconnectOutputData"));
    }
    if (ociemDiscOrderIn != null) {
      ociemDiscOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(ociemDiscOrderIn, new HashMap(), "OrderedCiemDisconnectOutputData").get("OrderedCiemDisconnectOutputData"));
    }
    if (ociemDiscServiceOrderIn != null) {
      ociemDiscServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(ociemDiscServiceOrderIn, new HashMap(), "OrderedCiemDisconnectOutputData").get("OrderedCiemDisconnectOutputData"));
    }
    if (InactiveDt != null) {
      addInput("InactiveDt", InactiveDt);
    }
    if (ociemDiscFindExistingSOIn != null) {
      addInput("FindExistingSO", ociemDiscFindExistingSOIn);
    }
    if (ociemDiscVerboseResponseIn != null) {
      addInput("VerboseResponse", ociemDiscVerboseResponseIn);
    }
  }


/**
 *
 * Sets the CustomerIdEquipMap
 * @param ociemDiscInIn Value of the ociemDiscIn
 *
 */

  public void setCustomerIdEquipMap(CustomerIdEquipMapObjectData ociemDiscInIn) {
    ociemDiscIn = ociemDiscInIn;
  }

/**
 *
 * Sets the Order
 * @param ociemDiscOrderInIn Value of the ociemDiscOrderIn
 *
 */

  public void setOrder(OrderObjectData ociemDiscOrderInIn) {
    ociemDiscOrderIn = ociemDiscOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param ociemDiscServiceOrderInIn Value of the ociemDiscServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData ociemDiscServiceOrderInIn) {
    ociemDiscServiceOrderIn = ociemDiscServiceOrderInIn;
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
 * @param ociemDiscFindExistingSOInIn Value of the ociemDiscFindExistingSOIn
 *
 */

  public void setFindExistingSO(Boolean ociemDiscFindExistingSOInIn) {
    ociemDiscFindExistingSOIn = ociemDiscFindExistingSOInIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param ociemDiscVerboseResponseInIn Value of the ociemDiscVerboseResponseIn
 *
 */

  public void setVerboseResponse(Boolean ociemDiscVerboseResponseInIn) {
    ociemDiscVerboseResponseIn = ociemDiscVerboseResponseInIn;
  }

  public void translateFromMap() {
    ociemDiscIn = CustomerIdEquipMapObjectHelper.fromMap(inputMap, "CustomerIdEquipMap");
    ociemDiscOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    ociemDiscServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    InactiveDt = (Date)inputMap.get("InactiveDt");
    ociemDiscFindExistingSOIn = (Boolean)inputMap.get("FindExistingSO");
    ociemDiscVerboseResponseIn = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the CustomerIdEquipMap
 * @return Value of the CustomerIdEquipMap
 *
 */

  public CustomerIdEquipMapObjectData getCustomerIdEquipMap( ) {
    return ociemDiscIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return ociemDiscOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return ociemDiscServiceOrderIn;
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
    return ociemDiscFindExistingSOIn;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return ociemDiscVerboseResponseIn;
  }

}
