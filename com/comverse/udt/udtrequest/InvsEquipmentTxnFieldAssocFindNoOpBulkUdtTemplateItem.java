/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsEquipmentTxnFieldAssocFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsEquipmentTxnFieldAssocFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsEquipmentTxnFieldTablesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsEquipmentTxnFieldAssocFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsEquipmentTxnFieldAssocFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsEquipmentTxnFieldTablesObjectDataList noOpInIn) {
    super(id, context, "InvsEquipmentTxnFieldAssocFind");
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
        mapArray[i] = InvsEquipmentTxnFieldTablesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsEquipmentTxnFieldAssoc", noOpIn);
      }
      addInput("InvsEquipmentTxnFieldAssoc", mapList);
    }
  }
/**
 *
 * Sets the  InvsEquipmentTxnFieldAssoc
 * @param noOpInIn InvsEquipmentTxnFieldTablesObjectDataList to set
 *
 */
  public void setInvsEquipmentTxnFieldAssoc(InvsEquipmentTxnFieldTablesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsEquipmentTxnFieldAssoc passed into the constructor
 * @return Simulated response
 *
 */
  public InvsEquipmentTxnFieldTablesObjectDataList getInvsEquipmentTxnFieldAssoc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsEquipmentTxnFieldTablesObjectHelper.fromMapList(inputMap, "InvsEquipmentTxnFieldAssocList");
  }
}
