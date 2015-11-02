/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderUpdateBulkUdtTemplateItem.java
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
