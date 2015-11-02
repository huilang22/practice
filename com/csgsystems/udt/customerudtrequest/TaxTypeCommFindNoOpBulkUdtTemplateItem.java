/*
 * Generated code DO NOT EDIT
 * Generated file: TaxTypeCommFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxTypeCommFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxTypeCommFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TTCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TaxTypeCommFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxTypeCommFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TTCObjectDataList noOpInIn) {
    super(id, context, "TaxTypeCommFind");
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
        mapArray[i] = TTCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxTypeComm", noOpIn);
      }
      addInput("TaxTypeComm", mapList);
    }
  }
/**
 *
 * Sets the  TaxTypeComm
 * @param noOpInIn TTCObjectDataList to set
 *
 */
  public void setTaxTypeComm(TTCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxTypeComm passed into the constructor
 * @return Simulated response
 *
 */
  public TTCObjectDataList getTaxTypeComm() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TTCObjectHelper.fromMapList(inputMap, "TaxTypeCommList");
  }
}
