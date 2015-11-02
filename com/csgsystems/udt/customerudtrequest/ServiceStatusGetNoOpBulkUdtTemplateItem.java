/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceStatusGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceStatusGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceStatusGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceStatusObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceStatusGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceStatusGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceStatusObjectData noOpInIn) {
    super(id, context, "ServiceStatusGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceStatus", ServiceStatusObjectHelper.toMap(noOpIn, new HashMap(), "ServiceStatus").get("ServiceStatus"));
    }
  }
/**
 *
 * Sets the  ServiceStatus
 * @param noOpInIn ServiceStatusObjectData to set
 *
 */
  public void setServiceStatus(ServiceStatusObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceStatus passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceStatusObjectData getServiceStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceStatusObjectHelper.fromMap(inputMap, "ServiceStatus");
  }
}
