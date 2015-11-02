/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWorkflowMapGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderWorkflowMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderWorkflowMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderWorkflowMapObjectData noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderWorkflowMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderWorkflowMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderWorkflowMapObjectData noOpInIn) {
    super(id, context, "ServiceOrderWorkflowMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceOrderWorkflowMap", ServiceOrderWorkflowMapObjectHelper.toMap(noOpIn, new HashMap(), "ServiceOrderWorkflowMap").get("ServiceOrderWorkflowMap"));
    }
  }
/**
 *
 * Sets the  ServiceOrderWorkflowMap
 * @param noOpInIn ServiceOrderWorkflowMapObjectData to set
 *
 */
  public void setServiceOrderWorkflowMap(ServiceOrderWorkflowMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrderWorkflowMap passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderWorkflowMapObjectData getServiceOrderWorkflowMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderWorkflowMapObjectHelper.fromMap(inputMap, "ServiceOrderWorkflowMap");
  }
}
