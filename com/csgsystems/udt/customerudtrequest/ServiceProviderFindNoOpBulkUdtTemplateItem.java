/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceProviderFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ServiceProviderFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceProviderFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceProviderObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceProviderFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceProviderFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceProviderObjectDataList noOpInIn) {
    super(id, context, "ServiceProviderFind");
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
        mapArray[i] = ServiceProviderObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceProvider", noOpIn);
      }
      addInput("ServiceProvider", mapList);
    }
  }
/**
 *
 * Sets the  ServiceProvider
 * @param noOpInIn ServiceProviderObjectDataList to set
 *
 */
  public void setServiceProvider(ServiceProviderObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceProvider passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceProviderObjectDataList getServiceProvider() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceProviderObjectHelper.fromMapList(inputMap, "ServiceProviderList");
  }
}
