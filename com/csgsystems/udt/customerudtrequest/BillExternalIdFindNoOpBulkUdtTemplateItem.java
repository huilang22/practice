/*
 * Generated code DO NOT EDIT
 * Generated file: BillExternalIdFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.si.data.*;

/**
 *
 * NoOp class used to simulate a BillExternalIdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BillExternalIdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BillExternalIdObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BillExternalIdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BillExternalIdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BillExternalIdObjectDataList noOpInIn) {
    super(id, context, "BillExternalIdFind");
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
        mapArray[i] = BillExternalIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BillExternalId", noOpIn);
      }
      addInput("BillExternalId", mapList);
    }
  }
/**
 *
 * Sets the  BillExternalId
 * @param noOpInIn BillExternalIdObjectDataList to set
 *
 */
  public void setBillExternalId(BillExternalIdObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BillExternalId passed into the constructor
 * @return Simulated response
 *
 */
  public BillExternalIdObjectDataList getBillExternalId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BillExternalIdObjectHelper.fromMapList(inputMap, "BillExternalIdList");
  }
}
