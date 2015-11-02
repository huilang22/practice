/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInventorySwapBulkUdtTemplateItem.java
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
 * Class used to create a OrderedInventorySwapBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedInventorySwapBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData oInvSSwapInInvElementIn;
  protected InvElementObjData oInvSSwapOutInvElementIn;
  protected ServiceObjectData oInvSServiceIn;
  protected OrderObjectData oInvSOrderIn;
  protected ServiceOrderObjectData oInvSServiceOrderIn;
  protected Date oInvSEffectiveDt;
  protected Integer oInvSExternalIdType;
  protected Boolean oInvSManageVanityCharges;
  protected Integer SwapReason;
  protected Boolean oInvSFindExistingSO;
  protected Boolean oInvSVerboseResponse;
/**
 *
 * Constructor to create a  OrderedInventorySwapBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedInventorySwapBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData oInvSSwapInInvElementInIn, InvElementObjData oInvSSwapOutInvElementInIn, ServiceObjectData oInvSServiceInIn, OrderObjectData oInvSOrderInIn, ServiceOrderObjectData oInvSServiceOrderInIn, Date oInvSEffectiveDtIn, Integer oInvSExternalIdTypeIn, Boolean oInvSManageVanityChargesIn, Integer SwapReasonIn, Boolean oInvSFindExistingSOIn, Boolean oInvSVerboseResponseIn) {
    super(id, context, "OrderedInventorySwap");
    oInvSSwapInInvElementIn = oInvSSwapInInvElementInIn;
    oInvSSwapOutInvElementIn = oInvSSwapOutInvElementInIn;
    oInvSServiceIn = oInvSServiceInIn;
    oInvSOrderIn = oInvSOrderInIn;
    oInvSServiceOrderIn = oInvSServiceOrderInIn;
    oInvSEffectiveDt = oInvSEffectiveDtIn;
    oInvSExternalIdType = oInvSExternalIdTypeIn;
    oInvSManageVanityCharges = oInvSManageVanityChargesIn;
    SwapReason = SwapReasonIn;
    oInvSFindExistingSO = oInvSFindExistingSOIn;
    oInvSVerboseResponse = oInvSVerboseResponseIn;
  }

  public void translateToMap() {
    if (oInvSSwapInInvElementIn != null) {
      oInvSSwapInInvElementIn.resetFlags(true, true);
      addInput("SwapInInvElement", InvElementObjHelper.toMap(oInvSSwapInInvElementIn, new HashMap(), "OrderedInventorySwapOutputData").get("OrderedInventorySwapOutputData"));
    }
    if (oInvSSwapOutInvElementIn != null) {
      oInvSSwapOutInvElementIn.resetFlags(true, true);
      addInput("SwapOutInvElement", InvElementObjHelper.toMap(oInvSSwapOutInvElementIn, new HashMap(), "OrderedInventorySwapOutputData").get("OrderedInventorySwapOutputData"));
    }
    if (oInvSServiceIn != null) {
      oInvSServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(oInvSServiceIn, new HashMap(), "OrderedInventorySwapOutputData").get("OrderedInventorySwapOutputData"));
    }
    if (oInvSOrderIn != null) {
      oInvSOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oInvSOrderIn, new HashMap(), "OrderedInventorySwapOutputData").get("OrderedInventorySwapOutputData"));
    }
    if (oInvSServiceOrderIn != null) {
      oInvSServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oInvSServiceOrderIn, new HashMap(), "OrderedInventorySwapOutputData").get("OrderedInventorySwapOutputData"));
    }
    if (oInvSEffectiveDt != null) {
      addInput("EffectiveDt", oInvSEffectiveDt);
    }
    if (oInvSExternalIdType != null) {
      addInput("ExternalIdType", oInvSExternalIdType);
    }
    if (oInvSManageVanityCharges != null) {
      addInput("ManageVanityCharges", oInvSManageVanityCharges);
    }
    if (SwapReason != null) {
      addInput("SwapReason", SwapReason);
    }
    if (oInvSFindExistingSO != null) {
      addInput("FindExistingSO", oInvSFindExistingSO);
    }
    if (oInvSVerboseResponse != null) {
      addInput("VerboseResponse", oInvSVerboseResponse);
    }
  }


/**
 *
 * Sets the SwapInInvElement
 * @param oInvSSwapInInvElementInIn Value of the oInvSSwapInInvElementIn
 *
 */

  public void setSwapInInvElement(InvElementObjData oInvSSwapInInvElementInIn) {
    oInvSSwapInInvElementIn = oInvSSwapInInvElementInIn;
  }

