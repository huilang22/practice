/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementPlusAutoContNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvElementPlusAutoContNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvElementPlusAutoContNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvElementPlusObjDataList noOpIn;

/**
 *
 * Constructor to create a   InvElementPlusAutoContNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvElementPlusAutoContNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementPlusObjDataList noOpInIn) {
    super(id, context, "InvElementPlusAutoCont");
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
        mapArray[i] = InvElementPlusObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvElementPlus", noOpIn);
      }
      addInput("InvElementPlus", mapList);
    }
  }
/**
 *
 * Sets the  InvElementPlus
 * @param noOpInIn InvElementPlusObjDataList to set
 *
 */
  public void setInvElementPlus(InvElementPlusObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvElementPlus passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementPlusObjDataList getInvElementPlus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvElementPlusObjHelper.fromMapList(inputMap, "InvElementPlusList");
  }
}
