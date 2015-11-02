/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeEquipTxnAssocFindcommontxnNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsTypeEquipTxnAssocFindcommontxnNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsTypeEquipTxnAssocFindcommontxnNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ITETAEquipmentTransactionIdObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsTypeEquipTxnAssocFindcommontxnNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsTypeEquipTxnAssocFindcommontxnNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ITETAEquipmentTransactionIdObjectDataList noOpInIn) {
    super(id, context, "InvsTypeEquipTxnAssocFindcommontxn");
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
        mapArray[i] = ITETAEquipmentTransactionIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsTypeEquipTxnAssoc", noOpIn);
      }
      addInput("InvsTypeEquipTxnAssoc", mapList);
    }
  }
/**
 *
 * Sets the  InvsTypeEquipTxnAssoc
 * @param noOpInIn ITETAEquipmentTransactionIdObjectDataList to set
 *
 */
  public void setInvsTypeEquipTxnAssoc(ITETAEquipmentTransactionIdObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsTypeEquipTxnAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public ITETAEquipmentTransactionIdObjectDataList getInvsTypeEquipTxnAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ITETAEquipmentTransactionIdObjectHelper.fromMapList(inputMap, "InvsTypeEquipTxnAssocList");
  }
}
