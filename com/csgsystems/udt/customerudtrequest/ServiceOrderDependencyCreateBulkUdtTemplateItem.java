/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderDependencyCreateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderDependencyCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderDependencyCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderDependencyObjectData ServiceOrderDependencyCreateIn;
/**
 *
 * Constructor to create a  ServiceOrderDependencyCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderDependencyCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderDependencyObjectData ServiceOrderDependencyCreateInIn) {
    super(id, context, "ServiceOrderDependencyCreate");
    ServiceOrderDependencyCreateIn = ServiceOrderDependencyCreateInIn;
  }

  public void translateToMap() {
    if (ServiceOrderDependencyCreateIn != null) {
      ServiceOrderDependencyCreateIn.resetFlags(true, true);
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(ServiceOrderDependencyCreateIn, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }


/**
 *
 * Sets the ServiceOrderDependency
 * @param ServiceOrderDependencyCreateInIn Value of the ServiceOrderDependencyCreateIn
 *
 */

  public void setServiceOrderDependency(ServiceOrderDependencyObjectData ServiceOrderDependencyCreateInIn) {
    ServiceOrderDependencyCreateIn = ServiceOrderDependencyCreateInIn;
  }

  public void translateFromMap() {
    ServiceOrderDependencyCreateIn = ServiceOrderDependencyObjectHelper.fromMap(inputMap, "ServiceOrderDependency");
  }

/**
 *
 * Gets the ServiceOrderDependency
 * @return Value of the ServiceOrderDependency
 *
 */

  public ServiceOrderDependencyObjectData getServiceOrderDependency( ) {
    return ServiceOrderDependencyCreateIn;
  }

}
