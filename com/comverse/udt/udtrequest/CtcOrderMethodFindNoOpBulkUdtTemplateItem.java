/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOrderMethodFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcOrderMethodFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOrderMethodFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOrderMethodObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcOrderMethodFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOrderMethodFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOrderMethodObjectDataList noOpInIn) {
    super(id, context, "CtcOrderMethodFind");
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
        mapArray[i] = CtcOrderMethodObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOrderMethod", noOpIn);
      }
      addInput("CtcOrderMethod", mapList);
    }
  }
/**
 *
 * Sets the  CtcOrderMethod
 * @param noOpInIn CtcOrderMethodObjectDataList to set
 *
 */
  public void setCtcOrderMethod(CtcOrderMethodObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOrderMethod passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOrderMethodObjectDataList getCtcOrderMethod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOrderMethodObjectHelper.fromMapList(inputMap, "CtcOrderMethodList");
  }
}
