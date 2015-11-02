/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateClassDescrFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateClassDescrFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateClassDescrObjectDataList noOpIn;

/**
 *
 * Constructor to create a   RateClassDescrFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateClassDescrFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateClassDescrObjectDataList noOpInIn) {
    super(id, context, "RateClassDescrFind");
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
        mapArray[i] = RateClassDescrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateClassDescr", noOpIn);
      }
      addInput("RateClassDescr", mapList);
    }
  }
/**
 *
 * Sets the  RateClassDescr
 * @param noOpInIn RateClassDescrObjectDataList to set
 *
 */
  public void setRateClassDescr(RateClassDescrObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateClassDescr passed into the constructor
 * @return Simulated response
 *
 */
  public RateClassDescrObjectDataList getRateClassDescr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateClassDescrObjectHelper.fromMapList(inputMap, "RateClassDescrList");
  }
}
