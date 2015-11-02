/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceObjectBaseDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceObjectBaseDataList noOpInIn) {
    super(id, context, "ServiceFind");
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
        mapArray[i] = ServiceObjectBaseHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Service", noOpIn);
      }
      addInput("Service", mapList);
    }
  }
/**
 *
 * Sets the  Service
 * @param noOpInIn ServiceObjectBaseDataList to set
 *
 */
  public void setService(ServiceObjectBaseDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Service passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceObjectBaseDataList getService() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceObjectBaseHelper.fromMapList(inputMap, "ServiceList");
  }
}
