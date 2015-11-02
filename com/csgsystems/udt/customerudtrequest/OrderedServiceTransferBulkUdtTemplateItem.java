/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedServiceTransferBulkUdtTemplateItem.java
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
 * Class used to create a OrderedServiceTransferBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedServiceTransferBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectData osTransferServiceIn;
  protected OrderObjectData osTransferOrderIn;
  protected Integer osTransferStatusReasonId;
  protected Date TransferDt;
  protected Integer TransferToAccountInternalId;
  protected String osTransferAnnotation;
  protected Integer NewPostpaidAccountInternalId;
  protected Integer NewBalanceAccountInternalId;
  protected Integer WaiveInstallmentNrcs;
  protected Integer WaiveUnbilledNrcs;
  protected Integer WaiveRefinanceNrcs;
  protected Integer NewOpenItemId;
  protected Boolean osTVerboseResponse;
/**
 *
 * Constructor to create a  OrderedServiceTransferBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedServiceTransferBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectData osTransferServiceInIn, OrderObjectData osTransferOrderInIn, Integer osTransferStatusReasonIdIn, Date TransferDtIn, Integer TransferToAccountInternalIdIn, String osTransferAnnotationIn, Integer NewPostpaidAccountInternalIdIn, Integer NewBalanceAccountInternalIdIn, Integer WaiveInstallmentNrcsIn, Integer WaiveUnbilledNrcsIn, Integer WaiveRefinanceNrcsIn, Integer NewOpenItemIdIn, Boolean osTVerboseResponseIn) {
    super(id, context, "OrderedServiceTransfer");
    osTransferServiceIn = osTransferServiceInIn;
    osTransferOrderIn = osTransferOrderInIn;
    osTransferStatusReasonId = osTransferStatusReasonIdIn;
    TransferDt = TransferDtIn;
    TransferToAccountInternalId = TransferToAccountInternalIdIn;
    osTransferAnnotation = osTransferAnnotationIn;
    NewPostpaidAccountInternalId = NewPostpaidAccountInternalIdIn;
    NewBalanceAccountInternalId = NewBalanceAccountInternalIdIn;
    WaiveInstallmentNrcs = WaiveInstallmentNrcsIn;
    WaiveUnbilledNrcs = WaiveUnbilledNrcsIn;
    WaiveRefinanceNrcs = WaiveRefinanceNrcsIn;
    NewOpenItemId = NewOpenItemIdIn;
    osTVerboseResponse = osTVerboseResponseIn;
  }

  public void translateToMap() {
    if (osTransferServiceIn != null) {
      osTransferServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(osTransferServiceIn, new HashMap(), "OrderedServiceTransferOutputData").get("OrderedServiceTransferOutputData"));
    }
    if (osTransferOrderIn != null) {
      osTransferOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(osTransferOrderIn, new HashMap(), "OrderedServiceTransferOutputData").get("OrderedServiceTransferOutputData"));
    }
    if (osTransferStatusReasonId != null) {
      addInput("StatusReasonId", osTransferStatusReasonId);
    }
    if (TransferDt != null) {
      addInput("TransferDt", TransferDt);
    }
    if (TransferToAccountInternalId != null) {
      addInput("TransferToAccountInternalId", TransferToAccountInternalId);
    }
    if (osTransferAnnotation != null) {
      addInput("Annotation", osTransferAnnotation);
    }
    if (NewPostpaidAccountInternalId != null) {
      addInput("NewPostpaidAccountInternalId", NewPostpaidAccountInternalId);
    }
    if (NewBalanceAccountInternalId != null) {
      addInput("NewBalanceAccountInternalId", NewBalanceAccountInternalId);
    }
    if (WaiveInstallmentNrcs != null) {
      addInput("WaiveInstallmentNrcs", WaiveInstallmentNrcs);
    }
    if (WaiveUnbilledNrcs != null) {
      addInput("WaiveUnbilledNrcs", WaiveUnbilledNrcs);
    }
    if (WaiveRefinanceNrcs != null) {
      addInput("WaiveRefinanceNrcs", WaiveRefinanceNrcs);
    }
    if (NewOpenItemId != null) {
      addInput("NewOpenItemId", NewOpenItemId);
    }
    if (osTVerboseResponse != null) {
      addInput("VerboseResponse", osTVerboseResponse);
    }
  }


/**
 *
 * Sets the Service
 * @param osTransferServiceInIn Value of the osTransferServiceIn
 *
 */

  public void setService(ServiceObjectData osTransferServiceInIn) {
    osTransferServiceIn = osTransferServiceInIn;
  }

