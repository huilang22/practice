/*
 * Generated code DO NOT EDIT
 * Generated file: BsdRelationalConstraintConditionFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdRelationalConstraintConditionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintConditionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintConditionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintConditionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintConditionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintConditionObjectDataList noOpInIn) {
    super(id, context, "BsdRelationalConstraintConditionFind");
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
        mapArray[i] = BsdRelationalConstraintConditionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdRelationalConstraintCondition", noOpIn);
      }
      addInput("BsdRelationalConstraintCondition", mapList);
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraintCondition
 * @param noOpInIn BsdRelationalConstraintConditionObjectDataList to set
 *
 */
  public void setBsdRelationalConstraintCondition(BsdRelationalConstraintConditionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraintCondition passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintConditionObjectDataList getBsdRelationalConstraintCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintConditionObjectHelper.fromMapList(inputMap, "BsdRelationalConstraintConditionList");
  }
}
