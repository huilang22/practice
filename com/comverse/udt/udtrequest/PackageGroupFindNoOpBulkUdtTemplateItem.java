/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PackageGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PGObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PackageGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PGObjectDataList noOpInIn) {
    super(id, context, "PackageGroupFind");
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
        mapArray[i] = PGObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageGroup", noOpIn);
      }
      addInput("PackageGroup", mapList);
    }
  }
/**
 *
 * Sets the  PackageGroup
 * @param noOpInIn PGObjectDataList to set
 *
 */
  public void setPackageGroup(PGObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageGroup passed into the constructor
 * @return Simulated response
 *
 */
  public PGObjectDataList getPackageGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PGObjectHelper.fromMapList(inputMap, "PackageGroupList");
  }
}
