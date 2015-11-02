/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementExtendedDataFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvElementExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvElementExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvElementEDObjDataList noOpIn;

/**
 *
 * Constructor to create a   InvElementExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvElementExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementEDObjDataList noOpInIn) {
    super(id, context, "InvElementExtendedDataFind");
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
        mapArray[i] = InvElementEDObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvElementExtendedData", noOpIn);
      }
      addInput("InvElementExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  InvElementExtendedData
 * @param noOpInIn InvElementEDObjDataList to set
 *
 */
  public void setInvElementExtendedData(InvElementEDObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvElementExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementEDObjDataList getInvElementExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvElementEDObjHelper.fromMapList(inputMap, "InvElementExtendedDataList");
  }
}
