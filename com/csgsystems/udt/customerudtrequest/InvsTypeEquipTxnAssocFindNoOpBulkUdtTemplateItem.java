/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeEquipTxnAssocFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsTypeEquipTxnAssocFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsTypeEquipTxnAssocFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsTypeEquipTxnTablesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsTypeEquipTxnAssocFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsTypeEquipTxnAssocFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeEquipTxnTablesObjectDataList noOpInIn) {
    super(id, context, "InvsTypeEquipTxnAssocFind");
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
        mapArray[i] = InvsTypeEquipTxnTablesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsTypeEquipTxnAssoc", noOpIn);
      }
      addInput("InvsTypeEquipTxnAssoc", mapList);
    }
  }
/**
 *
 * Sets the  InvsTypeEquipTxnAssoc
 * @param noOpInIn InvsTypeEquipTxnTablesObjectDataList to set
 *
 */
  public void setInvsTypeEquipTxnAssoc(InvsTypeEquipTxnTablesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsTypeEquipTxnAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeEquipTxnTablesObjectDataList getInvsTypeEquipTxnAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsTypeEquipTxnTablesObjectHelper.fromMapList(inputMap, "InvsTypeEquipTxnAssocList");
  }
}
