/*
 * Generated code DO NOT EDIT
 * Generated file: SvcCmfPackageFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a SvcCmfPackageFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SvcCmfPackageFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SvcCmfPackageObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SvcCmfPackageFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SvcCmfPackageFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcCmfPackageObjectDataList noOpInIn) {
    super(id, context, "SvcCmfPackageFind");
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
        mapArray[i] = SvcCmfPackageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcCmfPackage", noOpIn);
      }
      addInput("SvcCmfPackage", mapList);
    }
  }
/**
 *
 * Sets the  SvcCmfPackage
 * @param noOpInIn SvcCmfPackageObjectDataList to set
 *
 */
  public void setSvcCmfPackage(SvcCmfPackageObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SvcCmfPackage passed into the constructor
 * @return Simulated response
 *
 */
  public SvcCmfPackageObjectDataList getSvcCmfPackage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SvcCmfPackageObjectHelper.fromMapList(inputMap, "SvcCmfPackageList");
  }
}