/**
 *
 * Sets the Order
 * @param osTransferOrderInIn Value of the osTransferOrderIn
 *
 */

  public void setOrder(OrderObjectData osTransferOrderInIn) {
    osTransferOrderIn = osTransferOrderInIn;
  }

/**
 *
 * Sets the StatusReasonId
 * @param osTransferStatusReasonIdIn Value of the osTransferStatusReasonId
 *
 */

  public void setStatusReasonId(Integer osTransferStatusReasonIdIn) {
    osTransferStatusReasonId = osTransferStatusReasonIdIn;
  }

/**
 *
 * Sets the TransferDt
 * @param TransferDtIn Value of the TransferDt
 *
 */

  public void setTransferDt(Date TransferDtIn) {
    TransferDt = TransferDtIn;
  }

/**
 *
 * Sets the TransferToAccountInternalId
 * @param TransferToAccountInternalIdIn Value of the TransferToAccountInternalId
 *
 */

  public void setTransferToAccountInternalId(Integer TransferToAccountInternalIdIn) {
    TransferToAccountInternalId = TransferToAccountInternalIdIn;
  }

/**
 *
 * Sets the Annotation
 * @param osTransferAnnotationIn Value of the osTransferAnnotation
 *
 */

  public void setAnnotation(String osTransferAnnotationIn) {
    osTransferAnnotation = osTransferAnnotationIn;
  }

/**
 *
 * Sets the NewPostpaidAccountInternalId
 * @param NewPostpaidAccountInternalIdIn Value of the NewPostpaidAccountInternalId
 *
 */

  public void setNewPostpaidAccountInternalId(Integer NewPostpaidAccountInternalIdIn) {
    NewPostpaidAccountInternalId = NewPostpaidAccountInternalIdIn;
  }

/**
 *
 * Sets the NewBalanceAccountInternalId
 * @param NewBalanceAccountInternalIdIn Value of the NewBalanceAccountInternalId
 *
 */

  public void setNewBalanceAccountInternalId(Integer NewBalanceAccountInternalIdIn) {
    NewBalanceAccountInternalId = NewBalanceAccountInternalIdIn;
  }

/**
 *
 * Sets the WaiveInstallmentNrcs
 * @param WaiveInstallmentNrcsIn Value of the WaiveInstallmentNrcs
 *
 */

  public void setWaiveInstallmentNrcs(Integer WaiveInstallmentNrcsIn) {
    WaiveInstallmentNrcs = WaiveInstallmentNrcsIn;
  }

/**
 *
 * Sets the WaiveUnbilledNrcs
 * @param WaiveUnbilledNrcsIn Value of the WaiveUnbilledNrcs
 *
 */

  public void setWaiveUnbilledNrcs(Integer WaiveUnbilledNrcsIn) {
    WaiveUnbilledNrcs = WaiveUnbilledNrcsIn;
  }

/**
 *
 * Sets the WaiveRefinanceNrcs
 * @param WaiveRefinanceNrcsIn Value of the WaiveRefinanceNrcs
 *
 */

  public void setWaiveRefinanceNrcs(Integer WaiveRefinanceNrcsIn) {
    WaiveRefinanceNrcs = WaiveRefinanceNrcsIn;
  }

