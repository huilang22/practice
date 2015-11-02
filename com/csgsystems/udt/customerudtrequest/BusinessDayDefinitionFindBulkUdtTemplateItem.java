/*
 * Generated code DO NOT EDIT
 * Generated file: BusinessDayDefinitionFindBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayDefinitionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayDefinitionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BusinessDayDefinitionObjectFilter BDDfind_In;
/**
 *
 * Constructor to create a  BusinessDayDefinitionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayDefinitionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayDefinitionObjectFilter BDDfind_InIn) {
    super(id, context, "BusinessDayDefinitionFind");
    BDDfind_In = BDDfind_InIn;
  }

  public void translateToMap() {
    if (BDDfind_In != null) {
      Integer index =  BDDfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(BDDfind_In, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }


/**
 *
 * Sets the BusinessDayDefinition
 * @param BDDfind_InIn Value of the BDDfind_In
 *
 */

  public void setBusinessDayDefinition(BusinessDayDefinitionObjectFilter BDDfind_InIn) {
    BDDfind_In = BDDfind_InIn;
  }

  public void translateFromMap() {
    BDDfind_In = BusinessDayDefinitionObjectHelper.fromMapFilter(inputMap, "BusinessDayDefinition");
  }

/**
 *
 * Gets the BusinessDayDefinition
 * @return Value of the BusinessDayDefinition
 *
 */

  public BusinessDayDefinitionObjectFilter getBusinessDayDefinition( ) {
    return BDDfind_In;
  }

}
