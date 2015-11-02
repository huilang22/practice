/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentDefFindEligibleNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a PackageComponentDefFindEligibleNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageComponentDefFindEligibleNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PCDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PackageComponentDefFindEligibleNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageComponentDefFindEligibleNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PCDObjectDataList noOpInIn) {
    super(id, context, "PackageComponentDefFindEligible");
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
        mapArray[i] = PCDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageComponentDef", noOpIn);
      }
      addInput("PackageComponentDef", mapList);
    }
  }
/**
 *
 * Sets the  PackageComponentDef
 * @param noOpInIn PCDObjectDataList to set
 *
 */
  public void setPackageComponentDef(PCDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageComponentDef passed into the constructor
 * @return Simulated response
 *
 */
  public PCDObjectDataList getPackageComponentDef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PCDObjectHelper.fromMapList(inputMap, "PackageComponentDefList");
  }
}
