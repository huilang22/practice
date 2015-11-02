/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceZoneFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceZoneFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceZoneFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceZoneObjectFilter SZFindIn;
/**
 *
 * Constructor to create a  ServiceZoneFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceZoneFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectFilter SZFindInIn) {
    super(id, context, "ServiceZoneFind");
    SZFindIn = SZFindInIn;
  }

  public void translateToMap() {
    if (SZFindIn != null) {
      Integer index =  SZFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(SZFindIn, new HashMap(), "ServiceZone").get("ServiceZone"));
    }
  }


/**
 *
 * Sets the ServiceZone
 * @param SZFindInIn Value of the SZFindIn
 *
 */

  public void setServiceZone(ServiceZoneObjectFilter SZFindInIn) {
    SZFindIn = SZFindInIn;
  }

  public void translateFromMap() {
    SZFindIn = ServiceZoneObjectHelper.fromMapFilter(inputMap, "ServiceZone");
  }

/**
 *
 * Gets the ServiceZone
 * @return Value of the ServiceZone
 *
 */

  public ServiceZoneObjectFilter getServiceZone( ) {
    return SZFindIn;
  }

}
