/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceCenterFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceCenterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceCenterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceCenterObjectFilter SCFindIn;
/**
 *
 * Constructor to create a  ServiceCenterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceCenterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterObjectFilter SCFindInIn) {
    super(id, context, "ServiceCenterFind");
    SCFindIn = SCFindInIn;
  }

  public void translateToMap() {
    if (SCFindIn != null) {
      Integer index =  SCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceCenter", ServiceCenterObjectHelper.toMap(SCFindIn, new HashMap(), "ServiceCenter").get("ServiceCenter"));
    }
  }


/**
 *
 * Sets the ServiceCenter
 * @param SCFindInIn Value of the SCFindIn
 *
 */

  public void setServiceCenter(ServiceCenterObjectFilter SCFindInIn) {
    SCFindIn = SCFindInIn;
  }

  public void translateFromMap() {
    SCFindIn = ServiceCenterObjectHelper.fromMapFilter(inputMap, "ServiceCenter");
  }

/**
 *
 * Gets the ServiceCenter
 * @return Value of the ServiceCenter
 *
 */

  public ServiceCenterObjectFilter getServiceCenter( ) {
    return SCFindIn;
  }

}
