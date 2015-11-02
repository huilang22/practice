/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceProviderUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ServiceProviderUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceProviderUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceProviderObjectData ServiceProviderUpdateIn;
/**
 *
 * Constructor to create a  ServiceProviderUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceProviderUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceProviderObjectData ServiceProviderUpdateInIn) {
    super(id, context, "ServiceProviderUpdate");
    ServiceProviderUpdateIn = ServiceProviderUpdateInIn;
  }

  public void translateToMap() {
    if (ServiceProviderUpdateIn != null) {
      ServiceProviderUpdateIn.resetFlags(true, true);
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(ServiceProviderUpdateIn, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }


/**
 *
 * Sets the ServiceProvider
 * @param ServiceProviderUpdateInIn Value of the ServiceProviderUpdateIn
 *
 */

  public void setServiceProvider(ServiceProviderObjectData ServiceProviderUpdateInIn) {
    ServiceProviderUpdateIn = ServiceProviderUpdateInIn;
  }

  public void translateFromMap() {
    ServiceProviderUpdateIn = ServiceProviderObjectHelper.fromMap(inputMap, "ServiceProvider");
  }

/**
 *
 * Gets the ServiceProvider
 * @return Value of the ServiceProvider
 *
 */

  public ServiceProviderObjectData getServiceProvider( ) {
    return ServiceProviderUpdateIn;
  }

}
