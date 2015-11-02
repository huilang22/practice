/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MultiLinesAdjFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a MultiLinesAdjFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MultiLinesAdjFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MultiLinesAdjObjectDataList noOpIn;

/**
 *
 * Constructor to create a   MultiLinesAdjFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MultiLinesAdjFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MultiLinesAdjObjectDataList noOpInIn) {
    super(id, context, "MultiLinesAdjFind");
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
        mapArray[i] = MultiLinesAdjObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MultiLinesAdj", noOpIn);
      }
      addInput("MultiLinesAdj", mapList);
    }
  }
/**
 *
 * Sets the  MultiLinesAdj
 * @param noOpInIn MultiLinesAdjObjectDataList to set
 *
 */
  public void setMultiLinesAdj(MultiLinesAdjObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MultiLinesAdj passed into the constructor
 * @return Simulated response
 *
 */
  public MultiLinesAdjObjectDataList getMultiLinesAdj() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MultiLinesAdjObjectHelper.fromMapList(inputMap, "MultiLinesAdjList");
  }
}
