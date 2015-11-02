/*
 * Generated code DO NOT EDIT
 * Generated file: ArmStatusFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ArmStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ArmStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ASObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ArmStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ArmStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ASObjectDataList noOpInIn) {
    super(id, context, "ArmStatusFind");
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
        mapArray[i] = ASObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ArmStatus", noOpIn);
      }
      addInput("ArmStatus", mapList);
    }
  }
/**
 *
 * Sets the  ArmStatus
 * @param noOpInIn ASObjectDataList to set
 *
 */
  public void setArmStatus(ASObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ArmStatus passed into the constructor
 * @return Simulated response
 *
 */
  public ASObjectDataList getArmStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ASObjectHelper.fromMapList(inputMap, "ArmStatusList");
  }
}
