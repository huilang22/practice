/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCancelBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a ServiceOrderCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseKeyData ServiceOrderCancelIn;
/**
 *
 * Constructor to create a  ServiceOrderCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseKeyData ServiceOrderCancelInIn) {
    super(id, context, "ServiceOrderCancel");
    ServiceOrderCancelIn = ServiceOrderCancelInIn;
  }

  public void translateToMap() {
    if (ServiceOrderCancelIn != null) {
      ServiceOrderCancelIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ServiceOrderCancelIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ServiceOrderCancelInIn Value of the ServiceOrderCancelIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseKeyData ServiceOrderCancelInIn) {
    ServiceOrderCancelIn = ServiceOrderCancelInIn;
  }

  public void translateFromMap() {
    ServiceOrderCancelIn = ServiceOrderObjectBaseKeyHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseKeyData getServiceOrder( ) {
    return ServiceOrderCancelIn;
  }

}
