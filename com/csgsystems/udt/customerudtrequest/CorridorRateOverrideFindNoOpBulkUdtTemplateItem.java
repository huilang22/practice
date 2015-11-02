/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateOverrideFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorRateOverrideFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorRateOverrideFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CROObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CorridorRateOverrideFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorRateOverrideFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CROObjectDataList noOpInIn) {
    super(id, context, "CorridorRateOverrideFind");
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
        mapArray[i] = CROObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CorridorRateOverride", noOpIn);
      }
      addInput("CorridorRateOverride", mapList);
    }
  }
/**
 *
 * Sets the  CorridorRateOverride
 * @param noOpInIn CROObjectDataList to set
 *
 */
  public void setCorridorRateOverride(CROObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CorridorRateOverride passed into the constructor
 * @return Simulated response
 *
 */
  public CROObjectDataList getCorridorRateOverride() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CROObjectHelper.fromMapList(inputMap, "CorridorRateOverrideList");
  }
}
