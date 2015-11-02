/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceAddressAssocFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceAddressAssocFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceAddressAssocObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceAddressAssocFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceAddressAssocFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocObjectDataList noOpInIn) {
    super(id, context, "ServiceAddressAssocFind");
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
        mapArray[i] = ServiceAddressAssocObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceAddressAssoc", noOpIn);
      }
      addInput("ServiceAddressAssoc", mapList);
    }
  }
/**
 *
 * Sets the  ServiceAddressAssoc
 * @param noOpInIn ServiceAddressAssocObjectDataList to set
 *
 */
  public void setServiceAddressAssoc(ServiceAddressAssocObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceAddressAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressAssocObjectDataList getServiceAddressAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceAddressAssocObjectHelper.fromMapList(inputMap, "ServiceAddressAssocList");
  }
}
