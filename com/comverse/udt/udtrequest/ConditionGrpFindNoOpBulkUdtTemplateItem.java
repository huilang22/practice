/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConditionGrpFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConditionGrpFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CondGrpObjDataList noOpIn;

/**
 *
 * Constructor to create a   ConditionGrpFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConditionGrpFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CondGrpObjDataList noOpInIn) {
    super(id, context, "ConditionGrpFind");
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
        mapArray[i] = CondGrpObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ConditionGrp", noOpIn);
      }
      addInput("ConditionGrp", mapList);
    }
  }
/**
 *
 * Sets the  ConditionGrp
 * @param noOpInIn CondGrpObjDataList to set
 *
 */
  public void setConditionGrp(CondGrpObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ConditionGrp passed into the constructor
 * @return Simulated response
 *
 */
  public CondGrpObjDataList getConditionGrp() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CondGrpObjHelper.fromMapList(inputMap, "ConditionGrpList");
  }
}
