/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceProviderCreateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceProviderCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceProviderCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceProviderObjectData ServiceProviderCreateIn;
/**
 *
 * Constructor to create a  ServiceProviderCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceProviderCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceProviderObjectData ServiceProviderCreateInIn) {
    super(id, context, "ServiceProviderCreate");
    ServiceProviderCreateIn = ServiceProviderCreateInIn;
  }

  public void translateToMap() {
    if (ServiceProviderCreateIn != null) {
      ServiceProviderCreateIn.resetFlags(true, true);
      addInput("ServiceProvider", ServiceProviderObjectHelper.toMap(ServiceProviderCreateIn, new HashMap(), "ServiceProvider").get("ServiceProvider"));
    }
  }


/**
 *
 * Sets the ServiceProvider
 * @param ServiceProviderCreateInIn Value of the ServiceProviderCreateIn
 *
 */

  public void setServiceProvider(ServiceProviderObjectData ServiceProviderCreateInIn) {
    ServiceProviderCreateIn = ServiceProviderCreateInIn;
  }

  public void translateFromMap() {
    ServiceProviderCreateIn = ServiceProviderObjectHelper.fromMap(inputMap, "ServiceProvider");
  }

/**
 *
 * Gets the ServiceProvider
 * @return Value of the ServiceProvider
 *
 */

  public ServiceProviderObjectData getServiceProvider( ) {
    return ServiceProviderCreateIn;
  }

}
