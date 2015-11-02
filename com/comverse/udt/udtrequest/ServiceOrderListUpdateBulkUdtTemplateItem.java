/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderListUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderListUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderListUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseData[] SOLUpdateIn;
/**
 *
 * Constructor to create a  ServiceOrderListUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderListUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseData[] SOLUpdateInIn) {
    super(id, context, "ServiceOrderListUpdate");
    SOLUpdateIn = SOLUpdateInIn;
  }

  public void translateToMap() {
    if (SOLUpdateIn != null) {
      if (SOLUpdateIn != null) {
        Object[] list = new Object[SOLUpdateIn.length];
        for (int i = 0; i < SOLUpdateIn.length; i++) {
          list[i] = ServiceOrderObjectBaseHelper.getMap(SOLUpdateIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrder");
        }
        addInput("ServiceOrderList", list);
      }
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param SOLUpdateInIn Value of the SOLUpdateIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseData[] SOLUpdateInIn) {
    SOLUpdateIn = SOLUpdateInIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("ServiceOrderList");
    if (list != null) {
      SOLUpdateIn = new ServiceOrderObjectBaseData[list.length];
      for (int i = 0; i < list.length; i++) {
        SOLUpdateIn[i] = ServiceOrderObjectBaseHelper.getObj((Map) list[i]);
        SOLUpdateIn[i].resetFlags(true, true);
      }
    }
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseData[] getServiceOrder( ) {
    return SOLUpdateIn;
  }

}
