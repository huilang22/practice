/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTypeEligibleFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a AdjustmentTypeEligibleFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentTypeEligibleFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AdjustmentTypeEligibleFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentTypeEligibleFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTypeObjectDataList noOpInIn) {
    super(id, context, "AdjustmentTypeEligibleFind");
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
        mapArray[i] = AdjustmentTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdjustmentType", noOpIn);
      }
      addInput("AdjustmentType", mapList);
    }
  }
/**
 *
 * Sets the  AdjustmentType
 * @param noOpInIn AdjustmentTypeObjectDataList to set
 *
 */
  public void setAdjustmentType(AdjustmentTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjustmentType passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTypeObjectDataList getAdjustmentType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdjustmentTypeObjectHelper.fromMapList(inputMap, "AdjustmentTypeList");
  }
}
