/*
 * Generated code DO NOT EDIT
 * Generated file: TaxAbandonedFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxAbandonedFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxAbandonedFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TaxAbandonedObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TaxAbandonedFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxAbandonedFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxAbandonedObjectDataList noOpInIn) {
    super(id, context, "TaxAbandonedFind");
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
        mapArray[i] = TaxAbandonedObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxAbandoned", noOpIn);
      }
      addInput("TaxAbandoned", mapList);
    }
  }
/**
 *
 * Sets the  TaxAbandoned
 * @param noOpInIn TaxAbandonedObjectDataList to set
 *
 */
  public void setTaxAbandoned(TaxAbandonedObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxAbandoned passed into the constructor
 * @return Simulated response
 *
 */
  public TaxAbandonedObjectDataList getTaxAbandoned() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TaxAbandonedObjectHelper.fromMapList(inputMap, "TaxAbandonedList");
  }
}
