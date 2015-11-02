/*
 * Generated code DO NOT EDIT
 * Generated file: InvdViewsUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvdViewsUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdViewsUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdViewsObjectData InvdViewsUpdateIn;
/**
 *
 * Constructor to create a  InvdViewsUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdViewsUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdViewsObjectData InvdViewsUpdateInIn) {
    super(id, context, "InvdViewsUpdate");
    InvdViewsUpdateIn = InvdViewsUpdateInIn;
  }

  public void translateToMap() {
    if (InvdViewsUpdateIn != null) {
      InvdViewsUpdateIn.resetFlags(true, true);
      addInput("InvdViews", InvdViewsObjectHelper.toMap(InvdViewsUpdateIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }


/**
 *
 * Sets the InvdViews
 * @param InvdViewsUpdateInIn Value of the InvdViewsUpdateIn
 *
 */

  public void setInvdViews(InvdViewsObjectData InvdViewsUpdateInIn) {
    InvdViewsUpdateIn = InvdViewsUpdateInIn;
  }

  public void translateFromMap() {
    InvdViewsUpdateIn = InvdViewsObjectHelper.fromMap(inputMap, "InvdViews");
  }

/**
 *
 * Gets the InvdViews
 * @return Value of the InvdViews
 *
 */

  public InvdViewsObjectData getInvdViews( ) {
    return InvdViewsUpdateIn;
  }

}
