/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfStatusFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CmfStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CmfStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusObjectDataList noOpInIn) {
    super(id, context, "CmfStatusFind");
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
        mapArray[i] = CmfStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CmfStatus", noOpIn);
      }
      addInput("CmfStatus", mapList);
    }
  }
/**
 *
 * Sets the  CmfStatus
 * @param noOpInIn CmfStatusObjectDataList to set
 *
 */
  public void setCmfStatus(CmfStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CmfStatus passed into the constructor
 * @return Simulated response
 *
 */
  public CmfStatusObjectDataList getCmfStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CmfStatusObjectHelper.fromMapList(inputMap, "CmfStatusList");
  }
}
