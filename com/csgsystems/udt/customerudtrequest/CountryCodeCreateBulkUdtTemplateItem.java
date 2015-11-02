/*
 * Generated code DO NOT EDIT
 * Generated file: CountryCodeCreateBulkUdtTemplateItem.java
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
 * Class used to create a CountryCodeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class CountryCodeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CountryCodeObjectData CCCreateIn;
/**
 *
 * Constructor to create a  CountryCodeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CountryCodeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, CountryCodeObjectData CCCreateInIn) {
    super(id, context, "CountryCodeCreate");
    CCCreateIn = CCCreateInIn;
  }

  public void translateToMap() {
    if (CCCreateIn != null) {
      CCCreateIn.resetFlags(true, true);
      addInput("CountryCode", CountryCodeObjectHelper.toMap(CCCreateIn, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }


/**
 *
 * Sets the CountryCode
 * @param CCCreateInIn Value of the CCCreateIn
 *
 */

  public void setCountryCode(CountryCodeObjectData CCCreateInIn) {
    CCCreateIn = CCCreateInIn;
  }

  public void translateFromMap() {
    CCCreateIn = CountryCodeObjectHelper.fromMap(inputMap, "CountryCode");
  }

/**
 *
 * Gets the CountryCode
 * @return Value of the CountryCode
 *
 */

  public CountryCodeObjectData getCountryCode( ) {
    return CCCreateIn;
  }

}
