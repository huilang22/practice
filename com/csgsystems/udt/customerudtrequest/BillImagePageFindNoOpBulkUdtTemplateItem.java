/*
 * Generated code DO NOT EDIT
 * Generated file: BillImagePageFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillImagePageFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillImagePageFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillImagePageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillImagePageFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillImagePageFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillImagePageObjectDataList noOpInIn) {
    super(id, context, "BillImagePageFind");
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
        mapArray[i] = BillImagePageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillImagePage", noOpIn);
      }
      addInput("BillImagePage", mapList);
    }
  }
/**
 *
 * Sets the  BillImagePage
 * @param noOpInIn BillImagePageObjectDataList to set
 *
 */
  public void setBillImagePage(BillImagePageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillImagePage passed into the constructor
 * @return Simulated response
 *
 */
  public BillImagePageObjectDataList getBillImagePage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillImagePageObjectHelper.fromMapList(inputMap, "BillImagePageList");
  }
}
