/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceStatusObjectKeyData ServiceStatusGetIn;
/**
 *
 * Constructor to create a  ServiceStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceStatusObjectKeyData ServiceStatusGetInIn) {
    super(id, context, "ServiceStatusGet");
    ServiceStatusGetIn = ServiceStatusGetInIn;
  }

  public void translateToMap() {
    if (ServiceStatusGetIn != null) {
      ServiceStatusGetIn.resetFlags(true, true);
      addInput("ServiceStatus", ServiceStatusObjectKeyHelper.toMap(ServiceStatusGetIn, new HashMap(), "ServiceStatusObjectKeyData").get("ServiceStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceStatus
 * @param ServiceStatusGetInIn Value of the ServiceStatusGetIn
 *
 */

  public void setServiceStatus(ServiceStatusObjectKeyData ServiceStatusGetInIn) {
    ServiceStatusGetIn = ServiceStatusGetInIn;
  }

  public void translateFromMap() {
    ServiceStatusGetIn = ServiceStatusObjectKeyHelper.fromMap(inputMap, "ServiceStatus");
  }

/**
 *
 * Gets the ServiceStatus
 * @return Value of the ServiceStatus
 *
 */

  public ServiceStatusObjectKeyData getServiceStatus( ) {
    return ServiceStatusGetIn;
  }

}
