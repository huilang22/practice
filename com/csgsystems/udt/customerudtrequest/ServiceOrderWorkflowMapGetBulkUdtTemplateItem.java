/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderWorkflowMapGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceOrderWorkflowMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderWorkflowMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderWorkflowMapObjectKeyData ServiceOrderWorkflowMapGetIn;
/**
 *
 * Constructor to create a  ServiceOrderWorkflowMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderWorkflowMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderWorkflowMapObjectKeyData ServiceOrderWorkflowMapGetInIn) {
    super(id, context, "ServiceOrderWorkflowMapGet");
    ServiceOrderWorkflowMapGetIn = ServiceOrderWorkflowMapGetInIn;
  }

  public void translateToMap() {
    if (ServiceOrderWorkflowMapGetIn != null) {
      ServiceOrderWorkflowMapGetIn.resetFlags(true, true);
      addInput("ServiceOrderWorkflowMap", ServiceOrderWorkflowMapObjectKeyHelper.toMap(ServiceOrderWorkflowMapGetIn, new HashMap(), "ServiceOrderWorkflowMapObjectKeyData").get("ServiceOrderWorkflowMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the ServiceOrderWorkflowMap
 * @param ServiceOrderWorkflowMapGetInIn Value of the ServiceOrderWorkflowMapGetIn
 *
 */

  public void setServiceOrderWorkflowMap(ServiceOrderWorkflowMapObjectKeyData ServiceOrderWorkflowMapGetInIn) {
    ServiceOrderWorkflowMapGetIn = ServiceOrderWorkflowMapGetInIn;
  }

  public void translateFromMap() {
    ServiceOrderWorkflowMapGetIn = ServiceOrderWorkflowMapObjectKeyHelper.fromMap(inputMap, "ServiceOrderWorkflowMap");
  }

/**
 *
 * Gets the ServiceOrderWorkflowMap
 * @return Value of the ServiceOrderWorkflowMap
 *
 */

  public ServiceOrderWorkflowMapObjectKeyData getServiceOrderWorkflowMap( ) {
    return ServiceOrderWorkflowMapGetIn;
  }

}
