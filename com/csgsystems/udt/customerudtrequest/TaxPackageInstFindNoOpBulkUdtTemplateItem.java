/*
 * Generated code DO NOT EDIT
 * Generated file: TaxPackageInstFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TaxPackageInstFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TaxPackageInstFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TPIObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TaxPackageInstFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TaxPackageInstFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TPIObjectDataList noOpInIn) {
    super(id, context, "TaxPackageInstFind");
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
        mapArray[i] = TPIObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxPackageInst", noOpIn);
      }
      addInput("TaxPackageInst", mapList);
    }
  }
/**
 *
 * Sets the  TaxPackageInst
 * @param noOpInIn TPIObjectDataList to set
 *
 */
  public void setTaxPackageInst(TPIObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TaxPackageInst passed into the constructor
 * @return Simulated response
 *
 */
  public TPIObjectDataList getTaxPackageInst() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TPIObjectHelper.fromMapList(inputMap, "TaxPackageInstList");
  }
}
