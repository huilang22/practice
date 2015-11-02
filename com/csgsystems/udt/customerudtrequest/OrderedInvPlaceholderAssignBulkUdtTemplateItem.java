/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedInvPlaceholderAssignBulkUdtTemplateItem.java
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
 * Class used to create a OrderedInvPlaceholderAssignBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedInvPlaceholderAssignBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvPlaceholderObjectData oipaInvPlaceholderIn;
  protected InvElementObjData oipaInvElementIn;
  protected ServiceObjectData oipaServiceIn;
  protected OrderObjectData oipaOrderIn;
  protected ServiceOrderObjectData oipaServiceOrderIn;
  protected Date oipaEffectiveDt;
  protected Integer oipaExternalIdType;
  protected Boolean oipaManageVanityCharges;
  protected Boolean oipaFindExistingSO;
  protected Boolean oipaVerboseResponse;
/**
 *
 * Constructor to create a  OrderedInvPlaceholderAssignBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedInvPlaceholderAssignBulkUdtTemplateItem(String id, BSDMSessionContext context, InvPlaceholderObjectData oipaInvPlaceholderInIn, InvElementObjData oipaInvElementInIn, ServiceObjectData oipaServiceInIn, OrderObjectData oipaOrderInIn, ServiceOrderObjectData oipaServiceOrderInIn, Date oipaEffectiveDtIn, Integer oipaExternalIdTypeIn, Boolean oipaManageVanityChargesIn, Boolean oipaFindExistingSOIn, Boolean oipaVerboseResponseIn) {
    super(id, context, "OrderedInvPlaceholderAssign");
    oipaInvPlaceholderIn = oipaInvPlaceholderInIn;
    oipaInvElementIn = oipaInvElementInIn;
    oipaServiceIn = oipaServiceInIn;
    oipaOrderIn = oipaOrderInIn;
    oipaServiceOrderIn = oipaServiceOrderInIn;
    oipaEffectiveDt = oipaEffectiveDtIn;
    oipaExternalIdType = oipaExternalIdTypeIn;
    oipaManageVanityCharges = oipaManageVanityChargesIn;
    oipaFindExistingSO = oipaFindExistingSOIn;
    oipaVerboseResponse = oipaVerboseResponseIn;
  }

  public void translateToMap() {
    if (oipaInvPlaceholderIn != null) {
      oipaInvPlaceholderIn.resetFlags(true, true);
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(oipaInvPlaceholderIn, new HashMap(), "OrderedInvPlaceholderAssignOutputData").get("OrderedInvPlaceholderAssignOutputData"));
    }
    if (oipaInvElementIn != null) {
      oipaInvElementIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(oipaInvElementIn, new HashMap(), "OrderedInvPlaceholderAssignOutputData").get("OrderedInvPlaceholderAssignOutputData"));
    }
    if (oipaServiceIn != null) {
      oipaServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(oipaServiceIn, new HashMap(), "OrderedInvPlaceholderAssignOutputData").get("OrderedInvPlaceholderAssignOutputData"));
    }
    if (oipaOrderIn != null) {
      oipaOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oipaOrderIn, new HashMap(), "OrderedInvPlaceholderAssignOutputData").get("OrderedInvPlaceholderAssignOutputData"));
    }
    if (oipaServiceOrderIn != null) {
      oipaServiceOrderIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(oipaServiceOrderIn, new HashMap(), "OrderedInvPlaceholderAssignOutputData").get("OrderedInvPlaceholderAssignOutputData"));
    }
    if (oipaEffectiveDt != null) {
      addInput("EffectiveDt", oipaEffectiveDt);
    }
    if (oipaExternalIdType != null) {
      addInput("ExternalIdType", oipaExternalIdType);
    }
    if (oipaManageVanityCharges != null) {
      addInput("ManageVanityCharges", oipaManageVanityCharges);
    }
    if (oipaFindExistingSO != null) {
      addInput("FindExistingSO", oipaFindExistingSO);
    }
    if (oipaVerboseResponse != null) {
      addInput("VerboseResponse", oipaVerboseResponse);
    }
  }


/**
 *
 * Sets the InvPlaceholder
 * @param oipaInvPlaceholderInIn Value of the oipaInvPlaceholderIn
 *
 */

  public void setInvPlaceholder(InvPlaceholderObjectData oipaInvPlaceholderInIn) {
    oipaInvPlaceholderIn = oipaInvPlaceholderInIn;
  }

