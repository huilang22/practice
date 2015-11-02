/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceCenterFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceCenterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceCenterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceCenterObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceCenterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceCenterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterObjectDataList noOpInIn) {
    super(id, context, "ServiceCenterFind");
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
        mapArray[i] = ServiceCenterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceCenter", noOpIn);
      }
      addInput("ServiceCenter", mapList);
    }
  }
/**
 *
 * Sets the  ServiceCenter
 * @param noOpInIn ServiceCenterObjectDataList to set
 *
 */
  public void setServiceCenter(ServiceCenterObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceCenter passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceCenterObjectDataList getServiceCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceCenterObjectHelper.fromMapList(inputMap, "ServiceCenterList");
  }
}
