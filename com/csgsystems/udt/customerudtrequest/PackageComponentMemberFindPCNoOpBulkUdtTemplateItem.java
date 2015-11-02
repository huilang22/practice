/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentMemberFindPCNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a PackageComponentMemberFindPCNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageComponentMemberFindPCNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PCPCMObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PackageComponentMemberFindPCNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageComponentMemberFindPCNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PCPCMObjectDataList noOpInIn) {
    super(id, context, "PackageComponentMemberFindPC");
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
        mapArray[i] = PCPCMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageComponentMember", noOpIn);
      }
      addInput("PackageComponentMember", mapList);
    }
  }
/**
 *
 * Sets the  PackageComponentMember
 * @param noOpInIn PCPCMObjectDataList to set
 *
 */
  public void setPackageComponentMember(PCPCMObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageComponentMember passed into the constructor
 * @return Simulated response
 *
 */
  public PCPCMObjectDataList getPackageComponentMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PCPCMObjectHelper.fromMapList(inputMap, "PackageComponentMemberList");
  }
}
