/*
 * Generated code DO NOT EDIT
 * Generated file: CmfStatusChgReasonFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a CmfStatusChgReasonFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CmfStatusChgReasonFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CmfStatusChgReasonObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CmfStatusChgReasonFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CmfStatusChgReasonFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CmfStatusChgReasonObjectDataList noOpInIn) {
    super(id, context, "CmfStatusChgReasonFind");
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
        mapArray[i] = CmfStatusChgReasonObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CmfStatusChgReason", noOpIn);
      }
      addInput("CmfStatusChgReason", mapList);
    }
  }
/**
 *
 * Sets the  CmfStatusChgReason
 * @param noOpInIn CmfStatusChgReasonObjectDataList to set
 *
 */
  public void setCmfStatusChgReason(CmfStatusChgReasonObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CmfStatusChgReason passed into the constructor
 * @return Simulated response
 *
 */
  public CmfStatusChgReasonObjectDataList getCmfStatusChgReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CmfStatusChgReasonObjectHelper.fromMapList(inputMap, "CmfStatusChgReasonList");
  }
}
