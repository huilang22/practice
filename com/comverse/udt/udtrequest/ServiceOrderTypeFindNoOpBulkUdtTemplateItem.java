/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceOrderTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderTypeObjectDataList noOpInIn) {
    super(id, context, "ServiceOrderTypeFind");
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
        mapArray[i] = ServiceOrderTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrderType", noOpIn);
      }
      addInput("ServiceOrderType", mapList);
    }
  }
/**
 *
 * Sets the  ServiceOrderType
 * @param noOpInIn ServiceOrderTypeObjectDataList to set
 *
 */
  public void setServiceOrderType(ServiceOrderTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrderType passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderTypeObjectDataList getServiceOrderType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderTypeObjectHelper.fromMapList(inputMap, "ServiceOrderTypeList");
  }
}
