/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderTypeObjectData ServiceOrderTypeUpdateIn;
/**
 *
 * Constructor to create a  ServiceOrderTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderTypeObjectData ServiceOrderTypeUpdateInIn) {
    super(id, context, "ServiceOrderTypeUpdate");
    ServiceOrderTypeUpdateIn = ServiceOrderTypeUpdateInIn;
  }

  public void translateToMap() {
    if (ServiceOrderTypeUpdateIn != null) {
      ServiceOrderTypeUpdateIn.resetFlags(true, true);
      addInput("ServiceOrderType", ServiceOrderTypeObjectHelper.toMap(ServiceOrderTypeUpdateIn, new HashMap(), "ServiceOrderType").get("ServiceOrderType"));
    }
  }


/**
 *
 * Sets the ServiceOrderType
 * @param ServiceOrderTypeUpdateInIn Value of the ServiceOrderTypeUpdateIn
 *
 */

  public void setServiceOrderType(ServiceOrderTypeObjectData ServiceOrderTypeUpdateInIn) {
    ServiceOrderTypeUpdateIn = ServiceOrderTypeUpdateInIn;
  }

  public void translateFromMap() {
    ServiceOrderTypeUpdateIn = ServiceOrderTypeObjectHelper.fromMap(inputMap, "ServiceOrderType");
  }

/**
 *
 * Gets the ServiceOrderType
 * @return Value of the ServiceOrderType
 *
 */

  public ServiceOrderTypeObjectData getServiceOrderType( ) {
    return ServiceOrderTypeUpdateIn;
  }

}
