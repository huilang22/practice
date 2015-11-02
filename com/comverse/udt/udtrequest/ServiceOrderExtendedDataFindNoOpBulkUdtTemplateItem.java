/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderExtendedDataFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderEDObjectDataList noOpInIn) {
    super(id, context, "ServiceOrderExtendedDataFind");
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
        mapArray[i] = ServiceOrderEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrderExtendedData", noOpIn);
      }
      addInput("ServiceOrderExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  ServiceOrderExtendedData
 * @param noOpInIn ServiceOrderEDObjectDataList to set
 *
 */
  public void setServiceOrderExtendedData(ServiceOrderEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrderExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderEDObjectDataList getServiceOrderExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderEDObjectHelper.fromMapList(inputMap, "ServiceOrderExtendedDataList");
  }
}
