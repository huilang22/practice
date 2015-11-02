/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsCreateBulkUdtTemplateItem.java
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
 * Class used to create a InvdViewsCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdViewsCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdViewsObjectData InvdViewsCreateIn;
/**
 *
 * Constructor to create a  InvdViewsCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdViewsCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdViewsObjectData InvdViewsCreateInIn) {
    super(id, context, "InvdViewsCreate");
    InvdViewsCreateIn = InvdViewsCreateInIn;
  }

  public void translateToMap() {
    if (InvdViewsCreateIn != null) {
      InvdViewsCreateIn.resetFlags(true, true);
      addInput("InvdViews", InvdViewsObjectHelper.toMap(InvdViewsCreateIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }


/**
 *
 * Sets the InvdViews
 * @param InvdViewsCreateInIn Value of the InvdViewsCreateIn
 *
 */

  public void setInvdViews(InvdViewsObjectData InvdViewsCreateInIn) {
    InvdViewsCreateIn = InvdViewsCreateInIn;
  }

  public void translateFromMap() {
    InvdViewsCreateIn = InvdViewsObjectHelper.fromMap(inputMap, "InvdViews");
  }

/**
 *
 * Gets the InvdViews
 * @return Value of the InvdViews
 *
 */

  public InvdViewsObjectData getInvdViews( ) {
    return InvdViewsCreateIn;
  }

}
