/*
 * Generated code DO NOT EDIT
 * Generated file: BamErrorCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BamErrorCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BamErrorCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BECObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BamErrorCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BamErrorCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BECObjectDataList noOpInIn) {
    super(id, context, "BamErrorCodeFind");
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
        mapArray[i] = BECObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BamErrorCode", noOpIn);
      }
      addInput("BamErrorCode", mapList);
    }
  }
/**
 *
 * Sets the  BamErrorCode
 * @param noOpInIn BECObjectDataList to set
 *
 */
  public void setBamErrorCode(BECObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BamErrorCode passed into the constructor
 * @return Simulated response
 *
 */
  public BECObjectDataList getBamErrorCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BECObjectHelper.fromMapList(inputMap, "BamErrorCodeList");
  }
}
