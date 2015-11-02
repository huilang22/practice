/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceCenterUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ServiceCenterUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceCenterUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceCenterObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceCenterUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceCenterUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterObjectData noOpInIn) {
    super(id, context, "ServiceCenterUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(noOpIn, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }
/**
 *
 * Sets the  ServiceCenter
 * @param noOpInIn ServiceCenterObjectData to set
 *
 */
  public void setServiceCenter(ServiceCenterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceCenter passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceCenterObjectData getServiceCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceCenterObjectHelper.fromMap(inputMap, "ServiceCenter");
  }
}
