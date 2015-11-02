/*
 * Generated code DO NOT EDIT
 * Generated file: TransSourceTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TransSourceTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TransSourceTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TransSourceTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TransSourceTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TransSourceTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TransSourceTypeObjectDataList noOpInIn) {
    super(id, context, "TransSourceTypeFind");
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
        mapArray[i] = TransSourceTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TransSourceType", noOpIn);
      }
      addInput("TransSourceType", mapList);
    }
  }
/**
 *
 * Sets the  TransSourceType
 * @param noOpInIn TransSourceTypeObjectDataList to set
 *
 */
  public void setTransSourceType(TransSourceTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TransSourceType passed into the constructor
 * @return Simulated response
 *
 */
  public TransSourceTypeObjectDataList getTransSourceType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TransSourceTypeObjectHelper.fromMapList(inputMap, "TransSourceTypeList");
  }
}
