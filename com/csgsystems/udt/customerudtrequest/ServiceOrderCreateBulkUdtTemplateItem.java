/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderCreateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseData ServiceOrderCreateIn;
/**
 *
 * Constructor to create a  ServiceOrderCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseData ServiceOrderCreateInIn) {
    super(id, context, "ServiceOrderCreate");
    ServiceOrderCreateIn = ServiceOrderCreateInIn;
  }

  public void translateToMap() {
    if (ServiceOrderCreateIn != null) {
      ServiceOrderCreateIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderCreateIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderCreateInIn Value of the ServiceOrderCreateIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseData ServiceOrderCreateInIn) {
    ServiceOrderCreateIn = ServiceOrderCreateInIn;
  }

  public void translateFromMap() {
    ServiceOrderCreateIn = ServiceOrderObjectBaseHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseData getServiceOrder( ) {
    return ServiceOrderCreateIn;
  }

}
