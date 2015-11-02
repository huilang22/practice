/*
 * Generated code DO NOT EDIT
 * Generated file: BusinessDayFindBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BusinessDayObjectFilter BDfind_In;
/**
 *
 * Constructor to create a  BusinessDayFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayObjectFilter BDfind_InIn) {
    super(id, context, "BusinessDayFind");
    BDfind_In = BDfind_InIn;
  }

  public void translateToMap() {
    if (BDfind_In != null) {
      Integer index =  BDfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(BDfind_In, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }


/**
 *
 * Sets the BusinessDay
 * @param BDfind_InIn Value of the BDfind_In
 *
 */

  public void setBusinessDay(BusinessDayObjectFilter BDfind_InIn) {
    BDfind_In = BDfind_InIn;
  }

  public void translateFromMap() {
    BDfind_In = BusinessDayObjectHelper.fromMapFilter(inputMap, "BusinessDay");
  }

/**
 *
 * Gets the BusinessDay
 * @return Value of the BusinessDay
 *
 */

  public BusinessDayObjectFilter getBusinessDay( ) {
    return BDfind_In;
  }

}
