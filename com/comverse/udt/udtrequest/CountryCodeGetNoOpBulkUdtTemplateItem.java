/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CountryCodeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CountryCodeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CountryCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   CountryCodeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CountryCodeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CountryCodeObjectData noOpInIn) {
    super(id, context, "CountryCodeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CountryCode", CountryCodeObjectHelper.toMap(noOpIn, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }
/**
 *
 * Sets the  CountryCode
 * @param noOpInIn CountryCodeObjectData to set
 *
 */
  public void setCountryCode(CountryCodeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CountryCode passed into the constructor
 * @return Simulated response
 *
 */
  public CountryCodeObjectData getCountryCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CountryCodeObjectHelper.fromMap(inputMap, "CountryCode");
  }
}
