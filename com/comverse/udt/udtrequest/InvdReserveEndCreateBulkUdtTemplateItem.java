/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvdReserveEndCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdReserveEndCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdReserveEndObjectData InvdReserveEndCreateIn;
/**
 *
 * Constructor to create a  InvdReserveEndCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdReserveEndCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdReserveEndObjectData InvdReserveEndCreateInIn) {
    super(id, context, "InvdReserveEndCreate");
    InvdReserveEndCreateIn = InvdReserveEndCreateInIn;
  }

  public void translateToMap() {
    if (InvdReserveEndCreateIn != null) {
      InvdReserveEndCreateIn.resetFlags(true, true);
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(InvdReserveEndCreateIn, new HashMap(), "InvdReserveEnd").get("InvdReserveEnd"));
    }
  }


/**
 *
 * Sets the InvdReserveEnd
 * @param InvdReserveEndCreateInIn Value of the InvdReserveEndCreateIn
 *
 */

  public void setInvdReserveEnd(InvdReserveEndObjectData InvdReserveEndCreateInIn) {
    InvdReserveEndCreateIn = InvdReserveEndCreateInIn;
  }

  public void translateFromMap() {
    InvdReserveEndCreateIn = InvdReserveEndObjectHelper.fromMap(inputMap, "InvdReserveEnd");
  }

/**
 *
 * Gets the InvdReserveEnd
 * @return Value of the InvdReserveEnd
 *
 */

  public InvdReserveEndObjectData getInvdReserveEnd( ) {
    return InvdReserveEndCreateIn;
  }

}
