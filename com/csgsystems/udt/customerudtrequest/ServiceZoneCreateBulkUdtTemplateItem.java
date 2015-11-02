/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceZoneCreateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceZoneCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceZoneCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceZoneObjectData SZCreateIn;
/**
 *
 * Constructor to create a  ServiceZoneCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceZoneCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectData SZCreateInIn) {
    super(id, context, "ServiceZoneCreate");
    SZCreateIn = SZCreateInIn;
  }

  public void translateToMap() {
    if (SZCreateIn != null) {
      SZCreateIn.resetFlags(true, true);
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(SZCreateIn, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }


/**
 *
 * Sets the ServiceZone
 * @param SZCreateInIn Value of the SZCreateIn
 *
 */

  public void setServiceZone(ServiceZoneObjectData SZCreateInIn) {
    SZCreateIn = SZCreateInIn;
  }

  public void translateFromMap() {
    SZCreateIn = ServiceZoneObjectHelper.fromMap(inputMap, "ServiceZone");
  }

/**
 *
 * Gets the ServiceZone
 * @return Value of the ServiceZone
 *
 */

  public ServiceZoneObjectData getServiceZone( ) {
    return SZCreateIn;
  }

}
