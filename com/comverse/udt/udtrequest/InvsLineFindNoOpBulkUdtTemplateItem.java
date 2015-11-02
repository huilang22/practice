/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLineFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLineFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLineFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLineObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsLineFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLineFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineObjectDataList noOpInIn) {
    super(id, context, "InvsLineFind");
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
        mapArray[i] = InvsLineObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLine", noOpIn);
      }
      addInput("InvsLine", mapList);
    }
  }
/**
 *
 * Sets the  InvsLine
 * @param noOpInIn InvsLineObjectDataList to set
 *
 */
  public void setInvsLine(InvsLineObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLine passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineObjectDataList getInvsLine() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLineObjectHelper.fromMapList(inputMap, "InvsLineList");
  }
}
