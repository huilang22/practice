/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceMasterGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceMasterGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceMasterGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceMasterGroupObjectKeyData EMGgetIn;
/**
 *
 * Constructor to create a  ServiceMasterGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceMasterGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceMasterGroupObjectKeyData EMGgetInIn) {
    super(id, context, "ServiceMasterGroupGet");
    EMGgetIn = EMGgetInIn;
  }

  public void translateToMap() {
    if (EMGgetIn != null) {
      EMGgetIn.resetFlags(true, true);
      addInput("ServiceMasterGroup", ServiceMasterGroupObjectKeyHelper.toMap(EMGgetIn, new HashMap(), "ServiceMasterGroupObjectKeyData").get("ServiceMasterGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceMasterGroup
 * @param EMGgetInIn Value of the EMGgetIn
 *
 */

  public void setServiceMasterGroup(ServiceMasterGroupObjectKeyData EMGgetInIn) {
    EMGgetIn = EMGgetInIn;
  }

  public void translateFromMap() {
    EMGgetIn = ServiceMasterGroupObjectKeyHelper.fromMap(inputMap, "ServiceMasterGroup");
  }

/**
 *
 * Gets the ServiceMasterGroup
 * @return Value of the ServiceMasterGroup
 *
 */

  public ServiceMasterGroupObjectKeyData getServiceMasterGroup( ) {
    return EMGgetIn;
  }

}
