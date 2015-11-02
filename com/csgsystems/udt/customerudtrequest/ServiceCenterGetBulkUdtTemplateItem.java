/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceCenterGetBulkUdtTemplateItem.java
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
 * Class used to create a ServiceCenterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceCenterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceCenterObjectKeyData SCGetIn;
/**
 *
 * Constructor to create a  ServiceCenterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceCenterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterObjectKeyData SCGetInIn) {
    super(id, context, "ServiceCenterGet");
    SCGetIn = SCGetInIn;
  }

  public void translateToMap() {
    if (SCGetIn != null) {
      SCGetIn.resetFlags(true, true);
      addInput("ServiceCenter", ServiceCenterObjectKeyHelper.toMap(SCGetIn, new HashMap(), "ServiceCenterObjectKeyData").get("ServiceCenterObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceCenter
 * @param SCGetInIn Value of the SCGetIn
 *
 */

  public void setServiceCenter(ServiceCenterObjectKeyData SCGetInIn) {
    SCGetIn = SCGetInIn;
  }

  public void translateFromMap() {
    SCGetIn = ServiceCenterObjectKeyHelper.fromMap(inputMap, "ServiceCenter");
  }

/**
 *
 * Gets the ServiceCenter
 * @return Value of the ServiceCenter
 *
 */

  public ServiceCenterObjectKeyData getServiceCenter( ) {
    return SCGetIn;
  }

}
