/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceCenterTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ServiceCenterTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceCenterTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceCenterTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceCenterTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceCenterTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceCenterTypeObjectDataList noOpInIn) {
    super(id, context, "ServiceCenterTypeFind");
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
        mapArray[i] = ServiceCenterTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceCenterType", noOpIn);
      }
      addInput("ServiceCenterType", mapList);
    }
  }
/**
 *
 * Sets the  ServiceCenterType
 * @param noOpInIn ServiceCenterTypeObjectDataList to set
 *
 */
  public void setServiceCenterType(ServiceCenterTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceCenterType passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceCenterTypeObjectDataList getServiceCenterType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceCenterTypeObjectHelper.fromMapList(inputMap, "ServiceCenterTypeList");
  }
}
