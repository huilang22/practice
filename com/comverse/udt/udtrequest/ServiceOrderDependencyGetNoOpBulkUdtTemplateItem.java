/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderDependencyGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderDependencyGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderDependencyGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderDependencyObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderDependencyGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderDependencyGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderDependencyObjectData noOpInIn) {
    super(id, context, "ServiceOrderDependencyGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceOrderDependency", ServiceOrderDependencyObjectHelper.toMap(noOpIn, new HashMap(), "ServiceOrderDependency").get("ServiceOrderDependency"));
    }
  }
/**
 *
 * Sets the  ServiceOrderDependency
 * @param noOpInIn ServiceOrderDependencyObjectData to set
 *
 */
  public void setServiceOrderDependency(ServiceOrderDependencyObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrderDependency passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderDependencyObjectData getServiceOrderDependency() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderDependencyObjectHelper.fromMap(inputMap, "ServiceOrderDependency");
  }
}
