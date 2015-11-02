/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementViewUpdateCheckBulkUdtTemplateItem.java
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
 * Class used to create a InvElementViewUpdateCheckBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementViewUpdateCheckBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjData InvViewUpdateCheckIn;
/**
 *
 * Constructor to create a  InvElementViewUpdateCheckBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementViewUpdateCheckBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjData InvViewUpdateCheckInIn) {
    super(id, context, "InvElementViewUpdateCheck");
    InvViewUpdateCheckIn = InvViewUpdateCheckInIn;
  }

  public void translateToMap() {
    if (InvViewUpdateCheckIn != null) {
      InvViewUpdateCheckIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjHelper.toMap(InvViewUpdateCheckIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvViewUpdateCheckInIn Value of the InvViewUpdateCheckIn
 *
 */

  public void setInvElement(InvElementObjData InvViewUpdateCheckInIn) {
    InvViewUpdateCheckIn = InvViewUpdateCheckInIn;
  }

  public void translateFromMap() {
    InvViewUpdateCheckIn = InvElementObjHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjData getInvElement( ) {
    return InvViewUpdateCheckIn;
  }

}
