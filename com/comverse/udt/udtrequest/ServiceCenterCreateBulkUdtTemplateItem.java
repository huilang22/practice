/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterCreateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceCenterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceCenterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceCenterObjectData SCCreateIn;
/**
 *
 * Constructor to create a  ServiceCenterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceCenterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterObjectData SCCreateInIn) {
    super(id, context, "ServiceCenterCreate");
    SCCreateIn = SCCreateInIn;
  }

  public void translateToMap() {
    if (SCCreateIn != null) {
      SCCreateIn.resetFlags(true, true);
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(SCCreateIn, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }


/**
 *
 * Sets the ServiceCenter
 * @param SCCreateInIn Value of the SCCreateIn
 *
 */

  public void setServiceCenter(ServiceCenterObjectData SCCreateInIn) {
    SCCreateIn = SCCreateInIn;
  }

  public void translateFromMap() {
    SCCreateIn = ServiceCenterObjectHelper.fromMap(inputMap, "ServiceCenter");
  }

/**
 *
 * Gets the ServiceCenter
 * @return Value of the ServiceCenter
 *
 */

  public ServiceCenterObjectData getServiceCenter( ) {
    return SCCreateIn;
  }

}
