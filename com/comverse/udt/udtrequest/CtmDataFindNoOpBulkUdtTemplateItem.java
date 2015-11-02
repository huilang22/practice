/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtmDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmDataRowDataList noOpIn;

/**
 *
 * Constructor to create a   CtmDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmDataRowDataList noOpInIn) {
    super(id, context, "CtmDataFind");
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
        mapArray[i] = CtmDataRowHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtmData", noOpIn);
      }
      addInput("CtmData", mapList);
    }
  }
/**
 *
 * Sets the  CtmData
 * @param noOpInIn CtmDataRowDataList to set
 *
 */
  public void setCtmData(CtmDataRowDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmData passed into the constructor
 * @return Simulated response
 *
 */
  public CtmDataRowDataList getCtmData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmDataRowHelper.fromMapList(inputMap, "CtmDataList");
  }
}