/**
 *
 * Sets the InvElement
 * @param oipaInvElementInIn Value of the oipaInvElementIn
 *
 */

  public void setInvElement(InvElementObjData oipaInvElementInIn) {
    oipaInvElementIn = oipaInvElementInIn;
  }

/**
 *
 * Sets the Service
 * @param oipaServiceInIn Value of the oipaServiceIn
 *
 */

  public void setService(ServiceObjectData oipaServiceInIn) {
    oipaServiceIn = oipaServiceInIn;
  }

/**
 *
 * Sets the Order
 * @param oipaOrderInIn Value of the oipaOrderIn
 *
 */

  public void setOrder(OrderObjectData oipaOrderInIn) {
    oipaOrderIn = oipaOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param oipaServiceOrderInIn Value of the oipaServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData oipaServiceOrderInIn) {
    oipaServiceOrderIn = oipaServiceOrderInIn;
  }

/**
 *
 * Sets the EffectiveDt
 * @param oipaEffectiveDtIn Value of the oipaEffectiveDt
 *
 */

  public void setEffectiveDt(Date oipaEffectiveDtIn) {
    oipaEffectiveDt = oipaEffectiveDtIn;
  }

/**
 *
 * Sets the ExternalIdType
 * @param oipaExternalIdTypeIn Value of the oipaExternalIdType
 *
 */

  public void setExternalIdType(Integer oipaExternalIdTypeIn) {
    oipaExternalIdType = oipaExternalIdTypeIn;
  }

/**
 *
 * Sets the ManageVanityCharges
 * @param oipaManageVanityChargesIn Value of the oipaManageVanityCharges
 *
 */

  public void setManageVanityCharges(Boolean oipaManageVanityChargesIn) {
    oipaManageVanityCharges = oipaManageVanityChargesIn;
  }

/**
 *
 * Sets the FindExistingSO
 * @param oipaFindExistingSOIn Value of the oipaFindExistingSO
 *
 */

  public void setFindExistingSO(Boolean oipaFindExistingSOIn) {
    oipaFindExistingSO = oipaFindExistingSOIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oipaVerboseResponseIn Value of the oipaVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oipaVerboseResponseIn) {
    oipaVerboseResponse = oipaVerboseResponseIn;
  }

  public void translateFromMap() {
    oipaInvPlaceholderIn = InvPlaceholderObjectHelper.fromMap(inputMap, "InvPlaceholder");
    oipaInvElementIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
    oipaServiceIn = ServiceObjectHelper.fromMap(inputMap, "Service");
    oipaOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    oipaServiceOrderIn = ServiceOrderObjectHelper.fromMap(inputMap, "ServiceOrder");
    oipaEffectiveDt = (Date)inputMap.get("EffectiveDt");
    oipaExternalIdType = (Integer)inputMap.get("ExternalIdType");
    oipaManageVanityCharges = (Boolean)inputMap.get("ManageVanityCharges");
    oipaFindExistingSO = (Boolean)inputMap.get("FindExistingSO");
    oipaVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the InvPlaceholder
 * @return Value of the InvPlaceholder
 *
 */

  public InvPlaceholderObjectData getInvPlaceholder( ) {
    return oipaInvPlaceholderIn;
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return oipaInvElementIn;
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectData getService( ) {
    return oipaServiceIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oipaOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData getServiceOrder( ) {
    return oipaServiceOrderIn;
  }

/**
 *
 * Gets the EffectiveDt
 * @return Value of the EffectiveDt
 *
 */

  public Date getEffectiveDt( ) {
    return oipaEffectiveDt;
  }

/**
 *
 * Gets the ExternalIdType
 * @return Value of the ExternalIdType
 *
 */

  public Integer getExternalIdType( ) {
    return oipaExternalIdType;
  }

/**
 *
 * Gets the ManageVanityCharges
 * @return Value of the ManageVanityCharges
 *
 */

  public Boolean getManageVanityCharges( ) {
    return oipaManageVanityCharges;
  }

/**
 *
 * Gets the FindExistingSO
 * @return Value of the FindExistingSO
 *
 */

  public Boolean getFindExistingSO( ) {
    return oipaFindExistingSO;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oipaVerboseResponse;
  }

}
