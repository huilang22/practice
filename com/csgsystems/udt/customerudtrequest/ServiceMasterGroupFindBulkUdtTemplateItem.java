/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceMasterGroupFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceMasterGroupFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceMasterGroupFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceMasterGroupObjectFilter EMGfindIn;
/**
 *
 * Constructor to create a  ServiceMasterGroupFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceMasterGroupFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceMasterGroupObjectFilter EMGfindInIn) {
    super(id, context, "ServiceMasterGroupFind");
    EMGfindIn = EMGfindInIn;
  }

  public void translateToMap() {
    if (EMGfindIn != null) {
      Integer index =  EMGfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(EMGfindIn, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }


/**
 *
 * Sets the ServiceMasterGroup
 * @param EMGfindInIn Value of the EMGfindIn
 *
 */

  public void setServiceMasterGroup(ServiceMasterGroupObjectFilter EMGfindInIn) {
    EMGfindIn = EMGfindInIn;
  }

  public void translateFromMap() {
    EMGfindIn = ServiceMasterGroupObjectHelper.fromMapFilter(inputMap, "ServiceMasterGroup");
  }

/**
 *
 * Gets the ServiceMasterGroup
 * @return Value of the ServiceMasterGroup
 *
 */

  public ServiceMasterGroupObjectFilter getServiceMasterGroup( ) {
    return EMGfindIn;
  }

}
