/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsDeleteBulkUdtTemplateItem.java
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
 * Class used to create a InvdViewsDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdViewsDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdViewsObjectKeyData InvdViewsDeleteIn;
/**
 *
 * Constructor to create a  InvdViewsDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdViewsDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdViewsObjectKeyData InvdViewsDeleteInIn) {
    super(id, context, "InvdViewsDelete");
    InvdViewsDeleteIn = InvdViewsDeleteInIn;
  }

  public void translateToMap() {
    if (InvdViewsDeleteIn != null) {
      InvdViewsDeleteIn.resetFlags(true, true);
      addInput("InvdViews", InvdViewsObjectKeyHelper.toMap(InvdViewsDeleteIn, new HashMap(), "InvdViewsObjectKeyData").get("InvdViewsObjectKeyData"));
    }
  }


/**
 *
 * Sets the InvdViews
 * @param InvdViewsDeleteInIn Value of the InvdViewsDeleteIn
 *
 */

  public void setInvdViews(InvdViewsObjectKeyData InvdViewsDeleteInIn) {
    InvdViewsDeleteIn = InvdViewsDeleteInIn;
  }

  public void translateFromMap() {
    InvdViewsDeleteIn = InvdViewsObjectKeyHelper.fromMap(inputMap, "InvdViews");
  }

/**
 *
 * Gets the InvdViews
 * @return Value of the InvdViews
 *
 */

  public InvdViewsObjectKeyData getInvdViews( ) {
    return InvdViewsDeleteIn;
  }

}
