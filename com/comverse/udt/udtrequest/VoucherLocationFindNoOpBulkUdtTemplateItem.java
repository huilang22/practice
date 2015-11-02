/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VoucherLocationFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VoucherLocationFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VoucherLocationObjectDataList noOpIn;

/**
 *
 * Constructor to create a   VoucherLocationFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VoucherLocationFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VoucherLocationObjectDataList noOpInIn) {
    super(id, context, "VoucherLocationFind");
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
        mapArray[i] = VoucherLocationObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherLocation", noOpIn);
      }
      addInput("VoucherLocation", mapList);
    }
  }
/**
 *
 * Sets the  VoucherLocation
 * @param noOpInIn VoucherLocationObjectDataList to set
 *
 */
  public void setVoucherLocation(VoucherLocationObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VoucherLocation passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherLocationObjectDataList getVoucherLocation() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VoucherLocationObjectHelper.fromMapList(inputMap, "VoucherLocationList");
  }
}
