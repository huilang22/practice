/*
 * Generated code DO NOT EDIT
 * Generated file: BillFmtOptFormatsFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillFmtOptFormatsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillFmtOptFormatsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillFmtOptFormatsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillFmtOptFormatsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillFmtOptFormatsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillFmtOptFormatsObjectDataList noOpInIn) {
    super(id, context, "BillFmtOptFormatsFind");
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
        mapArray[i] = BillFmtOptFormatsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillFmtOptFormats", noOpIn);
      }
      addInput("BillFmtOptFormats", mapList);
    }
  }
/**
 *
 * Sets the  BillFmtOptFormats
 * @param noOpInIn BillFmtOptFormatsObjectDataList to set
 *
 */
  public void setBillFmtOptFormats(BillFmtOptFormatsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillFmtOptFormats passed into the constructor
 * @return Simulated response
 *
 */
  public BillFmtOptFormatsObjectDataList getBillFmtOptFormats() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillFmtOptFormatsObjectHelper.fromMapList(inputMap, "BillFmtOptFormatsList");
  }
}
