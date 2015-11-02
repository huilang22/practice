/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceStatusObjectFilter ServiceStatusFindIn;
/**
 *
 * Constructor to create a  ServiceStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceStatusObjectFilter ServiceStatusFindInIn) {
    super(id, context, "ServiceStatusFind");
    ServiceStatusFindIn = ServiceStatusFindInIn;
  }

  public void translateToMap() {
    if (ServiceStatusFindIn != null) {
      Integer index =  ServiceStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceStatus", ServiceStatusObjectHelper.toMap(ServiceStatusFindIn, new HashMap(), "ServiceStatus").get("ServiceStatus"));
    }
  }


/**
 *
 * Sets the ServiceStatus
 * @param ServiceStatusFindInIn Value of the ServiceStatusFindIn
 *
 */

  public void setServiceStatus(ServiceStatusObjectFilter ServiceStatusFindInIn) {
    ServiceStatusFindIn = ServiceStatusFindInIn;
  }

  public void translateFromMap() {
    ServiceStatusFindIn = ServiceStatusObjectHelper.fromMapFilter(inputMap, "ServiceStatus");
  }

/**
 *
 * Gets the ServiceStatus
 * @return Value of the ServiceStatus
 *
 */

  public ServiceStatusObjectFilter getServiceStatus( ) {
    return ServiceStatusFindIn;
  }

}
