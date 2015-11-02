/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedInventoryAssignBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderedInventoryAssignBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedInventoryAssignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData oInvAInvElementIn;
  protected ServiceObjectData oInvAServiceIn;
  protected OrderObjectData oInvAOrderIn;
  protected ServiceOrderObjectData oInvAServiceOrderIn;
  protected InvPlaceholderObjectData oInvAInvPlaceholderIn;
  protected Date oInvAEffectiveDt;
  protected Integer oInvAExternalIdType;
  protected Boolean oInvAManageVanityCharges;
  protected Boolean oInvAFindExistingSO;
  protected Boolean oInvAVerboseResponse;
/**
 *
 * Constructor to create a  OrderedInventoryAssignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedInventoryAssignBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData oInvAInvElementInIn, ServiceObjectData oInvAServiceInIn, OrderObjectData oInvAOrderInIn, ServiceOrderObjectData oInvAServiceOrderInIn, InvPlaceholderObjectData oInvAInvPlaceholderInIn, Date oInvAEffectiveDtIn, Integer oInvAExternalIdTypeIn, Boolean oInvAManageVanityChargesIn, Boolean oInvAFindExistingSOIn, Boolean oInvAVerboseResponseIn) {
    super(id, context, "OrderedInventoryAssign");
    oInvAInvElementIn = oInvAInvElementInIn;
    oInvAServiceIn = oInvAServiceInIn;
    oInvAOrderIn = oInvAOrderInIn;
    oInvAServiceOrderIn = oInvAServiceOrderInIn;
    oInvAInvPlaceholderIn = oInvAInvPlaceholderInIn;
    oInvAEffectiveDt = oInvAEffectiveDtIn;
    oInvAExternalIdType = oInvAExternalIdTypeIn;
    oInvAManageVanityCharges = oInvAManageVanityChargesIn;
    oInvAFindExistingSO = oInvAFindExistingSOIn;
    oInvAVerboseResponse = oInvAVerboseResponseIn;
  }

  public void translateToMap() {
    if (oInvAInvElementIn != null) {
      oInvAInvElementIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(oInvAInvElementIn, new HashMap(), "OrderedInventoryAssignOutputData").get("OrderedInventoryAssignOutputData"));
    }
    if (oInvAServiceIn != null) {
      oInvAServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(oInvAServiceIn, new HashMap(), "OrderedInventoryAssignOutputData").get("OrderedInventoryAssignOutputData"));
    }
    if (oInvAOrderIn != null) {
      oInvAOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oInvAOrderIn, new HashMap(), "OrderedInventoryAssignOutputData").get("OrderedInventoryAssignOutputData"));
    }
    if (oInvAServiceOrderIn != null) {
      oInvAServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oInvAServiceOrderIn, new HashMap(), "OrderedInventoryAssignOutputData").get("OrderedInventoryAssignOutputData"));
    }
    if (oInvAInvPlaceholderIn != null) {
      oInvAInvPlaceholderIn.resetFlags(true, true);
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(oInvAInvPlaceholderIn, new HashMap(), "OrderedInventoryAssignOutputData").get("OrderedInventoryAssignOutputData"));
    }
    if (oInvAEffectiveDt != null) {
      addInput("EffectiveDt", oInvAEffectiveDt);
    }
    if (oInvAExternalIdType != null) {
      addInput("ExternalIdType", oInvAExternalIdType);
    }
    if (oInvAManageVanityCharges != null) {
      addInput("ManageVanityCharges", oInvAManageVanityCharges);
    }
    if (oInvAFindExistingSO != null) {
      addInput("FindExistingSO", oInvAFindExistingSO);
    }
    if (oInvAVerboseResponse != null) {
      addInput("VerboseResponse", oInvAVerboseResponse);
    }
  }


/**
 *
 * Sets the InvElement
 * @param oInvAInvElementInIn Value of the oInvAInvElementIn
 *
 */

  public void setInvElement(InvElementObjData oInvAInvElementInIn) {
    oInvAInvElementIn = oInvAInvElementInIn;
  }

