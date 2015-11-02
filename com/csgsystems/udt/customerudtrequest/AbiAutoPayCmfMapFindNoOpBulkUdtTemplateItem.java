/*
 * Generated code DO NOT EDIT
 * Generated file: AbiAutoPayCmfMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AbiAutoPayCmfMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AbiAutoPayCmfMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AbiAutoPayCmfMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AbiAutoPayCmfMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AbiAutoPayCmfMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AbiAutoPayCmfMapObjectDataList noOpInIn) {
    super(id, context, "AbiAutoPayCmfMapFind");
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
        mapArray[i] = AbiAutoPayCmfMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AbiAutoPayCmfMap", noOpIn);
      }
      addInput("AbiAutoPayCmfMap", mapList);
    }
  }
/**
 *
 * Sets the  AbiAutoPayCmfMap
 * @param noOpInIn AbiAutoPayCmfMapObjectDataList to set
 *
 */
  public void setAbiAutoPayCmfMap(AbiAutoPayCmfMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AbiAutoPayCmfMap passed into the constructor
 * @return Simulated response
 *
 */
  public AbiAutoPayCmfMapObjectDataList getAbiAutoPayCmfMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AbiAutoPayCmfMapObjectHelper.fromMapList(inputMap, "AbiAutoPayCmfMapList");
  }
}
