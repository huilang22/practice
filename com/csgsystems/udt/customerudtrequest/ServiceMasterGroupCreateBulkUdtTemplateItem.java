/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceMasterGroupCreateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceMasterGroupCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceMasterGroupCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceMasterGroupObjectData EMGcreateIn;
/**
 *
 * Constructor to create a  ServiceMasterGroupCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceMasterGroupCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceMasterGroupObjectData EMGcreateInIn) {
    super(id, context, "ServiceMasterGroupCreate");
    EMGcreateIn = EMGcreateInIn;
  }

  public void translateToMap() {
    if (EMGcreateIn != null) {
      EMGcreateIn.resetFlags(true, true);
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(EMGcreateIn, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }


/**
 *
 * Sets the ServiceMasterGroup
 * @param EMGcreateInIn Value of the EMGcreateIn
 *
 */

  public void setServiceMasterGroup(ServiceMasterGroupObjectData EMGcreateInIn) {
    EMGcreateIn = EMGcreateInIn;
  }

  public void translateFromMap() {
    EMGcreateIn = ServiceMasterGroupObjectHelper.fromMap(inputMap, "ServiceMasterGroup");
  }

/**
 *
 * Gets the ServiceMasterGroup
 * @return Value of the ServiceMasterGroup
 *
 */

  public ServiceMasterGroupObjectData getServiceMasterGroup( ) {
    return EMGcreateIn;
  }

}
