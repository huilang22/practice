/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceZoneUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceZoneUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceZoneUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceZoneObjectData SZUpdateIn;
/**
 *
 * Constructor to create a  ServiceZoneUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceZoneUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectData SZUpdateInIn) {
    super(id, context, "ServiceZoneUpdate");
    SZUpdateIn = SZUpdateInIn;
  }

  public void translateToMap() {
    if (SZUpdateIn != null) {
      SZUpdateIn.resetFlags(true, true);
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(SZUpdateIn, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }


/**
 *
 * Sets the ServiceZone
 * @param SZUpdateInIn Value of the SZUpdateIn
 *
 */

  public void setServiceZone(ServiceZoneObjectData SZUpdateInIn) {
    SZUpdateIn = SZUpdateInIn;
  }

  public void translateFromMap() {
    SZUpdateIn = ServiceZoneObjectHelper.fromMap(inputMap, "ServiceZone");
  }

/**
 *
 * Gets the ServiceZone
 * @return Value of the ServiceZone
 *
 */

  public ServiceZoneObjectData getServiceZone( ) {
    return SZUpdateIn;
  }

}
