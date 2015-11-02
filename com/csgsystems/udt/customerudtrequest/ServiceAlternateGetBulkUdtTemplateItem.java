/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAlternateGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAlternateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAlternateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectBaseData ServiceAlternateGetIn;
/**
 *
 * Constructor to create a  ServiceAlternateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAlternateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseData ServiceAlternateGetInIn) {
    super(id, context, "ServiceAlternateGet");
    ServiceAlternateGetIn = ServiceAlternateGetInIn;
  }

  public void translateToMap() {
    if (ServiceAlternateGetIn != null) {
      ServiceAlternateGetIn.resetFlags(true, true);
      addInput("Service", ServiceObjectBaseHelper.toMap(ServiceAlternateGetIn, new HashMap(), "Service").get("Service"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceAlternateGetInIn Value of the ServiceAlternateGetIn
 *
 */

  public void setService(ServiceObjectBaseData ServiceAlternateGetInIn) {
    ServiceAlternateGetIn = ServiceAlternateGetInIn;
  }

  public void translateFromMap() {
    ServiceAlternateGetIn = ServiceObjectBaseHelper.fromMap(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectBaseData getService( ) {
    return ServiceAlternateGetIn;
  }

}
