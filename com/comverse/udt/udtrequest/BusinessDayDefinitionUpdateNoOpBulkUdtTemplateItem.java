/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BusinessDayDefinitionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BusinessDayDefinitionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BusinessDayDefinitionObjectData noOpIn;

/**
 *
 * Constructor to create a   BusinessDayDefinitionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BusinessDayDefinitionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayDefinitionObjectData noOpInIn) {
    super(id, context, "BusinessDayDefinitionUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(noOpIn, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }
/**
 *
 * Sets the  BusinessDayDefinition
 * @param noOpInIn BusinessDayDefinitionObjectData to set
 *
 */
  public void setBusinessDayDefinition(BusinessDayDefinitionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BusinessDayDefinition passed into the constructor
 * @return Simulated response
 *
 */
  public BusinessDayDefinitionObjectData getBusinessDayDefinition() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BusinessDayDefinitionObjectHelper.fromMap(inputMap, "BusinessDayDefinition");
  }
}
