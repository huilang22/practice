/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a UnitCrRestrictionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitCrRestrictionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitCrRestrictionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UnitCrRestrictionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitCrRestrictionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrRestrictionObjectDataList noOpInIn) {
    super(id, context, "UnitCrRestrictionFind");
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
        mapArray[i] = UnitCrRestrictionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UnitCrRestriction", noOpIn);
      }
      addInput("UnitCrRestriction", mapList);
    }
  }
/**
 *
 * Sets the  UnitCrRestriction
 * @param noOpInIn UnitCrRestrictionObjectDataList to set
 *
 */
  public void setUnitCrRestriction(UnitCrRestrictionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitCrRestriction passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRestrictionObjectDataList getUnitCrRestriction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitCrRestrictionObjectHelper.fromMapList(inputMap, "UnitCrRestrictionList");
  }
}
