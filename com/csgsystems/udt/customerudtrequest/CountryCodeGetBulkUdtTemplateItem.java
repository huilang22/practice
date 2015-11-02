/*
 * Generated code DO NOT EDIT
 * Generated file: CountryCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a CountryCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CountryCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CountryCodeObjectKeyData CCGetIn;
/**
 *
 * Constructor to create a  CountryCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CountryCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CountryCodeObjectKeyData CCGetInIn) {
    super(id, context, "CountryCodeGet");
    CCGetIn = CCGetInIn;
  }

  public void translateToMap() {
    if (CCGetIn != null) {
      CCGetIn.resetFlags(true, true);
      addInput("CountryCode", CountryCodeObjectKeyHelper.toMap(CCGetIn, new HashMap(), "CountryCodeObjectKeyData").get("CountryCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CountryCode
 * @param CCGetInIn Value of the CCGetIn
 *
 */

  public void setCountryCode(CountryCodeObjectKeyData CCGetInIn) {
    CCGetIn = CCGetInIn;
  }

  public void translateFromMap() {
    CCGetIn = CountryCodeObjectKeyHelper.fromMap(inputMap, "CountryCode");
  }

/**
 *
 * Gets the CountryCode
 * @return Value of the CountryCode
 *
 */

  public CountryCodeObjectKeyData getCountryCode( ) {
    return CCGetIn;
  }

}
