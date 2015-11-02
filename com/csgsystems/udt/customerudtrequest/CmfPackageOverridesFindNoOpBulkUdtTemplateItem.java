/*
 * Generated code DO NOT EDIT
 * Generated file: CmfPackageOverridesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfPackageOverridesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfPackageOverridesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PackageOverridesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CmfPackageOverridesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfPackageOverridesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PackageOverridesObjectDataList noOpInIn) {
    super(id, context, "CmfPackageOverridesFind");
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
        mapArray[i] = PackageOverridesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CmfPackageOverrides", noOpIn);
      }
      addInput("CmfPackageOverrides", mapList);
    }
  }
/**
 *
 * Sets the  CmfPackageOverrides
 * @param noOpInIn PackageOverridesObjectDataList to set
 *
 */
  public void setCmfPackageOverrides(PackageOverridesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CmfPackageOverrides passed into the constructor
 * @return Simulated response
 *
 */
  public PackageOverridesObjectDataList getCmfPackageOverrides() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PackageOverridesObjectHelper.fromMapList(inputMap, "CmfPackageOverridesList");
  }
}
