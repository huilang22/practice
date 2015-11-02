/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a CountryCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CountryCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CountryCodeObjectData CCUpdateIn;
/**
 *
 * Constructor to create a  CountryCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CountryCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CountryCodeObjectData CCUpdateInIn) {
    super(id, context, "CountryCodeUpdate");
    CCUpdateIn = CCUpdateInIn;
  }

  public void translateToMap() {
    if (CCUpdateIn != null) {
      CCUpdateIn.resetFlags(true, true);
      addInput("CountryCode", CountryCodeObjectHelper.toMap(CCUpdateIn, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }


/**
 *
 * Sets the CountryCode
 * @param CCUpdateInIn Value of the CCUpdateIn
 *
 */

  public void setCountryCode(CountryCodeObjectData CCUpdateInIn) {
    CCUpdateIn = CCUpdateInIn;
  }

  public void translateFromMap() {
    CCUpdateIn = CountryCodeObjectHelper.fromMap(inputMap, "CountryCode");
  }

/**
 *
 * Gets the CountryCode
 * @return Value of the CountryCode
 *
 */

  public CountryCodeObjectData getCountryCode( ) {
    return CCUpdateIn;
  }

}
