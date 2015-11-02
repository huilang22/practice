/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceStatusFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceStatusObjectDataList noOpInIn) {
    super(id, context, "ServiceStatusFind");
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
        mapArray[i] = ServiceStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceStatus", noOpIn);
      }
      addInput("ServiceStatus", mapList);
    }
  }
/**
 *
 * Sets the  ServiceStatus
 * @param noOpInIn ServiceStatusObjectDataList to set
 *
 */
  public void setServiceStatus(ServiceStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceStatus passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceStatusObjectDataList getServiceStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceStatusObjectHelper.fromMapList(inputMap, "ServiceStatusList");
  }
}
