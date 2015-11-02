/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsVendorFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsVendorFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsVendorObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsVendorFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsVendorFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsVendorObjectDataList noOpInIn) {
    super(id, context, "InvsVendorFind");
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
        mapArray[i] = InvsVendorObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsVendor", noOpIn);
      }
      addInput("InvsVendor", mapList);
    }
  }
/**
 *
 * Sets the  InvsVendor
 * @param noOpInIn InvsVendorObjectDataList to set
 *
 */
  public void setInvsVendor(InvsVendorObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsVendor passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVendorObjectDataList getInvsVendor() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsVendorObjectHelper.fromMapList(inputMap, "InvsVendorList");
  }
}
