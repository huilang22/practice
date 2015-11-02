/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvdReserveEndDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdReserveEndDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdReserveEndObjectFilter InvdReserveEndDeleteIn;
/**
 *
 * Constructor to create a  InvdReserveEndDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdReserveEndDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdReserveEndObjectFilter InvdReserveEndDeleteInIn) {
    super(id, context, "InvdReserveEndDelete");
    InvdReserveEndDeleteIn = InvdReserveEndDeleteInIn;
  }

  public void translateToMap() {
    if (InvdReserveEndDeleteIn != null) {
      Integer index =  InvdReserveEndDeleteIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(InvdReserveEndDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvdReserveEnd
 * @param InvdReserveEndDeleteInIn Value of the InvdReserveEndDeleteIn
 *
 */

  public void setInvdReserveEnd(InvdReserveEndObjectFilter InvdReserveEndDeleteInIn) {
    InvdReserveEndDeleteIn = InvdReserveEndDeleteInIn;
  }

  public void translateFromMap() {
    InvdReserveEndDeleteIn = InvdReserveEndObjectHelper.fromMapFilter(inputMap, "InvdReserveEnd");
  }

/**
 *
 * Gets the InvdReserveEnd
 * @return Value of the InvdReserveEnd
 *
 */

  public InvdReserveEndObjectFilter getInvdReserveEnd( ) {
    return InvdReserveEndDeleteIn;
  }

}
