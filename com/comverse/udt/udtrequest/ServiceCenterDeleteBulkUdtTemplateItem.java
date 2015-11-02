/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ServiceCenterDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceCenterDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceCenterObjectKeyData SCDeleteIn;
/**
 *
 * Constructor to create a  ServiceCenterDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceCenterDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterObjectKeyData SCDeleteInIn) {
    super(id, context, "ServiceCenterDelete");
    SCDeleteIn = SCDeleteInIn;
  }

  public void translateToMap() {
    if (SCDeleteIn != null) {
      SCDeleteIn.resetFlags(true, true);
      addInput("ServiceCenter", ServiceCenterObjectKeyHelper.toMap(SCDeleteIn, new HashMap(), "ServiceCenterObjectKeyData").get("ServiceCenterObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceCenter
 * @param SCDeleteInIn Value of the SCDeleteIn
 *
 */

  public void setServiceCenter(ServiceCenterObjectKeyData SCDeleteInIn) {
    SCDeleteIn = SCDeleteInIn;
  }

  public void translateFromMap() {
    SCDeleteIn = ServiceCenterObjectKeyHelper.fromMap(inputMap, "ServiceCenter");
  }

/**
 *
 * Gets the ServiceCenter
 * @return Value of the ServiceCenter
 *
 */

  public ServiceCenterObjectKeyData getServiceCenter( ) {
    return SCDeleteIn;
  }

}
