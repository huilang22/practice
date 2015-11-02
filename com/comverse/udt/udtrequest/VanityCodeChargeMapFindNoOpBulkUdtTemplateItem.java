/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VanityCodeChargeMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a VanityCodeChargeMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class VanityCodeChargeMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected VanityCodeChargeObjDataList noOpIn;

/**
 *
 * Constructor to create a   VanityCodeChargeMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public VanityCodeChargeMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, VanityCodeChargeObjDataList noOpInIn) {
    super(id, context, "VanityCodeChargeMapFind");
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
        mapArray[i] = VanityCodeChargeObjHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VanityCodeChargeMap", noOpIn);
      }
      addInput("VanityCodeChargeMap", mapList);
    }
  }
/**
 *
 * Sets the  VanityCodeChargeMap
 * @param noOpInIn VanityCodeChargeObjDataList to set
 *
 */
  public void setVanityCodeChargeMap(VanityCodeChargeObjDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the VanityCodeChargeMap passed into the constructor
 * @return Simulated response
 *
 */
  public VanityCodeChargeObjDataList getVanityCodeChargeMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = VanityCodeChargeObjHelper.fromMapList(inputMap, "VanityCodeChargeMapList");
  }
}
