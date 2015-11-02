/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsLocationDetailFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationDetailFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationDetailObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsLocationDetailFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationDetailFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailObjectDataList noOpInIn) {
    super(id, context, "InvsLocationDetailFind");
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
        mapArray[i] = InvsLocationDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocationDetail", noOpIn);
      }
      addInput("InvsLocationDetail", mapList);
    }
  }
/**
 *
 * Sets the  InvsLocationDetail
 * @param noOpInIn InvsLocationDetailObjectDataList to set
 *
 */
  public void setInvsLocationDetail(InvsLocationDetailObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationDetail passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationDetailObjectDataList getInvsLocationDetail() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationDetailObjectHelper.fromMapList(inputMap, "InvsLocationDetailList");
  }
}
