/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseData ServiceCreateIn;
/**
 *
 * Constructor to create a  ServiceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseData ServiceCreateInIn) {
    super(id, context, "ServiceCreate");
    ServiceCreateIn = ServiceCreateInIn;
  }

  public void translateToMap() {
    if (ServiceCreateIn != null) {
      ServiceCreateIn.resetFlags(true, true);
      addInput("Service", ServiceObjectBaseHelper.toMap(ServiceCreateIn, new HashMap(), "Service").get("Service"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceCreateInIn Value of the ServiceCreateIn
 *
 */

  public void setService(ServiceObjectBaseData ServiceCreateInIn) {
    ServiceCreateIn = ServiceCreateInIn;
  }

  public void translateFromMap() {
    ServiceCreateIn = ServiceObjectBaseHelper.fromMap(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseData getService( ) {
    return ServiceCreateIn;
  }

}
