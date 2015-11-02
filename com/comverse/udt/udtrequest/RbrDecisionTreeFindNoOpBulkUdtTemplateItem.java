/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrDecisionTreeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrDecisionTreeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrDecTreeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrDecisionTreeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrDecisionTreeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrDecTreeObjectDataList noOpInIn) {
    super(id, context, "RbrDecisionTreeFind");
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
        mapArray[i] = RbrDecTreeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrDecisionTree", noOpIn);
      }
      addInput("RbrDecisionTree", mapList);
    }
  }
/**
 *
 * Sets the  RbrDecisionTree
 * @param noOpInIn RbrDecTreeObjectDataList to set
 *
 */
  public void setRbrDecisionTree(RbrDecTreeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrDecisionTree passed into the constructor
 * @return Simulated response
 *
 */
  public RbrDecTreeObjectDataList getRbrDecisionTree() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrDecTreeObjectHelper.fromMapList(inputMap, "RbrDecisionTreeList");
  }
}
