/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableServiceTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceableServiceTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceableServiceTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServicePricingPlanObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceableServiceTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceableServiceTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServicePricingPlanObjectDataList noOpInIn) {
    super(id, context, "ServiceableServiceTypeFind");
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
        mapArray[i] = ServicePricingPlanObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServicePricingPlan", noOpIn);
      }
      addInput("ServicePricingPlan", mapList);
    }
  }
/**
 *
 * Sets the  ServicePricingPlan
 * @param noOpInIn ServicePricingPlanObjectDataList to set
 *
 */
  public void setServicePricingPlan(ServicePricingPlanObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServicePricingPlan passed into the constructor
 * @return Simulated response
 *
 */
  public ServicePricingPlanObjectDataList getServicePricingPlan() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServicePricingPlanObjectHelper.fromMapList(inputMap, "ServicePricingPlanList");
  }
}
