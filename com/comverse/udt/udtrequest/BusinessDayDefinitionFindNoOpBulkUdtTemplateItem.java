/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BusinessDayDefinitionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BusinessDayDefinitionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BusinessDayDefinitionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BusinessDayDefinitionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BusinessDayDefinitionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayDefinitionObjectDataList noOpInIn) {
    super(id, context, "BusinessDayDefinitionFind");
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
        mapArray[i] = BusinessDayDefinitionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BusinessDayDefinition", noOpIn);
      }
      addInput("BusinessDayDefinition", mapList);
    }
  }
/**
 *
 * Sets the  BusinessDayDefinition
 * @param noOpInIn BusinessDayDefinitionObjectDataList to set
 *
 */
  public void setBusinessDayDefinition(BusinessDayDefinitionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BusinessDayDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public BusinessDayDefinitionObjectDataList getBusinessDayDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BusinessDayDefinitionObjectHelper.fromMapList(inputMap, "BusinessDayDefinitionList");
  }
}
