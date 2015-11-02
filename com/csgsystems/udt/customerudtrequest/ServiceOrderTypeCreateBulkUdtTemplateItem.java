/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderTypeObjectData ServiceOrderTypeCreateIn;
/**
 *
 * Constructor to create a  ServiceOrderTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderTypeObjectData ServiceOrderTypeCreateInIn) {
    super(id, context, "ServiceOrderTypeCreate");
    ServiceOrderTypeCreateIn = ServiceOrderTypeCreateInIn;
  }

  public void translateToMap() {
    if (ServiceOrderTypeCreateIn != null) {
      ServiceOrderTypeCreateIn.resetFlags(true, true);
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(ServiceOrderTypeCreateIn, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }


/**
 *
 * Sets the ServiceOrderType
 * @param ServiceOrderTypeCreateInIn Value of the ServiceOrderTypeCreateIn
 *
 */

  public void setServiceOrderType(ServiceOrderTypeObjectData ServiceOrderTypeCreateInIn) {
    ServiceOrderTypeCreateIn = ServiceOrderTypeCreateInIn;
  }

  public void translateFromMap() {
    ServiceOrderTypeCreateIn = ServiceOrderTypeObjectHelper.fromMap(inputMap, "ServiceOrderType");
  }

/**
 *
 * Gets the ServiceOrderType
 * @return Value of the ServiceOrderType
 *
 */

  public ServiceOrderTypeObjectData getServiceOrderType( ) {
    return ServiceOrderTypeCreateIn;
  }

}
