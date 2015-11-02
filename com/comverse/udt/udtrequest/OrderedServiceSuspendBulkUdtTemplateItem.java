/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceSuspendBulkUdtTemplateItem.java
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
 * Class used to create a OrderedServiceSuspendBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedServiceSuspendBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectData osSuspendServiceIn;
  protected OrderObjectData osSuspendOrderIn;
  protected Integer osSStatusReasonId;
  protected Date osSSuspendDt;
  protected Date osSResumeDt;
  protected String osSAnnotation;
  protected Boolean osSVerboseResponse;
/**
 *
 * Constructor to create a  OrderedServiceSuspendBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedServiceSuspendBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectData osSuspendServiceInIn, OrderObjectData osSuspendOrderInIn, Integer osSStatusReasonIdIn, Date osSSuspendDtIn, Date osSResumeDtIn, String osSAnnotationIn, Boolean osSVerboseResponseIn) {
    super(id, context, "OrderedServiceSuspend");
    osSuspendServiceIn = osSuspendServiceInIn;
    osSuspendOrderIn = osSuspendOrderInIn;
    osSStatusReasonId = osSStatusReasonIdIn;
    osSSuspendDt = osSSuspendDtIn;
    osSResumeDt = osSResumeDtIn;
    osSAnnotation = osSAnnotationIn;
    osSVerboseResponse = osSVerboseResponseIn;
  }

  public void translateToMap() {
    if (osSuspendServiceIn != null) {
      osSuspendServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(osSuspendServiceIn, new HashMap(), "OrderedServiceSuspendOutputData").get("OrderedServiceSuspendOutputData"));
    }
    if (osSuspendOrderIn != null) {
      osSuspendOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(osSuspendOrderIn, new HashMap(), "OrderedServiceSuspendOutputData").get("OrderedServiceSuspendOutputData"));
    }
    if (osSStatusReasonId != null) {
      addInput("StatusReasonId", osSStatusReasonId);
    }
    if (osSSuspendDt != null) {
      addInput("SuspendDt", osSSuspendDt);
    }
    if (osSResumeDt != null) {
      addInput("ResumeDt", osSResumeDt);
    }
    if (osSAnnotation != null) {
      addInput("Annotation", osSAnnotation);
    }
    if (osSVerboseResponse != null) {
      addInput("VerboseResponse", osSVerboseResponse);
    }
  }


/**
 *
 * Sets the Service
 * @param osSuspendServiceInIn Value of the osSuspendServiceIn
 *
 */

  public void setService(ServiceObjectData osSuspendServiceInIn) {
    osSuspendServiceIn = osSuspendServiceInIn;
  }

/**
 *
 * Sets the Order
 * @param osSuspendOrderInIn Value of the osSuspendOrderIn
 *
 */

  public void setOrder(OrderObjectData osSuspendOrderInIn) {
    osSuspendOrderIn = osSuspendOrderInIn;
  }

/**
 *
 * Sets the StatusReasonId
 * @param osSStatusReasonIdIn Value of the osSStatusReasonId
 *
 */

  public void setStatusReasonId(Integer osSStatusReasonIdIn) {
    osSStatusReasonId = osSStatusReasonIdIn;
  }

/**
 *
 * Sets the SuspendDt
 * @param osSSuspendDtIn Value of the osSSuspendDt
 *
 */

  public void setSuspendDt(Date osSSuspendDtIn) {
    osSSuspendDt = osSSuspendDtIn;
  }

/**
 *
 * Sets the ResumeDt
 * @param osSResumeDtIn Value of the osSResumeDt
 *
 */

  public void setResumeDt(Date osSResumeDtIn) {
    osSResumeDt = osSResumeDtIn;
  }

/**
 *
 * Sets the Annotation
 * @param osSAnnotationIn Value of the osSAnnotation
 *
 */

  public void setAnnotation(String osSAnnotationIn) {
    osSAnnotation = osSAnnotationIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param osSVerboseResponseIn Value of the osSVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean osSVerboseResponseIn) {
    osSVerboseResponse = osSVerboseResponseIn;
  }

  public void translateFromMap() {
    osSuspendServiceIn = ServiceObjectHelper.fromMap(inputMap, "Service");
    osSuspendOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    osSStatusReasonId = (Integer)inputMap.get("StatusReasonId");
    osSSuspendDt = (Date)inputMap.get("SuspendDt");
    osSResumeDt = (Date)inputMap.get("ResumeDt");
    osSAnnotation = (String)inputMap.get("Annotation");
    osSVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectData getService( ) {
    return osSuspendServiceIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return osSuspendOrderIn;
  }

/**
 *
 * Gets the StatusReasonId
 * @return Value of the StatusReasonId
 *
 */

  public Integer getStatusReasonId( ) {
    return osSStatusReasonId;
  }

/**
 *
 * Gets the SuspendDt
 * @return Value of the SuspendDt
 *
 */

  public Date getSuspendDt( ) {
    return osSSuspendDt;
  }

/**
 *
 * Gets the ResumeDt
 * @return Value of the ResumeDt
 *
 */

  public Date getResumeDt( ) {
    return osSResumeDt;
  }

/**
 *
 * Gets the Annotation
 * @return Value of the Annotation
 *
 */

  public String getAnnotation( ) {
    return osSAnnotation;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return osSVerboseResponse;
  }

}
