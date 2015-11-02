/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceRefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsInterfaceRefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsInterfaceRefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsInterfaceRefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsInterfaceRefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsInterfaceRefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsInterfaceRefObjectDataList noOpInIn) {
    super(id, context, "InvsInterfaceRefFind");
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
        mapArray[i] = InvsInterfaceRefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsInterfaceRef", noOpIn);
      }
      addInput("InvsInterfaceRef", mapList);
    }
  }
/**
 *
 * Sets the  InvsInterfaceRef
 * @param noOpInIn InvsInterfaceRefObjectDataList to set
 *
 */
  public void setInvsInterfaceRef(InvsInterfaceRefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsInterfaceRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsInterfaceRefObjectDataList getInvsInterfaceRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsInterfaceRefObjectHelper.fromMapList(inputMap, "InvsInterfaceRefList");
  }
}
