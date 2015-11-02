/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionCreateBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayDefinitionCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayDefinitionCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BusinessDayDefinitionObjectData BDDcreate_In;
/**
 *
 * Constructor to create a  BusinessDayDefinitionCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayDefinitionCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayDefinitionObjectData BDDcreate_InIn) {
    super(id, context, "BusinessDayDefinitionCreate");
    BDDcreate_In = BDDcreate_InIn;
  }

  public void translateToMap() {
    if (BDDcreate_In != null) {
      BDDcreate_In.resetFlags(true, true);
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(BDDcreate_In, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }


/**
 *
 * Sets the BusinessDayDefinition
 * @param BDDcreate_InIn Value of the BDDcreate_In
 *
 */

  public void setBusinessDayDefinition(BusinessDayDefinitionObjectData BDDcreate_InIn) {
    BDDcreate_In = BDDcreate_InIn;
  }

  public void translateFromMap() {
    BDDcreate_In = BusinessDayDefinitionObjectHelper.fromMap(inputMap, "BusinessDayDefinition");
  }

/**
 *
 * Gets the BusinessDayDefinition
 * @return Value of the BusinessDayDefinition
 *
 */

  public BusinessDayDefinitionObjectData getBusinessDayDefinition( ) {
    return BDDcreate_In;
  }

}
