/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtcOfferExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcOfferExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcOfferExtendedDataObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CtcOfferExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcOfferExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOfferExtendedDataObjectDataList noOpInIn) {
    super(id, context, "CtcOfferExtendedDataFind");
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
        mapArray[i] = CtcOfferExtendedDataObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcOfferExtendedData", noOpIn);
      }
      addInput("CtcOfferExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  CtcOfferExtendedData
 * @param noOpInIn CtcOfferExtendedDataObjectDataList to set
 *
 */
  public void setCtcOfferExtendedData(CtcOfferExtendedDataObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcOfferExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcOfferExtendedDataObjectDataList getCtcOfferExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcOfferExtendedDataObjectHelper.fromMapList(inputMap, "CtcOfferExtendedDataList");
  }
}
