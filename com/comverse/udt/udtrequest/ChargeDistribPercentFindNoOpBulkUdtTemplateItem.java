/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDistribPercentFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ChargeDistribPercentFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ChargeDistribPercentFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ChargeDistribPercentObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ChargeDistribPercentFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ChargeDistribPercentFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDistribPercentObjectDataList noOpInIn) {
    super(id, context, "ChargeDistribPercentFind");
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
        mapArray[i] = ChargeDistribPercentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ChargeDistribPercent", noOpIn);
      }
      addInput("ChargeDistribPercent", mapList);
    }
  }
/**
 *
 * Sets the  ChargeDistribPercent
 * @param noOpInIn ChargeDistribPercentObjectDataList to set
 *
 */
  public void setChargeDistribPercent(ChargeDistribPercentObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ChargeDistribPercent passed into the constructor
 * @return Simulated response
 *
 */
  public ChargeDistribPercentObjectDataList getChargeDistribPercent() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ChargeDistribPercentObjectHelper.fromMapList(inputMap, "ChargeDistribPercentList");
  }
}
