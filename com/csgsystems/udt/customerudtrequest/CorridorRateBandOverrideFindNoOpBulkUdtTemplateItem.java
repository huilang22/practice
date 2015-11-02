/*
 * Generated code DO NOT EDIT
 * Generated file: CorridorRateBandOverrideFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CorridorRateBandOverrideFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CorridorRateBandOverrideFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CRBOObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CorridorRateBandOverrideFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CorridorRateBandOverrideFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CRBOObjectDataList noOpInIn) {
    super(id, context, "CorridorRateBandOverrideFind");
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
        mapArray[i] = CRBOObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CorridorRateBandOverride", noOpIn);
      }
      addInput("CorridorRateBandOverride", mapList);
    }
  }
/**
 *
 * Sets the  CorridorRateBandOverride
 * @param noOpInIn CRBOObjectDataList to set
 *
 */
  public void setCorridorRateBandOverride(CRBOObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CorridorRateBandOverride passed into the constructor
 * @return Simulated response
 *
 */
  public CRBOObjectDataList getCorridorRateBandOverride() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CRBOObjectHelper.fromMapList(inputMap, "CorridorRateBandOverrideList");
  }
}
