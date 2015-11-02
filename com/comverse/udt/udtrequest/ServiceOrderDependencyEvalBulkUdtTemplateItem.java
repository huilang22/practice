/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyEvalBulkUdtTemplateItem.java
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
 * Class used to create a ServiceOrderDependencyEvalBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderDependencyEvalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderDependencyObjectKeyData ServiceOrderDependencyEvalIn;
/**
 *
 * Constructor to create a  ServiceOrderDependencyEvalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderDependencyEvalBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderDependencyObjectKeyData ServiceOrderDependencyEvalInIn) {
    super(id, context, "ServiceOrderDependencyEval");
    ServiceOrderDependencyEvalIn = ServiceOrderDependencyEvalInIn;
  }

  public void translateToMap() {
    if (ServiceOrderDependencyEvalIn != null) {
      ServiceOrderDependencyEvalIn.resetFlags(true, true);
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectKeyHelper.toMap(ServiceOrderDependencyEvalIn, new HashMap(), "ServiceOrderDependencyObjectKeyData").get("ServiceOrderDependencyObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrderDependency
 * @param ServiceOrderDependencyEvalInIn Value of the ServiceOrderDependencyEvalIn
 *
 */

  public void setServiceOrderDependency(ServiceOrderDependencyObjectKeyData ServiceOrderDependencyEvalInIn) {
    ServiceOrderDependencyEvalIn = ServiceOrderDependencyEvalInIn;
  }

  public void translateFromMap() {
    ServiceOrderDependencyEvalIn = ServiceOrderDependencyObjectKeyHelper.fromMap(inputMap, "ServiceOrderDependency");
  }

/**
 *
 * Gets the ServiceOrderDependency
 * @return Value of the ServiceOrderDependency
 *
 */

  public ServiceOrderDependencyObjectKeyData getServiceOrderDependency( ) {
    return ServiceOrderDependencyEvalIn;
  }

}
