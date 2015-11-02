/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderDependencyFindDependentNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderDependencyFindDependentNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderDependencyFindDependentNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderDependencyObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderDependencyFindDependentNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderDependencyFindDependentNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderDependencyObjectDataList noOpInIn) {
    super(id, context, "ServiceOrderDependencyFindDependent");
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
        mapArray[i] = ServiceOrderDependencyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrderDependency", noOpIn);
      }
      addInput("ServiceOrderDependency", mapList);
    }
  }
/**
 *
 * Sets the  ServiceOrderDependency
 * @param noOpInIn ServiceOrderDependencyObjectDataList to set
 *
 */
  public void setServiceOrderDependency(ServiceOrderDependencyObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrderDependency passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderDependencyObjectDataList getServiceOrderDependency() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderDependencyObjectHelper.fromMapList(inputMap, "ServiceOrderDependencyList");
  }
}
