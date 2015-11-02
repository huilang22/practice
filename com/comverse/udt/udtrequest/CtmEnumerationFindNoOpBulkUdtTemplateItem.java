/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CtmEnumerationFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmEnumerationFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmEnumerationObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtmEnumerationFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmEnumerationFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmEnumerationObjectDataList noOpInIn) {
    super(id, context, "CtmEnumerationFind");
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
        mapArray[i] = CtmEnumerationObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtmEnumeration", noOpIn);
      }
      addInput("CtmEnumeration", mapList);
    }
  }
/**
 *
 * Sets the  CtmEnumeration
 * @param noOpInIn CtmEnumerationObjectDataList to set
 *
 */
  public void setCtmEnumeration(CtmEnumerationObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmEnumeration passed into the constructor
 * @return Simulated response
 *
 */
  public CtmEnumerationObjectDataList getCtmEnumeration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmEnumerationObjectHelper.fromMapList(inputMap, "CtmEnumerationList");
  }
}
