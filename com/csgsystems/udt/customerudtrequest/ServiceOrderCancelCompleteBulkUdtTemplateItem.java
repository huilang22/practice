/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderCancelCompleteBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderCancelCompleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderCancelCompleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseData ServiceOrderCancelCompleteIn;
/**
 *
 * Constructor to create a  ServiceOrderCancelCompleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderCancelCompleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseData ServiceOrderCancelCompleteInIn) {
    super(id, context, "ServiceOrderCancelComplete");
    ServiceOrderCancelCompleteIn = ServiceOrderCancelCompleteInIn;
  }

  public void translateToMap() {
    if (ServiceOrderCancelCompleteIn != null) {
      ServiceOrderCancelCompleteIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderCancelCompleteIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderCancelCompleteInIn Value of the ServiceOrderCancelCompleteIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseData ServiceOrderCancelCompleteInIn) {
    ServiceOrderCancelCompleteIn = ServiceOrderCancelCompleteInIn;
  }

  public void translateFromMap() {
    ServiceOrderCancelCompleteIn = ServiceOrderObjectBaseHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseData getServiceOrder( ) {
    return ServiceOrderCancelCompleteIn;
  }

}
