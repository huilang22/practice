/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocGetBulkUdtTemplateItem.java
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
 * Class used to create a InvdWorkpointAssocGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdWorkpointAssocGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdWorkpointAssocObjectKeyData InvdWorkpointAssocGetIn;
/**
 *
 * Constructor to create a  InvdWorkpointAssocGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdWorkpointAssocGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdWorkpointAssocObjectKeyData InvdWorkpointAssocGetInIn) {
    super(id, context, "InvdWorkpointAssocGet");
    InvdWorkpointAssocGetIn = InvdWorkpointAssocGetInIn;
  }

  public void translateToMap() {
    if (InvdWorkpointAssocGetIn != null) {
      InvdWorkpointAssocGetIn.resetFlags(true, true);
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectKeyHelper.toMap(InvdWorkpointAssocGetIn, new HashMap(), "InvdWorkpointAssocObjectKeyData").get("InvdWorkpointAssocObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdWorkpointAssoc
 * @param InvdWorkpointAssocGetInIn Value of the InvdWorkpointAssocGetIn
 *
 */

  public void setInvdWorkpointAssoc(InvdWorkpointAssocObjectKeyData InvdWorkpointAssocGetInIn) {
    InvdWorkpointAssocGetIn = InvdWorkpointAssocGetInIn;
  }

  public void translateFromMap() {
    InvdWorkpointAssocGetIn = InvdWorkpointAssocObjectKeyHelper.fromMap(inputMap, "InvdWorkpointAssoc");
  }

/**
 *
 * Gets the InvdWorkpointAssoc
 * @return Value of the InvdWorkpointAssoc
 *
 */

  public InvdWorkpointAssocObjectKeyData getInvdWorkpointAssoc( ) {
    return InvdWorkpointAssocGetIn;
  }

}
