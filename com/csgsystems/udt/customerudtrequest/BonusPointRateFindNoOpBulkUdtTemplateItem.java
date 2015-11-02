/*
 * Generated code DO NOT EDIT
 * Generated file: BonusPointRateFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BonusPointRateFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BonusPointRateFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BonusPointRateObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BonusPointRateFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BonusPointRateFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BonusPointRateObjectDataList noOpInIn) {
    super(id, context, "BonusPointRateFind");
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
        mapArray[i] = BonusPointRateObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BonusPointRate", noOpIn);
      }
      addInput("BonusPointRate", mapList);
    }
  }
/**
 *
 * Sets the  BonusPointRate
 * @param noOpInIn BonusPointRateObjectDataList to set
 *
 */
  public void setBonusPointRate(BonusPointRateObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BonusPointRate passed into the constructor
 * @return Simulated response
 *
 */
  public BonusPointRateObjectDataList getBonusPointRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BonusPointRateObjectHelper.fromMapList(inputMap, "BonusPointRateList");
  }
}
