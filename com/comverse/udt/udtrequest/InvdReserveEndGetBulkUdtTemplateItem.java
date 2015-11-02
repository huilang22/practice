/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndGetBulkUdtTemplateItem.java
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
 * Class used to create a InvdReserveEndGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdReserveEndGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdReserveEndObjectKeyData InvdReserveEndGetIn;
/**
 *
 * Constructor to create a  InvdReserveEndGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdReserveEndGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdReserveEndObjectKeyData InvdReserveEndGetInIn) {
    super(id, context, "InvdReserveEndGet");
    InvdReserveEndGetIn = InvdReserveEndGetInIn;
  }

  public void translateToMap() {
    if (InvdReserveEndGetIn != null) {
      InvdReserveEndGetIn.resetFlags(true, true);
      addInput("InvdReserveEnd", InvdReserveEndObjectKeyHelper.toMap(InvdReserveEndGetIn, new HashMap(), "InvdReserveEndObjectKeyData").get("InvdReserveEndObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdReserveEnd
 * @param InvdReserveEndGetInIn Value of the InvdReserveEndGetIn
 *
 */

  public void setInvdReserveEnd(InvdReserveEndObjectKeyData InvdReserveEndGetInIn) {
    InvdReserveEndGetIn = InvdReserveEndGetInIn;
  }

  public void translateFromMap() {
    InvdReserveEndGetIn = InvdReserveEndObjectKeyHelper.fromMap(inputMap, "InvdReserveEnd");
  }

/**
 *
 * Gets the InvdReserveEnd
 * @return Value of the InvdReserveEnd
 *
 */

  public InvdReserveEndObjectKeyData getInvdReserveEnd( ) {
    return InvdReserveEndGetIn;
  }

}
