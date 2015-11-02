/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderTypeObjectKeyData ServiceOrderTypeGetIn;
/**
 *
 * Constructor to create a  ServiceOrderTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderTypeObjectKeyData ServiceOrderTypeGetInIn) {
    super(id, context, "ServiceOrderTypeGet");
    ServiceOrderTypeGetIn = ServiceOrderTypeGetInIn;
  }

  public void translateToMap() {
    if (ServiceOrderTypeGetIn != null) {
      ServiceOrderTypeGetIn.resetFlags(true, true);
      addInput("ServiceOrderType", ServiceOrderTypeObjectKeyHelper.toMap(ServiceOrderTypeGetIn, new HashMap(), "ServiceOrderTypeObjectKeyData").get("ServiceOrderTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrderType
 * @param ServiceOrderTypeGetInIn Value of the ServiceOrderTypeGetIn
 *
 */

  public void setServiceOrderType(ServiceOrderTypeObjectKeyData ServiceOrderTypeGetInIn) {
    ServiceOrderTypeGetIn = ServiceOrderTypeGetInIn;
  }

  public void translateFromMap() {
    ServiceOrderTypeGetIn = ServiceOrderTypeObjectKeyHelper.fromMap(inputMap, "ServiceOrderType");
  }

/**
 *
 * Gets the ServiceOrderType
 * @return Value of the ServiceOrderType
 *
 */

  public ServiceOrderTypeObjectKeyData getServiceOrderType( ) {
    return ServiceOrderTypeGetIn;
  }

}
