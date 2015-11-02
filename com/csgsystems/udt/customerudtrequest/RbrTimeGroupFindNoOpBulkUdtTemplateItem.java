/*
 * Generated code DO NOT EDIT
 * Generated file: RbrTimeGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrTimeGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrTimeGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrTmGrpObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrTimeGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrTimeGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTmGrpObjectDataList noOpInIn) {
    super(id, context, "RbrTimeGroupFind");
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
        mapArray[i] = RbrTmGrpObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrTimeGroup", noOpIn);
      }
      addInput("RbrTimeGroup", mapList);
    }
  }
/**
 *
 * Sets the  RbrTimeGroup
 * @param noOpInIn RbrTmGrpObjectDataList to set
 *
 */
  public void setRbrTimeGroup(RbrTmGrpObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrTimeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public RbrTmGrpObjectDataList getRbrTimeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrTmGrpObjectHelper.fromMapList(inputMap, "RbrTimeGroupList");
  }
}
