/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderDependencyCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderDependencyCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderDependencyCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderDependencyObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderDependencyCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderDependencyCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderDependencyObjectData noOpInIn) {
    super(id, context, "ServiceOrderDependencyCreate");
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
