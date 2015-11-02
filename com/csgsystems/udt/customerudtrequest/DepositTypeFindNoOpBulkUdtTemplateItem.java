/*
 * Generated code DO NOT EDIT
 * Generated file: DepositTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DepositTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DepositTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DepositTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DepositTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DepositTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositTypeObjectDataList noOpInIn) {
    super(id, context, "DepositTypeFind");
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
        mapArray[i] = DepositTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DepositType", noOpIn);
      }
      addInput("DepositType", mapList);
    }
  }
/**
 *
 * Sets the  DepositType
 * @param noOpInIn DepositTypeObjectDataList to set
 *
 */
  public void setDepositType(DepositTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DepositType passed into the constructor
 * @return Simulated response
 *
 */
  public DepositTypeObjectDataList getDepositType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DepositTypeObjectHelper.fromMapList(inputMap, "DepositTypeList");
  }
}
