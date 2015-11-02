/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountRestrictionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountRestrictionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountRestrictionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DRObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DiscountRestrictionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountRestrictionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DRObjectDataList noOpInIn) {
    super(id, context, "DiscountRestrictionFind");
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
        mapArray[i] = DRObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DiscountRestriction", noOpIn);
      }
      addInput("DiscountRestriction", mapList);
    }
  }
/**
 *
 * Sets the  DiscountRestriction
 * @param noOpInIn DRObjectDataList to set
 *
 */
  public void setDiscountRestriction(DRObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountRestriction passed into the constructor
 * @return Simulated response
 *
 */
  public DRObjectDataList getDiscountRestriction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DRObjectHelper.fromMapList(inputMap, "DiscountRestrictionList");
  }
}
