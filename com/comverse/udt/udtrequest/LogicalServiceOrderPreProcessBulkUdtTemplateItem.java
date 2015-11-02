/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderPreProcessBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a LogicalServiceOrderPreProcessBulkUdtTemplateItem Bulk Template
 *
 */

public class LogicalServiceOrderPreProcessBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected OrderObjectData LSOPEOrderIn;
  protected ServiceOrderObjectData[] LSOPEServiceOrderIn;
/**
 *
 * Constructor to create a  LogicalServiceOrderPreProcessBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public LogicalServiceOrderPreProcessBulkUdtTemplateItem(String id, BSDMSessionContext context, OrderObjectData LSOPEOrderInIn, ServiceOrderObjectData[] LSOPEServiceOrderInIn) {
    super(id, context, "LogicalServiceOrderPreProcess");
    LSOPEOrderIn = LSOPEOrderInIn;
    LSOPEServiceOrderIn = LSOPEServiceOrderInIn;
  }

  public void translateToMap() {
    if (LSOPEOrderIn != null) {
      LSOPEOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(LSOPEOrderIn, new HashMap(), "LogicalServiceOrderPreProcessOutputData").get("LogicalServiceOrderPreProcessOutputData"));
    }
    if (LSOPEServiceOrderIn != null) {
      if (LSOPEServiceOrderIn != null) {
        Object[] list = new Object[LSOPEServiceOrderIn.length];
        for (int i = 0; i < LSOPEServiceOrderIn.length; i++) {
          list[i] = ServiceOrderObjectHelper.getMap(LSOPEServiceOrderIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "LogicalServiceOrderPreProcessOutputData");
        }
        addInput("ServiceOrderList", list);
      }
    }
  }


/**
 *
 * Sets the Order
 * @param LSOPEOrderInIn Value of the LSOPEOrderIn
 *
 */

  public void setOrder(OrderObjectData LSOPEOrderInIn) {
    LSOPEOrderIn = LSOPEOrderInIn;
  }

/**
 *
 * Sets the ServiceOrder
 * @param LSOPEServiceOrderInIn Value of the LSOPEServiceOrderIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectData[] LSOPEServiceOrderInIn) {
    LSOPEServiceOrderIn = LSOPEServiceOrderInIn;
  }

  public void translateFromMap() {
    LSOPEOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    Object[] list = (Object[]) inputMap.get("ServiceOrderList");
    if (list != null) {
      LSOPEServiceOrderIn = new ServiceOrderObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        LSOPEServiceOrderIn[i] = ServiceOrderObjectHelper.getObj((Map) list[i]);
        LSOPEServiceOrderIn[i].resetFlags(true, true);
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
    return LSOPEOrderIn;
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectData[] getServiceOrder( ) {
    return LSOPEServiceOrderIn;
  }

}
