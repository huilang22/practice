/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderListScheduleBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderListScheduleBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderListScheduleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectData SOLSOrderIn;
  protected ServiceOrderObjectBaseData[] ServiceOrderIn;
/**
 *
 * Constructor to create a  ServiceOrderListScheduleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderListScheduleBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectData SOLSOrderInIn, ServiceOrderObjectBaseData[] ServiceOrderInIn) {
    super(id, context, "ServiceOrderListSchedule");
    SOLSOrderIn = SOLSOrderInIn;
    ServiceOrderIn = ServiceOrderInIn;
  }

  public void translateToMap() {
    if (SOLSOrderIn != null) {
      SOLSOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(SOLSOrderIn, new HashMap(), "ServiceOrderListScheduleOutputData").get("ServiceOrderListScheduleOutputData"));
    }
    if (ServiceOrderIn != null) {
      if (ServiceOrderIn != null) {
        Object[] list = new Object[ServiceOrderIn.length];
        for (int i = 0; i < ServiceOrderIn.length; i++) {
          list[i] = ServiceOrderObjectBaseHelper.getMap(ServiceOrderIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrderListScheduleOutputData");
        }
        addInput("ServiceOrderList", list);
      }
    }
  }


/**
 *
 * Sets the Order
 * @param SOLSOrderInIn Value of the SOLSOrderIn
 *
 */

  public void setOrder(OrderObjectData SOLSOrderInIn) {
    SOLSOrderIn = SOLSOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderInIn Value of the ServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseData[] ServiceOrderInIn) {
    ServiceOrderIn = ServiceOrderInIn;
  }

  public void translateFromMap() {
    SOLSOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    Object[] list = (Object[]) inputMap.get("ServiceOrderList");
    if (list != null) {
      ServiceOrderIn = new ServiceOrderObjectBaseData[list.length];
      for (int i = 0; i < list.length; i++) {
        ServiceOrderIn[i] = ServiceOrderObjectBaseHelper.getObj((Map) list[i]);
        ServiceOrderIn[i].resetFlags(true, true);
      }
    }
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return SOLSOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseData[] getServiceOrder( ) {
    return ServiceOrderIn;
  }

}
