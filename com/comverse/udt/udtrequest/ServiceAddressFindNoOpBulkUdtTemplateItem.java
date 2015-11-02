/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceAddressFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceAddressFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceAddressObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceAddressFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceAddressFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressObjectDataList noOpInIn) {
    super(id, context, "ServiceAddressFind");
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
        mapArray[i] = ServiceAddressObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceAddress", noOpIn);
      }
      addInput("ServiceAddress", mapList);
    }
  }
/**
 *
 * Sets the  ServiceAddress
 * @param noOpInIn ServiceAddressObjectDataList to set
 *
 */
  public void setServiceAddress(ServiceAddressObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceAddress passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressObjectDataList getServiceAddress() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceAddressObjectHelper.fromMapList(inputMap, "ServiceAddressList");
  }
}
