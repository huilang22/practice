/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a CountryCodeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CountryCodeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CountryCodeObjectKeyData CCDeleteIn;
/**
 *
 * Constructor to create a  CountryCodeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CountryCodeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CountryCodeObjectKeyData CCDeleteInIn) {
    super(id, context, "CountryCodeDelete");
    CCDeleteIn = CCDeleteInIn;
  }

  public void translateToMap() {
    if (CCDeleteIn != null) {
      CCDeleteIn.resetFlags(true, true);
      addInput("CountryCode", CountryCodeObjectKeyHelper.toMap(CCDeleteIn, new HashMap(), "CountryCodeObjectKeyData").get("CountryCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the CountryCode
 * @param CCDeleteInIn Value of the CCDeleteIn
 *
 */

  public void setCountryCode(CountryCodeObjectKeyData CCDeleteInIn) {
    CCDeleteIn = CCDeleteInIn;
  }

  public void translateFromMap() {
    CCDeleteIn = CountryCodeObjectKeyHelper.fromMap(inputMap, "CountryCode");
  }

/**
 *
 * Gets the CountryCode
 * @return Value of the CountryCode
 *
 */

  public CountryCodeObjectKeyData getCountryCode( ) {
    return CCDeleteIn;
  }

}
