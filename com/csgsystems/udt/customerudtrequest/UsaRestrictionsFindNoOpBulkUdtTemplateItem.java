/*
 * Generated code DO NOT EDIT
 * Generated file: UsaRestrictionsFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a UsaRestrictionsFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsaRestrictionsFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsaRestrictionsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsaRestrictionsFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsaRestrictionsFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsaRestrictionsObjectDataList noOpInIn) {
    super(id, context, "UsaRestrictionsFind");
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
        mapArray[i] = UsaRestrictionsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsaRestrictions", noOpIn);
      }
      addInput("UsaRestrictions", mapList);
    }
  }
/**
 *
 * Sets the  UsaRestrictions
 * @param noOpInIn UsaRestrictionsObjectDataList to set
 *
 */
  public void setUsaRestrictions(UsaRestrictionsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsaRestrictions passed into the constructor
 * @return Simulated response
 *
 */
  public UsaRestrictionsObjectDataList getUsaRestrictions() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsaRestrictionsObjectHelper.fromMapList(inputMap, "UsaRestrictionsList");
  }
}
