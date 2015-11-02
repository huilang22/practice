/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderPpvUsageRequiredBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderPpvUsageRequiredBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderPpvUsageRequiredBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderObjectBaseKeyData ppvSOIn;
/**
 *
 * Constructor to create a  ServiceOrderPpvUsageRequiredBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderPpvUsageRequiredBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseKeyData ppvSOInIn) {
    super(id, context, "ServiceOrderPpvUsageRequired");
    ppvSOIn = ppvSOInIn;
  }

  public void translateToMap() {
    if (ppvSOIn != null) {
      ppvSOIn.resetFlags(true, true);
      addInput("ServiceOrder", ServiceOrderObjectBaseKeyHelper.toMap(ppvSOIn, new HashMap(), "ServiceOrderObjectBaseKeyData").get("ServiceOrderObjectBaseKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrder
 * @param ppvSOInIn Value of the ppvSOIn
 *
 */

  public void setServiceOrder(ServiceOrderObjectBaseKeyData ppvSOInIn) {
    ppvSOIn = ppvSOInIn;
  }

  public void translateFromMap() {
    ppvSOIn = ServiceOrderObjectBaseKeyHelper.fromMap(inputMap, "ServiceOrder");
  }

/**
 *
 * Gets the ServiceOrder
 * @return Value of the ServiceOrder
 *
 */

  public ServiceOrderObjectBaseKeyData getServiceOrder( ) {
    return ppvSOIn;
  }

}
