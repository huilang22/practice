/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageJurisdictionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageJurisdictionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageJurisdictionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsageJurisdictionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageJurisdictionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageJurisdictionObjectDataList noOpInIn) {
    super(id, context, "UsageJurisdictionFind");
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
        mapArray[i] = UsageJurisdictionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageJurisdiction", noOpIn);
      }
      addInput("UsageJurisdiction", mapList);
    }
  }
/**
 *
 * Sets the  UsageJurisdiction
 * @param noOpInIn UsageJurisdictionObjectDataList to set
 *
 */
  public void setUsageJurisdiction(UsageJurisdictionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageJurisdiction passed into the constructor
 * @return Simulated response
 *
 */
  public UsageJurisdictionObjectDataList getUsageJurisdiction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageJurisdictionObjectHelper.fromMapList(inputMap, "UsageJurisdictionList");
  }
}
