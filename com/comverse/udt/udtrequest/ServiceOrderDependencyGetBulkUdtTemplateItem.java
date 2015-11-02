/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderDependencyGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderDependencyGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderDependencyObjectKeyData ServiceOrderDependencyGetIn;
/**
 *
 * Constructor to create a  ServiceOrderDependencyGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderDependencyGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderDependencyObjectKeyData ServiceOrderDependencyGetInIn) {
    super(id, context, "ServiceOrderDependencyGet");
    ServiceOrderDependencyGetIn = ServiceOrderDependencyGetInIn;
  }

  public void translateToMap() {
    if (ServiceOrderDependencyGetIn != null) {
      ServiceOrderDependencyGetIn.resetFlags(true, true);
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectKeyHelper.toMap(ServiceOrderDependencyGetIn, new HashMap(), "ServiceOrderDependencyObjectKeyData").get("ServiceOrderDependencyObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrderDependency
 * @param ServiceOrderDependencyGetInIn Value of the ServiceOrderDependencyGetIn
 *
 */

  public void setServiceOrderDependency(ServiceOrderDependencyObjectKeyData ServiceOrderDependencyGetInIn) {
    ServiceOrderDependencyGetIn = ServiceOrderDependencyGetInIn;
  }

  public void translateFromMap() {
    ServiceOrderDependencyGetIn = ServiceOrderDependencyObjectKeyHelper.fromMap(inputMap, "ServiceOrderDependency");
  }

/**
 *
 * Gets the ServiceOrderDependency
 * @return Value of the ServiceOrderDependency
 *
 */

  public ServiceOrderDependencyObjectKeyData getServiceOrderDependency( ) {
    return ServiceOrderDependencyGetIn;
  }

}
