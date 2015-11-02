/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceExternalGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceExternalGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceExternalGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceExternalGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceExternalGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectData noOpInIn) {
    super(id, context, "ServiceExternalGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("Service", ServiceObjectHelper.toMap(noOpIn, new HashMap(), "Service").get("Service"));
    }
  }
/**
 *
 * Sets the  Service
 * @param noOpInIn ServiceObjectData to set
 *
 */
  public void setService(ServiceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Service passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceObjectData getService() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceObjectHelper.fromMap(inputMap, "Service");
  }
}
