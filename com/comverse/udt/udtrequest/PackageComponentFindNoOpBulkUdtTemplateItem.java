/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PackageComponentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PackageComponentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PackageComponentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PackageComponentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PCObjectDataList noOpInIn) {
    super(id, context, "PackageComponentFind");
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
        mapArray[i] = PCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageComponent", noOpIn);
      }
      addInput("PackageComponent", mapList);
    }
  }
/**
 *
 * Sets the  PackageComponent
 * @param noOpInIn PCObjectDataList to set
 *
 */
  public void setPackageComponent(PCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PackageComponent passed into the constructor
 * @return Simulated response
 *
 */
  public PCObjectDataList getPackageComponent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PCObjectHelper.fromMapList(inputMap, "PackageComponentList");
  }
}
