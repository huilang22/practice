/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceMasterGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceMasterGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceMasterGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceMasterGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceMasterGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceMasterGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceMasterGroupObjectDataList noOpInIn) {
    super(id, context, "ServiceMasterGroupFind");
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
        mapArray[i] = ServiceMasterGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceMasterGroup", noOpIn);
      }
      addInput("ServiceMasterGroup", mapList);
    }
  }
/**
 *
 * Sets the  ServiceMasterGroup
 * @param noOpInIn ServiceMasterGroupObjectDataList to set
 *
 */
  public void setServiceMasterGroup(ServiceMasterGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceMasterGroup passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceMasterGroupObjectDataList getServiceMasterGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceMasterGroupObjectHelper.fromMapList(inputMap, "ServiceMasterGroupList");
  }
}
