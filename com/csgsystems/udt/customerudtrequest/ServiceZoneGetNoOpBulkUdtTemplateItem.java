/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceZoneGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceZoneGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceZoneGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceZoneObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceZoneGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceZoneGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectData noOpInIn) {
    super(id, context, "ServiceZoneGet");
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
