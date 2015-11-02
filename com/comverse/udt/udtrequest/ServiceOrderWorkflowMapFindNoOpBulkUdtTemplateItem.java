/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderWorkflowMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderWorkflowMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderWorkflowMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderWorkflowMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderWorkflowMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderWorkflowMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderWorkflowMapObjectDataList noOpInIn) {
    super(id, context, "ServiceOrderWorkflowMapFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ServiceOrderWorkflowMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrderWorkflowMap", noOpIn);
      }
      addInput("ServiceOrderWorkflowMap", mapList);
    }
  }
/**
 *
 * Sets the  ServiceOrderWorkflowMap
 * @param noOpInIn ServiceOrderWorkflowMapObjectDataList to set
 *
 */
  public void setServiceOrderWorkflowMap(ServiceOrderWorkflowMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrderWorkflowMap passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderWorkflowMapObjectDataList getServiceOrderWorkflowMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderWorkflowMapObjectHelper.fromMapList(inputMap, "ServiceOrderWorkflowMapList");
  }
}
