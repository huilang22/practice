/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExtendedDataEnumerationFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataEnumerationFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataEnumerationFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataEnumerationFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EDObjectDataList noOpInIn) {
    super(id, context, "ExtendedDataEnumerationFind");
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
        mapArray[i] = EDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExtendedDataEnumeration", noOpIn);
      }
      addInput("ExtendedDataEnumeration", mapList);
    }
  }
/**
 *
 * Sets the  ExtendedDataEnumeration
 * @param noOpInIn EDObjectDataList to set
 *
 */
  public void setExtendedDataEnumeration(EDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataEnumeration passed into the constructor
 * @return Simulated response
 *
 */
  public EDObjectDataList getExtendedDataEnumeration() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EDObjectHelper.fromMapList(inputMap, "ExtendedDataEnumerationList");
  }
}
