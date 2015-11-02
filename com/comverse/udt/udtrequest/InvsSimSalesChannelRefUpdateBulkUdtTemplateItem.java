/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimSalesChannelRefUpdateBulkUdtTemplateItem.java
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
 * Class used to create a InvsSimSalesChannelRefUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvsSimSalesChannelRefUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvsSimSalesChannelRefObjectData InvsSimSalesChannelRefUpdateIn;
/**
 *
 * Constructor to create a  InvsSimSalesChannelRefUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvsSimSalesChannelRefUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSimSalesChannelRefObjectData InvsSimSalesChannelRefUpdateInIn) {
    super(id, context, "InvsSimSalesChannelRefUpdate");
    InvsSimSalesChannelRefUpdateIn = InvsSimSalesChannelRefUpdateInIn;
  }

  public void translateToMap() {
    if (InvsSimSalesChannelRefUpdateIn != null) {
      InvsSimSalesChannelRefUpdateIn.resetFlags(true, true);
      addInput("InvsSimSalesChannelRef", InvsSimSalesChannelRefObjectHelper.toMap(InvsSimSalesChannelRefUpdateIn, new HashMap(), "InvsSimSalesChannelRef").get("InvsSimSalesChannelRef"));
    }
  }


/**
 *
 * Sets the InvsSimSalesChannelRef
 * @param InvsSimSalesChannelRefUpdateInIn Value of the InvsSimSalesChannelRefUpdateIn
 *
 */

  public void setInvsSimSalesChannelRef(InvsSimSalesChannelRefObjectData InvsSimSalesChannelRefUpdateInIn) {
    InvsSimSalesChannelRefUpdateIn = InvsSimSalesChannelRefUpdateInIn;
  }

  public void translateFromMap() {
    InvsSimSalesChannelRefUpdateIn = InvsSimSalesChannelRefObjectHelper.fromMap(inputMap, "InvsSimSalesChannelRef");
  }

/**
 *
 * Gets the InvsSimSalesChannelRef
 * @return Value of the InvsSimSalesChannelRef
 *
 */

  public InvsSimSalesChannelRefObjectData getInvsSimSalesChannelRef( ) {
    return InvsSimSalesChannelRefUpdateIn;
  }

}
