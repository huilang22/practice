/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobsubstateFindBulkUdtTemplateItem.java
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
 * Class used to create a InvsJobsubstateFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsJobsubstateFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsJobsubstateObjectFilter InvsJobsubstateFindIn;
/**
 *
 * Constructor to create a  InvsJobsubstateFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsJobsubstateFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobsubstateObjectFilter InvsJobsubstateFindInIn) {
    super(id, context, "InvsJobsubstateFind");
    InvsJobsubstateFindIn = InvsJobsubstateFindInIn;
  }

  public void translateToMap() {
    if (InvsJobsubstateFindIn != null) {
      Integer index =  InvsJobsubstateFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsJobsubstate", InvsJobsubstateObjectHelper.toMap(InvsJobsubstateFindIn, new HashMap(), "InvsJobsubstate").get("InvsJobsubstate"));
    }
  }


/**
 *
 * Sets the InvsJobsubstate
 * @param InvsJobsubstateFindInIn Value of the InvsJobsubstateFindIn
 *
 */

  public void setInvsJobsubstate(InvsJobsubstateObjectFilter InvsJobsubstateFindInIn) {
    InvsJobsubstateFindIn = InvsJobsubstateFindInIn;
  }

  public void translateFromMap() {
    InvsJobsubstateFindIn = InvsJobsubstateObjectHelper.fromMapFilter(inputMap, "InvsJobsubstate");
  }

/**
 *
 * Gets the InvsJobsubstate
 * @return Value of the InvsJobsubstate
 *
 */

  public InvsJobsubstateObjectFilter getInvsJobsubstate( ) {
    return InvsJobsubstateFindIn;
  }

}
