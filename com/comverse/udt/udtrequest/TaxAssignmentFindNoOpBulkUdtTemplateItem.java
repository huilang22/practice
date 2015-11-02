/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxAssignmentFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxAssignmentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxAssignmentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TaxAssignmentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TaxAssignmentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxAssignmentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxAssignmentObjectDataList noOpInIn) {
    super(id, context, "TaxAssignmentFind");
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
        mapArray[i] = TaxAssignmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxAssignment", noOpIn);
      }
      addInput("TaxAssignment", mapList);
    }
  }
/**
 *
 * Sets the  TaxAssignment
 * @param noOpInIn TaxAssignmentObjectDataList to set
 *
 */
  public void setTaxAssignment(TaxAssignmentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxAssignment passed into the constructor
 * @return Simulated response
 *
 */
  public TaxAssignmentObjectDataList getTaxAssignment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TaxAssignmentObjectHelper.fromMapList(inputMap, "TaxAssignmentList");
  }
}
