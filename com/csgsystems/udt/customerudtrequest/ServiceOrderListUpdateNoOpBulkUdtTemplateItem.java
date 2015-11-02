/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderListUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderListUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderListUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderObjectBaseDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderListUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderListUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderObjectBaseDataList noOpInIn) {
    super(id, context, "ServiceOrderListUpdate");
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
        mapArray[i] = ServiceOrderObjectBaseHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrder", noOpIn);
      }
      addInput("ServiceOrder", mapList);
    }
  }
/**
 *
 * Sets the  ServiceOrder
 * @param noOpInIn ServiceOrderObjectBaseDataList to set
 *
 */
  public void setServiceOrder(ServiceOrderObjectBaseDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrder passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderObjectBaseDataList getServiceOrder() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderObjectBaseHelper.fromMapList(inputMap, "ServiceOrderList");
  }
}
