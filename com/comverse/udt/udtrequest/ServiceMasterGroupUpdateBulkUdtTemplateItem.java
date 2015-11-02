/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceMasterGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceMasterGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceMasterGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceMasterGroupObjectData EMGupdateIn;
/**
 *
 * Constructor to create a  ServiceMasterGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceMasterGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceMasterGroupObjectData EMGupdateInIn) {
    super(id, context, "ServiceMasterGroupUpdate");
    EMGupdateIn = EMGupdateInIn;
  }

  public void translateToMap() {
    if (EMGupdateIn != null) {
      EMGupdateIn.resetFlags(true, true);
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectHelper.toMap(EMGupdateIn, new HashMap(), "ServiceMasterGroup").get("ServiceMasterGroup"));
    }
  }


/**
 *
 * Sets the ServiceMasterGroup
 * @param EMGupdateInIn Value of the EMGupdateIn
 *
 */

  public void setServiceMasterGroup(ServiceMasterGroupObjectData EMGupdateInIn) {
    EMGupdateIn = EMGupdateInIn;
  }

  public void translateFromMap() {
    EMGupdateIn = ServiceMasterGroupObjectHelper.fromMap(inputMap, "ServiceMasterGroup");
  }

/**
 *
 * Gets the ServiceMasterGroup
 * @return Value of the ServiceMasterGroup
 *
 */

  public ServiceMasterGroupObjectData getServiceMasterGroup( ) {
    return EMGupdateIn;
  }

}
