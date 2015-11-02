/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConnectReasonFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ConnectReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ConnectReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ConnectReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ConnectReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ConnectReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ConnectReasonObjectDataList noOpInIn) {
    super(id, context, "ConnectReasonFind");
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
        mapArray[i] = ConnectReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ConnectReason", noOpIn);
      }
      addInput("ConnectReason", mapList);
    }
  }
/**
 *
 * Sets the  ConnectReason
 * @param noOpInIn ConnectReasonObjectDataList to set
 *
 */
  public void setConnectReason(ConnectReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ConnectReason passed into the constructor
 * @return Simulated response
 *
 */
  public ConnectReasonObjectDataList getConnectReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ConnectReasonObjectHelper.fromMapList(inputMap, "ConnectReasonList");
  }
}
