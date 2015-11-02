/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VipCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VipCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VipCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VipCodeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   VipCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VipCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VipCodeObjectDataList noOpInIn) {
    super(id, context, "VipCodeFind");
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
        mapArray[i] = VipCodeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VipCode", noOpIn);
      }
      addInput("VipCode", mapList);
    }
  }
/**
 *
 * Sets the  VipCode
 * @param noOpInIn VipCodeObjectDataList to set
 *
 */
  public void setVipCode(VipCodeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VipCode passed into the constructor
 * @return Simulated response
 *
 */
  public VipCodeObjectDataList getVipCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VipCodeObjectHelper.fromMapList(inputMap, "VipCodeList");
  }
}
