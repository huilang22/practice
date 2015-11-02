/*
 * Generated code DO NOT EDIT
 * Generated file: SupervisorFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a SupervisorFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SupervisorFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SupervisorObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SupervisorFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SupervisorFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SupervisorObjectDataList noOpInIn) {
    super(id, context, "SupervisorFind");
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
        mapArray[i] = SupervisorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Supervisor", noOpIn);
      }
      addInput("Supervisor", mapList);
    }
  }
/**
 *
 * Sets the  Supervisor
 * @param noOpInIn SupervisorObjectDataList to set
 *
 */
  public void setSupervisor(SupervisorObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Supervisor passed into the constructor
 * @return Simulated response
 *
 */
  public SupervisorObjectDataList getSupervisor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SupervisorObjectHelper.fromMapList(inputMap, "SupervisorList");
  }
}
