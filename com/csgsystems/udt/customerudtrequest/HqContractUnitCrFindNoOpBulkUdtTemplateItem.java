/*
 * Generated code DO NOT EDIT
 * Generated file: HqContractUnitCrFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a HqContractUnitCrFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class HqContractUnitCrFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected HqContractUnitCrObjectDataList noOpIn;

/**
 *
 * Constructor to create a   HqContractUnitCrFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public HqContractUnitCrFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, HqContractUnitCrObjectDataList noOpInIn) {
    super(id, context, "HqContractUnitCrFind");
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
        mapArray[i] = HqContractUnitCrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqContractUnitCr", noOpIn);
      }
      addInput("HqContractUnitCr", mapList);
    }
  }
/**
 *
 * Sets the  HqContractUnitCr
 * @param noOpInIn HqContractUnitCrObjectDataList to set
 *
 */
  public void setHqContractUnitCr(HqContractUnitCrObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the HqContractUnitCr passed into the constructor
 * @return Simulated response
 *
 */
  public HqContractUnitCrObjectDataList getHqContractUnitCr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = HqContractUnitCrObjectHelper.fromMapList(inputMap, "HqContractUnitCrList");
  }
}
