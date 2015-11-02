/*
 * Generated code DO NOT EDIT
 * Generated file: BsdAttributeConstraintConditionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeConstraintConditionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintConditionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintConditionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintConditionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintConditionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintConditionObjectDataList noOpInIn) {
    super(id, context, "BsdAttributeConstraintConditionFind");
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
        mapArray[i] = BsdAttributeConstraintConditionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttributeConstraintCondition", noOpIn);
      }
      addInput("BsdAttributeConstraintCondition", mapList);
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraintCondition
 * @param noOpInIn BsdAttributeConstraintConditionObjectDataList to set
 *
 */
  public void setBsdAttributeConstraintCondition(BsdAttributeConstraintConditionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraintCondition passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintConditionObjectDataList getBsdAttributeConstraintCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintConditionObjectHelper.fromMapList(inputMap, "BsdAttributeConstraintConditionList");
  }
}
