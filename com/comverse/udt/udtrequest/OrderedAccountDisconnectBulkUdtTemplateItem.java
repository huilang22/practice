/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountDisconnectBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderedAccountDisconnectBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedAccountDisconnectBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectData oadAccountIn;
  protected Integer StatusReasonId;
  protected Date InactiveDt;
  protected String Annotation;
  protected Integer WaiveInstallmentNrc;
  protected Integer WaiveUnbilledNrc;
  protected Integer WaiveTerminationObligation;
  protected Integer WaiveUnmetObligation;
  protected Integer WaiveRefinanceNrc;
  protected Integer NewPostpaidAccountInternalId;
  protected Integer NewBalanceAccountInternalId;
  protected Integer NewOpenItemId;
  protected Boolean oadVerboseResponse;
/**
 *
 * Constructor to create a  OrderedAccountDisconnectBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedAccountDisconnectBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectData oadAccountInIn, Integer StatusReasonIdIn, Date InactiveDtIn, String AnnotationIn, Integer WaiveInstallmentNrcIn, Integer WaiveUnbilledNrcIn, Integer WaiveTerminationObligationIn, Integer WaiveUnmetObligationIn, Integer WaiveRefinanceNrcIn, Integer NewPostpaidAccountInternalIdIn, Integer NewBalanceAccountInternalIdIn, Integer NewOpenItemIdIn, Boolean oadVerboseResponseIn) {
    super(id, context, "OrderedAccountDisconnect");
    oadAccountIn = oadAccountInIn;
    StatusReasonId = StatusReasonIdIn;
    InactiveDt = InactiveDtIn;
    Annotation = AnnotationIn;
    WaiveInstallmentNrc = WaiveInstallmentNrcIn;
    WaiveUnbilledNrc = WaiveUnbilledNrcIn;
    WaiveTerminationObligation = WaiveTerminationObligationIn;
    WaiveUnmetObligation = WaiveUnmetObligationIn;
    WaiveRefinanceNrc = WaiveRefinanceNrcIn;
    NewPostpaidAccountInternalId = NewPostpaidAccountInternalIdIn;
    NewBalanceAccountInternalId = NewBalanceAccountInternalIdIn;
    NewOpenItemId = NewOpenItemIdIn;
    oadVerboseResponse = oadVerboseResponseIn;
  }

  public void translateToMap() {
    if (oadAccountIn != null) {
      oadAccountIn.resetFlags(true, true);
      addInput("Account", AccountObjectHelper.toMap(oadAccountIn, new HashMap(), "OrderedAccountDisconnectOutputData").get("OrderedAccountDisconnectOutputData"));
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
    if (WaiveInstallmentNrc != null) {
      addInput("WaiveInstallmentNrc", WaiveInstallmentNrc);
    }
    if (WaiveUnbilledNrc != null) {
      addInput("WaiveUnbilledNrc", WaiveUnbilledNrc);
    }
    if (WaiveTerminationObligation != null) {
      addInput("WaiveTerminationObligation", WaiveTerminationObligation);
    }
    if (WaiveUnmetObligation != null) {
      addInput("WaiveUnmetObligation", WaiveUnmetObligation);
    }
    if (WaiveRefinanceNrc != null) {
      addInput("WaiveRefinanceNrc", WaiveRefinanceNrc);
    }
    if (NewPostpaidAccountInternalId != null) {
      addInput("NewPostpaidAccountInternalId", NewPostpaidAccountInternalId);
    }
    if (NewBalanceAccountInternalId != null) {
      addInput("NewBalanceAccountInternalId", NewBalanceAccountInternalId);
    }
    if (NewOpenItemId != null) {
      addInput("NewOpenItemId", NewOpenItemId);
    }
    if (oadVerboseResponse != null) {
      addInput("VerboseResponse", oadVerboseResponse);
    }
  }


/**
 *
 * Sets the Account
 * @param oadAccountInIn Value of the oadAccountIn
 *
 */

  public void setAccount(AccountObjectData oadAccountInIn) {
    oadAccountIn = oadAccountInIn;
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
 * Sets the WaiveInstallmentNrc
 * @param WaiveInstallmentNrcIn Value of the WaiveInstallmentNrc
 *
 */

  public void setWaiveInstallmentNrc(Integer WaiveInstallmentNrcIn) {
    WaiveInstallmentNrc = WaiveInstallmentNrcIn;
  }

/**
 *
 * Sets the WaiveUnbilledNrc
 * @param WaiveUnbilledNrcIn Value of the WaiveUnbilledNrc
 *
 */

  public void setWaiveUnbilledNrc(Integer WaiveUnbilledNrcIn) {
    WaiveUnbilledNrc = WaiveUnbilledNrcIn;
  }

/**
 *
 * Sets the WaiveTerminationObligation
 * @param WaiveTerminationObligationIn Value of the WaiveTerminationObligation
 *
 */

  public void setWaiveTerminationObligation(Integer WaiveTerminationObligationIn) {
    WaiveTerminationObligation = WaiveTerminationObligationIn;
  }

/**
 *
 * Sets the WaiveUnmetObligation
 * @param WaiveUnmetObligationIn Value of the WaiveUnmetObligation
 *
 */

  public void setWaiveUnmetObligation(Integer WaiveUnmetObligationIn) {
    WaiveUnmetObligation = WaiveUnmetObligationIn;
  }

/**
 *
 * Sets the WaiveRefinanceNrc
 * @param WaiveRefinanceNrcIn Value of the WaiveRefinanceNrc
 *
 */

  public void setWaiveRefinanceNrc(Integer WaiveRefinanceNrcIn) {
    WaiveRefinanceNrc = WaiveRefinanceNrcIn;
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
 * @param oadVerboseResponseIn Value of the oadVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oadVerboseResponseIn) {
    oadVerboseResponse = oadVerboseResponseIn;
  }

  public void translateFromMap() {
    oadAccountIn = AccountObjectHelper.fromMap(inputMap, "Account");
    StatusReasonId = (Integer)inputMap.get("StatusReasonId");
    InactiveDt = (Date)inputMap.get("InactiveDt");
    Annotation = (String)inputMap.get("Annotation");
    WaiveInstallmentNrc = (Integer)inputMap.get("WaiveInstallmentNrc");
    WaiveUnbilledNrc = (Integer)inputMap.get("WaiveUnbilledNrc");
    WaiveTerminationObligation = (Integer)inputMap.get("WaiveTerminationObligation");
    WaiveUnmetObligation = (Integer)inputMap.get("WaiveUnmetObligation");
    WaiveRefinanceNrc = (Integer)inputMap.get("WaiveRefinanceNrc");
    NewPostpaidAccountInternalId = (Integer)inputMap.get("NewPostpaidAccountInternalId");
    NewBalanceAccountInternalId = (Integer)inputMap.get("NewBalanceAccountInternalId");
    NewOpenItemId = (Integer)inputMap.get("NewOpenItemId");
    oadVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectData getAccount( ) {
    return oadAccountIn;
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
 * Gets the WaiveInstallmentNrc
 * @return Value of the WaiveInstallmentNrc
 *
 */

  public Integer getWaiveInstallmentNrc( ) {
    return WaiveInstallmentNrc;
  }

/**
 *
 * Gets the WaiveUnbilledNrc
 * @return Value of the WaiveUnbilledNrc
 *
 */

  public Integer getWaiveUnbilledNrc( ) {
    return WaiveUnbilledNrc;
  }

/**
 *
 * Gets the WaiveTerminationObligation
 * @return Value of the WaiveTerminationObligation
 *
 */

  public Integer getWaiveTerminationObligation( ) {
    return WaiveTerminationObligation;
  }

/**
 *
 * Gets the WaiveUnmetObligation
 * @return Value of the WaiveUnmetObligation
 *
 */

  public Integer getWaiveUnmetObligation( ) {
    return WaiveUnmetObligation;
  }

/**
 *
 * Gets the WaiveRefinanceNrc
 * @return Value of the WaiveRefinanceNrc
 *
 */

  public Integer getWaiveRefinanceNrc( ) {
    return WaiveRefinanceNrc;
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
    return oadVerboseResponse;
  }

}
