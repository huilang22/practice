/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionActionFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdRelationalConstraintConditionActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalConstraintConditionActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalConstraintConditionDescObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalConstraintConditionActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalConstraintConditionActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalConstraintConditionDescObjectDataList noOpInIn) {
    super(id, context, "BsdRelationalConstraintConditionActionFind");
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
        mapArray[i] = BsdRelationalConstraintConditionDescObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdRelationalConstraintCondition", noOpIn);
      }
      addInput("BsdRelationalConstraintCondition", mapList);
    }
  }
/**
 *
 * Sets the  BsdRelationalConstraintCondition
 * @param noOpInIn BsdRelationalConstraintConditionDescObjectDataList to set
 *
 */
  public void setBsdRelationalConstraintCondition(BsdRelationalConstraintConditionDescObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalConstraintCondition passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalConstraintConditionDescObjectDataList getBsdRelationalConstraintCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalConstraintConditionDescObjectHelper.fromMapList(inputMap, "BsdRelationalConstraintConditionList");
  }
}
