/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseKeyData ServiceGetIn;
/**
 *
 * Constructor to create a  ServiceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseKeyData ServiceGetInIn) {
    super(id, context, "ServiceGet");
    ServiceGetIn = ServiceGetInIn;
  }

  public void translateToMap() {
    if (ServiceGetIn != null) {
      ServiceGetIn.resetFlags(true, true);
      addInput("Service", ServiceObjectBaseKeyHelper.toMap(ServiceGetIn, new HashMap(), "ServiceObjectBaseKeyData").get("ServiceObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceGetInIn Value of the ServiceGetIn
 *
 */

  public void setService(ServiceObjectBaseKeyData ServiceGetInIn) {
    ServiceGetIn = ServiceGetInIn;
  }

  public void translateFromMap() {
    ServiceGetIn = ServiceObjectBaseKeyHelper.fromMap(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseKeyData getService( ) {
    return ServiceGetIn;
  }

}
