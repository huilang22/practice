/*
 * Generated code DO NOT EDIT
 * Generated file: InvdViewsGetLatestBulkUdtTemplateItem.java
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
 * Class used to create a InvdViewsGetLatestBulkUdtTemplateItem Bulk Template
 *
 */

public class InvdViewsGetLatestBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvdViewsObjectData InvdViewsGetLatestIn;
/**
 *
 * Constructor to create a  InvdViewsGetLatestBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvdViewsGetLatestBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdViewsObjectData InvdViewsGetLatestInIn) {
    super(id, context, "InvdViewsGetLatest");
    InvdViewsGetLatestIn = InvdViewsGetLatestInIn;
  }

  public void translateToMap() {
    if (InvdViewsGetLatestIn != null) {
      InvdViewsGetLatestIn.resetFlags(true, true);
      addInput("InvdViews", InvdViewsObjectHelper.toMap(InvdViewsGetLatestIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }


/**
 *
 * Sets the InvdViews
 * @param InvdViewsGetLatestInIn Value of the InvdViewsGetLatestIn
 *
 */

  public void setInvdViews(InvdViewsObjectData InvdViewsGetLatestInIn) {
    InvdViewsGetLatestIn = InvdViewsGetLatestInIn;
  }

  public void translateFromMap() {
    InvdViewsGetLatestIn = InvdViewsObjectHelper.fromMap(inputMap, "InvdViews");
  }

/**
 *
 * Gets the InvdViews
 * @return Value of the InvdViews
 *
 */

  public InvdViewsObjectData getInvdViews( ) {
    return InvdViewsGetLatestIn;
  }

}
