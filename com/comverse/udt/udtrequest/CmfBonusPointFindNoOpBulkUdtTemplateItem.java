/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfBonusPointFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfBonusPointFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfBonusPointFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfBonusPointObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CmfBonusPointFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfBonusPointFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfBonusPointObjectDataList noOpInIn) {
    super(id, context, "CmfBonusPointFind");
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
        mapArray[i] = CmfBonusPointObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CmfBonusPoint", noOpIn);
      }
      addInput("CmfBonusPoint", mapList);
    }
  }
/**
 *
 * Sets the  CmfBonusPoint
 * @param noOpInIn CmfBonusPointObjectDataList to set
 *
 */
  public void setCmfBonusPoint(CmfBonusPointObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CmfBonusPoint passed into the constructor
 * @return Simulated response
 *
 */
  public CmfBonusPointObjectDataList getCmfBonusPoint() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CmfBonusPointObjectHelper.fromMapList(inputMap, "CmfBonusPointList");
  }
}
