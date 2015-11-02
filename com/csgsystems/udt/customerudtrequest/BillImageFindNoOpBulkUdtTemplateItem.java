/*
 * Generated code DO NOT EDIT
 * Generated file: BillImageFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillImageFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillImageFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillImageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillImageFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillImageFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillImageObjectDataList noOpInIn) {
    super(id, context, "BillImageFind");
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
        mapArray[i] = BillImageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillImage", noOpIn);
      }
      addInput("BillImage", mapList);
    }
  }
/**
 *
 * Sets the  BillImage
 * @param noOpInIn BillImageObjectDataList to set
 *
 */
  public void setBillImage(BillImageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillImage passed into the constructor
 * @return Simulated response
 *
 */
  public BillImageObjectDataList getBillImage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillImageObjectHelper.fromMapList(inputMap, "BillImageList");
  }
}
