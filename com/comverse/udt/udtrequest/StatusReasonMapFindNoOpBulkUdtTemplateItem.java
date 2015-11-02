/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatusReasonMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusReasonMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SRMObjectDataList noOpIn;

/**
 *
 * Constructor to create a   StatusReasonMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusReasonMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SRMObjectDataList noOpInIn) {
    super(id, context, "StatusReasonMapFind");
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
        mapArray[i] = SRMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("StatusReasonMap", noOpIn);
      }
      addInput("StatusReasonMap", mapList);
    }
  }
/**
 *
 * Sets the  StatusReasonMap
 * @param noOpInIn SRMObjectDataList to set
 *
 */
  public void setStatusReasonMap(SRMObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatusReasonMap passed into the constructor
 * @return Simulated response
 *
 */
  public SRMObjectDataList getStatusReasonMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SRMObjectHelper.fromMapList(inputMap, "StatusReasonMapList");
  }
}
