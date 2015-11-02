/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceProviderGetBulkUdtTemplateItem.java
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

/**
 *
 * Class used to create a ServiceProviderGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceProviderGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceProviderObjectKeyData ServiceProviderGetIn;
/**
 *
 * Constructor to create a  ServiceProviderGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceProviderGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceProviderObjectKeyData ServiceProviderGetInIn) {
    super(id, context, "ServiceProviderGet");
    ServiceProviderGetIn = ServiceProviderGetInIn;
  }

  public void translateToMap() {
    if (ServiceProviderGetIn != null) {
      ServiceProviderGetIn.resetFlags(true, true);
      addInput("ServiceProvider", ServiceProviderObjectKeyHelper.toMap(ServiceProviderGetIn, new HashMap(), "ServiceProviderObjectKeyData").get("ServiceProviderObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceProvider
 * @param ServiceProviderGetInIn Value of the ServiceProviderGetIn
 *
 */

  public void setServiceProvider(ServiceProviderObjectKeyData ServiceProviderGetInIn) {
    ServiceProviderGetIn = ServiceProviderGetInIn;
  }

  public void translateFromMap() {
    ServiceProviderGetIn = ServiceProviderObjectKeyHelper.fromMap(inputMap, "ServiceProvider");
  }

/**
 *
 * Gets the ServiceProvider
 * @return Value of the ServiceProvider
 *
 */

  public ServiceProviderObjectKeyData getServiceProvider( ) {
    return ServiceProviderGetIn;
  }

}
