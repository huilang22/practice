/*
 * Generated code DO NOT EDIT
 * Generated file: TaxExemptionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxExemptionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxExemptionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TaxExemptionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TaxExemptionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxExemptionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TaxExemptionObjectDataList noOpInIn) {
    super(id, context, "TaxExemptionFind");
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
        mapArray[i] = TaxExemptionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxExemption", noOpIn);
      }
      addInput("TaxExemption", mapList);
    }
  }
/**
 *
 * Sets the  TaxExemption
 * @param noOpInIn TaxExemptionObjectDataList to set
 *
 */
  public void setTaxExemption(TaxExemptionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxExemption passed into the constructor
 * @return Simulated response
 *
 */
  public TaxExemptionObjectDataList getTaxExemption() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TaxExemptionObjectHelper.fromMapList(inputMap, "TaxExemptionList");
  }
}
