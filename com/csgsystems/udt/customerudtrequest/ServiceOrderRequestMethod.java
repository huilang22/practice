/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderRequestMethod.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.udt.UdtMethod;
public final class ServiceOrderRequestMethod implements UdtMethod {
  private String method = null;
  private ServiceOrderRequestMethod (String meth) {
    method = meth;
  }
  public String getMethod () {
    return method;
  }
  /** Variable representing the ServiceOrderCancel method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_CANCEL = new ServiceOrderRequestMethod("ServiceOrderCancel");
  /** Variable representing the ServiceOrderCancelComplete method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_CANCEL_COMPLETE = new ServiceOrderRequestMethod("ServiceOrderCancelComplete");
  /** Variable representing the ServiceOrderCancelValidate method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_CANCEL_VALIDATE = new ServiceOrderRequestMethod("ServiceOrderCancelValidate");
  /** Variable representing the ServiceOrderCommit method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_COMMIT = new ServiceOrderRequestMethod("ServiceOrderCommit");
  /** Variable representing the ServiceOrderCreate method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_CREATE = new ServiceOrderRequestMethod("ServiceOrderCreate");
  /** Variable representing the ServiceOrderExtendedDataFind method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_EXTENDED_DATA_FIND = new ServiceOrderRequestMethod("ServiceOrderExtendedDataFind");
  /** Variable representing the ServiceOrderExternalFind method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_EXTERNAL_FIND = new ServiceOrderRequestMethod("ServiceOrderExternalFind");
  /** Variable representing the ServiceOrderFind method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_FIND = new ServiceOrderRequestMethod("ServiceOrderFind");
  /** Variable representing the ServiceOrderFindCount method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_FIND_COUNT = new ServiceOrderRequestMethod("ServiceOrderFindCount");
  /** Variable representing the ServiceOrderFindInner method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_FIND_INNER = new ServiceOrderRequestMethod("ServiceOrderFindInner");
  /** Variable representing the ServiceOrderFindWithExtendedData method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_FIND_WITH_EXTENDED_DATA = new ServiceOrderRequestMethod("ServiceOrderFindWithExtendedData");
  /** Variable representing the ServiceOrderGet method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_GET = new ServiceOrderRequestMethod("ServiceOrderGet");
  /** Variable representing the ServiceOrderInvContainerFind method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_INV_CONTAINER_FIND = new ServiceOrderRequestMethod("ServiceOrderInvContainerFind");
  /** Variable representing the ServiceOrderListSchedule method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_LIST_SCHEDULE = new ServiceOrderRequestMethod("ServiceOrderListSchedule");
  /** Variable representing the ServiceOrderListUpdate method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_LIST_UPDATE = new ServiceOrderRequestMethod("ServiceOrderListUpdate");
  /** Variable representing the ServiceOrderLogicalExpand method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_LOGICAL_EXPAND = new ServiceOrderRequestMethod("ServiceOrderLogicalExpand");
  /** Variable representing the ServiceOrderPpvUsageRequired method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_PPV_USAGE_REQUIRED = new ServiceOrderRequestMethod("ServiceOrderPpvUsageRequired");
  /** Variable representing the ServiceOrderSuspendCreate method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_SUSPEND_CREATE = new ServiceOrderRequestMethod("ServiceOrderSuspendCreate");
  /** Variable representing the ServiceOrderUpdate method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_UPDATE = new ServiceOrderRequestMethod("ServiceOrderUpdate");
  /** Variable representing the ServiceOrderValidate method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_VALIDATE = new ServiceOrderRequestMethod("ServiceOrderValidate");
  /** Variable representing the ServiceOrderValidateCreate method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_VALIDATE_CREATE = new ServiceOrderRequestMethod("ServiceOrderValidateCreate");
  /** Variable representing the ServiceOrderWithLogicalFind method */
  public static final ServiceOrderRequestMethod SERVICE_ORDER_WITH_LOGICAL_FIND = new ServiceOrderRequestMethod("ServiceOrderWithLogicalFind");
}
