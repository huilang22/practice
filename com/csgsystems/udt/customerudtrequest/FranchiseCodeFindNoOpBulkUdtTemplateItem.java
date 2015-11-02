/*
 * Generated code DO NOT EDIT
 * Generated file: FranchiseCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a FranchiseCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class FranchiseCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected FranchiseCodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   FranchiseCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public FranchiseCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, FranchiseCodeObjectDataList noOpInIn) {
    super(id, context, "FranchiseCodeFind");
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
        mapArray[i] = FranchiseCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("FranchiseCode", noOpIn);
      }
      addInput("FranchiseCode", mapList);
    }
  }
/**
 *
 * Sets the  FranchiseCode
 * @param noOpInIn FranchiseCodeObjectDataList to set
 *
 */
  public void setFranchiseCode(FranchiseCodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the FranchiseCode passed into the constructor
 * @return Simulated response
 *
 */
  public FranchiseCodeObjectDataList getFranchiseCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = FranchiseCodeObjectHelper.fromMapList(inputMap, "FranchiseCodeList");
  }
}
