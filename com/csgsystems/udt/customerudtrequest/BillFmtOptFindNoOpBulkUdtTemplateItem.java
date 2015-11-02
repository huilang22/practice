/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillFmtOptFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillFmtOptFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BllFmtOptObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillFmtOptFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillFmtOptFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BllFmtOptObjectDataList noOpInIn) {
    super(id, context, "BillFmtOptFind");
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
        mapArray[i] = BllFmtOptObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillFmtOpt", noOpIn);
      }
      addInput("BillFmtOpt", mapList);
    }
  }
/**
 *
 * Sets the  BillFmtOpt
 * @param noOpInIn BllFmtOptObjectDataList to set
 *
 */
  public void setBillFmtOpt(BllFmtOptObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillFmtOpt passed into the constructor
 * @return Simulated response
 *
 */
  public BllFmtOptObjectDataList getBillFmtOpt() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BllFmtOptObjectHelper.fromMapList(inputMap, "BillFmtOptList");
  }
}
