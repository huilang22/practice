/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a DepartmentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DepartmentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DepartmentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DepartmentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DepartmentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DepartmentObjectDataList noOpInIn) {
    super(id, context, "DepartmentFind");
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
        mapArray[i] = DepartmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Department", noOpIn);
      }
      addInput("Department", mapList);
    }
  }
/**
 *
 * Sets the  Department
 * @param noOpInIn DepartmentObjectDataList to set
 *
 */
  public void setDepartment(DepartmentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Department passed into the constructor
 * @return Simulated response
 *
 */
  public DepartmentObjectDataList getDepartment() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DepartmentObjectHelper.fromMapList(inputMap, "DepartmentList");
  }
}
