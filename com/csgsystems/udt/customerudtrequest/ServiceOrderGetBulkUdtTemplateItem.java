/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseKeyData ServiceOrderGetIn;
/**
 *
 * Constructor to create a  ServiceOrderGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseKeyData ServiceOrderGetInIn) {
    super(id, context, "ServiceOrderGet");
    ServiceOrderGetIn = ServiceOrderGetInIn;
  }

  public void translateToMap() {
    if (ServiceOrderGetIn != null) {
      ServiceOrderGetIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderGetIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderGetInIn Value of the ServiceOrderGetIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseKeyData ServiceOrderGetInIn) {
    ServiceOrderGetIn = ServiceOrderGetInIn;
  }

  public void translateFromMap() {
    ServiceOrderGetIn = ServiceOrderObjectBaseKeyHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseKeyData getServiceOrder( ) {
    return ServiceOrderGetIn;
  }

}
