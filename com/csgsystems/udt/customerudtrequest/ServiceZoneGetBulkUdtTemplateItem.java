/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceZoneGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceZoneGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceZoneGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceZoneObjectKeyData SZGetIn;
/**
 *
 * Constructor to create a  ServiceZoneGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceZoneGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectKeyData SZGetInIn) {
    super(id, context, "ServiceZoneGet");
    SZGetIn = SZGetInIn;
  }

  public void translateToMap() {
    if (SZGetIn != null) {
      SZGetIn.resetFlags(true, true);
      addInput("ServiceZone", ServiceZoneObjectKeyHelper.toMap(SZGetIn, new HashMap(), "ServiceZoneObjectKeyData").get("ServiceZoneObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceZone
 * @param SZGetInIn Value of the SZGetIn
 *
 */

  public void setServiceZone(ServiceZoneObjectKeyData SZGetInIn) {
    SZGetIn = SZGetInIn;
  }

  public void translateFromMap() {
    SZGetIn = ServiceZoneObjectKeyHelper.fromMap(inputMap, "ServiceZone");
  }

/**
 *
 * Gets the ServiceZone
 * @return Value of the ServiceZone
 *
 */

  public ServiceZoneObjectKeyData getServiceZone( ) {
    return SZGetIn;
  }

}
