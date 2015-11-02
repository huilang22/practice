/*
 * Generated code DO NOT EDIT
 * Generated file: CountryCodeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CountryCodeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CountryCodeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CountryCodeObjectData noOpIn;

/**
 *
 * Constructor to create a   CountryCodeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CountryCodeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CountryCodeObjectData noOpInIn) {
    super(id, context, "CountryCodeUpdate");
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
