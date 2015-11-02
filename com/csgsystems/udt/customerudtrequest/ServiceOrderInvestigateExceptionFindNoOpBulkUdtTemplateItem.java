/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderInvestigateExceptionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderInvestigateExceptionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderInvestigateExceptionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceOrderInvestigateObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderInvestigateExceptionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderInvestigateExceptionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceOrderInvestigateObjectDataList noOpInIn) {
    super(id, context, "ServiceOrderInvestigateExceptionFind");
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
        mapArray[i] = ServiceOrderInvestigateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceOrderInvestigate", noOpIn);
      }
      addInput("ServiceOrderInvestigate", mapList);
    }
  }
/**
 *
 * Sets the  ServiceOrderInvestigate
 * @param noOpInIn ServiceOrderInvestigateObjectDataList to set
 *
 */
  public void setServiceOrderInvestigate(ServiceOrderInvestigateObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceOrderInvestigate passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceOrderInvestigateObjectDataList getServiceOrderInvestigate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceOrderInvestigateObjectHelper.fromMapList(inputMap, "ServiceOrderInvestigateList");
  }
}
