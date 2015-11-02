/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionActionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdAttributeConstraintConditionActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdAttributeConstraintConditionActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdAttributeConstraintConditionDescObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdAttributeConstraintConditionActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdAttributeConstraintConditionActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdAttributeConstraintConditionDescObjectDataList noOpInIn) {
    super(id, context, "BsdAttributeConstraintConditionActionFind");
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
        mapArray[i] = BsdAttributeConstraintConditionDescObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdAttributeConstraintCondition", noOpIn);
      }
      addInput("BsdAttributeConstraintCondition", mapList);
    }
  }
/**
 *
 * Sets the  BsdAttributeConstraintCondition
 * @param noOpInIn BsdAttributeConstraintConditionDescObjectDataList to set
 *
 */
  public void setBsdAttributeConstraintCondition(BsdAttributeConstraintConditionDescObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAttributeConstraintCondition passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeConstraintConditionDescObjectDataList getBsdAttributeConstraintCondition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdAttributeConstraintConditionDescObjectHelper.fromMapList(inputMap, "BsdAttributeConstraintConditionList");
  }
}
