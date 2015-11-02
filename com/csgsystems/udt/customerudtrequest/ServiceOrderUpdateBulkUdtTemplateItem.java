/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseData ServiceOrderUpdateExternalIn;
/**
 *
 * Constructor to create a  ServiceOrderUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseData ServiceOrderUpdateExternalInIn) {
    super(id, context, "ServiceOrderUpdate");
    ServiceOrderUpdateExternalIn = ServiceOrderUpdateExternalInIn;
  }

  public void translateToMap() {
    if (ServiceOrderUpdateExternalIn != null) {
      ServiceOrderUpdateExternalIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseHelper.toMap(ServiceOrderUpdateExternalIn, new HashMap(), "ServiceOrder").get("ServiceOrder"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderUpdateExternalInIn Value of the ServiceOrderUpdateExternalIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseData ServiceOrderUpdateExternalInIn) {
    ServiceOrderUpdateExternalIn = ServiceOrderUpdateExternalInIn;
  }

  public void translateFromMap() {
    ServiceOrderUpdateExternalIn = ServiceOrderObjectBaseHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseData getServiceOrder( ) {
    return ServiceOrderUpdateExternalIn;
  }

}
