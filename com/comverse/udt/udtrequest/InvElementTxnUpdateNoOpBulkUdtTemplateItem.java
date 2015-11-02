/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementTxnUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvElementTxnUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvElementTxnUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvElementObjDataList noOpIn;

/**
 *
 * Constructor to create a   InvElementTxnUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvElementTxnUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjDataList noOpInIn) {
    super(id, context, "InvElementTxnUpdate");
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
        mapArray[i] = InvElementObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvElement", noOpIn);
      }
      addInput("InvElement", mapList);
    }
  }
/**
 *
 * Sets the  InvElement
 * @param noOpInIn InvElementObjDataList to set
 *
 */
  public void setInvElement(InvElementObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvElement passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementObjDataList getInvElement() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvElementObjHelper.fromMapList(inputMap, "InvElementList");
  }
}