/**
 *
 * Sets the Service
 * @param oInvAServiceInIn Value of the oInvAServiceIn
 *
 */

  public void setService(ServiceObjectData oInvAServiceInIn) {
    oInvAServiceIn = oInvAServiceInIn;
  }

/**
 *
 * Sets the Order
 * @param oInvAOrderInIn Value of the oInvAOrderIn
 *
 */

  public void setOrder(OrderObjectData oInvAOrderInIn) {
    oInvAOrderIn = oInvAOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param oInvAServiceOrderInIn Value of the oInvAServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData oInvAServiceOrderInIn) {
    oInvAServiceOrderIn = oInvAServiceOrderInIn;
  }

/**
 *
 * Sets the InvPlaceholder
 * @param oInvAInvPlaceholderInIn Value of the oInvAInvPlaceholderIn
 *
 */

  public void setInvPlaceholder(InvPlaceholderObjectData oInvAInvPlaceholderInIn) {
    oInvAInvPlaceholderIn = oInvAInvPlaceholderInIn;
  }

/**
 *
 * Sets the EffectiveDt
 * @param oInvAEffectiveDtIn Value of the oInvAEffectiveDt
 *
 */

  public void setEffectiveDt(Date oInvAEffectiveDtIn) {
    oInvAEffectiveDt = oInvAEffectiveDtIn;
  }

/**
 *
 * Sets the ExternalIdType
 * @param oInvAExternalIdTypeIn Value of the oInvAExternalIdType
 *
 */

  public void setExternalIdType(Integer oInvAExternalIdTypeIn) {
    oInvAExternalIdType = oInvAExternalIdTypeIn;
  }

/**
 *
 * Sets the ManageVanityCharges
 * @param oInvAManageVanityChargesIn Value of the oInvAManageVanityCharges
 *
 */

  public void setManageVanityCharges(Boolean oInvAManageVanityChargesIn) {
    oInvAManageVanityCharges = oInvAManageVanityChargesIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param oInvAFindExistingSOIn Value of the oInvAFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean oInvAFindExistingSOIn) {
    oInvAFindExistingSO = oInvAFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oInvAVerboseResponseIn Value of the oInvAVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oInvAVerboseResponseIn) {
    oInvAVerboseResponse = oInvAVerboseResponseIn;
  }

  public void translateFromMap() {
    oInvAInvElementIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
    oInvAServiceIn = ServiceObjectHelper.fromMap(inputMap, "Service");
    oInvAOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oInvAServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    oInvAInvPlaceholderIn = InvPlaceholderObjectHelper.fromMap(inputMap, "InvPlaceholder");
    oInvAEffectiveDt = (Date)inputMap.get("EffectiveDt");
    oInvAExternalIdType = (Integer)inputMap.get("ExternalIdType");
    oInvAManageVanityCharges = (Boolean)inputMap.get("ManageVanityCharges");
    oInvAFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    oInvAVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return oInvAInvElementIn;
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectData getService( ) {
    return oInvAServiceIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oInvAOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return oInvAServiceOrderIn;
  }

/**
 *
 * Gets the InvPlaceholder
 * @return Value of the InvPlaceholder
 *
 */

  public InvPlaceholderObjectData getInvPlaceholder( ) {
    return oInvAInvPlaceholderIn;
  }

/**
 *
 * Gets the EffectiveDt
 * @return Value of the EffectiveDt
 *
 */

  public Date getEffectiveDt( ) {
    return oInvAEffectiveDt;
  }

/**
 *
 * Gets the ExternalIdType
 * @return Value of the ExternalIdType
 *
 */

  public Integer getExternalIdType( ) {
    return oInvAExternalIdType;
  }

/**
 *
 * Gets the ManageVanityCharges
 * @return Value of the ManageVanityCharges
 *
 */

  public Boolean getManageVanityCharges( ) {
    return oInvAManageVanityCharges;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return oInvAFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oInvAVerboseResponse;
  }

}
