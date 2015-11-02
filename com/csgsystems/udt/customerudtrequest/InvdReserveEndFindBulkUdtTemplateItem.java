/*
 * Generated code DO NOT EDIT
 * Generated file: InvdReserveEndFindBulkUdtTemplateItem.java
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
 * Class used to create a InvdReserveEndFindBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdReserveEndFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdReserveEndObjectFilter InvdReserveEndFindIn;
/**
 *
 * Constructor to create a  InvdReserveEndFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdReserveEndFindBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdReserveEndObjectFilter InvdReserveEndFindInIn) {
    super(id, context, "InvdReserveEndFind");
    InvdReserveEndFindIn = InvdReserveEndFindInIn;
  }

  public void translateToMap() {
    if (InvdReserveEndFindIn != null) {
      Integer index =  InvdReserveEndFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(InvdReserveEndFindIn, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }


/**
 *
 * Sets the InvdReserveEnd
 * @param InvdReserveEndFindInIn Value of the InvdReserveEndFindIn
 *
 */

  public void setInvdReserveEnd(InvdReserveEndObjectFilter InvdReserveEndFindInIn) {
    InvdReserveEndFindIn = InvdReserveEndFindInIn;
  }

  public void translateFromMap() {
    InvdReserveEndFindIn = InvdReserveEndObjectHelper.fromMapFilter(inputMap, "InvdReserveEnd");
  }

/**
 *
 * Gets the InvdReserveEnd
 * @return Value of the InvdReserveEnd
 *
 */

  public InvdReserveEndObjectFilter getInvdReserveEnd( ) {
    return InvdReserveEndFindIn;
  }

}
