/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceCenterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceCenterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceCenterObjectData SCUpdateIn;
/**
 *
 * Constructor to create a  ServiceCenterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceCenterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterObjectData SCUpdateInIn) {
    super(id, context, "ServiceCenterUpdate");
    SCUpdateIn = SCUpdateInIn;
  }

  public void translateToMap() {
    if (SCUpdateIn != null) {
      SCUpdateIn.resetFlags(true, true);
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(SCUpdateIn, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }


/**
 *
 * Sets the ServiceCenter
 * @param SCUpdateInIn Value of the SCUpdateIn
 *
 */

  public void setServiceCenter(ServiceCenterObjectData SCUpdateInIn) {
    SCUpdateIn = SCUpdateInIn;
  }

  public void translateFromMap() {
    SCUpdateIn = ServiceCenterObjectHelper.fromMap(inputMap, "ServiceCenter");
  }

/**
 *
 * Gets the ServiceCenter
 * @return Value of the ServiceCenter
 *
 */

  public ServiceCenterObjectData getServiceCenter( ) {
    return SCUpdateIn;
  }

}
