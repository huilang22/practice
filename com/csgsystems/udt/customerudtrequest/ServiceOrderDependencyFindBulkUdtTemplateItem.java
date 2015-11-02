/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderDependencyFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderDependencyFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderDependencyFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderDependencyObjectFilter ServiceOrderDependencyFindIn;
/**
 *
 * Constructor to create a  ServiceOrderDependencyFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderDependencyFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderDependencyObjectFilter ServiceOrderDependencyFindInIn) {
    super(id, context, "ServiceOrderDependencyFind");
    ServiceOrderDependencyFindIn = ServiceOrderDependencyFindInIn;
  }

  public void translateToMap() {
    if (ServiceOrderDependencyFindIn != null) {
      Integer index =  ServiceOrderDependencyFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(ServiceOrderDependencyFindIn, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }


/**
 *
 * Sets the ServiceOrderDependency
 * @param ServiceOrderDependencyFindInIn Value of the ServiceOrderDependencyFindIn
 *
 */

  public void setServiceOrderDependency(ServiceOrderDependencyObjectFilter ServiceOrderDependencyFindInIn) {
    ServiceOrderDependencyFindIn = ServiceOrderDependencyFindInIn;
  }

  public void translateFromMap() {
    ServiceOrderDependencyFindIn = ServiceOrderDependencyObjectHelper.fromMapFilter(inputMap, "ServiceOrderDependency");
  }

/**
 *
 * Gets the ServiceOrderDependency
 * @return Value of the ServiceOrderDependency
 *
 */

  public ServiceOrderDependencyObjectFilter getServiceOrderDependency( ) {
    return ServiceOrderDependencyFindIn;
  }

}
