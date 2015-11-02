/*
 * Generated code DO NOT EDIT
 * Generated file: CtcOrderMethodFindBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcOrderMethodFindBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcOrderMethodFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcOrderMethodObjectFilter FindIn;
/**
 *
 * Constructor to create a  CtcOrderMethodFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcOrderMethodFindBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcOrderMethodObjectFilter FindInIn) {
    super(id, context, "CtcOrderMethodFind");
    FindIn = FindInIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOrderMethod", CtcOrderMethodObjectHelper.toMap(FindIn, new HashMap(), "CtcOrderMethod").get("CtcOrderMethod"));
    }
  }


/**
 *
 * Sets the CtcOrderMethod
 * @param FindInIn Value of the FindIn
 *
 */

  public void setCtcOrderMethod(CtcOrderMethodObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

  public void translateFromMap() {
    FindIn = CtcOrderMethodObjectHelper.fromMapFilter(inputMap, "CtcOrderMethod");
  }

/**
 *
 * Gets the CtcOrderMethod
 * @return Value of the CtcOrderMethod
 *
 */

  public CtcOrderMethodObjectFilter getCtcOrderMethod( ) {
    return FindIn;
  }

}
