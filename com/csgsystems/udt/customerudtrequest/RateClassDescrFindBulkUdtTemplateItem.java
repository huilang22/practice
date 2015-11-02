/*
 * Generated code DO NOT EDIT
 * Generated file: RateClassDescrFindBulkUdtTemplateItem.java
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
 * Class used to create a RateClassDescrFindBulkUdtTemplateItem Bulk Template
 *
 */

public class RateClassDescrFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateClassDescrObjectFilter RCDFndIn;
/**
 *
 * Constructor to create a  RateClassDescrFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateClassDescrFindBulkUdtTemplateItem(String id, BSDMSessionContext context, RateClassDescrObjectFilter RCDFndInIn) {
    super(id, context, "RateClassDescrFind");
    RCDFndIn = RCDFndInIn;
  }

  public void translateToMap() {
    if (RCDFndIn != null) {
      Integer index =  RCDFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(RCDFndIn, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }


/**
 *
 * Sets the RateClassDescr
 * @param RCDFndInIn Value of the RCDFndIn
 *
 */

  public void setRateClassDescr(RateClassDescrObjectFilter RCDFndInIn) {
    RCDFndIn = RCDFndInIn;
  }

  public void translateFromMap() {
    RCDFndIn = RateClassDescrObjectHelper.fromMapFilter(inputMap, "RateClassDescr");
  }

/**
 *
 * Gets the RateClassDescr
 * @return Value of the RateClassDescr
 *
 */

  public RateClassDescrObjectFilter getRateClassDescr( ) {
    return RCDFndIn;
  }

}
