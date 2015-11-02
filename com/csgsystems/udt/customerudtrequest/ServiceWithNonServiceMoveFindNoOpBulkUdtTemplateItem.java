/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceWithNonServiceMoveFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceWithNonServiceMoveFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceWithNonServiceMoveFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceWithNonServiceMoveFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceWithNonServiceMoveFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectDataList noOpInIn) {
    super(id, context, "ServiceWithNonServiceMoveFind");
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
        mapArray[i] = ServiceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Service", noOpIn);
      }
      addInput("Service", mapList);
    }
  }
/**
 *
 * Sets the  Service
 * @param noOpInIn ServiceObjectDataList to set
 *
 */
  public void setService(ServiceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Service passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceObjectDataList getService() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceObjectHelper.fromMapList(inputMap, "ServiceList");
  }
}
