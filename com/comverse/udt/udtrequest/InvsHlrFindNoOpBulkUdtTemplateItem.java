/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsHlrFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsHlrFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsHlrFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsHlrObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsHlrFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsHlrFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsHlrObjectDataList noOpInIn) {
    super(id, context, "InvsHlrFind");
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
        mapArray[i] = InvsHlrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsHlr", noOpIn);
      }
      addInput("InvsHlr", mapList);
    }
  }
/**
 *
 * Sets the  InvsHlr
 * @param noOpInIn InvsHlrObjectDataList to set
 *
 */
  public void setInvsHlr(InvsHlrObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsHlr passed into the constructor
 * @return Simulated response
 *
 */
  public InvsHlrObjectDataList getInvsHlr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsHlrObjectHelper.fromMapList(inputMap, "InvsHlrList");
  }
}
