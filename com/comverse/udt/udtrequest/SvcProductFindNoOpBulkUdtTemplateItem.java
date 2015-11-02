/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcProductFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a SvcProductFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SvcProductFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SvcProductObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SvcProductFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SvcProductFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcProductObjectDataList noOpInIn) {
    super(id, context, "SvcProductFind");
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
        mapArray[i] = SvcProductObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcProduct", noOpIn);
      }
      addInput("SvcProduct", mapList);
    }
  }
/**
 *
 * Sets the  SvcProduct
 * @param noOpInIn SvcProductObjectDataList to set
 *
 */
  public void setSvcProduct(SvcProductObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SvcProduct passed into the constructor
 * @return Simulated response
 *
 */
  public SvcProductObjectDataList getSvcProduct() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SvcProductObjectHelper.fromMapList(inputMap, "SvcProductList");
  }
}
