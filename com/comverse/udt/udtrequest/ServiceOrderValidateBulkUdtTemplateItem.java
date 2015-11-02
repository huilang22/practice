/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderValidateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseData[] ServiceOrderValidateIn;
/**
 *
 * Constructor to create a  ServiceOrderValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseData[] ServiceOrderValidateInIn) {
    super(id, context, "ServiceOrderValidate");
    ServiceOrderValidateIn = ServiceOrderValidateInIn;
  }

  public void translateToMap() {
    if (ServiceOrderValidateIn != null) {
      if (ServiceOrderValidateIn != null) {
        Object[] list = new Object[ServiceOrderValidateIn.length];
        for (int i = 0; i < ServiceOrderValidateIn.length; i++) {
          list[i] = ServiceOrderObjectBaseHelper.getMap(ServiceOrderValidateIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "ServiceOrder");
        }
        addInput("ServiceOrderList", list);
      }
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderValidateInIn Value of the ServiceOrderValidateIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseData[] ServiceOrderValidateInIn) {
    ServiceOrderValidateIn = ServiceOrderValidateInIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("ServiceOrderList");
    if (list != null) {
      ServiceOrderValidateIn = new ServiceOrderObjectBaseData[list.length];
      for (int i = 0; i < list.length; i++) {
        ServiceOrderValidateIn[i] = ServiceOrderObjectBaseHelper.getObj((Map) list[i]);
        ServiceOrderValidateIn[i].resetFlags(true, true);
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
    return ServiceOrderValidateIn;
  }

}
