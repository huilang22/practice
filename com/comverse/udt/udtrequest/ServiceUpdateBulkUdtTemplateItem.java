/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseData ServiceUpdateIn;
/**
 *
 * Constructor to create a  ServiceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseData ServiceUpdateInIn) {
    super(id, context, "ServiceUpdate");
    ServiceUpdateIn = ServiceUpdateInIn;
  }

  public void translateToMap() {
    if (ServiceUpdateIn != null) {
      ServiceUpdateIn.resetFlags(true, true);
      addInput("Service", ServiceObjectBaseHelper.toMap(ServiceUpdateIn, new HashMap(), "Service").get("Service"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceUpdateInIn Value of the ServiceUpdateIn
 *
 */

  public void setService(ServiceObjectBaseData ServiceUpdateInIn) {
    ServiceUpdateIn = ServiceUpdateInIn;
  }

  public void translateFromMap() {
    ServiceUpdateIn = ServiceObjectBaseHelper.fromMap(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseData getService( ) {
    return ServiceUpdateIn;
  }

}
