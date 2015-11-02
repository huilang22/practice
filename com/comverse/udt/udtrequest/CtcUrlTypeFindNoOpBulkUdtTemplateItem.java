/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcUrlTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcUrlTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcUrlTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcUrlTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcUrlTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcUrlTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcUrlTypeObjectDataList noOpInIn) {
    super(id, context, "CtcUrlTypeFind");
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
        mapArray[i] = CtcUrlTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcUrlType", noOpIn);
      }
      addInput("CtcUrlType", mapList);
    }
  }
/**
 *
 * Sets the  CtcUrlType
 * @param noOpInIn CtcUrlTypeObjectDataList to set
 *
 */
  public void setCtcUrlType(CtcUrlTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcUrlType passed into the constructor
 * @return Simulated response
 *
 */
  public CtcUrlTypeObjectDataList getCtcUrlType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcUrlTypeObjectHelper.fromMapList(inputMap, "CtcUrlTypeList");
  }
}
