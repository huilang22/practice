/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceMasterGroupGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceMasterGroupGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceMasterGroupGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceMasterGroupObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceMasterGroupGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceMasterGroupGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceMasterGroupObjectData noOpInIn) {
    super(id, context, "ServiceMasterGroupGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(noOpIn, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }
/**
 *
 * Sets the  ServiceMasterGroup
 * @param noOpInIn ServiceMasterGroupObjectData to set
 *
 */
  public void setServiceMasterGroup(ServiceMasterGroupObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceMasterGroup passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceMasterGroupObjectData getServiceMasterGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceMasterGroupObjectHelper.fromMap(inputMap, "ServiceMasterGroup");
  }
}
