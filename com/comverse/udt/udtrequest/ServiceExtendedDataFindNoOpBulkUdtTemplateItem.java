/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceExtendedDataFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceEDObjectDataList noOpInIn) {
    super(id, context, "ServiceExtendedDataFind");
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
        mapArray[i] = ServiceEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceExtendedData", noOpIn);
      }
      addInput("ServiceExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  ServiceExtendedData
 * @param noOpInIn ServiceEDObjectDataList to set
 *
 */
  public void setServiceExtendedData(ServiceEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceEDObjectDataList getServiceExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceEDObjectHelper.fromMapList(inputMap, "ServiceExtendedDataList");
  }
}