/**
 *
 * Sets the SwapOutInvElement
 * @param oInvSSwapOutInvElementInIn Value of the oInvSSwapOutInvElementIn
 *
 */

  public void setSwapOutInvElement(InvElementObjData oInvSSwapOutInvElementInIn) {
    oInvSSwapOutInvElementIn = oInvSSwapOutInvElementInIn;
  }

/**
 *
 * Sets the Service
 * @param oInvSServiceInIn Value of the oInvSServiceIn
 *
 */

  public void setService(ServiceObjectData oInvSServiceInIn) {
    oInvSServiceIn = oInvSServiceInIn;
  }

/**
 *
 * Sets the Order
 * @param oInvSOrderInIn Value of the oInvSOrderIn
 *
 */

  public void setOrder(OrderObjectData oInvSOrderInIn) {
    oInvSOrderIn = oInvSOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param oInvSServiceOrderInIn Value of the oInvSServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData oInvSServiceOrderInIn) {
    oInvSServiceOrderIn = oInvSServiceOrderInIn;
  }

/**
 *
 * Sets the EffectiveDt
 * @param oInvSEffectiveDtIn Value of the oInvSEffectiveDt
 *
 */

  public void setEffectiveDt(Date oInvSEffectiveDtIn) {
    oInvSEffectiveDt = oInvSEffectiveDtIn;
  }

/**
 *
 * Sets the ExternalIdType
 * @param oInvSExternalIdTypeIn Value of the oInvSExternalIdType
 *
 */

  public void setExternalIdType(Integer oInvSExternalIdTypeIn) {
    oInvSExternalIdType = oInvSExternalIdTypeIn;
  }

/**
 *
 * Sets the ManageVanityCharges
 * @param oInvSManageVanityChargesIn Value of the oInvSManageVanityCharges
 *
 */

  public void setManageVanityCharges(Boolean oInvSManageVanityChargesIn) {
    oInvSManageVanityCharges = oInvSManageVanityChargesIn;
  }

/**
 *
 * Sets the SwapReason
 * @param SwapReasonIn Value of the SwapReason
 *
 */

  public void setSwapReason(Integer SwapReasonIn) {
    SwapReason = SwapReasonIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param oInvSFindExistingSOIn Value of the oInvSFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean oInvSFindExistingSOIn) {
    oInvSFindExistingSO = oInvSFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oInvSVerboseResponseIn Value of the oInvSVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oInvSVerboseResponseIn) {
    oInvSVerboseResponse = oInvSVerboseResponseIn;
  }

  public void translateFromMap() {
    oInvSSwapInInvElementIn = InvElementObjHelper.fromMap(inputMap, "SwapInInvElement");
    oInvSSwapOutInvElementIn = InvElementObjHelper.fromMap(inputMap, "SwapOutInvElement");
    oInvSServiceIn = ServiceObjectHelper.fromMap(inputMap, "Service");
    oInvSOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oInvSServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    oInvSEffectiveDt = (Date)inputMap.get("EffectiveDt");
    oInvSExternalIdType = (Integer)inputMap.get("ExternalIdType");
    oInvSManageVanityCharges = (Boolean)inputMap.get("ManageVanityCharges");
    SwapReason = (Integer)inputMap.get("SwapReason");
    oInvSFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    oInvSVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the SwapInInvElement
 * @return Value of the SwapInInvElement
 *
 */

  public InvElementObjData getSwapInInvElement( ) {
    return oInvSSwapInInvElementIn;
  }

/**
 *
 * Gets the SwapOutInvElement
 * @return Value of the SwapOutInvElement
 *
 */

  public InvElementObjData getSwapOutInvElement( ) {
    return oInvSSwapOutInvElementIn;
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectData getService( ) {
    return oInvSServiceIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oInvSOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return oInvSServiceOrderIn;
  }

/**
 *
 * Gets the EffectiveDt
 * @return Value of the EffectiveDt
 *
 */

  public Date getEffectiveDt( ) {
    return oInvSEffectiveDt;
  }

/**
 *
 * Gets the ExternalIdType
 * @return Value of the ExternalIdType
 *
 */

  public Integer getExternalIdType( ) {
    return oInvSExternalIdType;
  }

/**
 *
 * Gets the ManageVanityCharges
 * @return Value of the ManageVanityCharges
 *
 */

  public Boolean getManageVanityCharges( ) {
    return oInvSManageVanityCharges;
  }

/**
 *
 * Gets the SwapReason
 * @return Value of the SwapReason
 *
 */

  public Integer getSwapReason( ) {
    return SwapReason;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return oInvSFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oInvSVerboseResponse;
  }

}
