/*
 * Generated code DO NOT EDIT
 * Generated file: OrderedPackageDisconnectBulkUdtTemplateItem.java
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
 * Class used to create a OrderedPackageDisconnectBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedPackageDisconnectBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectData opdPackageIn;
  protected OrderObjectData opdOrderIn;
  protected Integer StatusReasonId;
  protected Date InactiveDt;
  protected String Annotation;
  protected Integer WaiveTerminationObligation;
  protected Integer WaiveUnmetObligation;
  protected Boolean opdVerboseResponse;
/**
 *
 * Constructor to create a  OrderedPackageDisconnectBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedPackageDisconnectBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectData opdPackageInIn, OrderObjectData opdOrderInIn, Integer StatusReasonIdIn, Date InactiveDtIn, String AnnotationIn, Integer WaiveTerminationObligationIn, Integer WaiveUnmetObligationIn, Boolean opdVerboseResponseIn) {
    super(id, context, "OrderedPackageDisconnect");
    opdPackageIn = opdPackageInIn;
    opdOrderIn = opdOrderInIn;
    StatusReasonId = StatusReasonIdIn;
    InactiveDt = InactiveDtIn;
    Annotation = AnnotationIn;
    WaiveTerminationObligation = WaiveTerminationObligationIn;
    WaiveUnmetObligation = WaiveUnmetObligationIn;
    opdVerboseResponse = opdVerboseResponseIn;
  }

  public void translateToMap() {
    if (opdPackageIn != null) {
      opdPackageIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(opdPackageIn, new HashMap(), "OrderedPackageDisconnectOutputData").get("OrderedPackageDisconnectOutputData"));
    }
    if (opdOrderIn != null) {
      opdOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(opdOrderIn, new HashMap(), "OrderedPackageDisconnectOutputData").get("OrderedPackageDisconnectOutputData"));
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
    if (WaiveTerminationObligation != null) {
      addInput("WaiveTerminationObligation", WaiveTerminationObligation);
    }
    if (WaiveUnmetObligation != null) {
      addInput("WaiveUnmetObligation", WaiveUnmetObligation);
    }
    if (opdVerboseResponse != null) {
      addInput("VerboseResponse", opdVerboseResponse);
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param opdPackageInIn Value of the opdPackageIn
 *
 */

  public void setProductPackage(ProductPackageObjectData opdPackageInIn) {
    opdPackageIn = opdPackageInIn;
  }

/**
 *
 * Sets the Order
 * @param opdOrderInIn Value of the opdOrderIn
 *
 */

  public void setOrder(OrderObjectData opdOrderInIn) {
    opdOrderIn = opdOrderInIn;
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
 * Sets the VerboseResponse
 * @param opdVerboseResponseIn Value of the opdVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean opdVerboseResponseIn) {
    opdVerboseResponse = opdVerboseResponseIn;
  }

  public void translateFromMap() {
    opdPackageIn = ProductPackageObjectHelper.fromMap(inputMap, "ProductPackage");
    opdOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    StatusReasonId = (Integer)inputMap.get("StatusReasonId");
    InactiveDt = (Date)inputMap.get("InactiveDt");
    Annotation = (String)inputMap.get("Annotation");
    WaiveTerminationObligation = (Integer)inputMap.get("WaiveTerminationObligation");
    WaiveUnmetObligation = (Integer)inputMap.get("WaiveUnmetObligation");
    opdVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectData getProductPackage( ) {
    return opdPackageIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return opdOrderIn;
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
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return opdVerboseResponse;
  }

}
