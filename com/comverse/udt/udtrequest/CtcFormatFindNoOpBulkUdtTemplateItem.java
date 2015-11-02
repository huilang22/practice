/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcFormatFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcFormatFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcFormatObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcFormatFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcFormatFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcFormatObjectDataList noOpInIn) {
    super(id, context, "CtcFormatFind");
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
        mapArray[i] = CtcFormatObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcFormat", noOpIn);
      }
      addInput("CtcFormat", mapList);
    }
  }
/**
 *
 * Sets the  CtcFormat
 * @param noOpInIn CtcFormatObjectDataList to set
 *
 */
  public void setCtcFormat(CtcFormatObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcFormat passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFormatObjectDataList getCtcFormat() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcFormatObjectHelper.fromMapList(inputMap, "CtcFormatList");
  }
}
