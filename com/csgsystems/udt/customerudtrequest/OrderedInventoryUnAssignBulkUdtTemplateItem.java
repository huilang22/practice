/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInventoryUnAssignBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderedInventoryUnAssignBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedInventoryUnAssignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData oInvUInvElementIn;
  protected OrderObjectData oInvUOrderIn;
  protected ServiceOrderObjectData oInvUServiceOrderIn;
  protected Date oInvUEffectiveDt;
  protected Integer DisconnectReason;
  protected Boolean oInvUManageVanityCharges;
  protected Boolean oInvUFindExistingSO;
  protected Boolean oInvUVerboseResponse;
/**
 *
 * Constructor to create a  OrderedInventoryUnAssignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedInventoryUnAssignBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData oInvUInvElementInIn, OrderObjectData oInvUOrderInIn, ServiceOrderObjectData oInvUServiceOrderInIn, Date oInvUEffectiveDtIn, Integer DisconnectReasonIn, Boolean oInvUManageVanityChargesIn, Boolean oInvUFindExistingSOIn, Boolean oInvUVerboseResponseIn) {
    super(id, context, "OrderedInventoryUnAssign");
    oInvUInvElementIn = oInvUInvElementInIn;
    oInvUOrderIn = oInvUOrderInIn;
    oInvUServiceOrderIn = oInvUServiceOrderInIn;
    oInvUEffectiveDt = oInvUEffectiveDtIn;
    DisconnectReason = DisconnectReasonIn;
    oInvUManageVanityCharges = oInvUManageVanityChargesIn;
    oInvUFindExistingSO = oInvUFindExistingSOIn;
    oInvUVerboseResponse = oInvUVerboseResponseIn;
  }

  public void translateToMap() {
    if (oInvUInvElementIn != null) {
      oInvUInvElementIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(oInvUInvElementIn, new HashMap(), "OrderedInventoryUnAssignOutputData").get("OrderedInventoryUnAssignOutputData"));
    }
    if (oInvUOrderIn != null) {
      oInvUOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oInvUOrderIn, new HashMap(), "OrderedInventoryUnAssignOutputData").get("OrderedInventoryUnAssignOutputData"));
    }
    if (oInvUServiceOrderIn != null) {
      oInvUServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oInvUServiceOrderIn, new HashMap(), "OrderedInventoryUnAssignOutputData").get("OrderedInventoryUnAssignOutputData"));
    }
    if (oInvUEffectiveDt != null) {
      addInput("EffectiveDt", oInvUEffectiveDt);
    }
    if (DisconnectReason != null) {
      addInput("DisconnectReason", DisconnectReason);
    }
    if (oInvUManageVanityCharges != null) {
      addInput("ManageVanityCharges", oInvUManageVanityCharges);
    }
    if (oInvUFindExistingSO != null) {
      addInput("FindExistingSO", oInvUFindExistingSO);
    }
    if (oInvUVerboseResponse != null) {
      addInput("VerboseResponse", oInvUVerboseResponse);
    }
  }


/**
 *
 * Sets the InvElement
 * @param oInvUInvElementInIn Value of the oInvUInvElementIn
 *
 */

  public void setInvElement(InvElementObjData oInvUInvElementInIn) {
    oInvUInvElementIn = oInvUInvElementInIn;
  }

/**
 *
 * Sets the Order
 * @param oInvUOrderInIn Value of the oInvUOrderIn
 *
 */

  public void setOrder(OrderObjectData oInvUOrderInIn) {
    oInvUOrderIn = oInvUOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param oInvUServiceOrderInIn Value of the oInvUServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData oInvUServiceOrderInIn) {
    oInvUServiceOrderIn = oInvUServiceOrderInIn;
  }

/**
 *
 * Sets the EffectiveDt
 * @param oInvUEffectiveDtIn Value of the oInvUEffectiveDt
 *
 */

  public void setEffectiveDt(Date oInvUEffectiveDtIn) {
    oInvUEffectiveDt = oInvUEffectiveDtIn;
  }

/**
 *
 * Sets the DisconnectReason
 * @param DisconnectReasonIn Value of the DisconnectReason
 *
 */

  public void setDisconnectReason(Integer DisconnectReasonIn) {
    DisconnectReason = DisconnectReasonIn;
  }

/**
 *
 * Sets the ManageVanityCharges
 * @param oInvUManageVanityChargesIn Value of the oInvUManageVanityCharges
 *
 */

  public void setManageVanityCharges(Boolean oInvUManageVanityChargesIn) {
    oInvUManageVanityCharges = oInvUManageVanityChargesIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param oInvUFindExistingSOIn Value of the oInvUFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean oInvUFindExistingSOIn) {
    oInvUFindExistingSO = oInvUFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oInvUVerboseResponseIn Value of the oInvUVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oInvUVerboseResponseIn) {
    oInvUVerboseResponse = oInvUVerboseResponseIn;
  }

  public void translateFromMap() {
    oInvUInvElementIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
    oInvUOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oInvUServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    oInvUEffectiveDt = (Date)inputMap.get("EffectiveDt");
    DisconnectReason = (Integer)inputMap.get("DisconnectReason");
    oInvUManageVanityCharges = (Boolean)inputMap.get("ManageVanityCharges");
    oInvUFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    oInvUVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return oInvUInvElementIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oInvUOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return oInvUServiceOrderIn;
  }

/**
 *
 * Gets the EffectiveDt
 * @return Value of the EffectiveDt
 *
 */

  public Date getEffectiveDt( ) {
    return oInvUEffectiveDt;
  }

/**
 *
 * Gets the DisconnectReason
 * @return Value of the DisconnectReason
 *
 */

  public Integer getDisconnectReason( ) {
    return DisconnectReason;
  }

/**
 *
 * Gets the ManageVanityCharges
 * @return Value of the ManageVanityCharges
 *
 */

  public Boolean getManageVanityCharges( ) {
    return oInvUManageVanityCharges;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return oInvUFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oInvUVerboseResponse;
  }

}
