/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a DependencyTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DependencyTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DependencyTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DependencyTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DependencyTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyTypeObjectDataList noOpInIn) {
    super(id, context, "DependencyTypeFind");
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
        mapArray[i] = DependencyTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DependencyType", noOpIn);
      }
      addInput("DependencyType", mapList);
    }
  }
/**
 *
 * Sets the  DependencyType
 * @param noOpInIn DependencyTypeObjectDataList to set
 *
 */
  public void setDependencyType(DependencyTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DependencyType passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyTypeObjectDataList getDependencyType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DependencyTypeObjectHelper.fromMapList(inputMap, "DependencyTypeList");
  }
}
