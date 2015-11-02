/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcItemFormatFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemFormatFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemFormatObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcItemFormatFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemFormatFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemFormatObjectDataList noOpInIn) {
    super(id, context, "CtcItemFormatFind");
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
        mapArray[i] = CtcItemFormatObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItemFormat", noOpIn);
      }
      addInput("CtcItemFormat", mapList);
    }
  }
/**
 *
 * Sets the  CtcItemFormat
 * @param noOpInIn CtcItemFormatObjectDataList to set
 *
 */
  public void setCtcItemFormat(CtcItemFormatObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemFormat passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemFormatObjectDataList getCtcItemFormat() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemFormatObjectHelper.fromMapList(inputMap, "CtcItemFormatList");
  }
}
