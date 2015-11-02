/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a PackageComponentMemberFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageComponentMemberFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PCMObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PackageComponentMemberFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageComponentMemberFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PCMObjectDataList noOpInIn) {
    super(id, context, "PackageComponentMemberFind");
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
        mapArray[i] = PCMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageComponentMember", noOpIn);
      }
      addInput("PackageComponentMember", mapList);
    }
  }
/**
 *
 * Sets the  PackageComponentMember
 * @param noOpInIn PCMObjectDataList to set
 *
 */
  public void setPackageComponentMember(PCMObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageComponentMember passed into the constructor
 * @return Simulated response
 *
 */
  public PCMObjectDataList getPackageComponentMember() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PCMObjectHelper.fromMapList(inputMap, "PackageComponentMemberList");
  }
}
