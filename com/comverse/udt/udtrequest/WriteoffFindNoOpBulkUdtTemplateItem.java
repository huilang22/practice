/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a WriteoffFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class WriteoffFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected WriteoffObjectDataList noOpIn;

/**
 *
 * Constructor to create a   WriteoffFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public WriteoffFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, WriteoffObjectDataList noOpInIn) {
    super(id, context, "WriteoffFind");
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
        mapArray[i] = WriteoffObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Writeoff", noOpIn);
      }
      addInput("Writeoff", mapList);
    }
  }
/**
 *
 * Sets the  Writeoff
 * @param noOpInIn WriteoffObjectDataList to set
 *
 */
  public void setWriteoff(WriteoffObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Writeoff passed into the constructor
 * @return Simulated response
 *
 */
  public WriteoffObjectDataList getWriteoff() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = WriteoffObjectHelper.fromMapList(inputMap, "WriteoffList");
  }
}
