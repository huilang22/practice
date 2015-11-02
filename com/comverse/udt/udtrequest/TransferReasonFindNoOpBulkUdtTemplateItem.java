/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a TransferReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class TransferReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected TransferReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   TransferReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public TransferReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, TransferReasonObjectDataList noOpInIn) {
    super(id, context, "TransferReasonFind");
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
        mapArray[i] = TransferReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TransferReason", noOpIn);
      }
      addInput("TransferReason", mapList);
    }
  }
/**
 *
 * Sets the  TransferReason
 * @param noOpInIn TransferReasonObjectDataList to set
 *
 */
  public void setTransferReason(TransferReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the TransferReason passed into the constructor
 * @return Simulated response
 *
 */
  public TransferReasonObjectDataList getTransferReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = TransferReasonObjectHelper.fromMapList(inputMap, "TransferReasonList");
  }
}
