/*
 * Generated code DO NOT EDIT
 * Generated file: TaxStatusFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TSObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TaxStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TSObjectDataList noOpInIn) {
    super(id, context, "TaxStatusFind");
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
        mapArray[i] = TSObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxStatus", noOpIn);
      }
      addInput("TaxStatus", mapList);
    }
  }
/**
 *
 * Sets the  TaxStatus
 * @param noOpInIn TSObjectDataList to set
 *
 */
  public void setTaxStatus(TSObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxStatus passed into the constructor
 * @return Simulated response
 *
 */
  public TSObjectDataList getTaxStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TSObjectHelper.fromMapList(inputMap, "TaxStatusList");
  }
}
