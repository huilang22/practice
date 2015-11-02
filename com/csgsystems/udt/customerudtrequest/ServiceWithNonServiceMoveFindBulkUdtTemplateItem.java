/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceWithNonServiceMoveFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceWithNonServiceMoveFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceWithNonServiceMoveFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceObjectFilter ServiceWithNonServiceMoveFindIn;
/**
 *
 * Constructor to create a  ServiceWithNonServiceMoveFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceWithNonServiceMoveFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectFilter ServiceWithNonServiceMoveFindInIn) {
    super(id, context, "ServiceWithNonServiceMoveFind");
    ServiceWithNonServiceMoveFindIn = ServiceWithNonServiceMoveFindInIn;
  }

  public void translateToMap() {
    if (ServiceWithNonServiceMoveFindIn != null) {
      Integer index =  ServiceWithNonServiceMoveFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Service", ServiceObjectHelper.toMap(ServiceWithNonServiceMoveFindIn, new HashMap(), "Service").get("Service"));
    }
  }


/**
 *
 * Sets the Service
 * @param ServiceWithNonServiceMoveFindInIn Value of the ServiceWithNonServiceMoveFindIn
 *
 */

  public void setService(ServiceObjectFilter ServiceWithNonServiceMoveFindInIn) {
    ServiceWithNonServiceMoveFindIn = ServiceWithNonServiceMoveFindInIn;
  }

  public void translateFromMap() {
    ServiceWithNonServiceMoveFindIn = ServiceObjectHelper.fromMapFilter(inputMap, "Service");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public ServiceObjectFilter getService( ) {
    return ServiceWithNonServiceMoveFindIn;
  }

}
