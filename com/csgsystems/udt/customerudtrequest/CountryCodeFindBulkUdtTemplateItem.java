/*
 * Generated code DO NOT EDIT
 * Generated file: CountryCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a CountryCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CountryCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CountryCodeObjectFilter CCFindIn;
/**
 *
 * Constructor to create a  CountryCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CountryCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CountryCodeObjectFilter CCFindInIn) {
    super(id, context, "CountryCodeFind");
    CCFindIn = CCFindInIn;
  }

  public void translateToMap() {
    if (CCFindIn != null) {
      Integer index =  CCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CountryCode", CountryCodeObjectHelper.toMap(CCFindIn, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }


/**
 *
 * Sets the CountryCode
 * @param CCFindInIn Value of the CCFindIn
 *
 */

  public void setCountryCode(CountryCodeObjectFilter CCFindInIn) {
    CCFindIn = CCFindInIn;
  }

  public void translateFromMap() {
    CCFindIn = CountryCodeObjectHelper.fromMapFilter(inputMap, "CountryCode");
  }

/**
 *
 * Gets the CountryCode
 * @return Value of the CountryCode
 *
 */

  public CountryCodeObjectFilter getCountryCode( ) {
    return CCFindIn;
  }

}
