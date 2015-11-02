/*
 * Generated code DO NOT EDIT
 * Generated file: RateClassDescrUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateClassDescrUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateClassDescrUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateClassDescrObjectData RCDUpdIn;
/**
 *
 * Constructor to create a  RateClassDescrUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateClassDescrUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateClassDescrObjectData RCDUpdInIn) {
    super(id, context, "RateClassDescrUpdate");
    RCDUpdIn = RCDUpdInIn;
  }

  public void translateToMap() {
    if (RCDUpdIn != null) {
      RCDUpdIn.resetFlags(true, true);
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(RCDUpdIn, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }


/**
 *
 * Sets the RateClassDescr
 * @param RCDUpdInIn Value of the RCDUpdIn
 *
 */

  public void setRateClassDescr(RateClassDescrObjectData RCDUpdInIn) {
    RCDUpdIn = RCDUpdInIn;
  }

  public void translateFromMap() {
    RCDUpdIn = RateClassDescrObjectHelper.fromMap(inputMap, "RateClassDescr");
  }

/**
 *
 * Gets the RateClassDescr
 * @return Value of the RateClassDescr
 *
 */

  public RateClassDescrObjectData getRateClassDescr( ) {
    return RCDUpdIn;
  }

}
