/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ServiceZoneCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceZoneCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceZoneObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceZoneCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceZoneCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectData noOpInIn) {
    super(id, context, "ServiceZoneCreate");
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
