/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceOrderInvContainerFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceOrderInvContainerFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceOrderInvContainerFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvContainerIdObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceOrderInvContainerFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceOrderInvContainerFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvContainerIdObjectDataList noOpInIn) {
    super(id, context, "ServiceOrderInvContainerFind");
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
        mapArray[i] = InvContainerIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvContainer", noOpIn);
      }
      addInput("InvContainer", mapList);
    }
  }
/**
 *
 * Sets the  InvContainer
 * @param noOpInIn InvContainerIdObjectDataList to set
 *
 */
  public void setInvContainer(InvContainerIdObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvContainer passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerIdObjectDataList getInvContainer() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvContainerIdObjectHelper.fromMapList(inputMap, "InvContainerList");
  }
}
