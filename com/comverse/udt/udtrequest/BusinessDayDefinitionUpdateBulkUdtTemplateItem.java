/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayDefinitionUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayDefinitionUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BusinessDayDefinitionObjectData BDDupdate_In;
/**
 *
 * Constructor to create a  BusinessDayDefinitionUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayDefinitionUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayDefinitionObjectData BDDupdate_InIn) {
    super(id, context, "BusinessDayDefinitionUpdate");
    BDDupdate_In = BDDupdate_InIn;
  }

  public void translateToMap() {
    if (BDDupdate_In != null) {
      BDDupdate_In.resetFlags(true, true);
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(BDDupdate_In, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }


/**
 *
 * Sets the BusinessDayDefinition
 * @param BDDupdate_InIn Value of the BDDupdate_In
 *
 */

  public void setBusinessDayDefinition(BusinessDayDefinitionObjectData BDDupdate_InIn) {
    BDDupdate_In = BDDupdate_InIn;
  }

  public void translateFromMap() {
    BDDupdate_In = BusinessDayDefinitionObjectHelper.fromMap(inputMap, "BusinessDayDefinition");
  }

/**
 *
 * Gets the BusinessDayDefinition
 * @return Value of the BusinessDayDefinition
 *
 */

  public BusinessDayDefinitionObjectData getBusinessDayDefinition( ) {
    return BDDupdate_In;
  }

}
