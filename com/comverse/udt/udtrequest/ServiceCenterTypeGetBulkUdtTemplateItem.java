/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceCenterTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceCenterTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceCenterTypeObjectKeyData SCTGetIn;
/**
 *
 * Constructor to create a  ServiceCenterTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceCenterTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterTypeObjectKeyData SCTGetInIn) {
    super(id, context, "ServiceCenterTypeGet");
    SCTGetIn = SCTGetInIn;
  }

  public void translateToMap() {
    if (SCTGetIn != null) {
      SCTGetIn.resetFlags(true, true);
      addInput("ServiceCenterType", ServiceCenterTypeObjectKeyHelper.toMap(SCTGetIn, new HashMap(), "ServiceCenterTypeObjectKeyData").get("ServiceCenterTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceCenterType
 * @param SCTGetInIn Value of the SCTGetIn
 *
 */

  public void setServiceCenterType(ServiceCenterTypeObjectKeyData SCTGetInIn) {
    SCTGetIn = SCTGetInIn;
  }

  public void translateFromMap() {
    SCTGetIn = ServiceCenterTypeObjectKeyHelper.fromMap(inputMap, "ServiceCenterType");
  }

/**
 *
 * Gets the ServiceCenterType
 * @return Value of the ServiceCenterType
 *
 */

  public ServiceCenterTypeObjectKeyData getServiceCenterType( ) {
    return SCTGetIn;
  }

}
