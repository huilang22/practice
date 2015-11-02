/*
 * Generated code DO NOT EDIT
 * Generated file: InvsCountryCodeFindBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvsCountryCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsCountryCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsCountryCodeObjectFilter InvsCountryCodeFindIn;
/**
 *
 * Constructor to create a  InvsCountryCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsCountryCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsCountryCodeObjectFilter InvsCountryCodeFindInIn) {
    super(id, context, "InvsCountryCodeFind");
    InvsCountryCodeFindIn = InvsCountryCodeFindInIn;
  }

  public void translateToMap() {
    if (InvsCountryCodeFindIn != null) {
      Integer index =  InvsCountryCodeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsCountryCode", InvsCountryCodeObjectHelper.toMap(InvsCountryCodeFindIn, new HashMap(), "InvsCountryCode").get("InvsCountryCode"));
    }
  }


/**
 *
 * Sets the InvsCountryCode
 * @param InvsCountryCodeFindInIn Value of the InvsCountryCodeFindIn
 *
 */

  public void setInvsCountryCode(InvsCountryCodeObjectFilter InvsCountryCodeFindInIn) {
    InvsCountryCodeFindIn = InvsCountryCodeFindInIn;
  }

  public void translateFromMap() {
    InvsCountryCodeFindIn = InvsCountryCodeObjectHelper.fromMapFilter(inputMap, "InvsCountryCode");
  }

/**
 *
 * Gets the InvsCountryCode
 * @return Value of the InvsCountryCode
 *
 */

  public InvsCountryCodeObjectFilter getInvsCountryCode( ) {
    return InvsCountryCodeFindIn;
  }

}
