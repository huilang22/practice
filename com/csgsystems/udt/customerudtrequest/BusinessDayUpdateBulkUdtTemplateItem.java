/*
 * Generated code DO NOT EDIT
 * Generated file: BusinessDayUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BusinessDayUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BusinessDayUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BusinessDayObjectData BDupdate_In;
/**
 *
 * Constructor to create a  BusinessDayUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BusinessDayUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BusinessDayObjectData BDupdate_InIn) {
    super(id, context, "BusinessDayUpdate");
    BDupdate_In = BDupdate_InIn;
  }

  public void translateToMap() {
    if (BDupdate_In != null) {
      BDupdate_In.resetFlags(true, true);
      addInput("BusinessDay", BusinessDayObjectHelper.toMap(BDupdate_In, new HashMap(), "BusinessDay").get("BusinessDay"));
    }
  }


/**
 *
 * Sets the BusinessDay
 * @param BDupdate_InIn Value of the BDupdate_In
 *
 */

  public void setBusinessDay(BusinessDayObjectData BDupdate_InIn) {
    BDupdate_In = BDupdate_InIn;
  }

  public void translateFromMap() {
    BDupdate_In = BusinessDayObjectHelper.fromMap(inputMap, "BusinessDay");
  }

/**
 *
 * Gets the BusinessDay
 * @return Value of the BusinessDay
 *
 */

  public BusinessDayObjectData getBusinessDay( ) {
    return BDupdate_In;
  }

}
