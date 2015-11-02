/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceWithPendingFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceWithPendingFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceWithPendingFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectFilter ServiceWithPendingFindIn;
/**
 *
 * Constructor to create a  ServiceWithPendingFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceWithPendingFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectFilter ServiceWithPendingFindInIn) {
    super(id, context, "ServiceWithPendingFind");
    ServiceWithPendingFindIn = ServiceWithPendingFindInIn;
  }

  public void translateToMap() {
    if (ServiceWithPendingFindIn != null) {
      Integer index =  ServiceWithPendingFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceWithPendingFindIn, new HashMap(), "Service").get("Service"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceWithPendingFindInIn Value of the ServiceWithPendingFindIn
 *
 */

  public void setService(ServiceObjectFilter ServiceWithPendingFindInIn) {
    ServiceWithPendingFindIn = ServiceWithPendingFindInIn;
  }

  public void translateFromMap() {
    ServiceWithPendingFindIn = ServiceObjectHelper.fromMapFilter(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectFilter getService( ) {
    return ServiceWithPendingFindIn;
  }

}
