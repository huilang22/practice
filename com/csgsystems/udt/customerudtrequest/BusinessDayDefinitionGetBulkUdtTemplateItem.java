/*
 * Generated code DO NOT EDIT
 * Generated file: BusinessDayDefinitionGetBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayDefinitionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayDefinitionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BusinessDayDefinitionObjectKeyData BDDget_In;
/**
 *
 * Constructor to create a  BusinessDayDefinitionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayDefinitionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayDefinitionObjectKeyData BDDget_InIn) {
    super(id, context, "BusinessDayDefinitionGet");
    BDDget_In = BDDget_InIn;
  }

  public void translateToMap() {
    if (BDDget_In != null) {
      BDDget_In.resetFlags(true, true);
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectKeyHelper.toMap(BDDget_In, new HashMap(), "BusinessDayDefinitionObjectKeyData").get("BusinessDayDefinitionObjectKeyData"));
    }
  }


/**
 *
 * Sets the BusinessDayDefinition
 * @param BDDget_InIn Value of the BDDget_In
 *
 */

  public void setBusinessDayDefinition(BusinessDayDefinitionObjectKeyData BDDget_InIn) {
    BDDget_In = BDDget_InIn;
  }

  public void translateFromMap() {
    BDDget_In = BusinessDayDefinitionObjectKeyHelper.fromMap(inputMap, "BusinessDayDefinition");
  }

/**
 *
 * Gets the BusinessDayDefinition
 * @return Value of the BusinessDayDefinition
 *
 */

  public BusinessDayDefinitionObjectKeyData getBusinessDayDefinition( ) {
    return BDDget_In;
  }

}
