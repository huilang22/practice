/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderCreateBulkUdtTemplateItem.java
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