/**
 *
 * Sets the NewOpenItemId
 * @param NewOpenItemIdIn Value of the NewOpenItemId
 *
 */

  public void setNewOpenItemId(Integer NewOpenItemIdIn) {
    NewOpenItemId = NewOpenItemIdIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param osTVerboseResponseIn Value of the osTVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean osTVerboseResponseIn) {
    osTVerboseResponse = osTVerboseResponseIn;
  }

  public void translateFromMap() {
    osTransferServiceIn = ServiceObjectHelper.fromMap(inputMap, "Service");
    osTransferOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    osTransferStatusReasonId = (Integer)inputMap.get("StatusReasonId");
    TransferDt = (Date)inputMap.get("TransferDt");
    TransferToAccountInternalId = (Integer)inputMap.get("TransferToAccountInternalId");
    osTransferAnnotation = (String)inputMap.get("Annotation");
    NewPostpaidAccountInternalId = (Integer)inputMap.get("NewPostpaidAccountInternalId");
    NewBalanceAccountInternalId = (Integer)inputMap.get("NewBalanceAccountInternalId");
    WaiveInstallmentNrcs = (Integer)inputMap.get("WaiveInstallmentNrcs");
    WaiveUnbilledNrcs = (Integer)inputMap.get("WaiveUnbilledNrcs");
    WaiveRefinanceNrcs = (Integer)inputMap.get("WaiveRefinanceNrcs");
    NewOpenItemId = (Integer)inputMap.get("NewOpenItemId");
    osTVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectData getService( ) {
    return osTransferServiceIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return osTransferOrderIn;
  }

/**
 *
 * Gets the StatusReasonId
 * @return Value of the StatusReasonId
 *
 */

  public Integer getStatusReasonId( ) {
    return osTransferStatusReasonId;
  }

/**
 *
 * Gets the TransferDt
 * @return Value of the TransferDt
 *
 */

  public Date getTransferDt( ) {
    return TransferDt;
  }

/**
 *
 * Gets the TransferToAccountInternalId
 * @return Value of the TransferToAccountInternalId
 *
 */

  public Integer getTransferToAccountInternalId( ) {
    return TransferToAccountInternalId;
  }

/**
 *
 * Gets the Annotation
 * @return Value of the Annotation
 *
 */

  public String getAnnotation( ) {
    return osTransferAnnotation;
  }

/**
 *
 * Gets the NewPostpaidAccountInternalId
 * @return Value of the NewPostpaidAccountInternalId
 *
 */

  public Integer getNewPostpaidAccountInternalId( ) {
    return NewPostpaidAccountInternalId;
  }

/**
 *
 * Gets the NewBalanceAccountInternalId
 * @return Value of the NewBalanceAccountInternalId
 *
 */

  public Integer getNewBalanceAccountInternalId( ) {
    return NewBalanceAccountInternalId;
  }

/**
 *
 * Gets the WaiveInstallmentNrcs
 * @return Value of the WaiveInstallmentNrcs
 *
 */

  public Integer getWaiveInstallmentNrcs( ) {
    return WaiveInstallmentNrcs;
  }

/**
 *
 * Gets the WaiveUnbilledNrcs
 * @return Value of the WaiveUnbilledNrcs
 *
 */

  public Integer getWaiveUnbilledNrcs( ) {
    return WaiveUnbilledNrcs;
  }

/**
 *
 * Gets the WaiveRefinanceNrcs
 * @return Value of the WaiveRefinanceNrcs
 *
 */

  public Integer getWaiveRefinanceNrcs( ) {
    return WaiveRefinanceNrcs;
  }

/**
 *
 * Gets the NewOpenItemId
 * @return Value of the NewOpenItemId
 *
 */

  public Integer getNewOpenItemId( ) {
    return NewOpenItemId;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return osTVerboseResponse;
  }

}
