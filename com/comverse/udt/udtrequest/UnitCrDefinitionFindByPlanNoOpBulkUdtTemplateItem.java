/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionFindByPlanNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UnitCrDefinitionFindByPlanNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrDefinitionFindByPlanNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrDefinitionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UnitCrDefinitionFindByPlanNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrDefinitionFindByPlanNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrDefinitionObjectDataList noOpInIn) {
    super(id, context, "UnitCrDefinitionFindByPlan");
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
        mapArray[i] = UnitCrDefinitionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitCrDefinition", noOpIn);
      }
      addInput("UnitCrDefinition", mapList);
    }
  }
/**
 *
 * Sets the  UnitCrDefinition
 * @param noOpInIn UnitCrDefinitionObjectDataList to set
 *
 */
  public void setUnitCrDefinition(UnitCrDefinitionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrDefinitionObjectDataList getUnitCrDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrDefinitionObjectHelper.fromMapList(inputMap, "UnitCrDefinitionList");
  }
}
