/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedServiceResumeBulkUdtTemplateItem.java
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
 * Class used to create a OrderedServiceResumeBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedServiceResumeBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectData osResumeServiceIn;
  protected OrderObjectData osResumeOrderIn;
  protected Integer osRStatusReasonId;
  protected Date osRResumeDt;
  protected String osRAnnotation;
  protected Boolean osRVerboseResponse;
/**
 *
 * Constructor to create a  OrderedServiceResumeBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedServiceResumeBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectData osResumeServiceInIn, OrderObjectData osResumeOrderInIn, Integer osRStatusReasonIdIn, Date osRResumeDtIn, String osRAnnotationIn, Boolean osRVerboseResponseIn) {
    super(id, context, "OrderedServiceResume");
    osResumeServiceIn = osResumeServiceInIn;
    osResumeOrderIn = osResumeOrderInIn;
    osRStatusReasonId = osRStatusReasonIdIn;
    osRResumeDt = osRResumeDtIn;
    osRAnnotation = osRAnnotationIn;
    osRVerboseResponse = osRVerboseResponseIn;
  }

  public void translateToMap() {
    if (osResumeServiceIn != null) {
      osResumeServiceIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(osResumeServiceIn, new HashMap(), "OrderedServiceResumeOutputData").get("OrderedServiceResumeOutputData"));
    }
    if (osResumeOrderIn != null) {
      osResumeOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(osResumeOrderIn, new HashMap(), "OrderedServiceResumeOutputData").get("OrderedServiceResumeOutputData"));
    }
    if (osRStatusReasonId != null) {
      addInput("StatusReasonId", osRStatusReasonId);
    }
    if (osRResumeDt != null) {
      addInput("ResumeDt", osRResumeDt);
    }
    if (osRAnnotation != null) {
      addInput("Annotation", osRAnnotation);
    }
    if (osRVerboseResponse != null) {
      addInput("VerboseResponse", osRVerboseResponse);
    }
  }


/**
 *
 * Sets the Service
 * @param osResumeServiceInIn Value of the osResumeServiceIn
 *
 */

  public void setService(ServiceObjectData osResumeServiceInIn) {
    osResumeServiceIn = osResumeServiceInIn;
  }

/**
 *
 * Sets the Order
 * @param osResumeOrderInIn Value of the osResumeOrderIn
 *
 */

  public void setOrder(OrderObjectData osResumeOrderInIn) {
    osResumeOrderIn = osResumeOrderInIn;
  }

/**
 *
 * Sets the StatusReasonId
 * @param osRStatusReasonIdIn Value of the osRStatusReasonId
 *
 */

  public void setStatusReasonId(Integer osRStatusReasonIdIn) {
    osRStatusReasonId = osRStatusReasonIdIn;
  }

/**
 *
 * Sets the ResumeDt
 * @param osRResumeDtIn Value of the osRResumeDt
 *
 */

  public void setResumeDt(Date osRResumeDtIn) {
    osRResumeDt = osRResumeDtIn;
  }

/**
 *
 * Sets the Annotation
 * @param osRAnnotationIn Value of the osRAnnotation
 *
 */

  public void setAnnotation(String osRAnnotationIn) {
    osRAnnotation = osRAnnotationIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param osRVerboseResponseIn Value of the osRVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean osRVerboseResponseIn) {
    osRVerboseResponse = osRVerboseResponseIn;
  }

  public void translateFromMap() {
    osResumeServiceIn = ServiceObjectHelper.fromMap(inputMap, "Service");
    osResumeOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    osRStatusReasonId = (Integer)inputMap.get("StatusReasonId");
    osRResumeDt = (Date)inputMap.get("ResumeDt");
    osRAnnotation = (String)inputMap.get("Annotation");
    osRVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectData getService( ) {
    return osResumeServiceIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return osResumeOrderIn;
  }

/**
 *
 * Gets the StatusReasonId
 * @return Value of the StatusReasonId
 *
 */

  public Integer getStatusReasonId( ) {
    return osRStatusReasonId;
  }

/**
 *
 * Gets the ResumeDt
 * @return Value of the ResumeDt
 *
 */

  public Date getResumeDt( ) {
    return osRResumeDt;
  }

/**
 *
 * Gets the Annotation
 * @return Value of the Annotation
 *
 */

  public String getAnnotation( ) {
    return osRAnnotation;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return osRVerboseResponse;
  }

}
