/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcItemExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcItemExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcItemExtendedDataObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcItemExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcItemExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcItemExtendedDataObjectDataList noOpInIn) {
    super(id, context, "CtcItemExtendedDataFind");
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
        mapArray[i] = CtcItemExtendedDataObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItemExtendedData", noOpIn);
      }
      addInput("CtcItemExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  CtcItemExtendedData
 * @param noOpInIn CtcItemExtendedDataObjectDataList to set
 *
 */
  public void setCtcItemExtendedData(CtcItemExtendedDataObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcItemExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemExtendedDataObjectDataList getCtcItemExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcItemExtendedDataObjectHelper.fromMapList(inputMap, "CtcItemExtendedDataList");
  }
}
