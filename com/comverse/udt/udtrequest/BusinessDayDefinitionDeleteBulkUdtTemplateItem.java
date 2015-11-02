/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayDefinitionDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayDefinitionDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BusinessDayDefinitionObjectData BDDdelete_In;
/**
 *
 * Constructor to create a  BusinessDayDefinitionDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayDefinitionDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayDefinitionObjectData BDDdelete_InIn) {
    super(id, context, "BusinessDayDefinitionDelete");
    BDDdelete_In = BDDdelete_InIn;
  }

  public void translateToMap() {
    if (BDDdelete_In != null) {
      BDDdelete_In.resetFlags(true, true);
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(BDDdelete_In, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }


/**
 *
 * Sets the BusinessDayDefinition
 * @param BDDdelete_InIn Value of the BDDdelete_In
 *
 */

  public void setBusinessDayDefinition(BusinessDayDefinitionObjectData BDDdelete_InIn) {
    BDDdelete_In = BDDdelete_InIn;
  }

  public void translateFromMap() {
    BDDdelete_In = BusinessDayDefinitionObjectHelper.fromMap(inputMap, "BusinessDayDefinition");
  }

/**
 *
 * Gets the BusinessDayDefinition
 * @return Value of the BusinessDayDefinition
 *
 */

  public BusinessDayDefinitionObjectData getBusinessDayDefinition( ) {
    return BDDdelete_In;
  }

}
