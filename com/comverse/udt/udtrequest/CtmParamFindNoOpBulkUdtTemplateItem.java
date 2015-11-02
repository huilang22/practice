/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmParamFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtmParamFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmParamFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmParamObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtmParamFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmParamFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamObjectDataList noOpInIn) {
    super(id, context, "CtmParamFind");
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
        mapArray[i] = CtmParamObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtmParam", noOpIn);
      }
      addInput("CtmParam", mapList);
    }
  }
/**
 *
 * Sets the  CtmParam
 * @param noOpInIn CtmParamObjectDataList to set
 *
 */
  public void setCtmParam(CtmParamObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmParam passed into the constructor
 * @return Simulated response
 *
 */
  public CtmParamObjectDataList getCtmParam() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmParamObjectHelper.fromMapList(inputMap, "CtmParamList");
  }
}
