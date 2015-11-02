/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsInterfaceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsInterfaceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsInterfaceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsInterfaceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsInterfaceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceObjectDataList noOpInIn) {
    super(id, context, "InvsInterfaceFind");
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
        mapArray[i] = InvsInterfaceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsInterface", noOpIn);
      }
      addInput("InvsInterface", mapList);
    }
  }
/**
 *
 * Sets the  InvsInterface
 * @param noOpInIn InvsInterfaceObjectDataList to set
 *
 */
  public void setInvsInterface(InvsInterfaceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsInterface passed into the constructor
 * @return Simulated response
 *
 */
  public InvsInterfaceObjectDataList getInvsInterface() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsInterfaceObjectHelper.fromMapList(inputMap, "InvsInterfaceList");
  }
}
