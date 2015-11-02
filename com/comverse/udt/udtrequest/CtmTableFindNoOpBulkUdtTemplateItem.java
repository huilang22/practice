/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtmTableFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmTableFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmTableObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtmTableFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmTableFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmTableObjectDataList noOpInIn) {
    super(id, context, "CtmTableFind");
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
        mapArray[i] = CtmTableObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtmTable", noOpIn);
      }
      addInput("CtmTable", mapList);
    }
  }
/**
 *
 * Sets the  CtmTable
 * @param noOpInIn CtmTableObjectDataList to set
 *
 */
  public void setCtmTable(CtmTableObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmTable passed into the constructor
 * @return Simulated response
 *
 */
  public CtmTableObjectDataList getCtmTable() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmTableObjectHelper.fromMapList(inputMap, "CtmTableList");
  }
}
