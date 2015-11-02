/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceZoneDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceZoneDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceZoneDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceZoneObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceZoneDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceZoneDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectData noOpInIn) {
    super(id, context, "ServiceZoneDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(noOpIn, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }
/**
 *
 * Sets the  ServiceZone
 * @param noOpInIn ServiceZoneObjectData to set
 *
 */
  public void setServiceZone(ServiceZoneObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceZone passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceZoneObjectData getServiceZone() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceZoneObjectHelper.fromMap(inputMap, "ServiceZone");
  }
}
