/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementGetBulkUdtTemplateItem.java
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
 * Class used to create a InvElementGetBulkUdtTemplateItem Bulk Template
 *
 */

public class InvElementGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvElementObjKeyData InvGetIn;
/**
 *
 * Constructor to create a  InvElementGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvElementGetBulkUdtTemplateItem(String id, BSDMSessionContext context, InvElementObjKeyData InvGetInIn) {
    super(id, context, "InvElementGet");
    InvGetIn = InvGetInIn;
  }

  public void translateToMap() {
    if (InvGetIn != null) {
      InvGetIn.resetFlags(true, true);
      addInput("InvElement", InvElementObjKeyHelper.toMap(InvGetIn, new HashMap(), "InvElementObjKeyData").get("InvElementObjKeyData"));
    }
  }


/**
 *
 * Sets the InvElement
 * @param InvGetInIn Value of the InvGetIn
 *
 */

  public void setInvElement(InvElementObjKeyData InvGetInIn) {
    InvGetIn = InvGetInIn;
  }

  public void translateFromMap() {
    InvGetIn = InvElementObjKeyHelper.fromMap(inputMap, "InvElement");
  }

/**
 *
 * Gets the InvElement
 * @return Value of the InvElement
 *
 */

  public InvElementObjKeyData getInvElement( ) {
    return InvGetIn;
  }

}
