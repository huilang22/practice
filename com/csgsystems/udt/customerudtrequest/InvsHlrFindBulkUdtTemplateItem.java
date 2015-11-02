/*
 * Generated code DO NOT EDIT
 * Generated file: InvsHlrFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsHlrFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsHlrFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsHlrObjectFilter InvsHlrFindIn;
/**
 *
 * Constructor to create a  InvsHlrFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsHlrFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsHlrObjectFilter InvsHlrFindInIn) {
    super(id, context, "InvsHlrFind");
    InvsHlrFindIn = InvsHlrFindInIn;
  }

  public void translateToMap() {
    if (InvsHlrFindIn != null) {
      Integer index =  InvsHlrFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(InvsHlrFindIn, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }


/**
 *
 * Sets the InvsHlr
 * @param InvsHlrFindInIn Value of the InvsHlrFindIn
 *
 */

  public void setInvsHlr(InvsHlrObjectFilter InvsHlrFindInIn) {
    InvsHlrFindIn = InvsHlrFindInIn;
  }

  public void translateFromMap() {
    InvsHlrFindIn = InvsHlrObjectHelper.fromMapFilter(inputMap, "InvsHlr");
  }

/**
 *
 * Gets the InvsHlr
 * @return Value of the InvsHlr
 *
 */

  public InvsHlrObjectFilter getInvsHlr( ) {
    return InvsHlrFindIn;
  }

}
