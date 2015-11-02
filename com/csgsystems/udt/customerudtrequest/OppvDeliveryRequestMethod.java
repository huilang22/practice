/*
 * Generated code DO NOT EDIT
 * Generated file: OppvDeliveryRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class OppvDeliveryRequestMethod implements UdtMethod {
  private String method = null;
  private OppvDeliveryRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the OppvDeliveryCreate method */
  public static final OppvDeliveryRequestMethod OPPV_DELIVERY_CREATE = new OppvDeliveryRequestMethod("OppvDeliveryCreate");
  /** Variable representing the OppvDeliveryDelete method */
  public static final OppvDeliveryRequestMethod OPPV_DELIVERY_DELETE = new OppvDeliveryRequestMethod("OppvDeliveryDelete");
  /** Variable representing the OppvDeliveryFind method */
  public static final OppvDeliveryRequestMethod OPPV_DELIVERY_FIND = new OppvDeliveryRequestMethod("OppvDeliveryFind");
  /** Variable representing the OppvDeliveryGet method */
  public static final OppvDeliveryRequestMethod OPPV_DELIVERY_GET = new OppvDeliveryRequestMethod("OppvDeliveryGet");
  /** Variable representing the OppvDeliveryNonCancelledFind method */
  public static final OppvDeliveryRequestMethod OPPV_DELIVERY_NON_CANCELLED_FIND = new OppvDeliveryRequestMethod("OppvDeliveryNonCancelledFind");
  /** Variable representing the OppvDeliveryUpdate method */
  public static final OppvDeliveryRequestMethod OPPV_DELIVERY_UPDATE = new OppvDeliveryRequestMethod("OppvDeliveryUpdate");
}
