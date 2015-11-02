/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjustmentTaxFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AdjustmentTaxFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AdjustmentTaxFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AdjustmentTaxObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AdjustmentTaxFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AdjustmentTaxFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AdjustmentTaxObjectDataList noOpInIn) {
    super(id, context, "AdjustmentTaxFind");
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
        mapArray[i] = AdjustmentTaxObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AdjustmentTax", noOpIn);
      }
      addInput("AdjustmentTax", mapList);
    }
  }
/**
 *
 * Sets the  AdjustmentTax
 * @param noOpInIn AdjustmentTaxObjectDataList to set
 *
 */
  public void setAdjustmentTax(AdjustmentTaxObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AdjustmentTax passed into the constructor
 * @return Simulated response
 *
 */
  public AdjustmentTaxObjectDataList getAdjustmentTax() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AdjustmentTaxObjectHelper.fromMapList(inputMap, "AdjustmentTaxList");
  }
}
