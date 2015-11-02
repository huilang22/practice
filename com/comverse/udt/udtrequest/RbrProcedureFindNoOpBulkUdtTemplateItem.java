/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrProcedureFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrProcedureFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrProcObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RbrProcedureFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrProcedureFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrProcObjectDataList noOpInIn) {
    super(id, context, "RbrProcedureFind");
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
        mapArray[i] = RbrProcObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrProcedure", noOpIn);
      }
      addInput("RbrProcedure", mapList);
    }
  }
/**
 *
 * Sets the  RbrProcedure
 * @param noOpInIn RbrProcObjectDataList to set
 *
 */
  public void setRbrProcedure(RbrProcObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrProcedure passed into the constructor
 * @return Simulated response
 *
 */
  public RbrProcObjectDataList getRbrProcedure() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrProcObjectHelper.fromMapList(inputMap, "RbrProcedureList");
  }
}
