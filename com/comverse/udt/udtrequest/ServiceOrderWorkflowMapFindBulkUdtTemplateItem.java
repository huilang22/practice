/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWorkflowMapFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceOrderWorkflowMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceOrderWorkflowMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceOrderWorkflowMapObjectFilter ServiceOrderWorkflowMapFindIn;
/**
 *
 * Constructor to create a  ServiceOrderWorkflowMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceOrderWorkflowMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderWorkflowMapObjectFilter ServiceOrderWorkflowMapFindInIn) {
    super(id, context, "ServiceOrderWorkflowMapFind");
    ServiceOrderWorkflowMapFindIn = ServiceOrderWorkflowMapFindInIn;
  }

  public void translateToMap() {
    if (ServiceOrderWorkflowMapFindIn != null) {
      Integer index =  ServiceOrderWorkflowMapFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceOrderWorkflowMap", ServiceOrderWorkflowMapObjectHelper.toMap(ServiceOrderWorkflowMapFindIn, new HashMap(), "ServiceOrderWorkflowMap").get("ServiceOrderWorkflowMap"));
    }
  }


/**
 *
 * Sets the ServiceOrderWorkflowMap
 * @param ServiceOrderWorkflowMapFindInIn Value of the ServiceOrderWorkflowMapFindIn
 *
 */

  public void setServiceOrderWorkflowMap(ServiceOrderWorkflowMapObjectFilter ServiceOrderWorkflowMapFindInIn) {
    ServiceOrderWorkflowMapFindIn = ServiceOrderWorkflowMapFindInIn;
  }

  public void translateFromMap() {
    ServiceOrderWorkflowMapFindIn = ServiceOrderWorkflowMapObjectHelper.fromMapFilter(inputMap, "ServiceOrderWorkflowMap");
  }

/**
 *
 * Gets the ServiceOrderWorkflowMap
 * @return Value of the ServiceOrderWorkflowMap
 *
 */

  public ServiceOrderWorkflowMapObjectFilter getServiceOrderWorkflowMap( ) {
    return ServiceOrderWorkflowMapFindIn;
  }

}
