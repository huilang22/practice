/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceZoneFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceZoneFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceZoneObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceZoneFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceZoneFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectDataList noOpInIn) {
    super(id, context, "ServiceZoneFind");
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
        mapArray[i] = ServiceZoneObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceZone", noOpIn);
      }
      addInput("ServiceZone", mapList);
    }
  }
/**
 *
 * Sets the  ServiceZone
 * @param noOpInIn ServiceZoneObjectDataList to set
 *
 */
  public void setServiceZone(ServiceZoneObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceZone passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceZoneObjectDataList getServiceZone() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceZoneObjectHelper.fromMapList(inputMap, "ServiceZoneList");
  }
}
