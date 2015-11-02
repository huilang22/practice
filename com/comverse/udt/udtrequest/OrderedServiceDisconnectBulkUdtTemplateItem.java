/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceDisconnectBulkUdtTemplateItem.java
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
 * Class used to create a OrderedServiceDisconnectBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedServiceDisconnectBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectData osDiscServiceIn;
  protected OrderObjectData osDiscOrderIn;
  protected Integer StatusReasonId;
  protected Date InactiveDt;
  protected String Annotation;
  protected Integer WaiveInstallmentNrc;
  protected Integer WaiveUnbilledNrc;
  protected Integer WaiveTerminationObligation;
  protected Integer WaiveUnmetObligation;
  protected Integer WaiveRefinanceNrc;
  protected Boolean osDiscVerboseResponse;
/**
 *
 * Constructor to create a  OrderedServiceDisconnectBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedServiceDisconnectBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectData osDiscServiceInIn, OrderObjectData osDiscOrderInIn, Integer StatusReasonIdIn, Date InactiveDtIn, String AnnotationIn, Integer WaiveInstallmentNrcIn, Integer WaiveUnbilledNrcIn, Integer WaiveTerminationObligationIn, Integer WaiveUnmetObligationIn, Integer WaiveRefinanceNrcIn, Boolean osDiscVerboseResponseIn) {
    super(id, context, "OrderedServiceDisconnect");
    osDiscServiceIn = osDiscServiceInIn;
    osDiscOrderIn = osDiscOrderInIn;
    StatusReasonId = StatusReasonIdIn;
    InactiveDt = InactiveDtIn;
    Annotation = AnnotationIn;
    WaiveInstallmentNrc = WaiveInstallmentNrcIn;
    WaiveUnbilledNrc = WaiveUnbilledNrcIn;
    WaiveTerminationObligation = WaiveTerminationObligationIn;
    WaiveUnmetObligation = WaiveUnmetObligationIn;
    WaiveRefinanceNrc = WaiveRefinanceNrcIn;
    osDiscVerboseResponse = osDiscVerboseResponseIn;
  }

  public void translateToMap() {
    if (osDiscServiceIn != null) {
      osDiscServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(osDiscServiceIn, new HashMap(), "OrderedServiceDisconnectOutputData").get("OrderedServiceDisconnectOutputData"));
    }
    if (osDiscOrderIn != null) {
      osDiscOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(osDiscOrderIn, new HashMap(), "OrderedServiceDisconnectOutputData").get("OrderedServiceDisconnectOutputData"));
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
    if (osDiscVerboseResponse != null) {
      addInput("VerboseResponse", osDiscVerboseResponse);
    }
  }


/**
 *
 * Sets the Service
 * @param osDiscServiceInIn Value of the osDiscServiceIn
 *
 */

  public void setService(ServiceObjectData osDiscServiceInIn) {
    osDiscServiceIn = osDiscServiceInIn;
  }

/**
 *
 * Sets the Order
 * @param osDiscOrderInIn Value of the osDiscOrderIn
 *
 */

  public void setOrder(OrderObjectData osDiscOrderInIn) {
    osDiscOrderIn = osDiscOrderInIn;
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
 * Sets the VerboseResponse
 * @param osDiscVerboseResponseIn Value of the osDiscVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean osDiscVerboseResponseIn) {
    osDiscVerboseResponse = osDiscVerboseResponseIn;
  }

  public void translateFromMap() {
    osDiscServiceIn = ServiceObjectHelper.fromMap(inputMap, "Service");
    osDiscOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    StatusReasonId = (Integer)inputMap.get("StatusReasonId");
    InactiveDt = (Date)inputMap.get("InactiveDt");
    Annotation = (String)inputMap.get("Annotation");
    WaiveInstallmentNrc = (Integer)inputMap.get("WaiveInstallmentNrc");
    WaiveUnbilledNrc = (Integer)inputMap.get("WaiveUnbilledNrc");
    WaiveTerminationObligation = (Integer)inputMap.get("WaiveTerminationObligation");
    WaiveUnmetObligation = (Integer)inputMap.get("WaiveUnmetObligation");
    WaiveRefinanceNrc = (Integer)inputMap.get("WaiveRefinanceNrc");
    osDiscVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectData getService( ) {
    return osDiscServiceIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return osDiscOrderIn;
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
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return osDiscVerboseResponse;
  }

}
