/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupCorridorFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a HqGroupCorridorFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqGroupCorridorFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqGroupCorridorObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HqGroupCorridorFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqGroupCorridorFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupCorridorObjectDataList noOpInIn) {
    super(id, context, "HqGroupCorridorFind");
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
        mapArray[i] = HqGroupCorridorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroupCorridor", noOpIn);
      }
      addInput("HqGroupCorridor", mapList);
    }
  }
/**
 *
 * Sets the  HqGroupCorridor
 * @param noOpInIn HqGroupCorridorObjectDataList to set
 *
 */
  public void setHqGroupCorridor(HqGroupCorridorObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqGroupCorridor passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupCorridorObjectDataList getHqGroupCorridor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqGroupCorridorObjectHelper.fromMapList(inputMap, "HqGroupCorridorList");
  }
}
