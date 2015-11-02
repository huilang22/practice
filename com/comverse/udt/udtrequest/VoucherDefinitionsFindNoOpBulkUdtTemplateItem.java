/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherDefinitionsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherDefinitionsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherDefinitionsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   VoucherDefinitionsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherDefinitionsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherDefinitionsObjectDataList noOpInIn) {
    super(id, context, "VoucherDefinitionsFind");
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
        mapArray[i] = VoucherDefinitionsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherDefinitions", noOpIn);
      }
      addInput("VoucherDefinitions", mapList);
    }
  }
/**
 *
 * Sets the  VoucherDefinitions
 * @param noOpInIn VoucherDefinitionsObjectDataList to set
 *
 */
  public void setVoucherDefinitions(VoucherDefinitionsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherDefinitions passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherDefinitionsObjectDataList getVoucherDefinitions() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherDefinitionsObjectHelper.fromMapList(inputMap, "VoucherDefinitionsList");
  }
}
