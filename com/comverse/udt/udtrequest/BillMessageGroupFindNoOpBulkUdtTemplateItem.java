/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillMessageGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BillMessageGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillMessageGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillMessageGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillMessageGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillMessageGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillMessageGroupObjectDataList noOpInIn) {
    super(id, context, "BillMessageGroupFind");
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
        mapArray[i] = BillMessageGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillMessageGroup", noOpIn);
      }
      addInput("BillMessageGroup", mapList);
    }
  }
/**
 *
 * Sets the  BillMessageGroup
 * @param noOpInIn BillMessageGroupObjectDataList to set
 *
 */
  public void setBillMessageGroup(BillMessageGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillMessageGroup passed into the constructor
 * @return Simulated response
 *
 */
  public BillMessageGroupObjectDataList getBillMessageGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillMessageGroupObjectHelper.fromMapList(inputMap, "BillMessageGroupList");
  }
}
