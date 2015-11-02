/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedAccountBalanceDisconnectBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderedAccountBalanceDisconnectBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedAccountBalanceDisconnectBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBalancesObjectData oabdAccountBalancesIn;
  protected OrderObjectData oabdOrderIn;
  protected Integer StatusReasonId;
  protected Date InactiveDt;
  protected String Annotation;
  protected Integer NewBalanceAccountInternalId;
  protected Integer NewOpenItemId;
  protected Boolean oabdVerboseResponse;
/**
 *
 * Constructor to create a  OrderedAccountBalanceDisconnectBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedAccountBalanceDisconnectBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectData oabdAccountBalancesInIn, OrderObjectData oabdOrderInIn, Integer StatusReasonIdIn, Date InactiveDtIn, String AnnotationIn, Integer NewBalanceAccountInternalIdIn, Integer NewOpenItemIdIn, Boolean oabdVerboseResponseIn) {
    super(id, context, "OrderedAccountBalanceDisconnect");
    oabdAccountBalancesIn = oabdAccountBalancesInIn;
    oabdOrderIn = oabdOrderInIn;
    StatusReasonId = StatusReasonIdIn;
    InactiveDt = InactiveDtIn;
    Annotation = AnnotationIn;
    NewBalanceAccountInternalId = NewBalanceAccountInternalIdIn;
    NewOpenItemId = NewOpenItemIdIn;
    oabdVerboseResponse = oabdVerboseResponseIn;
  }

  public void translateToMap() {
    if (oabdAccountBalancesIn != null) {
      oabdAccountBalancesIn.resetFlags(true, true);
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(oabdAccountBalancesIn, new HashMap(), "OrderedAccountBalanceDisconnectOutputData").get("OrderedAccountBalanceDisconnectOutputData"));
    }
    if (oabdOrderIn != null) {
      oabdOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oabdOrderIn, new HashMap(), "OrderedAccountBalanceDisconnectOutputData").get("OrderedAccountBalanceDisconnectOutputData"));
    }
    if (StatusReasonId != null) {
      addInput("StatusReasonId", StatusReasonId);
    }
    if (InactiveDt != null) {
      addInput("InactiveDt", InactiveDt);
    }
    if (Annotation != null) {
      addInput("Annotation", Annotation);
    }
    if (NewBalanceAccountInternalId != null) {
      addInput("NewBalanceAccountInternalId", NewBalanceAccountInternalId);
    }
    if (NewOpenItemId != null) {
      addInput("NewOpenItemId", NewOpenItemId);
    }
    if (oabdVerboseResponse != null) {
      addInput("VerboseResponse", oabdVerboseResponse);
    }
  }


/**
 *
 * Sets the AccountBalances
 * @param oabdAccountBalancesInIn Value of the oabdAccountBalancesIn
 *
 */

  public void setAccountBalances(AccountBalancesObjectData oabdAccountBalancesInIn) {
    oabdAccountBalancesIn = oabdAccountBalancesInIn;
  }

/**
 *
 * Sets the Order
 * @param oabdOrderInIn Value of the oabdOrderIn
 *
 */

  public void setOrder(OrderObjectData oabdOrderInIn) {
    oabdOrderIn = oabdOrderInIn;
  }

/**
 *
 * Sets the StatusReasonId
 * @param StatusReasonIdIn Value of the StatusReasonId
 *
 */

  public void setStatusReasonId(Integer StatusReasonIdIn) {
    StatusReasonId = StatusReasonIdIn;
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
 * Sets the Annotation
 * @param AnnotationIn Value of the Annotation
 *
 */

  public void setAnnotation(String AnnotationIn) {
    Annotation = AnnotationIn;
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
 * @param oabdVerboseResponseIn Value of the oabdVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oabdVerboseResponseIn) {
    oabdVerboseResponse = oabdVerboseResponseIn;
  }

  public void translateFromMap() {
    oabdAccountBalancesIn = AccountBalancesObjectHelper.fromMap(inputMap, "AccountBalances");
    oabdOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    StatusReasonId = (Integer)inputMap.get("StatusReasonId");
    InactiveDt = (Date)inputMap.get("InactiveDt");
    Annotation = (String)inputMap.get("Annotation");
    NewBalanceAccountInternalId = (Integer)inputMap.get("NewBalanceAccountInternalId");
    NewOpenItemId = (Integer)inputMap.get("NewOpenItemId");
    oabdVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the AccountBalances
 * @return Value of the AccountBalances
 *
 */

  public AccountBalancesObjectData getAccountBalances( ) {
    return oabdAccountBalancesIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oabdOrderIn;
  }

/**
 *
 * Gets the StatusReasonId
 * @return Value of the StatusReasonId
 *
 */

  public Integer getStatusReasonId( ) {
    return StatusReasonId;
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
 * Gets the Annotation
 * @return Value of the Annotation
 *
 */

  public String getAnnotation( ) {
    return Annotation;
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
    return oabdVerboseResponse;
  }

}
