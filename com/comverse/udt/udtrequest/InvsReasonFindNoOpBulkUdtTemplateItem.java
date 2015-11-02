/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsReasonFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsReasonObjectDataList noOpInIn) {
    super(id, context, "InvsReasonFind");
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
        mapArray[i] = InvsReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsReason", noOpIn);
      }
      addInput("InvsReason", mapList);
    }
  }
/**
 *
 * Sets the  InvsReason
 * @param noOpInIn InvsReasonObjectDataList to set
 *
 */
  public void setInvsReason(InvsReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsReason passed into the constructor
 * @return Simulated response
 *
 */
  public InvsReasonObjectDataList getInvsReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsReasonObjectHelper.fromMapList(inputMap, "InvsReasonList");
  }
}
